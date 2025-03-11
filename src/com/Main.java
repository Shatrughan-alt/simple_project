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
	}
}
