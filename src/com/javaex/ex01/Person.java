package com.javaex.ex01;

public class Person {
	
	private String name;
	private String hp;
	private String cp;
	
	
	public Person() {}
	
	public Person(String name, String hp, String cp) {
		this.name = name;
		this.hp = hp;
		this.cp = cp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}

	
	
	public String showList() {
    	return "\t"+name+"\t"+hp+"\t"+cp;
    }

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + ", cp=" + cp + "]";
	}

	

}
