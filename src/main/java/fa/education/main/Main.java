package fa.education.main;

import fa.education.session.SessionFactory;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new SessionFactory();
        org.hibernate.SessionFactory sessionFactory1 = sessionFactory.sessionFactory();
        Session session = sessionFactory1.openSession();
        session.beginTransaction();
        session.getTransaction().commit();
        sessionFactory1.close();
    }
}
