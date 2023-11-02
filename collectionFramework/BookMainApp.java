package collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;


import java.util.Scanner;

class Book{
	int bookNum;
	String bookName;
	float price;
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Book(int bookNum, String bookName, float price) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", bookName=" + bookName + ", price=" + price + "]";
	}
	
	
}
public class BookMainApp {

	public static void main(String[] args) {

ArrayList<Book> ob=new ArrayList<Book>();
Scanner sc=new Scanner(System.in);
int choice;
do {
	System.out.println("Enter your choice");
	
	System.out.println("1.Add Book");
	System.out.println("2.Display Book Details");
	System.out.println("3.Search Book");
	choice=sc.nextInt();
	
	switch(choice) {
	case 1:
		System.out.println("enter Book number");
		int bookNum=sc.nextInt();
		System.out.println("enter Book Name");
		String bookName=sc.next();
		System.out.println();
		System.out.println("enter Book Price");
		float price=sc.nextFloat();
		 Book book = new Book(bookNum, bookName, price);
         ob.add(book);
         break;
         
	
		
	}
	
}while(choice!=0);
	}

}
	
	
	
	
		



		