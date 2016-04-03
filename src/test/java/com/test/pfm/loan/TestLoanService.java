/**
 * Project Name:account
 * File Name:TestLoanService.java
 * Package Name:com.test.pfm.loan
 * Date:2016-3-27ÏÂÎç4:30:12
 *
*/

package com.test.pfm.loan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jjl.pfm.loan.model.Loan;
import com.jjl.pfm.loan.service.LoanService;

/**
 * Description: TODO ADD Description.
 * Date:     2016-3-27 ÏÂÎç4:30:12
 * @author   jjl
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/applicationContext.xml", 
		"classpath*:/spring-hibernate.xml" })
public class TestLoanService {
	
	@Autowired
	private LoanService loanService;
	
	
	@Test
	public void testAddLoad() throws ParseException{
		
		
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		
		Loan loan = new Loan("»¨ßÂ",2960.00,0.0067, 9, sf.parse("2015-11-10"),"ÌÔ±¦");
		
		loanService.addLoan(loan);
		
		
		
	}

}

