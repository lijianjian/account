/**
 * Project Name:account
 * File Name:TestLoanDao.java
 * Package Name:com.test.pfm.loan
 * Date:2016-3-26обнГ11:17:20
 *
*/

package com.test.pfm.loan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jjl.pfm.loan.dao.LoanDao;
import com.jjl.pfm.loan.model.Loan;

/**
 * Description: TODO ADD Description
 * Function: TODO ADD FUNCTION.
 * Date:     2016-3-26 обнГ11:17:20
 * @author   jjl
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/applicationContext.xml", 
		"classpath*:/spring-hibernate.xml" })
public class TestLoanDao {
	
	@Autowired
	private LoanDao loanDao;
	
	@Test
	public void save(){
		
		Loan loan = new Loan();
		
		loan.setLoanName("tesst");
		
		loanDao.save(loan);
		
		
		
	}

}

