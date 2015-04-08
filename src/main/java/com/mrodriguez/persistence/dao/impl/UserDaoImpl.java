package com.mrodriguez.persistence.dao.impl;

import org.springframework.stereotype.Component;

import com.mrodriguez.persistence.dao.UserDao;
import com.mrodriguez.persistence.entities.UserEntity;

/**
*
* @author mrodriguez
*/
@Component("userDao")
public class UserDaoImpl extends DaoImpl<String , UserEntity> implements UserDao {

   
}
