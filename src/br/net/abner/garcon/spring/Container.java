package br.net.abner.garcon.spring;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Container {

	private ApplicationContext contextoSpring;

	private ApplicationContext getContextoSpring() {
		if (contextoSpring == null) {
			contextoSpring = new ClassPathXmlApplicationContext("spring.xml");
		}
		return contextoSpring;
	}

	public Object getBean(String nome) {
		ApplicationContext contexto = getContextoSpring();
		if (contexto != null) {
			try {
				return contexto.getBean(nome);
			} catch (NoSuchBeanDefinitionException ex) {
				return null;
			}
		}
		return null;
	}

	public static synchronized Container getInstancia() {
		return _instancia;
	}

	private static Container _instancia = new Container();

	private Container() {
	}

}
