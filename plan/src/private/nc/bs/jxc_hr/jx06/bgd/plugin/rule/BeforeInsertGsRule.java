package nc.bs.jxc_hr.jx06.bgd.plugin.rule;

import java.util.HashMap;
import java.util.Map;

import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.jx06.BGDBVO;
import nc.vo.plan.jx06.BGDHVO;
import nc.vo.plan.jx06.BGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * 
 * @author xiashsh 校验每天工时不能大于8
 */
public class BeforeInsertGsRule implements IRule<BGDVO> {

	@Override
	public void process(BGDVO[] vos) {
		if (vos == null || vos.length == 0) {
			return;
		}
		for (BGDVO vo : vos) {
			BGDHVO hvo = vo.getParentVO();
			BGDBVO[] bvos = (BGDBVO[]) vo.getChildrenVO();
			if (bvos == null || bvos.length == 0) {
				return;
			}
			if (vo.getParentVO().getPk_bgd_h() == null) {
				 
			}
			Map<String ,UFDouble> gslist=this.gs(bvos);
			for (int i = 1; i <= gslist.size(); i++) {
				UFDouble dou=gslist.get(i+"");
				if (gslist.get(i+"").compareTo(new UFDouble(Double.valueOf(8)))>0) {
					try {
						throw new BusinessException(i+" 号生产，出差，公务，请假的工时累计大于8！");
					} catch (BusinessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						ExceptionUtils.wrappBusinessException(e.getMessage());
					}
				}
			}
				
		}
	}
	
	/**
	 * 累加每天生产，出差，公务的工时
	 * @param bvos
	 * @return
	 */
	private Map<String ,UFDouble> gs(BGDBVO[] bvos) {
//		ArrayList<UFDouble> gsmap = new ArrayList<UFDouble>();
		Map<String ,UFDouble> gsmap=new HashMap<String, UFDouble>();
		for (int i = 1; i <= 31; i++) {
			gsmap.put(i+"", new UFDouble().ZERO_DBL);
		}
		for (BGDBVO bvo : bvos) {
			if ("1".equals(bvo.getKqzt()) || "2".equals(bvo.getKqzt())
					|| "3".equals(bvo.getKqzt()) || "7".equals(bvo.getKqzt())
					|| "8".equals(bvo.getKqzt()) || "9".equals(bvo.getKqzt())
					|| "10".equals(bvo.getKqzt())||"11".equals(bvo.getKqzt())) {// 
				gsmap.put("1",bvo.getDay1() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("1"))
						: bvo.getDay1().add(gsmap.get("1")));
				gsmap.put("2",bvo.getDay2() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("2"))
						: bvo.getDay2().add(gsmap.get("2")));
				gsmap.put("3",bvo.getDay3() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("3"))
						: bvo.getDay3().add(gsmap.get("3")));
				gsmap.put("4",bvo.getDay4() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("4"))
						: bvo.getDay4().add(gsmap.get("4")));
				gsmap.put("5",bvo.getDay5() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("5"))
						: bvo.getDay5().add(gsmap.get("5")));
				gsmap.put("6",bvo.getDay6() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("6"))
						: bvo.getDay6().add(gsmap.get("6")));
				gsmap.put("7",bvo.getDay7() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("7"))
						: bvo.getDay7().add(gsmap.get("7")));
				gsmap.put("8",bvo.getDay8() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("8"))
						: bvo.getDay8().add(gsmap.get("8")));
				gsmap.put("9",bvo.getDay9() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("9"))
						: bvo.getDay9().add(gsmap.get("9")));
				gsmap.put("10",bvo.getDay10() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("10"))
						: bvo.getDay10().add(gsmap.get("10")));
				gsmap.put("11",bvo.getDay11() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("11"))
						: bvo.getDay11().add(gsmap.get("11")));
				gsmap.put("12",bvo.getDay12() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("12"))
						: bvo.getDay12().add(gsmap.get("12")));
				gsmap.put("13",bvo.getDay13() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("13"))
						: bvo.getDay13().add(gsmap.get("13")));
				gsmap.put("14",bvo.getDay14() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("14"))
						: bvo.getDay14().add(gsmap.get("14")));
				gsmap.put("15",bvo.getDay15() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("15"))
						: bvo.getDay15().add(gsmap.get("15")));
				gsmap.put("16",bvo.getDay16() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("16"))
						: bvo.getDay16().add(gsmap.get("16")));
				gsmap.put("17",bvo.getDay17() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("17"))
						: bvo.getDay17().add(gsmap.get("17")));
				gsmap.put("18",bvo.getDay18() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("18"))
						: bvo.getDay18().add(gsmap.get("18")));
				gsmap.put("19",bvo.getDay19() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("19"))
						: bvo.getDay19().add(gsmap.get("19")));
				gsmap.put("20",bvo.getDay20() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("20"))
						: bvo.getDay20().add(gsmap.get("20")));
				gsmap.put("21",bvo.getDay21() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("21"))
						: bvo.getDay21().add(gsmap.get("21")));
				gsmap.put("22",bvo.getDay22() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("22"))
						: bvo.getDay22().add(gsmap.get("22")));
				gsmap.put("23",bvo.getDay23() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("23"))
						: bvo.getDay23().add(gsmap.get("23")));
				gsmap.put("24",bvo.getDay24() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("24"))
						: bvo.getDay24().add(gsmap.get("24")));
				gsmap.put("25",bvo.getDay25() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("25"))
						: bvo.getDay25().add(gsmap.get("25")));
				gsmap.put("26",bvo.getDay26() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("26"))
						: bvo.getDay26().add(gsmap.get("26")));
				gsmap.put("27",bvo.getDay27() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("27"))
						: bvo.getDay27().add(gsmap.get("27")));
				gsmap.put("28",bvo.getDay28() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("28"))
						: bvo.getDay28().add(gsmap.get("28")));
				gsmap.put("29",bvo.getDay29() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("29"))
						: bvo.getDay29().add(gsmap.get("29")));
				gsmap.put("30",bvo.getDay30() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("30"))
						: bvo.getDay30().add(gsmap.get("30")));
				gsmap.put("31",bvo.getDay31() == null ? new UFDouble().ZERO_DBL.add(gsmap.get("31"))
						: bvo.getDay31().add(gsmap.get("31")));
				
			}
		}

		return gsmap;
	}

}
