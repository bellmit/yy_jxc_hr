package nc.bs.jxc_hr.jx15.sgd_exc.rule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.jdbc.framework.generator.SequenceGenerator;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.util.SQLHelper;
import nc.vo.plan.jx01.SGDDTO;
import nc.vo.plan.jx15.SGDBVO_EXC;
import nc.vo.plan.jx15.SGDHVO_EXC;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.pmpub.common.utils.StringUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;

public class JX15AfterApproveRule implements IRule<SGDVO_EXC> {
	private BaseDAO baseDAO = null;

	@SuppressWarnings("unchecked")
	@Override
	public void process(SGDVO_EXC[] vos) {
		if (vos == null || vos.length == 0) {return;}
		StringBuilder asdas=new StringBuilder().append("(");//来源单据表体主键
		StringBuilder sb = new StringBuilder().append("(");
		StringBuilder pk_sgd_exc_h=new StringBuilder().append("(");
		HashMap<String, UFDouble> k_v = new HashMap<String, UFDouble>();
		HashMap<String,String> k_zdr=new HashMap<String,String>();
		HashMap<String,String> k_deptv=new HashMap<String,String>();
		for (SGDVO_EXC vo : vos) {
			SGDHVO_EXC hvo = vo.getParentVO();
			if (hvo.getApprovestatus() != 1) {continue;}
			String srcbillid_b = hvo.getSrcbillid_b();
			String pk_h=hvo.getPk_sgd_exc_h();
			if(StringUtil.isEmpty(srcbillid_b)){continue;}
			String pk_sgd_h = hvo.getSrcbillid() == null ? "" : hvo.getSrcbillid();/* 施工单表头主键 */
			String excdept = hvo.getExcdept() == null ? "" : hvo.getExcdept();/*协作部门 也就是目的部门*/
			String excdept_v = hvo.getExcdept_v()==null?"":hvo.getExcdept_v();/*协作部门 _v也就是目的部门_v*/
			String creater=hvo.getCreator()==null?"":hvo.getCreator();
			SGDBVO_EXC[] bvos = (SGDBVO_EXC[]) vo.getChildrenVO();
			for (int i = 0; i < bvos.length; i++) {
				SGDBVO_EXC bvo = bvos[i];
				String gz = bvo.getGz() == null ? "" : bvo.getGz();
				sb.append("'");
				sb.append(pk_sgd_h);
				sb.append("_");
				sb.append(excdept);
				sb.append("_");
				sb.append(gz);
				sb.append("',");
				k_v.put(pk_sgd_h + "_" + excdept + "_" + gz, bvo.getExchours_b());
				k_zdr.put(pk_sgd_h + "_" + excdept + "_" + gz,creater);
				k_deptv.put(pk_sgd_h + "_" + excdept + "_" + gz, excdept_v);
			}
			asdas.append("'");
			asdas.append(srcbillid_b);
			asdas.append("',");
			pk_sgd_exc_h.append("'");
			pk_sgd_exc_h.append(pk_h);
			pk_sgd_exc_h.append("',");
		}
		sb.deleteCharAt(sb.length() - 1).append(")");
		asdas.deleteCharAt(asdas.length()-1).append(")");
		pk_sgd_exc_h.deleteCharAt(pk_sgd_exc_h.length()-1).append(")");
		try {
			ArrayList<SGDDTO> resVos = query(sb);//
			process(resVos,k_v, k_zdr,k_deptv);  //处理目的部门的工种工时  加工时
			process(asdas,pk_sgd_exc_h);				         //处理源头部门的工种工时，减工时
		} catch (Exception e) {
			e.printStackTrace();
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
	}

	

	private void process(StringBuilder whereSql, StringBuilder pk_sgd_exc_h) throws DAOException {
		StringBuilder sbs=new StringBuilder().append("update jxc_hr_sgd_b A set A.gs=");
		sbs.append("nvl(A.gs,0)-(select nvl(B.exchours,0) from jxc_hr_sgd_exc_h B where B.Srcbillid_b=A.Pk_Sgd_b and B.pk_sgd_exc_h in" +pk_sgd_exc_h.toString()+
				")");
		sbs.append("where exists(select 1 from jxc_hr_sgd_exc_h B where A.pk_sgd_b= B.Srcbillid_b and B.pk_sgd_exc_h in" +pk_sgd_exc_h.toString()+
				") ");
		sbs.append("and nvl(dr,0)=0 and pk_sgd_b in");
		sbs.append(whereSql);
		getBaseDAO().executeUpdate(sbs.toString());
	}



	@SuppressWarnings("unchecked")
	private ArrayList<SGDDTO> query(StringBuilder sb) throws DAOException {
		StringBuilder sql = new StringBuilder();
		sql.append("select pk_sgd_h||'_'||dept||'_'||gz,pk_sgd_b,gs  from jxc_hr_sgd_b ");
		sql.append("where nvl(dr,0)=0 and pk_sgd_h||'_'||dept||'_'||gz in");
		sql.append(sb);
		ArrayList<SGDDTO> listDTO = (ArrayList<SGDDTO>) getBaseDAO().executeQuery(sql.toString(),new BeanListProcessor(SGDDTO.class));
		return listDTO;
	}
	private void process(ArrayList<SGDDTO> resVos, HashMap<String, UFDouble> map,HashMap<String, String> k_zdr, HashMap<String, String> k_deptv) throws BusinessException {
		if(map.size()==0){return;}
		ArrayList<SGDDTO> ouList=null;
		if(map.size()>resVos.size()){
			ouList=new ArrayList<SGDDTO>(map.size()-resVos.size());
		}
		else if(map.size()<resVos.size()){
			throw new BusinessException("系统BUG,类：nc.bs.jxc_hr.jx15.sgd_exc.rule.JX15AfterApproveRule");
		}
		SGDDTO helpDTO=null;//helpDTO是用来给新增的DTO设置默认值的
		for (SGDDTO dto : resVos) {
			String key=dto.getSgdh_bm_gz();
			if(map.containsKey(key)){
				helpDTO=dto;
				dto.setGs(dto.getGs().add(map.get(key)));
				map.remove(key);
			}else{
				throw new BusinessException("DTO查询结果不在施工联系单的界面数据中，请检查SQL语句是否有BUG");
			}
		}
		getBaseDAO().updateVOArray(resVos.toArray(new SGDDTO[resVos.size()]), new String[]{"gs"});
		//如果map的size还是大于0 说明施工联系单中有新增的部门工种
		SequenceGenerator sequenceGenerator = new SequenceGenerator();
		String corpPk = SQLHelper.getCorpPk();
		if(map.size()>0){
			SGDDTO[] newdtos=new SGDDTO[map.size()];
			int i=0;
			for(Entry<String, UFDouble> entry:map.entrySet()){
				String key=entry.getKey();
				String[] keys=key.split("_");
				UFDouble value=entry.getValue();
				newdtos[i]=new SGDDTO();
				newdtos[i].setPk_sgd_h(keys[0]);
				newdtos[i].setDept(keys[1]);
				newdtos[i].setGz(keys[2]);
				newdtos[i].setGs(value);
			newdtos[i].setPk_group(helpDTO==null?AppContext.getInstance().getPkGroup():helpDTO.getPk_group()==null?"":helpDTO.getPk_group());
				newdtos[i].setPk_org(helpDTO==null?"0001W110000000002LWQ":helpDTO.getPk_org()==null?"~":helpDTO.getPk_org());
				newdtos[i].setPk_org_v(helpDTO==null?"0001W110000000002LWP":helpDTO.getPk_org_v()==null?"~":helpDTO.getPk_org_v());
				newdtos[i].setDr(0);
				newdtos[i].setTs(new UFDateTime());
				newdtos[i].setPk_sgd_b(sequenceGenerator.generate(corpPk));
				newdtos[i].setPk_dept_v(k_deptv.get(key));//获取施工联系单的制单人塞到施工单表体的修改人字段
				newdtos[i].setModifiedtime(new UFDateTime());
				newdtos[i].setModifier(k_zdr.get(key));
				i++;
			}
			getBaseDAO().insertVOArray(newdtos);
			
		}
	}

	public BaseDAO getBaseDAO() {
		if (baseDAO == null) {
			baseDAO = new BaseDAO();
		}
		return baseDAO;
	}
}
