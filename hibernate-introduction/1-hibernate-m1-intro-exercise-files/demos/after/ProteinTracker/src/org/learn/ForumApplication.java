package org.learn;

import java.util.List;

import org.hibernate.Session;
import org.learn.forum.domain.Topic;
import org.learn.forum.domain.Answer;
import org.learn.forum.domain.ForumUser;
import org.learn.forum.domain.Question;

public class ForumApplication {

	public static void main(String[] args) {
		createTopic(new Topic("Java"));
		createTopic(new Topic("SQL"));
		createTopic(new Topic("Redis"));

		List<Topic> topicList = getAllTopics();
		System.out.println(topicList);

		createUser();

	}

	private static void createUser() {
		List<Topic> topicList = getAllTopics();

		ForumUser user = new ForumUser();
		Question question = new Question("Java stack overflow", "Not getting idea about stack.");
		user.setUserName("Test ForumUser");
		user.getInterestedTopics().add(topicList.get(0));
		question.setTopic(topicList.get(0));
		// user.getInterestedTopics().add(topicList.get(1));
		user.getInterestedTopics().add(topicList.get(2));
		Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.save(user);

		session.save(question);

		session.getTransaction().commit();
		session.close();

		//

		List<Question> questions = getAllQuestions();
		List<ForumUser> forumUsers = getAllUsers();
		Answer answer = new Answer("That is right", questions.get(0));
		answer.setUser(forumUsers.get(0));

		Session session2 = HibernateSessionFactoryUtil.getSessionFactory().openSession();
		session2.beginTransaction();
		session2.save(answer);
		session2.getTransaction().commit();
		session2.close();

		List<Question> questions2 = getAllQuestions();
		/*
		 * for(Question q : questions2){ System.out.println(q.getDescription());
		 * for(Answer ans : q.getAnswers()){
		 * System.out.println(ans.getAnswer()); } }
		 */
		System.out.println("Complete");

	}

	private static void createTopic(Topic topic) {
		System.out.println("");
		Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.save(topic);
		session.getTransaction().commit();
		session.close();

		System.out.println("Topic Created");
	}

	private static List<Topic> getAllTopics() {
		Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

		List<Topic> list = session.createQuery("from Topic").list();
		session.close();
		return list;
	}

	private static List<Question> getAllQuestions() {
		Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

		List<Question> list = session.createQuery("from Question").list();
		session.close();
		return list;
	}

	private static List<Answer> getAllAnswers() {
		Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

		List<Answer> list = session.createQuery("from Answer").list();
		session.close();
		return list;
	}

	private static List<ForumUser> getAllUsers() {
		Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
		List<ForumUser> list = session.createQuery("from ForumUser").list();
		session.close();
		return list;
	}

}
