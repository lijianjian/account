/**
 * Project Name:account
 * File Name:BaseDao.java
 * Package Name:com.jjl.pfm.common.dao
 * Date:2016-3-26����11:11:28
 *
*/

package com.jjl.pfm.common.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * Description: Hibernate������.
 * Date:     2016-3-26 ����11:11:28
 * @author   jjl
 */

public class BaseHibernateDao extends HibernateDaoSupport {
	
    
    /**
     * setMySessionFactory:ע��SessionFactory.
     * @param sessionFactory Session����
     * @date 2016��4��2�� ����8:41:38 
     * @author jjl
     */
    @Autowired  
    public final void setMySessionFactory(SessionFactory sessionFactory) {  
        super.setSessionFactory(sessionFactory);  
    }  
    
	
	
}

