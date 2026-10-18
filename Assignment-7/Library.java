import java.util.Scanner;

class Library {

    int[] bookNo = new int[100];
    String[] bookName = new String[100];
    String[] bookAuthor = new String[100];

    int count = 0;

    // Method to add a book
    void addBook(int no, String name, String author) {
        bookNo[count] = no;
        bookName[count] = name;
        bookAuthor[count] = author;
        count++;

        System.out.println("Book added successfully!");
    }

    // Method to remove a book
    void removeBook(int no) {

        int index = -1;

        // Find the book
        for (int i = 0; i < count; i++) {
            if (bookNo[i] == no) {
                index = i;
                break;
            }
        }

        // Book not found
        if (index == -1) {
            System.out.println("Book not found!");
            return;
        }

        // Deletion algorithm: shift elements to the left
        for (int i = index; i < count - 1; i++) {
            bookNo[i] = bookNo[i + 1];
            bookName[i] = bookName[i + 1];
            bookAuthor[i] = bookAuthor[i + 1];
        }

        count--;

        System.out.println("Book removed successfully!");
    }

    // Method to display books
    void displayBooks() {

        if (count == 0) {
            System.out.println("Library is empty!");
            return;
        }

        System.out.println("\nBooks in Library:");

        for (int i = 0; i < count; i++) {
            System.out.println("Book No. : " + bookNo[i]);
            System.out.println("Book Name: " + bookName[i]);
            System.out.println("Author   : " + bookAuthor[i]);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {

            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            // sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book No.: ");
                    int no = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();

                    lib.addBook(no, name, author);
                    break;

                case 2:
                    System.out.print("Enter Book No. to remove: ");
                    int removeNo = sc.nextInt();

                    lib.removeBook(removeNo);
                    break;

                case 3:
                    lib.displayBooks();
                    break;

                case 4:
                    System.out.println("Exiting...\nSuccessfully Exited");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}