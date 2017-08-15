package com.ks.configuracion;

import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class DozerConfiguration {
	@Bean(name="org.dozer.Mapper")
	public DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean(
			@Value("classpath*:*mappings/*.xml") Resource[] resources) throws Exception {
		final DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean = new DozerBeanMapperFactoryBean();
		// Other configurations
		dozerBeanMapperFactoryBean.setMappingFiles(resources);
		return dozerBeanMapperFactoryBean;
	}
}
