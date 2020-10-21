package com.study.com;

public class StudentComparable implements Comparable<StudentComparable> {
	private String name;
	private int score;
	
	public StudentComparable(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(StudentComparable o) {
		return Integer.compare(score, o.score);
	}
	
	
	
}
