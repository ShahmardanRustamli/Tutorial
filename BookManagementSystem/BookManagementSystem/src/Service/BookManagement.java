package Service;

import Database.BookData;
import Model.Book;
import Tools.BookMenu;
import Tools.InputMenu;


public class BookManagement {

    public static void BookManage(){
        BookService bookService = new BookService();
        while (true){
            int option = BookMenu.Menu();
            switch (option){
                case 1:
                    bookService.showBook();
                    break;
                case 2:
                    bookService.searchBook();
                    break;
                case 3:
                    bookService.addBook();
                    break;
                case 4:
                    bookService.updateBook();
                    break;
                default:
                    System.out.println("INVALID OPTION!");

            }
            System.out.println("Book Successfully Added! ");
        }

    }
}
