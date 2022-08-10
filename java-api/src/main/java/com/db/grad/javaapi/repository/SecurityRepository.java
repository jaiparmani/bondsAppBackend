package com.db.grad.javaapi.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.db.grad.javaapi.model.Security;


@Repository
public interface SecurityRepository extends JpaRepository<Security,Integer> {

//	List<Security> findByMaturityDate(Date from_date);

	List<Security> findByMaturityDateBetween(Date from_date, Date to_date);

	@Query(value = "from Security where securityid in (select securityid from Trade where bookid in (select bu.bookid from BookUser bu join User u on u.userid = bu.userid where u.userid = :uid))")
	List<Security> getAllSecurityForUser(@Param("uid") int uid);
@Query(value = "from Security where securityid in (select securityid from Trade where bookid in (select bu.bookid from BookUser bu join User u on u.userid = bu.userid where u.userid = :uid)) and maturity_date between :from and :to ")
	List<Security> getAllSecurityForUserBetweenDateRange(@Param("uid") int uid, @Param("from") Date from, @Param("to") Date to);	
}
