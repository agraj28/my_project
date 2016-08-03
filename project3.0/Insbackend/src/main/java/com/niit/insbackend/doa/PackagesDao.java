package com.niit.insbackend.doa;
import java.util.List;

import com.niit.insbackend.model.Packages;

public interface PackagesDao {

	
	public List<Packages> getAllPackages();
	public Packages get(String pac_id);
	public void saveorupdate(Packages pack);
	public void delete(String pac_id);
	
}
