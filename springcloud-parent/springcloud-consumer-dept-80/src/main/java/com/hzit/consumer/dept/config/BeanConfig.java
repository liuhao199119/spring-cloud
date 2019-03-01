package com.hzit.consumer.dept.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

//<beans>
@Configuration
public class BeanConfig {

	//<bean id="restTemplate" class="org.springframework.web.client.RestTemplate">
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
	
	@Bean
	public IRule MyRule(){
	        return new RandomRule();    
	    }

}
