package com.Medplus_Traders.Medplus_Traders.Repository;



import org.springframework.security.config.annotation.web.builders.WebSecurity;

public class SecurityConfiguration
{
	
	protected void configure(WebSecurity web) throws Exception
	 {
		 web
		    .ignoring()
		    .antMatchers("/h2-console/**");
	 }

}
