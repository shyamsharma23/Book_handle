package com.collectionproject.java;
import java.util.*;
import java.util.stream.Collectors;

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
			obj2.setBookId(id2);
			System.out.println("Enter the Book Name");
			obj2.setBookName(sc.next());
			System.out.println("Enter the author name");
			obj2.setAuthorName(sc.next());
			System.out.println("Enter the description");
			obj2.setDescription(sc.next());
			pair.put(id2, obj2);
			user.setFavorite(obj2);
			
			System.out.println("Enter the info of Completed book");
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
			
			userlist.add(user);

		}
		
	}

	public void display(){
		System.out.println("Enter the userid of which you want to display details::");
		int i_d = sc.nextInt();
		Set<Book> bookone = userlist.stream().filter(u->u.getUserId()==i_d).map(u->u.getNewBooks()).collect(Collectors.toSet());
		Set<Book> booktwo = userlist.stream().filter(u->u.getUserId()==i_d).map(u->u.getCompleted()).collect(Collectors.toSet());
		Set<Book> bookthree = userlist.stream().filter(u->u.getUserId()==i_d).map(u->u.getFavorite()).collect(Collectors.toSet());
		System.out.println("Details of New book");
		for(Book ele: bookone) {
			System.out.println(ele.getBookId());
			System.out.println(ele.getBookName());
			System.out.println(ele.getAuthorName());
			System.out.println(ele.getDescription());
		}
		System.out.println("Details of Completed Book:");
		for(Book ele: booktwo) {
			System.out.println(ele.getBookId());
			System.out.println(ele.getBookName());
			System.out.println(ele.getAuthorName());
			System.out.println(ele.getDescription());
		}
		System.out.println("Details of favorite book:");
		for(Book ele: bookthree) {
			System.out.println(ele.getBookId());
			System.out.println(ele.getBookName());
			System.out.println(ele.getAuthorName());
			System.out.println(ele.getDescription());
		}
	}
	
	public static void main(String[] args) {
		MagicOfBooks val = new MagicOfBooks();
		val.insertBook();
		
		val.display();
	}
	
}


