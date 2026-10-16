import model.LibraryItem;
import model.User;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main() {
        Library lb = new Library();
        //items
        LibraryItem li0 = new LibraryItem("book","hero");
        lb.addItem(li0);
        LibraryItem li1= new LibraryItem("dvd","sing");
        lb.addItem(li1);
        LibraryItem li2 = new LibraryItem("book","week ");
        lb.addItem(li2);
        LibraryItem li3 = new LibraryItem("book","good");
        lb.addItem(li3);
        LibraryItem li4 = new LibraryItem("book","money");
        lb.addItem(li4);
        LibraryItem li5 = new LibraryItem("book","taar");
        lb.addItem(li5);
        LibraryItem li6 = new LibraryItem("dvd","singh");
        lb.addItem(li6);
        LibraryItem li7 = new LibraryItem("book","mix");
        lb.addItem(li7);

        User u1 = new User("A");
        lb.addUser(u1);
        User u2 = new User("B");
        lb.addUser(u2);
        User u3 = new User("C");
        lb.addUser(u3);
        User u4 = new User("D");
        lb.addUser(u4);
        User u5 = new User("E");
        lb.addUser(u5);
        User u6 = new User("F");
        lb.addUser(u6);
        User u7 = new User("G");
        lb.addUser(u7);
        User u8 = new User("H");
        lb.addUser(u8);
        User u9 = new User("I");
        lb.addUser(u9);

        System.out.println("____________________________________________");
        System.out.println("Welcome to Borrow Item enter the details below");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID of user ");
        String id = sc.nextLine();
        System.out.print("Enter item Name  ");
        String itemName = sc.nextLine();

        lb.callBorrowItem( id ,  itemName);
        System.out.println("____________________________________________");

        System.out.print("Enter ID of user ");
        String id2 = sc.nextLine();
        System.out.print("Enter item Name  ");
        String itemName2 = sc.nextLine();

        lb.callBorrowItem( id2 ,  itemName2);



    }
}