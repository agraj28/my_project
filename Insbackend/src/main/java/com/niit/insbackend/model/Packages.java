package com.niit.insbackend.model;
import javax.persistence.Column;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.stereotype.Component;

@javax.persistence.Entity
@Component
@Table(appliesTo = "PACKAGES")

public class Packages {
	private String ins_id;
	private String pa_id;
	private String package_name;
	private Float  price;
	public String getIns_id() {
		return ins_id;
	}
	public void setIns_id(String ins_id) {
		this.ins_id = ins_id;
	}
	
	@Id
	public String getPa_id() {
		return pa_id;
	}
	public void setPa_id(String pa_id) {
		this.pa_id = pa_id;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	

}
