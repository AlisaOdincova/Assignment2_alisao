package no.uio.inf5750.assignment2.dao.hibernate.util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil
{
private static SessionFactory sessionFactory;
private static Session session;
static
{
Configuration configuration = new Configuration();
configuration.configure(); 
sessionFactory = configuration.buildSessionFactory();
session = sessionFactory.openSession();
}
public static Session getCurrentSession()
{
return session;
}
}
