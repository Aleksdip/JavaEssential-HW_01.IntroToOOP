package task_02.book;

import java.util.Scanner;

public class Book {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      Author author = new Author();
      System.out.println("if you want, enter the author of the book");
      author.author = sc.nextLine();


      Content content = new Content();
      System.out.println("if you want, enter the content of the book");
      content.content = sc.nextLine();


      Title title = new Title();
      System.out.println("if you want, enter the title of the book");
      title.title = sc.nextLine();

      author.show();
      title.show();
      content.show();


    }
}
