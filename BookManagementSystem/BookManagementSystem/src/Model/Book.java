package Model;

public class Book {
    public static int ID;
    public String Name;
    public String Description;
    public String Author;

    public Book(){

    }

    public Book(int i, String bookName, String description, String author) {
        this.ID = i;
        this.Name = bookName;
        this.Description = description;
        this.Author = author;
    }

    public String getInfo(){
        return "------------------------------------\n"+
                "ID:" + ID+ "\n"+
                "----------------------\n"+
                "Book Name: "+ Name+ "\n"+
                "----------------------\n"+
                "Description: "+ Description+ "\n"+
                "----------------------\n"+
                "Author: "+ Author+ "\n"+
                "------------------------------------\n";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public boolean getAuthor(String text) {
        return getAuthor(text);
    }
    public String getFullInfo(){
        return this.getName()+ " " + this.getAuthor();
    }
}
