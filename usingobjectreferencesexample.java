public class BooksTestDrive
{
    public static void main (String[] args) {
        Books[] myBooks = new Books[3];
        int x =0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].title = " The Grapes of Java";
        myBooks[1].title = " The Grapes of Java 1";
        myBooks[2].title = " The Grapes of Java 3";
        myBooks[0].author = "bob";
        myBooks[1].author = "bob";
        myBooks[2].author = "bob";
        
        while(x<3)
        {
            System.out.println(myBooks[x].title);
            System.out.println("by");
            System.out.println(myBooks[x].author);
        }
        
    }
}

class Books
{
    String title;
    String author;
}
