package org.springframework.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.postprocessor.supplier.CreateSupplier;

public class SupplierBEanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		BeanDefinition cao = beanFactory.getBeanDefinition("f");
//		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) cao;
//		genericBeanDefinition.setInstanceSupplier(CreateSupplier::createCao);
	}
}
