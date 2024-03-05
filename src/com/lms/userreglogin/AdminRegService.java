package com.lms.userreglogin;

import com.lms.entity.UserEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class AdminRegService {
    static Logger logger= Logger.getLogger(AdminRegService.class.getName());
  static  BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));

    public static void adminRegistration() throws IOException {
        System.out.println("---------ADMIN REGISTRATION---------");
        System.out.println("Enter Your Email");
        String email= bufferedReader.readLine();
        System.out.println("Enter Your Password");
        String pass = bufferedReader.readLine();
        UserEntity.User.ADMIN.setEmail(email);
        UserEntity.User.ADMIN.setPassword(pass);
       logger.info("Admin Registered Successfully");
    }
}
