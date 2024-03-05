package com.lms.userreglogin;
import com.lms.choice.AdminChoice;
import com.lms.entity.UserEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;


public class AdminLoginService {
  static Logger logger = Logger.getLogger(AdminLoginService.class.getName());
    static BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));

    public static void AdminLogin() throws IOException {

        System.out.println("--------------ADMIN LOGIN-----------");
        System.out.println("Enter Email");
        String email = bufferedReader.readLine();
        System.out.println("Enter PassWord ");
        String pass= bufferedReader.readLine();
        if (UserEntity.User.ADMIN.getEmail().equalsIgnoreCase(email)&&
                UserEntity.User.ADMIN.getPassword().equalsIgnoreCase(pass)){
           logger.info("Books Added Successfully");
            AdminChoice.choice();
        }
        else {
            logger.warning("Invalid Details");
        }
        }
    }

