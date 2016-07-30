package com.niit.insbackend.model;
import javax.persistence.Column;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.stereotype.Component;

@javax.persistence.Entity
@Table(appliesTo = "PRODUCTS")
@Component


public class Products {
	private String p_id;
	private String p_name;
	private String p_desc;
	
	@Id
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		p_name = p_name;
	}
	public String getP_desc() {
		return p_desc;
	}
	public void setP_desc(String p_desc) {
		p_desc = p_desc;
	}
	
	
}