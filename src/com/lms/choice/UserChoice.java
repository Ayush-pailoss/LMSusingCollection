package com.lms.choice;

import com.lms.userreglogin.AdminRegService;
import com.lms.userreglogin.StudentRegService;
import com.lms.userreglogin.AdminLoginService;
import com.lms.userreglogin.StudentLoginService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class UserChoice {
    static BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
    static Logger logger= Logger.getLogger(UserChoice.class.getName());
    public static void choice() throws IOException {
        while(true){
            System.out.println("Enter 0 For Exit");
            System.out.println("Enter 1 For Admin Portal");
            System.out.println("Enter 2 For Student Portal");
            System.out.println("Enter Your Choice :");
            int choice= Integer.parseInt(bufferedReader.readLine());
            if (choice==1){
                while (true){
                    System.out.println("Enter 1 For Admin Registration");
                    System.out.println("Enter 2 For Admin Login");
                    System.out.println("Enter 0 For Exit");
                    System.out.println("Enter Your Choice");
                    int choice2= Integer.parseInt(bufferedReader.readLine());
                    if (choice2==1){
                       AdminRegService.adminRegistration();
                    } else if (choice2==2) {
                        AdminLoginService.AdminLogin();
                    } else if (choice2==0) {
                        System.out.println("THANK YOU");
                        break;
                    }
                    else {
                        System.out.println("Invalid Choice");
                    }
                }

            }
            else if (choice==2) {
                while (true) {
                    System.out.println("Enter 1 For Student Registration");
                    System.out.println("Enter 2 For Student Login");
                    System.out.println("Enter Your Choice :");
                    int choice1= Integer.parseInt(bufferedReader.readLine());
                    if(choice1==1){
                        StudentRegService.studentRegistration();
                    } else if (choice1==2) {
                        StudentLoginService.login();
                    }
                }
            }
            else if (choice==0) {
                System.out.println("Thank You For Visiting");
                break;
            }
            else {
                logger.info("Invalid Choice");
            }
        }
    }
}
