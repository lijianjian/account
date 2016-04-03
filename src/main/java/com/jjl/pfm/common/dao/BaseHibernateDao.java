/**
 * Project Name:account
 * File Name:BaseDao.java
 * Package Name:com.jjl.pfm.common.dao
 * Date:2016-3-26下午11:11:28
 *
*/

package com.jjl.pfm.common.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * Description: Hibernate基础类.
 * Date:     2016-3-26 下午11:11:28
 * @author   jjl
 */

public class BaseHibernateDao extends HibernateDaoSupport {
	
    
    /**
     * setMySessionFactory:注入SessionFactory.
     * @param sessionFactory Session工厂
     * @date 2016年4月2日 下午8:41:38 
     * @author jjl
     */
    @Autowired  
    public final void setMySessionFactory(SessionFactory sessionFactory) {  
        super.setSessionFactory(sessionFactory);  
    }  
    
	
	
}

