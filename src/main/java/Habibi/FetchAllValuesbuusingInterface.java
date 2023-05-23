package Habibi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;


public class FetchAllValuesbuusingInterface
{
	public static void main(String[] args)
	{
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		 EntityManager entityManager=entityManagerFactory.createEntityManager();
		    
		 Query query=entityManager.createQuery("select createTable from Student createTable",CreateTable.class);
		 
		 List<CreateTable> listtable=query.getResultList();
		 for(CreateTable createTable:listtable)
		 {
				System.out.println("student_id"+":"+createTable.getStudent_id()+" "+"student_name"+":"+createTable.getStudent_name()+""
						+ " "+"student_eid"+":"+createTable.getStudent_eid());
 
		 }
		 

	}

}
