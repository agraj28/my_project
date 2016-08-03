package com.backend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.insbackend.doa.ProductsDao;
import com.niit.insbackend.doa.ProductsDaoImpl;
import com.niit.insbackend.model.Products;

import com.niit.insbackend.doa.InsDao;
import com.niit.insbackend.doa.InsDaoImpl;
import com.niit.insbackend.model.Ins;

import com.niit.insbackend.doa.PackagesDao;
import com.niit.insbackend.doa.PackagesDaoImpl;
import com.niit.insbackend.model.Packages;

import com.niit.insbackend.doa.UserDao;
import com.niit.insbackend.doa.UserDaoImpl;
import com.niit.insbackend.model.User;

@Configuration
@ComponentScan("com.niit.insbackend")
@EnableTransactionManagement

public class ApplicationContextConfig {
	

	
 	
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl(" jdbc:h2:~/test");

		dataSource.setUsername("sa");
		dataSource.setPassword("hello");
		return dataSource;
	}
    
   
    
    private Properties getHibernateProperties() {
    	Properties properties = new Properties();
    	properties.setProperty("hibernate.hbm2ddl.auto","update");
    	properties.put("hibernate.show_sql", "true");
     	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
    	return properties;
    }
    
    @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {
    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
    	sessionBuilder.addProperties(getHibernateProperties());
    	sessionBuilder.addAnnotatedClass(Products.class);
    	sessionBuilder.addAnnotatedClass(Ins.class);
    	sessionBuilder.addAnnotatedClass(Packages.class);
    	sessionBuilder.addAnnotatedClass(User.class);
      	return sessionBuilder.buildSessionFactory();
    }
    
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(
			SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(
				sessionFactory);

		return transactionManager;
	}
    
   


	
	  @Autowired
	    @Bean(name = "ProductsDao")
	    public ProductsDao getProductsDao(SessionFactory sessionFactory) {
	    	return new ProductsDaoImpl(sessionFactory);
	    }
	
	  @Autowired
	    @Bean(name = "PackagesDao")
	    public PackagesDao getPackagesDao(SessionFactory sessionFactory) {
	    	return new PackagesDaoImpl(sessionFactory);
	    }
	  @Autowired
	    @Bean(name = "UserDao")
	    public UserDao getUserDao(SessionFactory sessionFactory) {
	    	return new UserDaoImpl(sessionFactory);
	    }
	

}
