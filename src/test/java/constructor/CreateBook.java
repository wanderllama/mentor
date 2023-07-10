package constructor;

import java.util.ArrayList;

public class CreateBook {

    public static void main(String[] args) {
        Book book1 = new Book("Lord Of The Rings");
        Book book2 = new Book("Jurassic Park", "Michael Criton");
        Book book3 = new Book("Cat in the Hat", "Dr. Suess", "childrens");
        Book book4 = new Book("Head First Java", "Kathy Sierra, Bert Bates", "educational", 720);
        Book book5 = new Book("1984", "George Orwell", "science fiction", 328, 1949);

        ArrayList<Book> library = new ArrayList<>();
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);

        System.out.println(library.get(0));
        System.out.println(library.get(1));
        System.out.println(library.get(2));
        System.out.println(library.get(3));
        System.out.println(library.get(4));
        System.out.println(library.get(0).getName());
        System.out.println(library.get(1).getAuthor());
        System.out.println(library.get(2).getGenre());
        System.out.println(library.get(3).getNumberOfPages());
        System.out.println(library.get(4).getYear());


    }
}
