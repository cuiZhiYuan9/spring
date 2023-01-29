package org.springframework.factorybean.FactoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class Test implements FactoryBean<Test> {
	@Override
	public Test getObject() throws Exception {
		return new Test();
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}
}
