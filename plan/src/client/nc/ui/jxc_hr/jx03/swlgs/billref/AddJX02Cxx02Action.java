package nc.ui.jxc_hr.jx03.swlgs.billref;

 
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.bs.pf.pub.BillTypeCacheKey;
import nc.desktop.ui.WorkbenchEnvironment;
import nc.itf.uap.IUAPQueryBS;
import nc.itf.uap.pf.IPfExchangeService;
import nc.itf.uap.pf.busiflow.PfButtonClickContext;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.ui.ml.NCLangRes;
import nc.ui.pf.change.PfUtilUITools;
import nc.ui.pf.pub.PfUIDataCache;
import nc.ui.pubapp.uif2app.actions.AbstractReferenceAction;
import nc.ui.uif2.NCAction;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.ui.pubapp.uif2app.view.BillForm;
import nc.ui.uif2.model.AbstractAppModel;
import nc.ui.pub.ClientEnvironment;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pub.beans.UIDialog;
import nc.ui.pub.bizflow.IBillReferQueryWithBusitype;
import nc.ui.pub.bizflow.IBillReferQueryWithScheme;
import nc.ui.pub.pf.AbstractBillSourceDLG;
import nc.ui.pub.pf.BillSourceVar;
import nc.ui.pub.pf.IinitQueryData;
import nc.ui.pub.pf.PfUtilClient;
import nc.ui.querytemplate.IBillReferQuery;
import nc.ui.querytemplate.QueryConditionDLG;
import nc.ui.querytemplate.querytree.FromWhereSQL;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pf.change.ExchangeVO;
import nc.vo.plan.jx02.PGDBVO01;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.template.ITemplateStyle;
import nc.vo.pubapp.AppContext;
import nc.vo.querytemplate.TemplateInfo;
import nc.vo.uap.pf.PFBusinessException;
/**
 * @author zhangshjf@yonyou.com
 * @date ����1:28:05
 * @todo ʵ������ʱ������ʱ�����鰴ť�����򣬿��޸Ĵ���ʱ������Ĭ�ϴ������Ĺ�ʱ
 */
