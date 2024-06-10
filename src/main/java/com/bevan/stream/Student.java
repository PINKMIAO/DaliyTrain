package main.java.com.bevan.stream;

/**
 * @author zbf
 * @since 2023/12/18 23:05
 */
public class Student implements People {
    private int age;
    private String name;
    private int price;
    private String author;

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void walk() {
        System.out.println("I can walk!!!");
    }
}
