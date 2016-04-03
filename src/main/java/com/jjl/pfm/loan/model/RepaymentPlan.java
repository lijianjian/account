package com.jjl.pfm.loan.model;
// default package

import java.util.Date;


/**
 * RepaymentPlan entity. @author MyEclipse Persistence Tools
 */

public class RepaymentPlan  implements java.io.Serializable {


    // Fields    

     /**
     * serialVersionUID:.
     */
    private static final long serialVersionUID = 1L;
    private Long id;
     private Long loanId;
     private Date repaymentTime;
     private Double repaymentAmount;
     private Double principal;
     private Double interest;
     
     private Integer isRepayment;
     
     private Loan loan;


    // Constructors

    /** default constructor */
    public RepaymentPlan() {
    }

	/** minimal constructor */
    public RepaymentPlan(Long id) {
        this.id = id;
    }
    
    
    
    public Double getPrincipal() {
		return principal;
	}

	public void setPrincipal(Double principal) {
		this.principal = principal;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	/** full constructor */
    public RepaymentPlan(Long id, Long loanId, Date repaymentTime, Double repaymentAmount, Integer isRepayment) {
        this.id = id;
        this.loanId = loanId;
        this.repaymentTime = repaymentTime;
        this.repaymentAmount = repaymentAmount;
        this.isRepayment = isRepayment;
    }

   
    // Property accessors

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getLoanId() {
        return this.loanId;
    }
    
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public Date getRepaymentTime() {
        return this.repaymentTime;
    }
    
    public void setRepaymentTime(Date repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    public Double getRepaymentAmount() {
        return this.repaymentAmount;
    }
    
    public void setRepaymentAmount(Double repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public Integer getIsRepayment() {
        return this.isRepayment;
    }
    
    public void setIsRepayment(Integer isRepayment) {
        this.isRepayment = isRepayment;
    }
   








}