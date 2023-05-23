package Habibi;

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

public class TogetConnectionusingEntityManagerFactory
{
 public static void main(String[] args)
 {
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		System.out.println("Connection is Established Now.........");
}
}
