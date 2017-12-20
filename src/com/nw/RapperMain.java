package com.nw;

import java.util.ArrayList;
import java.util.List;

public class RapperMain {

	public void init() {
		RapperEntity rapperEntity1 = new RapperEntity("01组", 200, 18);
		RapperEntity rapperEntity2 = new RapperEntity("02组", 220, 12);
		RapperEntity rapperEntity3 = new RapperEntity("03组", 240, 18);
		RapperEntity rapperEntity4 = new RapperEntity("04组", 260, 12);
	}

	public static void main(String[] args) {
//		int c = 3600*24*3;
		int c = 1350;

		RapperMain rapperMain = new RapperMain();

		RapperEntity rapperEntity1 = new RapperEntity("01组", 190, 18);
		RapperEntity rapperEntity2 = new RapperEntity("02组", 222, 12);
		RapperEntity rapperEntity3 = new RapperEntity("03组", 465, 18);
		RapperEntity rapperEntity4 = new RapperEntity("04组", 483, 12);
		RapperEntity rapperEntity5 = new RapperEntity("05组", 640, 18);
		RapperEntity rapperEntity6 = new RapperEntity("06组", 686, 12);
		RapperEntity rapperEntity7 = new RapperEntity("07组", 1064, 24);
		RapperEntity rapperEntity8 = new RapperEntity("08组", 1220, 18);
//		RapperEntity rapperEntity1 = new RapperEntity("01组", 400, 18);
//		RapperEntity rapperEntity2 = new RapperEntity("02组", 200, 12);
//		RapperEntity rapperEntity3 = new RapperEntity("03组", 800, 18);
//		RapperEntity rapperEntity4 = new RapperEntity("04组", 300, 12);
//		RapperEntity rapperEntity5 = new RapperEntity("05组", 900, 18);
//		RapperEntity rapperEntity6 = new RapperEntity("06组", 500, 12);
//		RapperEntity rapperEntity7 = new RapperEntity("07组", 1200, 24);
//		RapperEntity rapperEntity8 = new RapperEntity("08组", 600, 18);

		List<RapperEntity> list = new ArrayList<RapperEntity>();
		list.add(rapperEntity1);
		list.add(rapperEntity2);
		list.add(rapperEntity3);
		list.add(rapperEntity4);
		list.add(rapperEntity5);
		list.add(rapperEntity6);
		list.add(rapperEntity7);
		list.add(rapperEntity8);

		for (int i = 0; i < c; i++) {
			for(RapperEntity re:list){
				re.subCount();
			}
		}
		for(RapperEntity re:list){
			System.out.println(re);
		}
//		System.out.println(rapperEntity1);
//		System.out.println(rapperEntity2);
//		System.out.println(rapperEntity3);
//		System.out.println(rapperEntity4);

		int currentLocation = 0;
		int lastLocation = -1;
		int sum = 0;
		for (int i = 0; i < c; i++) {
			int num = 0;
			List<RapperEntity> rapperEntityList = new ArrayList<RapperEntity>();
			for (RapperEntity re : list) {
				if (re.getStateByLocation(i).equals("+")) {
					num++;
					rapperEntityList.add(re);
				}
			}

			if (num > 1) {
				currentLocation = i;
				// 查询当前是否连续以前的重合振打
				// 当前振打的
				// 查询当前的重合振打，是否属于某一个重合振打组
				L tempL = null;
				if ((currentLocation - lastLocation) == 1) {
					for (int m = 0; m < lList.size(); m++) {
						tempL = lList.get(m);
						if (null != tempL) {
							if ((tempL.getEndNum() + 1) == currentLocation) {
								tempL.setEndNum(currentLocation);
								tempL.setTotalNum(tempL.getTotalNum() + 1);
								tempL.addCoincide(num);
							} else {
								tempL = null;
							}
						} else {

						}
					}
				} else {
					L tL = new L();
					tL.setIndex(currentLocation);
					tL.setStartNum(currentLocation);
					tL.setTotalNum(1);
					tL.setEndNum(currentLocation);
					tL.addCoincide(num);
					lList.add(tL);
				}

				L l = rapperMain.getL(i, num);
				sum++;
				// l.addCompareRapper(i,num);
				if ((currentLocation - lastLocation) == 1) {
//					System.out.println("begin------------------" + i + "-----" + num + ",sum:" + sum);
				} else {
//					System.out.println("end-----" + i + "------" + num + ",sum:" + sum);
				}
				// System.out.println(i + " ---" + num);
				lastLocation = i;
			}
		}
		System.out.println("sum:" + sum);

		for (int i = 0; i < lList.size(); i++) {
			System.out.println(lList.get(i).getStartNum() + "," + lList.get(i).getTotalNum() +""+lList.get(i).getCoincideString()+"");
		}
	}

	private static List<L> lList = new ArrayList<L>();

	public L getL(int location, int num) {
		L l = null;
		// 遍历查询
		for (L tempL : lList) {
			int totalNum = tempL.getTotalNum();
			int index = tempL.getIndex();
			for (int i = 0; i < totalNum; i++) {

			}
		}
		return l;
	}

	public L getNextL(int location, int num) {
		L l = null;
		for (L tempL : lList) {
			int totalNum = tempL.getTotalNum();
			int index = tempL.getIndex();
		}
		return l;
	}

}
