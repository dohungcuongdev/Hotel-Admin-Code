package daos.impl;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import daos.TestDAO;

@Repository
@Configuration
@PropertySource("classpath:database.properties")
public class TestDAOImpl implements TestDAO {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	// injecting properties
	@Autowired
	private Environment env;

	@Override
	public String getName() {
		return env.getProperty("HOST");
		
	}

}
