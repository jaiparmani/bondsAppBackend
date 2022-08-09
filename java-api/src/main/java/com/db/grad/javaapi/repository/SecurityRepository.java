package com.db.grad.javaapi.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.grad.javaapi.model.Security;

@Repository
public interface SecurityRepository extends JpaRepository<Security,Integer> {

//	List<Security> findByMaturityDate(Date from_date);

	List<Security> findByMaturityDateBetween(Date from_date, Date to_date);
	
}
