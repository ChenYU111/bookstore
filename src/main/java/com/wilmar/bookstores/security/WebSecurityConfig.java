package com.wilmar.bookstores.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests().antMatchers("/").permitAll().anyRequest().authenticated().and()
			.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/user/list")
				.failureUrl("/login")
				.permitAll()
			    .and()
			.logout()
				.permitAll();
	}

	@Bean
	MyAuthenticationProvider myAuthenticationProvider() {
		MyAuthenticationProvider myAuthenticationProvider = new MyAuthenticationProvider();
		return myAuthenticationProvider;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.authenticationProvider(myAuthenticationProvider());// 这个设置默认为true
																// 为了清除密码
	}
}
