package assignment6;

public class BookDto {
	    private String title;
	    private String author;
	    private String isbn;
	    private double price;
	    private String publicationYear;
	    private String publisher;
	    private int pages;
	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public void setIsbn(String isbn) {
	        this.isbn = isbn;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public String getPublicationYear() {
	        return publicationYear;
	    }

	    public void setPublicationYear(String publicationYear) {
	        this.publicationYear = publicationYear;
	    }

	    public String getPublisher() {
	        return publisher;
	    }

	    public void setPublisher(String publisher) {
	        this.publisher = publisher;
	    }

	    public int getPages() {
	        return pages;
	    }

	    public void setPages(int pages) {
	        this.pages = pages;
	    }
	 
	    public static void main(String[] args) {
	    	BookDto book1 = new BookDto();
	    	book1.setTitle("Machine learning");
	    	System.out.println("Title : "+book1.getTitle());
	    	book1.setAuthor("Andrew Ng");
	    	System.out.println("Author : "+book1.getAuthor());
	    	book1.setIsbn("321-6549870321");
	    	System.out.println("ISBN : "+book1.getIsbn());
	    	book1.setPrice(839.90);
	    	System.out.println("Price : "+book1.getPrice());
	    	book1.setPublicationYear("01-12-2022");
	    	System.out.println("PublicationYear : "+book1.getPublicationYear());
	    	book1.setPublisher("AI press");
	    	System.out.println("Publisher : "+book1.getPublisher());
	    	book1.setPages(550);
	    	System.out.println("Pages : "+book1.getPages());

     
	    }
	

}
