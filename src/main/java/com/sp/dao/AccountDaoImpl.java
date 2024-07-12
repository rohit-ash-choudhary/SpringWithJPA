package com.sp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AccountDaoImpl implements AccountDao{
	
	@PersistenceContext
	private EntityManager em;
	

	@Override
	public void searchAccountDetails(int employee_id) {
		// TODO Auto-generated method stub
		Account acc=em.find(Account.class, employee_id);
	}
	
	

}
