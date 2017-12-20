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
		int c = 50000;

		RapperEntity rapperEntity1 = new RapperEntity("01组", 190, 18);
		RapperEntity rapperEntity2 = new RapperEntity("02组", 225, 12);
		RapperEntity rapperEntity3 = new RapperEntity("03组", 258, 18);
		RapperEntity rapperEntity4 = new RapperEntity("04组", 280, 12);

		List<RapperEntity> list = new ArrayList<RapperEntity>();
		list.add(rapperEntity1);
		list.add(rapperEntity2);
		list.add(rapperEntity3);
		list.add(rapperEntity4);

		for (int i = 0; i < c; i++) {
			rapperEntity1.subCount();
			rapperEntity2.subCount();
			rapperEntity3.subCount();
			rapperEntity4.subCount();
		}
		System.out.println(rapperEntity1);
		System.out.println(rapperEntity2);
		System.out.println(rapperEntity3);
		System.out.println(rapperEntity4);

		int currentLocation = 0;
		int lastLocation = -1;
		int sum = 0;
		for (int i = 0; i < c; i++) {
			int num = 0;
			if (rapperEntity1.getStateByLocation(i).equals("+")){
				num ++;
			}
			if (rapperEntity2.getStateByLocation(i).equals("+")){
				num ++;
			}
			if (rapperEntity3.getStateByLocation(i).equals("+")){
				num ++;
			}
			if (rapperEntity4.getStateByLocation(i).equals("+")){
				num ++;
			}
			
			if(num > 1){
				sum ++;
				currentLocation = i;
				if((currentLocation - lastLocation) == 1){
					System.out.println("begin------------------" + i + "-----" + num + ",sum:" + sum);
				}else{
					System.out.println("end-----" + i + "------" + num + ",sum:" + sum);
				}
//				System.out.println(i	 + " ---" + num);
				lastLocation = i;
			}
		}
		System.out.println("sum:" + sum);
	}

}
