package com.company;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, write you password :");
        
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        
        if (password.equals(Password.INSTANCE.returnName())){
            System.out.println("Hello, admin, what kind of tv you want to create? \n 1 - Samsung \n 2 - Siemens ");
            int typeOfTv = scan.nextInt();
            TVFactoryFirstImplementationSingleton tvFactoryFirstImplementationSingleton = new TVFactoryFirstImplementationSingleton();
            TvProducer tvProducer = tvFactoryFirstImplementationSingleton.create(typeOfTv);
            tvProducer.producerNamed();
        }
        else System.out.println("Sorry, you are not admin! The program will be closed! ");
    }
}
