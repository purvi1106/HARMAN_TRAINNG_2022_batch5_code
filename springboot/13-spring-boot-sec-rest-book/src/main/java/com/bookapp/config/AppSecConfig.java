package com.bookapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
@EnableWebSecurity
public class AppSecConfig extends WebSecurityConfigurerAdapter{

	//----Authentication----
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("raj").password("raj121").roles("ADMIN")
		.and()
		.withUser("ekta").password("ekta121").roles("MGR")
		.and()
		.withUser("gun").password("gun121").roles("EMP");	
	}
	//ur password must be encrypted?
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	//----Authorization policies----
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable().httpBasic().and().authorizeRequests()
		.antMatchers(HttpMethod.PUT, "/api/books/**").hasAnyRole("ADMIN")
		.antMatchers(HttpMethod.DELETE, "/api/books/**").hasAnyRole("ADMIN")
		.antMatchers(HttpMethod.POST, "/api/books/**").hasAnyRole("ADMIN","MGR")
		.antMatchers(HttpMethod.GET, "/api/books/**").hasAnyRole("ADMIN","MGR","EMP")
		.and()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

	}
}
