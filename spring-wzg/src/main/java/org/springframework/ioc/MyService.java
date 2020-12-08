package org.springframework.ioc;

import org.springframework.stereotype.Component;

/**
 * @ClassName MyService
 * @Description TODO
 * @Author wzg
 * @Date 2020/11/30 23:01
 * @Version 1.0
 **/

@Component
public class MyService {

	public MyService() {
		System.out.println("=====call MyService constructor=====");
	}
}
