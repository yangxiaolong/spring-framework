package org.springframework.test.recycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.recycle.aspect.LogAspects;
import org.springframework.test.recycle.calc.Calculate;
import org.springframework.test.recycle.calc.DoCalculate;

/**
 * Created by yangxiaolong
 */
@Configuration
@ComponentScan("org.springframework.test.recycle")
@EnableAspectJAutoProxy(exposeProxy = true) // 开启注解的AOP模式
public class AopConfig {

	@Bean
	public LogAspects logAspects() { // 注册到IOC容器中
		return new LogAspects();
	}

}
