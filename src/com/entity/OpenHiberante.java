/*package com.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class OpenHiberante {
	private static Configuration configuration;
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	private static Session session;
	private static Transaction transaction;

	public void open() {
		// ����Configuration����:��Ӧhibernate�Ļ���������Ϣ�Ͷ����ϵӳ����Ϣ
		configuration = new Configuration().configure();

		// ����һ������StandardServiceRegistry��configure("���***.cfg.xml")��Ĭ��Ϊhibernate.cfg.xml
		registry = new StandardServiceRegistryBuilder().configure().build();

		// �����Ự��������
		sessionFactory = configuration.buildSessionFactory(registry);

		// ����һ��Session����
		session = sessionFactory.openSession();

		// ��������
		transaction = session.beginTransaction();
	}

	
	 * public void saveNews() { User user = new User("fei", "123");
	 * session.save(user); }
	 
	public boolean getUser(User user) {
		
		String sql = "select username,pwd from User where username='"
				+ user.getUsername() + "'and pwd='" + user.getPwd() + "'";
		List list = session.createQuery(sql).list();
		if (!list.isEmpty()) {
			return true;
		}
		return false;
	}
	   
     * ��User������뵽���ݿ���  
     * @param user  
       
    public void create(User user) {  
    		
    }  

	public void close() {
		// �ύ����
		transaction.commit();
		// �ر�session
		session.close();
		// �ر�SessionFactory����
		sessionFactory.close();
	}
	// public static void main(String[] args) {
	// open();
	// // System.out.println(getUser());
	// close();
	//
	// }
}
*/