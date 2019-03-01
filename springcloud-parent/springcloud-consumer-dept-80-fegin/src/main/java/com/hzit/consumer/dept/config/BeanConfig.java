package com.hzit.consumer.dept.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;

//<beans>
@Configuration
public class BeanConfig {

	// <bean id="restTemplate" class="org.springframework.web.client.RestTemplate">
	@Bean
	@LoadBalanced // 开启负载均衡
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}

	/**
	 * 
	 * 更改轮询的算法
	 * 表示添加一个 bena IRule
	 * 
	 * a、如果没有添加IRule,那么系统会自动调用默认的 b、如果有指定的IRule,那么使用自定义的Rule
	 * 
	 * @return
	 */
	@Bean
	public IRule myRule() {
		 //return new RoundRobinRule(); //轮询 默认的方式 默认过滤掉异常提供者
		//return new RandomRule(); // 随机 访问
		 return new RetryRule();//轮询 过滤掉异常提供者
	}

}
