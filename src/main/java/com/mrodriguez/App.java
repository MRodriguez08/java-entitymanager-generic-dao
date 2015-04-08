package com.mrodriguez;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.mrodriguez.persistence.DaoFactory;
import com.mrodriguez.persistence.dao.UserDao;
import com.mrodriguez.persistence.dao.UserRoleDao;
import com.mrodriguez.persistence.entities.UserEntity;
import com.mrodriguez.persistence.entities.UserRoleEntity;


@SpringBootApplication
public class App implements CommandLineRunner{
	
	private static final Logger logger = Logger.getLogger(App.class);
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserRoleDao userRoleDao;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);		
	}

	public void run(String... arg0) throws Exception {
		listUsers();
		listRoles();		
	}
	
	private void listUsers(){
    	logger.info("####################################################");
    	logger.info("Listing users");
    	List<UserEntity> users = userDao.findAll();
    	for (UserEntity e : users){
    		logger.info("------------------------------------");
    		logger.info("email: " + e.getEmail());
    		logger.info("name: " + e.getName());
    		logger.info("surname: " + e.getSurname());
    	}
    }
    
    private void listRoles(){
    	logger.info("####################################################");
    	logger.info("Listing roles");
    	List<UserRoleEntity> roles = userRoleDao.findAll();
    	for (UserRoleEntity e : roles){
    		logger.info("------------------------------------");
    		logger.info("id: " + e.getId());
    		logger.info("name: " + e.getName());
    	}
    }
	
}
