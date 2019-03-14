package com.ashu.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class RootAppConfig {
	@Bean
	public DataSource dataSource() throws PropertyVetoException {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/student";
		String userName = "root";
		String password = "root";
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(driver);
		dataSource.setJdbcUrl(url);
		dataSource.setUser(userName);
		dataSource.setPassword(password);
		return dataSource;
	}

	@Bean
	public HibernateJpaVendorAdapter hibernate() {
		HibernateJpaVendorAdapter hibernate = new HibernateJpaVendorAdapter();
		hibernate.setShowSql(true);
		//hibernate.setPrepareConnection(true);
		return hibernate;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean managerFactory() throws PropertyVetoException {
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setPackagesToScan("com.ashu.entity");
		//factory.setPersistenceUnitName("ashu");
		factory.setDataSource(dataSource());
		factory.setJpaVendorAdapter(hibernate());
		//factory.setJpaDialect(new Jp);;
		return factory;
	}
}
