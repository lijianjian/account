/**
 * Project Name:account
 * File Name:LoanDaoHibernateImpl.java
 * Package Name:com.jjl.pfm.loan.dao.impl
 * Date:2016-3-26 11:07:56
 *
*/

package com.jjl.pfm.loan.dao.impl;

import org.springframework.stereotype.Repository;

import com.jjl.pfm.common.dao.BaseHibernateDao;
import com.jjl.pfm.loan.dao.LoanDao;
import com.jjl.pfm.loan.model.Loan;

/**
 * Description: 贷款类操作实现.
 * Date: 2016-3-26 11:07:56
 * @author jjl
 */
@Repository
public class LoanDaoHbImpl extends BaseHibernateDao implements LoanDao {

    @Override
    public void save(Loan loan) {

		this.getHibernateTemplate().save(loan);

	}

}
