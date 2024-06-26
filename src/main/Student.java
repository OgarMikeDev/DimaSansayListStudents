
package main;

import java.util.*;

public class Student implements Comparable<Student> {
    private static int count = 0;
    private String name; //Misha
    private int age; //23
    private String email; //mura.m.v@email.ru
    private long phoneNumber; //89676400941
    private static ArrayList<Student> setStudents = new ArrayList<>();

    public Student(String name, int age, long phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        setStudents.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //equals - Kirill

    //hash code - Max Lixachev

    //compareTo - Max Noskov

    public static void printInformationAboutStudents() {
        //Vlad
    }

    public static void removeStudent(long phoneNumber) {
        for (Iterator<Student> iterator = setStudents.iterator(); iterator.hasNext();) {
            Student student = iterator.next();
            if (student.getPhoneNumber() == phoneNumber) {
                iterator.remove();
            }
        }
    }


    public static int getCountStudents() {
        //Vasya
        return 0;
    }

    @Override
    public String toString() {
        //Dima
        return "";
    }


    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }
}