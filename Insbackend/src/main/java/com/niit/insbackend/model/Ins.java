package com.niit.insbackend.model;
import javax.persistence.Column;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.stereotype.Component;

@javax.persistence.Entity
@Component
@Table(appliesTo = "INS")
public class Ins {
	private String ins_id;
	private String ins_name;
	private String p_id;
	
	@Id
	public String getIns_id() {
		return ins_id;
	}
	public void setIns_id(String ins_id) {
		this.ins_id = ins_id;
	}
	public String getIns_name() {
		return ins_name;
	}
	public void setIns_name(String ins_name) {
		this.ins_name = ins_name;
	}
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	
	
}
