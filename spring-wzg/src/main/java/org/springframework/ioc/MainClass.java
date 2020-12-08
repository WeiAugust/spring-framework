package org.springframework.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName MainClass
 * @Description TODO
 * @Author wzg
 * @Date 2020/11/30 22:54
 * @Version 1.0
 **/
public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		context.getBean("classA");
	}
}
