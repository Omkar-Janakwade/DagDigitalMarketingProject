package com.demo.admin.entity;

import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carrer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String job_name;
	private String qualification;
	private String job_type;
	private String job_experience;
	private String skills;
	
	@Column(length = 1000)
	private String disc1;
	@Column(length = 1000)
	private String disc2;
	@Column(length = 1000)
	private String disc3;
	@Column(length = 1000)
	private String disc4;
	@Column(length = 1000)
	private String disc5;
	@Column(length = 1000)
	private String disc6;
	@Column(length = 1000)
	private String disc7;
	@Column(length = 1000)
	private String disc8;
	@Column(length = 1000)
	private String disc9;
	@Column(length = 1000)
	private String disc10;
	
	public Carrer() {
		// TODO Auto-generated constructor stub
	}

	public Carrer(String job_name,String qualification, String job_type, String job_experience, String skills, String disc1,
			String disc2, String disc3, String disc4, String disc5, String disc6, String disc7, String disc8,
			String disc9, String disc10) {
		super();
		this.job_name=job_name;
		this.qualification = qualification;
		this.job_type = job_type;
		this.job_experience = job_experience;
		this.skills = skills;
		this.disc1 = disc1;
		this.disc2 = disc2;
		this.disc3 = disc3;
		this.disc4 = disc4;
		this.disc5 = disc5;
		this.disc6 = disc6;
		this.disc7 = disc7;
		this.disc8 = disc8;
		this.disc9 = disc9;
		this.disc10 = disc10;
	}
	

	public Integer getId() {
		return id;
	}
	
	public String getJob_name() {
		return job_name;
	}

	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getJob_type() {
		return job_type;
	}

	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}

	public String getJob_experience() {
		return job_experience;
	}

	public void setJob_experience(String job_experience) {
		this.job_experience = job_experience;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getDisc1() {
		return disc1;
	}

	public void setDisc1(String disc1) {
		this.disc1 = disc1;
	}

	public String getDisc2() {
		return disc2;
	}

	public void setDisc2(String disc2) {
		this.disc2 = disc2;
	}

	public String getDisc3() {
		return disc3;
	}

	public void setDisc3(String disc3) {
		this.disc3 = disc3;
	}

	public String getDisc4() {
		return disc4;
	}

	public void setDisc4(String disc4) {
		this.disc4 = disc4;
	}

	public String getDisc5() {
		return disc5;
	}

	public void setDisc5(String disc5) {
		this.disc5 = disc5;
	}

	public String getDisc6() {
		return disc6;
	}

	public void setDisc6(String disc6) {
		this.disc6 = disc6;
	}

	public String getDisc7() {
		return disc7;
	}

	public void setDisc7(String disc7) {
		this.disc7 = disc7;
	}

	public String getDisc8() {
		return disc8;
	}

	public void setDisc8(String disc8) {
		this.disc8 = disc8;
	}

	public String getDisc9() {
		return disc9;
	}

	public void setDisc9(String disc9) {
		this.disc9 = disc9;
	}

	public String getDisc10() {
		return disc10;
	}

	public void setDisc10(String disc10) {
		this.disc10 = disc10;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disc1);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrer other = (Carrer) obj;
		return Objects.equals(disc1, other.disc1);
	}

	@Override
	public String toString() {
		return "Carrer [id=" + id + ", qualification=" + qualification + ", job_type=" + job_type + ", job_experience="
				+ job_experience + ", skills=" + skills + ", disc1=" + disc1 + ", disc2=" + disc2 + ", disc3=" + disc3
				+ ", disc4=" + disc4 + ", disc5=" + disc5 + ", disc6=" + disc6 + ", disc7=" + disc7 + ", disc8=" + disc8
				+ ", disc9=" + disc9 + ", disc10=" + disc10 + "]";
	}

	
	
	

}
