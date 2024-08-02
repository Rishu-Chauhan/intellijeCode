//method->addBook,issueBook,returnBook,showAvailableBook.
//properties->array to store the available book.
//array to store the issue book

class library1{
    String []books;
    int noOfBooks;
    library1(){
        this.books=new String[100];
        this.noOfBooks=0;
    }
    void addBook(String book){
        this.books[noOfBooks]=book;
        noOfBooks++;
        System.out.println(book+" Has been added!");
    }
    void availableBook(){
        System.out.println("Available books are:");
        for (String book:this.books){
            if(book==null){
                continue;
            }
            System.out.println("*-->"+book);
        }
    }
    void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("the book has  been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("this book does not exist");
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class library {
    public static void main(String[] args) {
library1 lib=new library1();
lib.addBook("MATHEMATICS");
lib.addBook("PHYSICS");
lib.addBook("CHEMISTRY");
lib.addBook("DSA");
lib.availableBook();
lib.issueBook("DSA");
        lib.availableBook();
    }
}
