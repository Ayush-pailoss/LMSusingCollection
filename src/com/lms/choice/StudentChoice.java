package com.lms.choice;

import com.lms.studentservice.DisplayBooks;
import com.lms.studentservice.RentBookService;
import com.lms.studentservice.ReturnRentedBookService;
import com.lms.studentservice.ShowRentedBooksService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class StudentChoice {
    static Logger logger= Logger.getLogger(StudentChoice.class.getName());
    static BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));

    public static void choice() throws IOException {
        while (true) {
            System.out.println("Enter 1 For Exit");
            System.out.println("Enter 2 for Show Books");
            System.out.println("Enter 3 For Rent Books");
            System.out.println("Enter 4 for Show Rented Books");
            System.out.println("Enter 5 For Return Rented Books");
            System.out.println("Enter Your Choice :");
            int choice = Integer.parseInt(bufferedReader.readLine());
            if (choice == 1) {
                System.out.println("THANK YOU");
                break;
            } else if (choice==2) {
                DisplayBooks.display();
            } else if (choice==3) {
                RentBookService.rentBooks();
            } else if (choice==4) {
                ShowRentedBooksService.rentedBooks();
            } else if (choice==5) {
                ReturnRentedBookService.returnBooks();
            } else {
                logger.info("Invalid Choice");
            }
        }
    }
    }

