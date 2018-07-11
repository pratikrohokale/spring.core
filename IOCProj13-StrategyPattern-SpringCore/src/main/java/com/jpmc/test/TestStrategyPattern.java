package com.jpmc.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.jpmc.beans.Vehicle;

public class TestStrategyPattern {

	public static void main(String[] args) {
		Vehicle veh = null;
		Resource res = null;
		DefaultListableBeanFactory factory = null;
		BeanDefinitionReader reader = null;
		
		res = new ClassPathResource("com/jpmc/cfgs/applicationContext.xml");
		//create IOC Container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);
		
		//get Bean
		veh = factory.getBean("vehicle", Vehicle.class);
		//use bean
		veh.move();
		veh.park();

	}

}
