package com.lms.userreglogin;

import com.lms.entity.UserEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class StudentRegService {
   static BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
   static Logger logger= Logger.getLogger(StudentRegService.class.getName());
   public static void studentRegistration() throws IOException {
        System.out.println("---------STUDENT REGISTRATION-----------");
        System.out.println("Enter Your Name");
        String name = bufferedReader.readLine();
        System.out.println("Enter Your Email");
        String email=bufferedReader.readLine();
        System.out.println("Enter Your Password");
        String pass=bufferedReader.readLine();
        UserEntity.User.STUDENT.setEmail(email);
    UserEntity.User.STUDENT.setPassword(pass);
        logger.info("Student Registered Successfully");

    }
}
