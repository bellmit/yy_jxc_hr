package nc.ui.jxc_hr.jx06.bgd.action;

import nc.desktop.ui.ServerTimeProxy;
import nc.ui.pubapp.uif2app.actions.intf.ICopyActionProcessor;
import nc.vo.plan.jx06.BGDVO;
import nc.vo.plan.jx06.BGDHVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.uif2.LoginContext;

/**
 * ���ݸ���ʱ��ͷ���崦��
 * 
 * @since 6.0
 * @version 2011-7-7 ����02:31:23
 * @author duy
 */
public class CopyActionProcessor implements ICopyActionProcessor<BGDVO> {

	@Override
	public void processVOAfterCopy(BGDVO billVO, LoginContext context) {
		this.processHeadVO(billVO, context);
		this.processBodyVO(billVO);
	}

	private void processBodyVO(BGDVO vo) {
		vo.getParent().setAttributeValue(
				vo.getMetaData().getParent().getPrimaryAttribute().getName(),
				null);
		vo.getParent().setAttributeValue("ts", null);
		for (IVOMeta meta : vo.getMetaData().getChildren()) {
			if (vo.getChildren(meta) == null)
				continue;
			for (ISuperVO childvo : vo.getChildren(meta)) {
				childvo.setAttributeValue(meta.getPrimaryAttribute().getName(),
						null);
				childvo.setAttributeValue("pk_group", null);
				childvo.setAttributeValue("pk_org", null);
				childvo.setAttributeValue("ts", null);
			}
		}
	}

	private void processHeadVO(BGDVO vo, LoginContext context) {
		UFDateTime datetime = ServerTimeProxy.getInstance().getServerTime();
		BGDHVO hvo = vo.getParentVO();
		// ���ÿմ���
		hvo.setBillno(null);
		hvo.setApprover(null);
		hvo.setApprovedate(null);
		hvo.setModifier(null);
		hvo.setModifiedtime(null);
		hvo.setCreator(null);
		hvo.setCreationtime(null);
		// ����Ĭ��ֵ
		hvo.setBilldate(datetime.getDate());
		hvo.setPk_group(context.getPk_group());
		hvo.setPk_org(context.getPk_org());
		hvo.setAttributeValue("approvestatus", BillStatusEnum.FREE.value());
	}

}
