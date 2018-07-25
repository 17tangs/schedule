package com.schedule.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	public void configureGlobalSecurity (AuthenticationManagerBuilder auth)
		throws Exception {
		
		// for now in memory authenticator used for test
		auth.inMemoryAuthentication().withUser("sabin").password("Infinity01").roles("ADMIN")
		.and()
		.withUser("Sam").password("awesome").roles("ADMIN");
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new PasswordEncoder() {
			@Override
			public boolean matches(CharSequence arg0, String arg1) {
				return arg1.equals(encode(arg0));
			}
			
			@Override
			public String encode(CharSequence arg0) {
				return (String) arg0;
			}
		};
	}
	
	protected void configure (HttpSecurity http) throws Exception {
		// everyone can access login page
		http.authorizeRequests().antMatchers("/login").permitAll() 
		// everyone can access the scratch test pages
		.antMatchers("/scratch/**").permitAll()
		// the rest of the pages require admin permissino
		.antMatchers("/","/**").access("hasRole('ADMIN')").and()
		.formLogin();
	}

}
