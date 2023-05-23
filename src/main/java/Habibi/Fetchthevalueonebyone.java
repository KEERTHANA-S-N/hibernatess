package Habibi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetchthevalueonebyone
{
public static void main(String[] args) 
{
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		CreateTable createTable=entityManager.find(CreateTable.class, 1);
		
		System.out.println("student_id"+":"+createTable.getStudent_id()+" "+"student_name"+":"+createTable.getStudent_name()+" "+
		"student_eid"+":"+createTable.getStudent_eid());

		
}
}
