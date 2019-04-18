package com.ua.configuration;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
//@PropertySource("classpath:application.properties")
//@EnableJpaRepositories("com.ua.db.repository")
public class DataSourceConfig {

//    /**
//     * Create jdbcTemplate bean
//     *
//     * @return bean for jdbc template
//     */
//    @Bean(name = "namedParameterJdbcTemplate")
//    public NamedParameterJdbcTemplate getJdbcTemplate(DataSourceProperties dataSourceProperties) {
//        return new NamedParameterJdbcTemplate(getDataSource(dataSourceProperties));
//    }
//
//    /**
//     *
//     * @return datasource properties
//     */
//    @Bean
//    @Primary
//    @ConfigurationProperties("app.datasource")
//    public static DataSourceProperties dataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
    /**
     * @return bean for datasource
     */
    @Bean("dataSource")
    public DataSource getDataSource(DataSourceProperties dataSourceProperties) {
       return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource,
                                                                       JpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(dataSource);
        bean.setJpaVendorAdapter(jpaVendorAdapter);
        bean.setPackagesToScan("com.ua.db.entity");
        return bean;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter bean = new HibernateJpaVendorAdapter();
        bean.setDatabase(Database.H2);
        bean.setGenerateDdl(true);
        bean.setShowSql(true);
        return bean;
    }

}
