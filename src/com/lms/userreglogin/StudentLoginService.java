package com.lms.userreglogin;
import com.lms.choice.StudentChoice;
import com.lms.entity.UserEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class StudentLoginService {
static Logger logger= Logger.getLogger(StudentLoginService.class.getName());
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void login() throws IOException {
        System.out.println("-------------STUDENT LOGIN-------------");
        System.out.println("Enter Email");
        String email = bufferedReader.readLine();
        System.out.println("Enter Password");
        String pass = bufferedReader.readLine();
            if (UserEntity.User.STUDENT.getEmail().equalsIgnoreCase(email)&&
                    UserEntity.User.STUDENT.getPassword().equalsIgnoreCase(pass)) {
                logger.info("Login Successfully");
                StudentChoice .choice();
            } else {
                logger.info("Invalid Email And Password");
            }
        }
    }
