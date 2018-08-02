package com.schedule.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteDataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	public void configureGlobalSecurity (AuthenticationManagerBuilder auth)
		throws Exception {
		
		// for now in memory authenticator used for test
		auth.jdbcAuthentication()
		.dataSource(dataSource)
		.passwordEncoder(passwordEncoder())
		.usersByUsernameQuery("select username, password from users where username=?")
		.authoritiesByUsernameQuery("select username, role from user_roles where username=?");
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new PasswordEncoder() {
			public boolean matches(CharSequence arg0, String arg1) {
				return arg1.equals(encode(arg0));
			}
			
			public String encode(CharSequence arg0) {
				return (String) arg0;
			}
		};
	}
	
	protected void configure (HttpSecurity http) throws Exception {
		http.authorizeRequests()
		// everyone can access the scratch test pages
		.antMatchers("/scratch/**").permitAll()
		// the rest of the pages require admin permissino
		.antMatchers("/","/login").access("hasRole('user')").and()
		.formLogin()
		.loginPage("/login")
		.permitAll(true);
	}
}
