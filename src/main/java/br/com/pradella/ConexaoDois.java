package br.com.pradella;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "doisEntityManagerFactory",
    transactionManagerRef = "doisTransactionManager", basePackages = {"br.com.pradella.dois.repo"})
public class ConexaoDois {

	  @Bean(name = "doisDataSource")
	  @ConfigurationProperties(prefix = "dois.datasource")
	  public DataSource dataSource() {
	    return DataSourceBuilder.create().build();
	  }

	  @Bean(name = "doisEntityManagerFactory")
	  public LocalContainerEntityManagerFactoryBean doisEntityManagerFactory(
	      EntityManagerFactoryBuilder builder, @Qualifier("doisDataSource") DataSource dataSource) {
	    return builder.dataSource(dataSource).packages("br.com.pradella.dois.domain").persistenceUnit("bar")
	        .build();
	  }

	  @Bean(name = "doisTransactionManager")
	  public PlatformTransactionManager doisTransactionManager(@Qualifier("doisEntityManagerFactory") EntityManagerFactory doisEntityManagerFactory) {
	    return new JpaTransactionManager(doisEntityManagerFactory);
	  }

}