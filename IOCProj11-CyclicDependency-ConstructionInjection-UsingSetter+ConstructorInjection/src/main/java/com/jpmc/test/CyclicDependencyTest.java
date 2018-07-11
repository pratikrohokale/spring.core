package com.jpmc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.jpmc.beans.A;
import com.jpmc.beans.B;

@SuppressWarnings("deprecation")
public class CyclicDependencyTest {

	public static void main(String[] args) {

		Resource res = null;
		BeanFactory factory = null;
		A bean1 = null;
		B bean2 = null;

		res = new ClassPathResource("com/jpmc/cfgs/applicationContext.xml");
		// Create IOC Container
		factory = new XmlBeanFactory(res);
		// get Bean
		bean1 = factory.getBean("a1", A.class);
		bean2 = factory.getBean("b1", B.class);
		// use bean
		System.out.println(bean1);
		System.out.println(bean2);
	}

}
