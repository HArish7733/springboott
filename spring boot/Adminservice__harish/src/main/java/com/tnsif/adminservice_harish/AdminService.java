package com.tnsif.adminservice_harish;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import jakarta.transaction.Transactional;

@Service
@Transactional

public class AdminService {
	@Autowired
	private AdminRepository repo;
	//Inserting the records to the table in database
	public void insertRecord(Admin adm)
	{
		repo.save(adm);
	}
	
	//Show all the records from the table in database
	public List<Admin> getAllRecords()
	{
		return repo.findAll();
	}
	
	//Show specific record from the table in database
	public Admin getAdminById(Integer id)
	{
		return repo.findById(id).orElse(null);
	}
	
	//Deleting the specific record from the table in database
	public void deleteAdmin(Integer id)
	{
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void updateAdmin(Integer id,Admin updateAdmin)
	{
		Admin existingAdmin=repo.findById(id).orElse(null);
		if(existingAdmin!=null)
		{
			existingAdmin.setAid(updateAdmin.getAid());
			existingAdmin.setName(updateAdmin.getName());
			existingAdmin.setUsername(updateAdmin.getUsername());
			existingAdmin.setPassword(updateAdmin.getPassword());
			existingAdmin.setEmail(updateAdmin.getEmail());
			existingAdmin.setAddress(updateAdmin.getAddress());
			existingAdmin.setShopname(updateAdmin.getShopname());
			repo.save(existingAdmin);
		}
	}
	
	
	
	
	
	
	
	

}
