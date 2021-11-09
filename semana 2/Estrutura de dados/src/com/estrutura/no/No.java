package com.estrutura.no;

public class No {

	private String namePerson;
	private int position;
	private No nextNo;
	
	public No(String namePerson, int position) {
		this.namePerson = namePerson;
		this.position = position;
		this.nextNo = null;
	}

	public String getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public No getNextNo() {
		return nextNo;
	}

	public void setNextNo(No nextNo) {
		this.nextNo = nextNo;
	}

	@Override
	public String toString() {
		return "No [namePerson=" + namePerson + ", position=" + position + ", nextNo=" + nextNo + "]";
	}
	
	
	
}
