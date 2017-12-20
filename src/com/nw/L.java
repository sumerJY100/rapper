package com.nw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L{
	private int index; //序号
	private int startNum;//开始编号
	private int endNum ;//结束编号
	private int totalNum;//总计重合时间数量
	private List<Integer> list = new ArrayList<Integer>();
	private Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	public L(){
		
	}
	
	public void addCompareRapper(int i, int num) {
		int nextIndex = index + totalNum;
		if(i == nextIndex){
			map.put(i, num);
			this.totalNum ++;
		}
		
	}
	public L(int index,int num){
		this.index = index;
		this.totalNum++;
		this.map.put(index, num);
	}
	public int getIndex(){
		return index;
	}
	
	@Override
	public int hashCode(){
		return index;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	
}
