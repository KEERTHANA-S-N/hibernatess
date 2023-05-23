package Habibi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updatethevaluesbycreatingobject
{
 public static void main(String[] args) 
 {
	    EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		
		CreateTable createTable=new CreateTable();
		createTable.setStudent_id(1);
		createTable.setStudent_name("samprithhhhhhhhhhh");
		createTable.setStudent_eid("samprithhhh@gmail.com");
		
		createTable.setStudent_id(2);
		createTable.setStudent_name("dingiiiiiiiiiiiiiiiiii");
		createTable.setStudent_eid("dingiiiiiiiiiiiii@gmail.com");
		
		entityTransaction.begin();
		entityManager.merge(createTable);//merge for update.........

		
		entityTransaction.commit();
		
		
		
		System.out.println("update..............");

	}

}
