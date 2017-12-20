package com.nw;

import java.util.ArrayList;
import java.util.List;

public class RapperEntity {

	private String groupName;
	private int cycleTime;
	private int runTime;
	private int waitTime;
	private int count;
	private int runCount;
	private List<String> strList = new ArrayList<String>();
	
	public RapperEntity(){
		
	}
	
	public RapperEntity(String groupName,int cycleTime,int runTime){
		this.cycleTime = cycleTime;
		this.runTime = runTime;
		this.groupName = groupName;
		this.waitTime = this.cycleTime - this.runTime;
		this.count = this.waitTime;
		this.runCount = runTime;
	}
	
	public void subCount(){
		if(this.count > 1){
			this.count = this.count - 1;
			this.strList.add("_");
		}else{
			if(this.runCount > 0){
				this.runCount = this.runCount - 1;
				this.strList.add("+");
			}else{
				this.runCount = runTime;
				this.count = this.waitTime;
			}
		}
	}
	public String toString(){
		StringBuffer buffer = new StringBuffer();
		for(int i=0;i<strList.size();i++){
			buffer.append(strList.get(i));
		}
		return buffer.toString();
	}
	
	public String getStateByLocation(int index){
		return this.strList.get(index);
	}
}
