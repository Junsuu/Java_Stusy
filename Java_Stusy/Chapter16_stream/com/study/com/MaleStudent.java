package com.study.com;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
	private List<StudentEnum> list;
	
	public MaleStudent() {
		list = new ArrayList<StudentEnum>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}
	
	public void accmulate(StudentEnum studentEnum) {
		list.add(studentEnum);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}
	
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}
	
	public List<StudentEnum> getList(){
		return list;
	}
}
