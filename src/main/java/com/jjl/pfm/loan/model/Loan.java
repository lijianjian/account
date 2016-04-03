package com.jjl.pfm.loan.model;
// default package

import java.util.Date;
import java.util.List;


/**
 * Loan entity. @author MyEclipse Persistence Tools
 */
public class Loan  implements java.io.Serializable {


    /**
     * serialVersionUID:.
     */
    private static final long serialVersionUID = 1L;
    // Fields    
     private Long loanId =0L;
     private String loanName;
     private Integer loanType;
     private Double loanAmount;
     private Double interestRate;
     private Integer loadDeadline;
     private Date startTime;
     private Integer repaymentType;
     private String lender;
     private Integer repaymentPeriod;
     private Integer isRepayment;
     private Integer isDel;
     private Date createTime;
     
     private List<RepaymentPlan> rePlans;
     
     
     
     /**
     * Creates a new instance of Loan.
     *
     */
    
    public Loan() {
        
        super();
        
    }



    /**
      * Creates a new instance of Loan.
      *
      * @param newLoanName 贷款名称
      * @param newLoanAmount 贷款金额
      * @param newInterestRate 利息
      * @param newLoadDeadline 贷款周期
      * @param newStartTime 开始时间
      * @param newLender 贷款机构
      */    
     public Loan(String newLoanName, Double newLoanAmount, 
             Double newInterestRate, Integer newLoadDeadline,
             Date newStartTime, String newLender) {
         super();
         loanName = newLoanName;
         loanAmount = newLoanAmount;
         interestRate = newInterestRate;
         loadDeadline = newLoadDeadline;
         startTime = newStartTime;
         lender = newLender;
     }
     
     

    /**
     * loanId.
     *
     * @return  the loanId
     */
    public Long getLoanId() {
        return loanId;
    }


    /**
     * newLoanId.
     *
     * @param   newLoanId    the loanId to set
     */
    public void setLoanId(Long newLoanId) {
        loanId = newLoanId;
    }

    /**
     * loanName.
     *
     * @return  the loanName
     */
    public String getLoanName() {
        return loanName;
    }

    /**
     * newLoanName.
     *
     * @param   newLoanName    the loanName to set
     */
    public void setLoanName(String newLoanName) {
        loanName = newLoanName;
    }

    /**
     * loanType.
     *
     * @return  the loanType
     */
    public Integer getLoanType() {
        return loanType;
    }

    /**
     * newLoanType.
     *
     * @param   newLoanType    the loanType to set
     */
    public void setLoanType(Integer newLoanType) {
        loanType = newLoanType;
    }

    /**
     * loanAmount.
     *
     * @return  the loanAmount
     */
    public Double getLoanAmount() {
        return loanAmount;
    }

    /**
     * newLoanAmount.
     *
     * @param   newLoanAmount    the loanAmount to set
     */
    public void setLoanAmount(Double newLoanAmount) {
        loanAmount = newLoanAmount;
    }

    /**
     * interestRate.
     *
     * @return  the interestRate
     */
    public Double getInterestRate() {
        return interestRate;
    }

    /**
     * newInterestRate.
     *
     * @param   newInterestRate    the interestRate to set
     */
    public void setInterestRate(Double newInterestRate) {
        interestRate = newInterestRate;
    }

    /**
     * loadDeadline.
     *
     * @return  the loadDeadline
     */
    public Integer getLoadDeadline() {
        return loadDeadline;
    }

    /**
     * newLoadDeadline.
     *
     * @param   newLoadDeadline    the loadDeadline to set
     */
    public void setLoadDeadline(Integer newLoadDeadline) {
        loadDeadline = newLoadDeadline;
    }

    /**
     * startTime.
     *
     * @return  the startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * newStartTime.
     *
     * @param   newStartTime    the startTime to set
     */
    public void setStartTime(Date newStartTime) {
        startTime = newStartTime;
    }

    /**
     * repaymentType.
     *
     * @return  the repaymentType
     */
    public Integer getRepaymentType() {
        return repaymentType;
    }

    /**
     * newRepaymentType.
     *
     * @param   newRepaymentType    the repaymentType to set
     */
    public void setRepaymentType(Integer newRepaymentType) {
        repaymentType = newRepaymentType;
    }

    /**
     * lender.
     *
     * @return  the lender
     */
    public String getLender() {
        return lender;
    }

    /**
     * newLender.
     *
     * @param   newLender    the lender to set
     */
    public void setLender(String newLender) {
        lender = newLender;
    }

    /**
     * repaymentPeriod.
     *
     * @return  the repaymentPeriod
     */
    public Integer getRepaymentPeriod() {
        return repaymentPeriod;
    }

    /**
     * newRepaymentPeriod.
     *
     * @param   newRepaymentPeriod    the repaymentPeriod to set
     */
    public void setRepaymentPeriod(Integer newRepaymentPeriod) {
        repaymentPeriod = newRepaymentPeriod;
    }

    /**
     * isRepayment.
     *
     * @return  the isRepayment
     */
    public Integer getIsRepayment() {
        return isRepayment;
    }

    /**
     * newIsRepayment.
     *
     * @param   newIsRepayment    the isRepayment to set
     */
    public void setIsRepayment(Integer newIsRepayment) {
        isRepayment = newIsRepayment;
    }

    /**
     * isDel.
     *
     * @return  the isDel
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * newIsDel.
     *
     * @param   newIsDel    the isDel to set
     */
    public void setIsDel(Integer newIsDel) {
        isDel = newIsDel;
    }

    /**
     * createTime.
     *
     * @return  the createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * newCreateTime.
     *
     * @param   newCreateTime    the createTime to set
     */
    public void setCreateTime(Date newCreateTime) {
        createTime = newCreateTime;
    }

    /**
     * rePlans.
     *
     * @return  the rePlans
     */
    public List<RepaymentPlan> getRePlans() {
        return rePlans;
    }

    /**
     * newRePlans.
     *
     * @param   newRePlans    the rePlans to set
     */
    public void setRePlans(List<RepaymentPlan> newRePlans) {
        rePlans = newRePlans;
    }
    
    

   
    // Property accessors






}