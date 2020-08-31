package com.test06;

public class BeanFactory {

	Object getBean(String beanName) {

		if (beanName.equals("SS")) {
			return new SSTV();
		} else if (beanName.equals("IG")) {
			return new IgTV();
		}
		return null;
	}
}
