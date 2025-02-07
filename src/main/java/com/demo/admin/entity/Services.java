package com.demo.admin.entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Services {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String tittle;
	@Column(length = 10000)
	private String discription;
	@Lob
	  @Column(columnDefinition = "LONGBLOB")
	private byte[] img;
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Services(String tittle, String discription, byte[] img) {
		super();
		this.tittle = tittle;
		this.discription = discription;
		this.img = img;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "Services [id=" + id + ", tittle=" + tittle + ", discription=" + discription + ", img="
				+ Arrays.toString(img) + "]";
	}
	
	
	

}
