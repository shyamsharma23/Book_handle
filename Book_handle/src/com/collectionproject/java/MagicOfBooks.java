package com.collectionproject.java;
import java.util.*;

public class MagicOfBooks {
	
	Scanner sc;
	Map<Integer, Book> pair;
	Set<User> userlist;
	
	public MagicOfBooks() {
		sc = new Scanner(System.in);
		pair = new HashMap<>();
	}
	
	public void insertBook() {
		System.out.println("Enter the number of records");
		int number = sc.nextInt();
		for(int i = 1; i<=number; i++) {
			
			userlist = new HashSet<>();
			User user = new User();
			System.out.println("Enter the user id:");
			int userid = sc.nextInt();
			user.setUserId(userid);
			
			System.out.println("Enter the email:");
			user.setEmailId(sc.next());
			
			System.out.println("Enter the username");
			user.setUsername(sc.next());
			
			System.out.println("Enter the password");
			user.setPassword(sc.next());
			
			System.out.println("Enter the info of New book");
			Book obj = new Book();
			System.out.println("Enter the Book ID");
			int id = sc.nextInt();
			obj.setBookId(id);
			System.out.println("Enter the Book Name");
			obj.setBookName(sc.next());
			System.out.println("Enter the author name");
			obj.setAuthorName(sc.next());
			System.out.println("Enter the description");
			obj.setDescription(sc.next());
			pair.put(id, obj);
			user.setNewBooks(obj);
			
			System.out.println("Enter the info of favorite book");
			Book obj2 = new Book();
			System.out.println("Enter the Book ID");
			int id2 = sc.nextInt();
			obj.setBookId(id2);
			System.out.println("Enter the Book Name");
			obj.setBookName(sc.next());
			System.out.println("Enter the author name");
			obj.setAuthorName(sc.next());
			System.out.println("Enter the description");
			obj.setDescription(sc.next());
			pair.put(id2, obj2);
			user.setFavorite(obj2);
			
			System.out.println("Enter the info of Completed");
			Book obj3 = new Book();
			System.out.println("Enter the Book ID");
			int id3 = sc.nextInt();
			obj3.setBookId(id3);
			System.out.println("Enter the Book Name");
			obj3.setBookName(sc.next());
			System.out.println("Enter the author name");
			obj3.setAuthorName(sc.next());
			System.out.println("Enter the description");
			obj3.setDescription(sc.next());
			pair.put(id3, obj3);
			user.setCompleted(obj3);

		}
		
	}

	public void display(int id){
		
		
	}
	
}
