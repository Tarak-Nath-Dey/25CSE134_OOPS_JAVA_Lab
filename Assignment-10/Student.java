//Write a Java program to demonstrate the use of this keyword.

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul");
        s1.display();
	    Student s2 = new Student(102, "Aman");
        s2.display();
	    Student s3 = new Student(103, "Karan");
        s3.display();
    }
}