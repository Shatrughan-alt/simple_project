package com;

import com.model.Author;
import com.model.Book;

public class Main {
	public static void main(String args[]) {
		Book b=new Book();
		b.setTitle("Shatrughan title");
		Author auth=new Author();
		auth.setName("Auth");
		auth.setAuthor("Shatrughan");
		 b.setAuthor(auth);
		System.out.println(b);
		
		Book b1=new Book();
		
		b1.setTitle("Harry title");
		Author auth1=new Author();
		auth1.setName("Harry");
		auth1.setAuthor("Harry");
		 b1.setAuthor(auth1);
		System.out.println(b1);
	}
}
