package Habibi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updateusingtheFind 
{
 public static void main(String[] args)
 {
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		CreateTable createTable=entityManager.find(CreateTable.class, 3);
		
		createTable.setStudent_name("mudduuuuuuuuuuuu");
		createTable.setStudent_eid("mudduuuuuuuu@gmail.com");
		
		entityTransaction.begin();
		entityManager.merge(createTable);

		
		entityTransaction.commit();
		
		
		
		System.out.println("update is done.............");

		
		
}
}
