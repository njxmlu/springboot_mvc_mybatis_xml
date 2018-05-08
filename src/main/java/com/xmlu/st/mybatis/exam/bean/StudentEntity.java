package com.xmlu.st.mybatis.exam.bean;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class StudentEntity {

	private int stuID;

	private String stuName;

	private int stuAge;

	private String stuAddress;

	public int getStuID() {
		return stuID;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	/*
	 * @Override public String toString() { ToStringBuilder tsb = new
	 * ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE); tsb.append("Name",
	 * name); tsb.append("Age", age); return tsb.toString(); }
	 */

	@Override
	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(this.getStuID());
		hcb.append(this.getStuAge());
		hcb.append(this.getStuName());
		return hcb.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof StudentEntity)) {
			return false;
		}
		StudentEntity bd = (StudentEntity) obj;
		EqualsBuilder eb = new EqualsBuilder();
		eb.append(this.getStuName(), bd.getStuName());
		return eb.isEquals();
	}
}