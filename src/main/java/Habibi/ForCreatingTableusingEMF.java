package Habibi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ForCreatingTableusingEMF 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		CreateTable createTable=new CreateTable();
		createTable.setStudent_id(1);
		createTable.setStudent_name("siddu");
		createTable.setStudent_eid("siddu@gmail.com");
		
		//CreateTable createTable1=new CreateTable();//this is another method to store the data to create new reference variable
//		createTable1.setStudent_id(7);//we can store n number of data.........
//		createTable1.setStudent_name("kavana");
//		createTable1.setStudent_eid("kavana@gmail.com");
//		
//		createTable1.setStudent_id(11);
//		createTable1.setStudent_name("riya");
//		createTable1.setStudent_eid("riya@gmail.com");
//		
//		createTable1.setStudent_id(12);
//		createTable1.setStudent_name("amith");
//		createTable1.setStudent_eid("amith@gmail.com");
//		
//		entityTransaction.begin();
//		entityManager.persist(createTable1);
//		entityTransaction.commit();

		
		
		createTable.setStudent_id(2);
		createTable.setStudent_name("bindu");
		createTable.setStudent_eid("bindu@gmail.com");
		
		createTable.setStudent_id(3);
		createTable.setStudent_name("sindhu");
		createTable.setStudent_eid("sindhu@gmail.com");
		
		createTable.setStudent_id(4);
		createTable.setStudent_name("sinchu");
		createTable.setStudent_eid("sinchu@gmail.com");
		
		createTable.setStudent_id(5);
	    createTable.setStudent_name("akshu");
     	createTable.setStudent_eid("akshu@gmail.com");
		
        createTable.setStudent_id(6);
		createTable.setStudent_name("supriya");
		createTable.setStudent_eid("supriya@gmail.com");
		
		createTable.setStudent_id(8);
		createTable.setStudent_name("kavya");
		createTable.setStudent_eid("kavya@gmail.com");
		
		createTable.setStudent_id(9);
		createTable.setStudent_name("sumithra");
		createTable.setStudent_eid("sumi56@gmail.com");
		
		createTable.setStudent_id(10);
		createTable.setStudent_name("nagraj");
		createTable.setStudent_eid("");
		
		createTable.setStudent_id(13);
		createTable.setStudent_name("gouthami");
		createTable.setStudent_eid("abc@gmail.com");
		
		createTable.setStudent_id(14);
		createTable.setStudent_name("ganavi");
		createTable.setStudent_eid("ganavi@gmail.com");
		
		createTable.setStudent_id(15);
		createTable.setStudent_name("jothi");
		createTable.setStudent_eid("jothi@gmail.com");
		
		createTable.setStudent_id(16);
		createTable.setStudent_name("jeevan");
		createTable.setStudent_eid("jeevan@gmail.com");
		
		
			
        			
		
		
		entityTransaction.begin();
		entityManager.persist(createTable);
		entityManager.persist(createTable);
		entityManager.persist(createTable);
		entityManager.persist(createTable);


		
		entityTransaction.commit();
		
		
		
		System.out.println("Data inserted..............");
	}

}
