package io.pivotal.pal.paluserprovidedservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.util.ClassUtils;

import javax.sql.DataSource;
import java.sql.Driver;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class PalUserProvidedServicesApplication {


	public static void main(String[] args) {
		SpringApplication.run(PalUserProvidedServicesApplication.class, args);
	}

//	@Bean
//	ServiceCredentials serviceCredentials(@Value("${vcap.services}") String vcapServices) {
//		return new ServiceCredentials(vcapServices);
//	}

//	@Bean
//	public DataSource getDataSource(ServiceCredentials serviceCredentials) throws Exception {
//		String databaseName = serviceCredentials.getCredential("SERVICE_INSTANCE", "user-provided", "databasename");
//		String host = serviceCredentials.getCredential("SERVICE_INSTANCE", "user-provided", "host");
//		String password = serviceCredentials.getCredential("SERVICE_INSTANCE", "user-provided", "password");
//		String port = serviceCredentials.getCredential("SERVICE_INSTANCE", "user-provided", "port");
//		String username = serviceCredentials.getCredential("SERVICE_INSTANCE", "user-provided", "username");
//
//		String driverClassName = "com.mysql.jdbc.Driver";
//		String jdbcUrl = "jdbc:mysql://"+host+":"+port+"/"+databaseName+"?useSSL=false&useTimezone=true&serverTimezone=UTC&useLegacyDatetimeCode=false";
//
//		final Class<?> driverClass = ClassUtils.resolveClassName(driverClassName, this.getClass().getClassLoader());
//		final Driver driver = (Driver) ClassUtils.getConstructorIfAvailable(driverClass).newInstance();
//		return new SimpleDriverDataSource(driver, jdbcUrl, username, password);
//
////			final DataSource dataSource = DataSourceBuilder.create().driverClassName(driverClassName).url(jdbcUrl).username(username).password(password).build();
//		//return new JdbcTemplate(dataSource);
//
//	}



}
