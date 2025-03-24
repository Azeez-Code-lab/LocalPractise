package com.br.javaPrractise.Arrays;

public class Student {
    public int roll_no;
    public String name;
    Student(int roll_no,String name){
        this.name=name;
        this.roll_no=roll_no;
    }
}
class actions{
    public static void main(String args[]){
        Student[] arr;
        arr=new Student[5];
        arr[0]=new Student(1,"Azeez");
        arr[1]=new Student(2,"Shaik");

        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : "
                    + arr[i].roll_no + " "
                    + arr[i].name);
    }
    }

