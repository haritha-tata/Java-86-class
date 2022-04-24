package co.edureka.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Batch;
import co.edureka.hibernate.entity.Faculty;
import co.edureka.hibernate.utils.HibernateUtils;

public class Relationships {

	public static void main(String[] args) {
		Session session = HibernateUtils.getHibernateSession();
		Transaction tx = session.beginTransaction();
	
		Faculty faculty = new Faculty(101, "Sunil Joseph");
		
		Batch batch1 = new Batch(1, "Java Certification", faculty);
		Batch batch2 = new Batch(2, "Python Certification", faculty);
		Batch batch3 = new Batch(3, "Microservices Certification", faculty);
		
		Set<Batch> batches = new HashSet<Batch>();
		batches.add(batch1);
		batches.add(batch2);
		batches.add(batch3);
		
		faculty.setBatches(batches);
		
		session.save(faculty);		
		
		tx.commit();
		session.close();
	}
}
