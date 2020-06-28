package com.sumid;
import java.util.Random;

public class JavaExerciseOne {
    public static void main(String[] args) {
        String[] studentsInCLass = {"Sumid", "Abby Truong" , "Ahmed Mujtaba", "Azeez Temitope Olanrewaju",
                "Diming Chu", "Dongshuo Li", "Honorinicy", "Jason", "Junyu Liu", "Kelly Liu", "Kinjan",
                "Kun Li" , "Muhammed Umar" , "Oaz" , "PQ" , "Prithviatani" , "Richard" , "Sahil Slngh Sandhu" ,
                "Samuel Yang" , "Scott(Shi-Kai) Jhou" , "Shahbaz Mansahia" , "Shahriar Kabir" , "Shakur" , "Shrina Patel" ,
                "Siyu Qiu" , "Siyu Lei" , "Tao" , "Trivediakshay" , "Yan Huang" , "Zhaosaitong"};

        Random studentName = new Random();

        int randomNumber = studentName.nextInt(studentsInCLass.length);

        System.out.println("Student Name " + "= "+studentsInCLass[randomNumber]);
    }
    }

