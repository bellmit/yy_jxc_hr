package nc.ui.jxc_hr.jx02.pgd2.action;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import nc.a.tools.all.MyTransfer;
import nc.ui.pubapp.uif2app.model.BillManageModel;
import nc.ui.pubapp.uif2app.view.ShowUpableBillForm;
import nc.ui.uif2.NCAction;
import nc.ui.uif2.UIState;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.plan.jx03.SWLGSBVO;
import nc.vo.plan.jx03.SWLGSHVO;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.pub.BusinessException;
/**
 * @author ���پ�
 * TODO �ɹ�����ʵ������ʱ
 */
public class FinishAction extends NCAction {
	private static final long serialVersionUID = 8653426944145766647L;
	private BillManageModel model;
	public BillManageModel getModel() {
		return model;
	}

	public void setModel(BillManageModel model) {
		this.model = model;
		this.model.addAppEventListener(this);
	}

	public ShowUpableBillForm getEditor() {
		return editor;
	}

	public void setEditor(ShowUpableBillForm editor) {
		this.editor = editor;
	}

	private ShowUpableBillForm editor;
	public FinishAction(){
		super();
		setBtnName("һ���깤");
		setCode("FinishAction");
	}

	@Override
	public void doAction(ActionEvent e) throws Exception {
		Object[] seldatas = this.getModel().getSelectedOperaDatas();
		if(seldatas==null||seldatas.length==0){
			return;
		}
		PGDVO[] srcVos=new PGDVO[seldatas.length];
		for(int i=0;i<seldatas.length;i++){
			srcVos[i]=new PGDVO();
			srcVos[i]=(PGDVO)seldatas[i];
		}
		
		MyTransfer mt=new MyTransfer();
		SWLGSVO[] destVos = (SWLGSVO[]) mt.VOtransfer("JX02", "JX03", srcVos);
		if(destVos==null||destVos.length==0){
			throw new BusinessException("��ʾ������ת���������");
		}
		//���ű���һ�Ŷ���壬����ת������Ҫ�ϲ�
		//Ŀǰ�ĺϲ������ǣ�
		//ȡ��һ�ŵı�ͷhvo��ȡ���еı���bvo����װ��һ���µ�AggVo
		SWLGSHVO destHvo=destVos[0].getParentVO();
		ArrayList<SWLGSBVO> list=new ArrayList<SWLGSBVO>();
		for(int j=0;j<destVos.length;j++){
			SWLGSBVO[] destBvos=(SWLGSBVO[])destVos[j].getChildrenVO();
			for(int jj=0;jj<destBvos.length;jj++){
				list.add(destBvos[jj]);
			}
		}
		SWLGSVO[] newDestVOs=new SWLGSVO[]{new SWLGSVO()};
		newDestVOs[0].setParentVO(destHvo);
		newDestVOs[0].setChildrenVO(list.toArray(new SWLGSBVO[list.size()]));
		mt.OpenNode(newDestVOs, 2374, "68H10103");

	}
	@Override
	public boolean isActionEnable(){
		boolean bl=this.getModel().getSelectedOperaDatas()!=null;
		boolean el=this.getModel().getUiState()!=UIState.EDIT;
		return bl&&el;
	}
}
