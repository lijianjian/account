/**
 * Project Name:account
 * File Name:LoanService.java
 * Package Name:com.jjl.pfm.loan.service
 * Date:2016-3-27下午3:52:02
 *
*/

package com.jjl.pfm.loan.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jjl.pfm.loan.dao.LoanDao;
import com.jjl.pfm.loan.model.Loan;
import com.jjl.pfm.loan.model.RepaymentPlan;

/**
 * Description: 贷款服务类. Date: 2016-3-27 下午3:52:02
 * 
 * @author jjl
 */
@Service
@Transactional
public class LoanService {

    /**
     * loanDao:贷款操作实体.
     */
    @Autowired
    private LoanDao loanDao;

    /**
     * addLoan:添加一个贷款信息.
     * 
     * @param loan
     *            贷款实体
     * @date 2016-3-27 下午3:55:52
     * @author jjl
     */
    public void addLoan(Loan loan) {

        loan.setRePlans(this.createRepaymentPlan(loan));

        loanDao.save(loan);

    }

    /**
     * createRepaymentPlan:生成贷款的还款计划.
     * 
     * @param loan
     *            贷款实体
     * @return 还款计划
     * @date 2016-3-27 下午4:14:21
     * @author jjl
     */
    private List<RepaymentPlan> createRepaymentPlan(Loan loan) {

        // 还款计划
        List<RepaymentPlan> rPlans = new ArrayList<RepaymentPlan>();

        // 每月还款金额
        double interest = loan.getLoanAmount() * loan.getInterestRate();

        double principal = loan.getLoanAmount() / loan.getLoadDeadline();

        Calendar calendar = Calendar.getInstance();
        // 起始时间
        calendar.setTime(loan.getStartTime());

        for (int i = 0; i < loan.getLoadDeadline(); i++) {

            RepaymentPlan plan = new RepaymentPlan();
            plan.setLoan(loan);
            plan.setRepaymentAmount(
                    new BigDecimal(interest + principal).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
            plan.setInterest(new BigDecimal(interest).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
            plan.setPrincipal(new BigDecimal(principal).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
            calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + 1);

            plan.setRepaymentTime(calendar.getTime());

            rPlans.add(plan);
        }

        return rPlans;

    }

}
