package com.niit.insbackend.doa;

import java.util.List;

import com.niit.insbackend.model.Ins;

public interface InsDao {
	
	public List<Ins> getAllIns();
	public Ins get(String ins_id);
	public void saveorupdate(Ins ins);
	public void delete(String ins_id);
	
	

}
