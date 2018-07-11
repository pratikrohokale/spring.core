package com.jpmc.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.jpmc.controller.StudentController;

public class TestLayeredApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		StudentController controller = null;
		factory = new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("com/jpmc/cfgs/applicationContext.xml"));
		// get bean
		controller = factory.getBean("studentController", StudentController.class);
		// use bean
		try {
			System.out.println(controller.registerStudent("101", "pritam", "40", "41", "42"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
