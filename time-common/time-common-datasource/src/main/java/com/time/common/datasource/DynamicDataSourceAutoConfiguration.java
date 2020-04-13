package com.time.common.datasource;

import com.baomidou.dynamic.datasource.processor.DsProcessor;
import com.baomidou.dynamic.datasource.provider.DynamicDataSourceProvider;
import com.time.common.datasource.config.DataSourceProperties;
import com.time.common.datasource.config.JdbcDynamicDataSourceProvider;
import com.time.common.datasource.config.LastParamDsProcessor;
import lombok.AllArgsConstructor;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @date 2020-04-12
 * @author
 * <p>
 * 动态数据源切换配置
 */
@AllArgsConstructor
@Configuration(proxyBeanMethods = false)
@AutoConfigureAfter(DataSourceAutoConfiguration.class)
@EnableConfigurationProperties(DataSourceProperties.class)
public class DynamicDataSourceAutoConfiguration {
	private final StringEncryptor stringEncryptor;
	private final DataSourceProperties properties;

	@Bean
	public DynamicDataSourceProvider dynamicDataSourceProvider() {
		return new JdbcDynamicDataSourceProvider(stringEncryptor, properties);
	}

	@Bean
	public DsProcessor dsProcessor() {
		return new LastParamDsProcessor();
	}
}
