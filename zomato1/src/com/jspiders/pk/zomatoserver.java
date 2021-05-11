package com.jspiders.pk;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class zomatoserver {

	public static void main(String[] args) {
		

		BeanFactory container = new XmlBeanFactory(new FileSystemResource("config.xml"));
	User user =(User)container.getBean("rcb");
	user.needFood();
	}
}
