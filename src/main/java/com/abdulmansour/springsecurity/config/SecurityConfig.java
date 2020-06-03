package com.abdulmansour.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //inject the db dataSource bean that was created in AppConfig
    @Autowired
    DataSource securityDataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //use jdbc authentication to retrieve users from db
        auth.jdbcAuthentication().dataSource(securityDataSource);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasRole("EMPLOYEE")
                .antMatchers("/leaders/**").hasRole("MANAGER")
                .antMatchers("/systems/**").hasRole("ADMIN")
                .and()
                .formLogin()
                .loginPage("/showLoginPage")
                .loginProcessingUrl("/authenticateUser")
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .and()
                .exceptionHandling()
                .accessDeniedPage("/access-denied");

        //the following code is authorization for landing page implementation

//        http.authorizeRequests()
//                .antMatchers("/").permitAll()  // allow public access to home page
//                .antMatchers("/employees").hasRole("EMPLOYEE")
//                .antMatchers("/leaders/**").hasRole("MANAGER")
//                .antMatchers("/systems/**").hasRole("ADMIN")
//                .and()
//                .formLogin()
//                .loginPage("/showLoginPage")
//                .loginProcessingUrl("/authenticateUser")
//                .permitAll()
//                .and()
//                .logout()
//                .logoutSuccessUrl("/")  // after logout then redirect to landing page (root)
//                .permitAll();
    }
}
