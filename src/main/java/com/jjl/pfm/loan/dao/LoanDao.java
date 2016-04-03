/**
 * Project Name:account
 * File Name:LoanDao.java
 * Package Name:com.jjl.pfm.loan.dao
 * Date:2016-3-26 10:58:14
 *
*/

package com.jjl.pfm.loan.dao;

import com.jjl.pfm.loan.model.Loan;

/**
 * Description: 贷款操作dao.
 * Date:     2016-3-26 10:58:14
 * @author   jjl
 */
public interface LoanDao {
	
	/**
	 * save:添加贷款数据.
	 * @param loan 贷款实体
	 * @date 2016年4月2日 下午9:17:17 
	 * @author jjl
	 */
	 void save(Loan loan);

}

