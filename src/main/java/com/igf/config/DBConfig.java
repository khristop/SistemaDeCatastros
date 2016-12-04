package com.igf.config;

import com.igf.entidades.DepartamentoEntity;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * Created by Christopher on 4/12/2016.
 */

@Configuration
@EnableTransactionManagement
public class DBConfig {
    @Bean
    public HibernateTemplate hibernateTemplate(){
        return new HibernateTemplate(sessionFactory());
    }

    @Bean
    public SessionFactory sessionFactory(){
        return new LocalSessionFactoryBuilder(getDataSource())
                .addAnnotatedClasses(DepartamentoEntity.class)
                .buildSessionFactory();
    }

    @Bean
    public DataSource getDataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/catastro");
        dataSource.setUsername("root");
        dataSource.setPassword("toor");
        return dataSource;
    }
    @Bean
    public HibernateTransactionManager hibTransMan(){
        return new HibernateTransactionManager(sessionFactory());
    }
}
