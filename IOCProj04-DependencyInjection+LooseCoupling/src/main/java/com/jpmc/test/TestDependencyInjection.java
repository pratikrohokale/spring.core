package com.jpmc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.jpmc.beans.Flipkart;

@SuppressWarnings("deprecation")
public class TestDependencyInjection {

	public static void main(String[] args) {
		Resource res = null;
		BeanFactory factory = null;
		Flipkart bean = null;
		// create resource
		res = new ClassPathResource("com/jpmc/cfgs/applicationContext.xml");
		// create IOC container
		factory = new XmlBeanFactory(res);
		// get bean
		bean = factory.getBean("fpkt", Flipkart.class);
		// use bean
		bean.shopping(new String[] { "shirt", "belt", "pant", "tshirt" });
		
	}

}
