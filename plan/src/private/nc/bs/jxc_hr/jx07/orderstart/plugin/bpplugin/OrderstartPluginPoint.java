package nc.bs.jxc_hr.jx07.orderstart.plugin.bpplugin;

import nc.impl.pubapp.pattern.rule.plugin.IPluginPoint;

/**
 * ��׼���ݵ���չ�����
 * 
 */
public enum OrderstartPluginPoint implements IPluginPoint {
  /**
   * ����
   */
  APPROVE,
  /**
   * ɾ��
   */
  DELETE,
  /**
   * ����
   */
  INSERT,

  /**
   * ����
   */
  SEND_APPROVE,

  /**
   * ȡ�����
   */
  UNAPPROVE,

  /**
   * �ջ�
   */
  UNSEND_APPROVE,

  /**
   * ����
   */
  UPDATE,
  
  /**
   * �ű�ɾ��
   */
  SCRIPT_DELETE,
  /**
   * �ű�����
   */
  SCRIPT_INSERT,
  /**
   * �ű�����
   */
  SCRIPT_UPDATE;

  @Override
  public String getComponent() {
    return "plan";
  }

  @Override
  public String getModule() {
    return "jxc_hr";
  }

  @Override
  public String getPoint() {
    return this.getClass().getName() + "." + this.name();
  }

}