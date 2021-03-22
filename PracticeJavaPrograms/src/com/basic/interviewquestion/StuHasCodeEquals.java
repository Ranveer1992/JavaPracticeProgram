package com.basic.interviewquestion;

public class StuHasCodeEquals {
	private int rollno;
	private String name;

	public StuHasCodeEquals(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		System.out.println("hashCode=>"+prime);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StuHasCodeEquals other = (StuHasCodeEquals) obj;
		if (rollno != other.rollno)
			return false;
		return true;
	}

}
