/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Anthony Tiongson
 * @version 2018.09.17
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    // Add the methods here ...
    
    // Accessor for a book's author
    public String getAuthor()
    {
        return author;
    }
    
    // Accessor for a book's title
    public String getTitle()
    {
        return title;
    }
    
    // Accessor for a book's pages
    public int getPages()
    {
        return pages;
    }
    
    // Method to print a book's author to terminal
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    // Method to print a book's title to terminal
    public void printTitle()
    {
        System.out.println(title);
    }
}
