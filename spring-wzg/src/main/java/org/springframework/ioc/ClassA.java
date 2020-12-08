package org.springframework.ioc;

import org.springframework.stereotype.Component;

/**
 * @ClassName ClassA
 * @Description TODO
 * @Author wzg
 * @Date 2020/12/3 19:49
 * @Version 1.0
 **/
@Component
public class ClassA {

	private ClassB classB;

	public ClassB getClassB() {
		return classB;
	}

	public void setClassB(ClassB classB) {
		this.classB = classB;
	}
}
