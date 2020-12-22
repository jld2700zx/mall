package com.seentao.mall.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PreDestroy;
import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.seentao.*.domain"})
public class MybatisConfig {

    private DruidDataSource dataSource = null;

    @Bean(destroyMethod = "close", name = "dataSource")
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource(){
        dataSource = new DruidDataSource();
        return dataSource;
    }

    @PreDestroy
    public void close() {
        if(dataSource != null){
            dataSource.close();
        }
    }
}
