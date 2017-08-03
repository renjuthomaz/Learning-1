package org.learn;

import java.util.Date;

import org.hibernate.Session;
import org.learn.domain.User;
import org.learn.domain.UserAddress;
import org.learn.domain.UserContact;
import org.learn.domain.UserHistory;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hello world");
		Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
		session.beginTransaction();

		System.out.println("Session closed");

		User user = new User("ForumUser 1", 0);
		// Component same table
		user.setUserAddress(new UserAddress("hno", "strt 1", "strt 2"));

		// Component different table.
		user.addUserHistory(new UserHistory(new Date(), "Train1"));
		user.addUserHistory(new UserHistory(new Date(), "Train2"));

		user.setContact(new UserContact("77272","test@test.com", user));
		
		session.save(user);
		session.getTransaction().commit();
		System.out.println("Saving users");

		session.close();
	}

}
