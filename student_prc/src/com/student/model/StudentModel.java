package com.student.model;

public class StudentModel {
	private int id;//ID
	private String username;//名字
	private String password;//密码
	private int sex;//性别
	private String pcy;//简写
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((pcy == null) ? 0 : pcy.hashCode());
		result = prime * result + sex;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		StudentModel other = (StudentModel) obj;
		if (id != other.id)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (pcy == null) {
			if (other.pcy != null)
				return false;
		} else if (!pcy.equals(other.pcy))
			return false;
		if (sex != other.sex)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	

}
