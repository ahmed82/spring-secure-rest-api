package com.tro.omar.SecureRESTapi.security;
/*
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
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
				.inMemoryAuthentication() 
				.withUser( "Admin").password(passwordEncoder().encode("Admin123")).roles("ADMIN").authorities("CRUD_EMPL","R_EMPL")
				.and()
				.withUser( "manager").password(passwordEncoder().encode("man")).roles("MANAGER")
				.and()
				.withUser("user").password(passwordEncoder().encode("pass")).roles("USER");
	}//AuthenticationManagerBuilder
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http 
			.cors().and().csrf().disable()
			
				.authorizeRequests()
				//.anyRequest().authenticated()
				.antMatchers("/index.html").permitAll()
				
				//.antMatchers("/employees/").permitAll()
				 
				.antMatchers("/employees/**").authenticated()
				.antMatchers("/Admin/**").hasRole("ADMIN")
				.antMatchers("/employees/edit").hasAnyRole("ADMIN","MANAGER") 
				//.antMatchers("/api/employees/**").authenticated()
				.antMatchers("/api/students/**").hasAuthority("CRUD_EMPL")
				
				.and()
				.httpBasic();
		
		
		
	}//HttpSecurity
	
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	
				
				 * @Override
			protected void configure(HttpSecurity http) throws Exception { 
				    http
					    .csrf().disable()
					    .exceptionHandling()
					    .authenticationEntryPoint(restAuthenticationEntryPoint)
					    .and()
						    .authorizeRequests()
							    .antMatchers("/api/foos").authenticated()
							    .antMatchers("/api/admin/**").hasRole("ADMIN")
					    .and()
					   .formLogin()
					   .successHandler(mySuccessHandler)
					   .failureHandler(myFailureHandler)
					    .and()
				    .logout();
			}
				
	
}*/
