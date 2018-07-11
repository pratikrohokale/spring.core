package com.jpmc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.jpmc.beans.WishGenerator;

@SuppressWarnings("deprecation")
public class WishGeneratorTest {

	public static void main(String[] args) {
		Resource res = null;
		BeanFactory factory = null;
		WishGenerator bean = null;

		res = new ClassPathResource("com/jpmc/cfgs/applicationContext.xml");
		// Create IOC Container
		factory = new XmlBeanFactory(res);
		// get Bean
		bean = factory.getBean("wish", WishGenerator.class);
		// use bean
		System.out.println(bean.generateWishMessage("Pratik"));
	}

}
