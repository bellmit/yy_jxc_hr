package nc.ui.jxc_hr.jx03.swlgs.query;

import nc.ui.pubapp.uif2app.query2.IQueryConditionDLGInitializer;
import nc.ui.pubapp.uif2app.query2.QueryConditionDLGDelegator;
import nc.ui.pubapp.uif2app.query2.refregion.QueryDefaultOrgFilter;
import java.util.ArrayList;
import java.util.List;

public class SWLGSQueryConditionInitializer implements
    IQueryConditionDLGInitializer {

  @Override
  public void initQueryConditionDLG(QueryConditionDLGDelegator condDLGDelegator) {
      // TODO ��ʼ����ѯģ���߼�
      //�������Ŀǰ�ǿյģ���ҵ�������Ҫ����֯���˵Ĳ����ֶμ��뵽���������
      List<String> targetFields = new ArrayList<String>();
      // TODO ������Ҫ����֯���˵Ĳ����ֶ�
      QueryDefaultOrgFilter orgFilter=new QueryDefaultOrgFilter(condDLGDelegator,"pk_org",targetFields);
      orgFilter.addEditorListener();
  }

}