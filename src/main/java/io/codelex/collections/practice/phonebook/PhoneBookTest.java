package io.codelex.collections.practice.phonebook;

public class PhoneBookTest {
    public static void main(String[] args) {
        PhoneDirectory book = new PhoneDirectory();
        book.putNumber("John", "12345");
        book.putNumber("Carl", "54321");
        book.putNumber("Bob", "11111");
        book.putNumber("Mary", "22222");
        book.putNumber("John", "12121");

        book.getNumber("Carl");
        book.getNumber("Gary");

        System.out.println(book);
    }

}