public class AddJX02Cxx02Action extends AbstractReferenceAction {
	private static boolean m_isOk = false;
	private static IPfExchangeService exchangeService;
	// �������Ʊ�־
	public static boolean makeFlag = false;
	private static int m_classifyMode = PfButtonClickContext.NoClassify;
	private static boolean isOpenedInDialog = false;
	private static boolean isAutoCloseParentDialog = false;
	private static final long serialVersionUID = 1L;
	private BillForm editor;
	private AbstractAppModel model;
	public BillForm getEditor() {
		return editor;
	}
	public void setEditor(BillForm editor) {
		this.editor = editor;
	}
	public AbstractAppModel getModel() {
		return model;
	}
	public void setModel(AbstractAppModel model) {
		this.model = model;
	}
	@Override
	public void doAction(ActionEvent arg0) throws Exception {
		//��ȡ�ͻ�������IP
		WorkbenchEnvironment.getInstance().getSession().getClientHostIP();
		IBillReferQuery qcDLG=loadUserQuery(getModel().getContext()
				//nc.ui.jxc_hr.jx03.swlgs.action.AddFromJX02BillRefQuery
				.getEntranceUI(), "nc.ui.pubapp.billref.src.DefaultBillReferQuery", getModel()
				.getContext().getPk_group(), getModel().getContext()
				.getPk_loginUser(), "68H10102400","JX02-Cxx-02", "JX02-Cxx-02", "qt", null);//68H10102400
		//�ɹ������ܽڵ�ţ�68H10102400  ��ʱ������ʹ���ɹ���Ĭ�ϲ�ѯģ�壺qt
		if (qcDLG.showModal() == UIDialog.ID_OK) {
			IQueryScheme qryScheme = null;
			if(qcDLG instanceof IBillReferQueryWithScheme) {
				qryScheme = ((IBillReferQueryWithScheme)qcDLG).getQueryScheme();
			}
			String  whereSql=qryScheme.getWhereSQLOnly()==null?"11=11":qryScheme.getWhereSQLOnly();
			PGDBVO01[] bvos=getJX02Vos(whereSql);
			if(bvos!=null&&bvos.length!=0){
				ShowJX02Cxx02BodyDlg dlg= new ShowJX02Cxx02BodyDlg(editor.getParent(),bvos);
				dlg.showModal();
			}
			else{
				ShowStatusBarMsgUtil.showStatusBarMsg("δ��ѯ���κ�����",this.model.getContext());
				return;
			}
			
		} else {
			return;
		}
		
	}
	private PGDBVO01[] getJX02Vos(String whereSql) throws BusinessException {
		if(StringUtil.isEmptyWithTrim(whereSql)){
			throw new BusinessException("��ѯ����Ϊ�գ�");
		}
		//
		IUAPQueryBS ibs = (IUAPQueryBS) NCLocator.getInstance().lookup(IUAPQueryBS.class.getName());
		//������Ż�������
		
		
		//String sql="select A.billno as def10,A.Pgd_Dept,A.GL as def11,A.def1,B.people,(nvl(B.zgs,0)+nvl(B.Addgs,0)) as zgs,B.pk_pgd_czz,B.pk_pgk_h from jxc_hr_pgk_h A inner join jxc_hr_pgk_czz B on A.pk_pgk_h=B.pk_pgk_h where B.Pk_Pgk_h in(select pk_pgk_h from jxc_hr_pgk_h where nvl(dr,0)=0 and approvestatus='1'  and"+whereSql+")";
		
		//20170613
		String pkUser = AppContext.getInstance().getPkUser();
		String sql = "(select concat(substr(T.name,0,3),'%')  from bd_psnjob A inner join org_dept T on A.PK_DEPT=T.PK_DEPT inner join bd_psndoc C on A.pk_psndoc = C.Pk_Psndoc  where C.Pk_Psndoc = (select pk_psndoc from sm_user where nvl(dr, 0) = 0 and cuserid = '"+ pkUser+ "')) ";
		sql = "select pk_dept from org_dept   where name like "+ sql;
		//������Ż�������
		//��ӽ������� ������ʱ�����顱�͡��ɹ�����
		sql="select A.billno as def10,A.Pgd_Dept as def12,A.GL as def11,A.def1,B.people, (nvl(B.zgs,0)+nvl(B.addgs,0)) as zgs,B.pk_pgd_czz,B.pk_pgk_h from jxc_hr_pgk_h A inner join jxc_hr_pgk_czz B on A.pk_pgk_h=B.pk_pgk_h where B.Pk_Pgk_h in(select pk_pgk_h from jxc_hr_pgk_h where nvl(dr,0)=0 and pgd_dept  in("+sql+") and approvestatus='1'  and"+whereSql+"and billtype='JX02-Cxx-02')";
		@SuppressWarnings("unchecked")
		ArrayList<PGDBVO01> res = (ArrayList<PGDBVO01>)ibs.executeQuery(sql, new BeanListProcessor(PGDBVO01.class));
		if(res.size()==0){
			return null;
		}else{
			return res.toArray(new PGDBVO01[res.size()]);
		}		
	}
	private static IBillReferQuery loadUserQuery(Container parent, String src_qrytemplate,
			String pk_group, String userId, String FunNode, String currBillOrTranstype,
			String sourceBillType, String nodeKey, Object userObj) {

		Class c = null;
		try {
			// ���ж��Ƿ�Ϊ�²�ѯģ��UI������
			String qtId = PfUtilUITools.getTemplateId(ITemplateStyle.queryTemplate, pk_group, FunNode,
					userId, nodeKey);
			TemplateInfo ti = new TemplateInfo();
			ti.setTemplateId(qtId);
			ti.setPk_Org(pk_group);
			ti.setUserid(userId);
			ti.setCurrentCorpPk(pk_group);
			ti.setFunNode(FunNode);
			ti.setNodekey(nodeKey);

			c = Class.forName(src_qrytemplate);
			Object retObj = c.getConstructor(new Class[] { Container.class, TemplateInfo.class })
					.newInstance(new Object[] { parent, ti });
			//�Բ�ѯģ��Ի����һЩ���Ƴ�ʼ��
			if (retObj instanceof IinitQueryData) {
				((IinitQueryData) retObj).initData(pk_group, userId, FunNode, currBillOrTranstype,
						sourceBillType, nodeKey, userObj);
			}

			return (IBillReferQuery) retObj;
		} catch (NoSuchMethodException e) {
			Logger.warn("�Ҳ����²�ѯģ��UI�Ĺ��췽���������ж��Ƿ����ϲ�ѯģ��Ĺ��췽��", e);
			try {
				// Ӧ��Ϊ�ϲ�ѯģ��UI������
				Object retObj = c.getConstructor(new Class[] { Container.class }).newInstance(
						new Object[] { parent });
				//�Բ�ѯģ��Ի����һЩ���Ƴ�ʼ��
				if (retObj instanceof IinitQueryData) {
					((IinitQueryData) retObj).initData(pk_group, userId, FunNode, currBillOrTranstype,
							sourceBillType, nodeKey, userObj);
				}
				return (IBillReferQuery) retObj;
			} catch (Exception ex) {
				Logger.error(ex.getMessage(), ex);
			}
		} catch (Exception e) {
			Logger.error(e.getMessage(), e);
		}
		return null;
	}
	
	

}
