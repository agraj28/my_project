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
	private String in_id;
	private String pac_id;
	private String package_name;
	private Float  price;
	public String getIn_id() {
		return in_id;
	}
	public void setIns_id(String in_id) {
		this.in_id = in_id;
	}
	
	@Id
	public String getPac_id() {
		return pac_id;
	}
	public void setPac_id(String pac_id) {
		this.pac_id = pac_id;
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
