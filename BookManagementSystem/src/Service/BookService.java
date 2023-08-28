package Service;

import Database.BookData;
import Model.Book;
import Tools.InputMenu;


public class BookService {

    public static Book addBook(){
        int add = InputMenu.inputInt("How many books do you add?");

        BookData.books = new Book[add];
        for(int i =0; i<BookData.books.length;i++) {
            System.out.println("----------------NEW BOOKS----------------");
            System.out.println(i + 1 + ".Book");
            String name = InputMenu.inputString("Enter The Book Name:");
            String description = InputMenu.inputString("Enter this Book`s Description:");
            String author = InputMenu.inputString("Enter the Author:");
            BookData.books[i] = new Book(i + 1, name,description,author);


        }
        return null;
    }
        public static void showBook(){
            for (int i = 0 ; i<BookData.books.length;i++){
                System.out.println(i+1+"."+"\n"+"Book:");
                System.out.println(BookData.books[i].getInfo());
            }
        }
    public static void searchBook(){
        String text = InputMenu.inputString("Enter the search text:");
        for (int i=0;i<BookData.books.length;i++){
            Book book = BookData.books[i];
            if (book.getName().contains(text) || book.getAuthor(text)){
                System.out.println(book.getFullInfo() );
            }
        }


    }
    public static void updateBook(){
        java.util.Date date = new java.util.Date();
        showBook();
        int i = InputMenu.inputInt("Which one to update?");
        System.out.println("Enter the updated info:");
        Book b = new Book();
        b.getFullInfo();
        BookData.books[i-1]= b;
        System.out.println("Update date:");
        System.out.println(date);
    }
}

