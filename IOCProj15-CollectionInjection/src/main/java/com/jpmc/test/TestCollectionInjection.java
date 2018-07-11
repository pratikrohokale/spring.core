package com.jpmc.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.jpmc.beans.College;
import com.jpmc.beans.EmployeeDetails;
import com.jpmc.beans.Faculty;
import com.jpmc.beans.Person;
import com.jpmc.beans.University;

public class TestCollectionInjection {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		BeanDefinitionReader reader = null;
		Person person = null;
		College college = null;
		Faculty faculty = null;
		University university = null;
		EmployeeDetails eDetails = null;
		// create IOC container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("com/jpmc/cfgs/applicationContext.xml"));
		// get bean
		person = factory.getBean("person", Person.class);
		college = factory.getBean("college", College.class);
		faculty = factory.getBean("faculty", Faculty.class);
		university = factory.getBean("university", University.class);
		eDetails = factory.getBean("eDetails",EmployeeDetails.class);
				
		// use bean
		System.out.println(person);
		System.out.println(college);
		System.out.println(faculty);
		System.out.println(university);
		System.out.println(eDetails);
	}

}
