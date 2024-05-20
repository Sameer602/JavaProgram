package com.jtc.beans;

public class Student {
	
	 private String sname;
	 private Integer sclass;
	 private Integer sroolno;
	 private Double sfee;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, Integer sclass, Integer sroolno, Double sfee) {
		super();
		this.sname = sname;
		this.sclass = sclass;
		this.sroolno = sroolno;
		this.sfee = sfee;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSclass() {
		return sclass;
	}
	public void setSclass(Integer sclass) {
		this.sclass = sclass;
	}
	public Integer getSroolno() {
		return sroolno;
	}
	public void setSroolno(Integer sroolno) {
		this.sroolno = sroolno;
	}
	public Double getSfee() {
		return sfee;
	}
	public void setSfee(Double sfee) {
		this.sfee = sfee;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sclass=" + sclass + ", sroolno=" + sroolno + ", sfee=" + sfee + "]";
	}
	
	 
	 

}
