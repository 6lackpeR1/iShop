package com.blythe.domain;

import org.springframework.stereotype.Component;

@Component
public class Store {
	private String name;
	private String partnum;

	public String getName(){
		return "hello";
	}

	public void setPartnum(String partnum) {
		if(isMatchPartnum(partnum)){
			this.partnum = partnum;
		}
	}

	public String getPartnum(){
		return partnum;
	}

	private boolean isMatchPartnum(String partnum){
		return (partnum.matches("[A-Z0-9]{6}-[A-Z0-9]{3}")) ? true : false; 
	}
}
