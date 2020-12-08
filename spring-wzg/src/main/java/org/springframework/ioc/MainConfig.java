package org.springframework.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName MainConfig
 * @Description TODO
 * @Author wzg
 * @Date 2020/11/30 22:56
 * @Version 1.0
 **/

@Configuration
@Import(value = {MyService.class})
@ComponentScan(basePackages = "org.springframework.ioc")
public class MainConfig {

	@Bean
	public MyDataSource myDataSource() {
		return new MyDataSource();
	}
}
