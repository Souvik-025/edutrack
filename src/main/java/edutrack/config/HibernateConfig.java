package edutrack.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
@ComponentScan(basePackages = {"edutrack.repository","edutrack.service"})
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "edutrack.repository")
public class HibernateConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5432/edutrack");
		ds.setUsername("postgres");
		ds.setPassword("root");
		return ds;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean sf = new LocalContainerEntityManagerFactoryBean();
		
		Properties pro = new Properties();
		// To keep properties related orm framework create properties object
		pro.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		pro.setProperty("hibernate.hbm2ddl.auto", "update");
		pro.setProperty("hibernate.show_sql", "true");
		
		sf.setPackagesToScan("edutrack.model");		
		sf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		sf.setJpaProperties(pro);
		sf.setDataSource(dataSource());
		
		return sf;
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory ef) {
//		JpaTransactionManager jt = new JpaTransactionManager(ef); We can also pass ef(EntityManagerFactory) in constructor
		JpaTransactionManager jt = new JpaTransactionManager();
		jt.setEntityManagerFactory(ef);
		return jt;
	}	
	
	@Bean
	public Validator getValidator() {
		return new LocalValidatorFactoryBean();
	}
}
