package com.ua.configuration;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class DataSourceConfig {

    /**
     * @return bean for jdbc template
     */
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSourceProperties dataSourceProperties) {
        return new JdbcTemplate(getDataSource(dataSourceProperties));
    }

    /**
     *
     * @return datasource properties
     */
    @Bean
    @Primary
    @ConfigurationProperties("app.datasource")
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    /**
     * @return bean for datasource
     */
    @Bean("dataSource")
    public DataSource getDataSource(DataSourceProperties dataSourceProperties) {
        DataSource dataSource = dataSourceProperties.initializeDataSourceBuilder().build();
        return dataSource;
    }

}
