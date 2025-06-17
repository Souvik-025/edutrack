package edutrack.config;

import java.util.Properties;

import javax.sql.DataSource;
import javax.validation.Validator;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
@ComponentScan(basePackages = {"edutrack.repository","edutrack.service"})
@EnableTransactionManagement
public class HibernateConfig {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5432/edutrack");
		ds.setUsername("postgres");
		ds.setPassword("root");
		return ds;
	}

	@Bean
	public LocalSessionFactoryBean getSessionFactoryBean() {
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(getDataSource());
		Properties pro = new Properties();
		pro.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		pro.setProperty("hibernate.hbm2ddl.auto", "update");
		pro.setProperty("hibernate.show_sql", "true");
		sf.setPackagesToScan("edutrack.model");
		sf.setHibernateProperties(pro);
		return sf;
	}

	@Bean
	public PlatformTransactionManager getTransaction(SessionFactory sf) {
		HibernateTransactionManager ht = new HibernateTransactionManager();
		ht.setSessionFactory(sf);
		return ht;
	}	
	
	@Bean
	public Validator getValidator() {
		return new LocalValidatorFactoryBean();
	}
}
