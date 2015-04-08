package com.mrodriguez.persistence;

import com.mrodriguez.persistence.dao.UserDao;
import com.mrodriguez.persistence.dao.UserRoleDao;
import com.mrodriguez.persistence.dao.impl.UserDaoImpl;
import com.mrodriguez.persistence.dao.impl.UserRoleDaoImpl;

/**
 *
 * @author mrodriguez
 */
public class DaoFactory {
	
	private DaoFactory() {}
    
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }   
    
    public static UserRoleDao getUserRoleDao(){
        return new UserRoleDaoImpl();
    } 
    
}
