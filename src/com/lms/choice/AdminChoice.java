package com.lms.choice;

import com.lms.adminservice.AddNewBookService;
import com.lms.adminservice.RemoveBooksService;
import com.lms.studentservice.DisplayBooks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class AdminChoice {
    static Logger logger= Logger.getLogger(AdminChoice.class.getName());
   static BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
    public static void choice() throws IOException {
        while (true){
            System.out.println("Enter 1 For Add New Books");
            System.out.println("Enter 2 For Remove Books");
            System.out.println("Enter 3 For Display Books");
            System.out.println("Enter 0 For Exit");
            System.out.println("Enter Your Choice :");
            int choice= Integer.parseInt(bufferedReader.readLine());
            if (choice==1){
                AddNewBookService.newBooksAdd();
            }
            else if (choice==2) {
                RemoveBooksService.removeBooks();
            } else if (choice==3) {
                DisplayBooks.display();

            } else if (choice==0) {
                System.out.println("Thank You");
                break;
            }
            else {
                logger.info("Invalid Choice");
            }

        }

    }
}
