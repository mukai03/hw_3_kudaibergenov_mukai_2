package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isItTrue = true;
        while (isItTrue) {
            User user = new User();
            Scanner inName = new Scanner(System.in);
            try {
                System.out.println("Введите ваше имя: ");
                user.setName(inName.nextLine());
            }catch (IllegalNameLengthException e){
                System.out.println("Введите корректное имя");
            }

            Scanner inAge = new Scanner(System.in);
            try {
                System.out.println("Введите ваш возраст: ");
                user.setAge(inAge.nextInt());
            }catch (IllegalAgeException e){
                System.out.println("Введите верный возраст");
            }
        }
    }
}
