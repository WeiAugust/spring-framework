package org.springframework.ioc;

import org.springframework.stereotype.Component;

/**
 * @ClassName ClassB
 * @Description TODO
 * @Author wzg
 * @Date 2020/12/3 19:50
 * @Version 1.0
 **/
@Component
public class ClassB {

	private ClassA classA;

	public ClassA getClassA() {
		return classA;
	}

	public void setClassA(ClassA classA) {
		this.classA = classA;
	}
}
