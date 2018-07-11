package com.jpmc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.jpmc.beans.Student;

@SuppressWarnings("deprecation")
public class WishGeneratorTest {

	public static void main(String[] args) {
		Resource res = null;
		BeanFactory factory = null;
		Student bean = null;

		res = new ClassPathResource("com/jpmc/cfgs/applicationContext.xml");
		// Create IOC Container
		factory = new XmlBeanFactory(res);
		// get Bean
		bean = factory.getBean("st", Student.class);
		// use bean
		bean.showDetails();
	}

}
