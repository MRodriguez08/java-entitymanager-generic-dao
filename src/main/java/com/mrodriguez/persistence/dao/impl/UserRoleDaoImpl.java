package com.mrodriguez.persistence.dao.impl;

import org.springframework.stereotype.Component;

import com.mrodriguez.persistence.dao.UserRoleDao;
import com.mrodriguez.persistence.entities.UserRoleEntity;

/**
*
* @author mrodriguez
*/
@Component("userRoleDao")
public class UserRoleDaoImpl extends DaoImpl<Integer , UserRoleEntity> implements UserRoleDao {
   
}
