class library{
    String[]books;
    int numberofbook;
    library(){
        this.books=new String[100];
        this.numberofbook=0;
    }
    void addbook(String book){
        this.books[numberofbook]=book;
        numberofbook++;
        System.out.println(book+" has been added!");
    }
    void issuebook(String book){
        for(int i=0;i<this.books.length;i++)
        {
            if(this.books[i].equals(book))
            {
                System.out.println(book+" the book has been issued!");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("this book does not exist");
    }
    void returnbook(String book){
        addbook(book);
    }
    void showavilablebook(){
        System.out.println("available book are ");
        for(String book:this.books)
        {
            if(book==null)
            {
                continue;
            }
            System.out.println("* "+book);
        }
    }
}
public class Java_51_Exercise_Library {
    public static void main(String[] args) {
        library li = new library();
        li.addbook("c++");
        li.addbook("c");
        li.addbook("java");
        li.addbook("php");
        li.addbook("python");
        li.showavilablebook();
        li.issuebook("c");
        li.showavilablebook();
        li.returnbook("c");
        li.showavilablebook();
    }
}
