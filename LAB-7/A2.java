class Book {
    private String author_name;


    public Book(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthorName() {
        return author_name;
    }

    public void display() {
        System.out.println("Author: " + author_name);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    public void display() {
        System.out.println("Book Publication:");
        System.out.println("  Title: " + title);
        System.out.println("  Author: " + getAuthorName());
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    public void display() {
        System.out.println("Paper Publication:");
        System.out.println("  Title: " + title);
        System.out.println("  Author: " + getAuthorName());
    }
}

public class A2 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Main <AuthorName> <Type: book/paper> <Title>");
            return;
        }

        String author = args[0];
        String type = args[1].toLowerCase();
        String title = args[2];

        Book ref;

        if (type.equals("book")) {
            ref = new BookPublication(author, title);
        } else if (type.equals("paper")) {
            ref = new PaperPublication(author, title);
        } else {
            System.out.println("Invalid publication type. Use 'book' or 'paper'.");
            return;
        }
        ref.display();
    }
}
