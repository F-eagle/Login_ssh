package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
	private static SessionFactory sessionFactory = null;

	// ���õ���ģʽ
	private Hibernateutil() {
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			// ����Configuration����:��Ӧhibernate�Ļ���������Ϣ�Ͷ����ϵӳ����Ϣ
			Configuration config = new Configuration().configure();
			// ����һ������StandardServiceRegistry��configure("���***.cfg.xml")��Ĭ��Ϊhibernate.cfg.xml
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
					.configure().build();
			// �����Ự��������
			sessionFactory = config.buildSessionFactory(registry);
			return sessionFactory;
		} else
			return sessionFactory;
	}

}
