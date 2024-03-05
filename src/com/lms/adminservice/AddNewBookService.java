package com.lms.adminservice;

import com.lms.entity.BooksEntity;
import com.lms.studentservice.AddBooksService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class AddNewBookService {
    static Logger logger= Logger.getLogger(AddBooksService.class.getName());
    static BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
    public static void newBooksAdd() throws IOException {
        System.out.println("Enter Number Of Books");
        int numBooks= Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i <numBooks ; i++) {
            System.out.println("Enter Book Name");
            String bookName = bufferedReader.readLine();
            System.out.println("Enter Serial Number Of Book");
            String serialNumber = bufferedReader.readLine();
            BooksEntity books = new BooksEntity(serialNumber, bookName);
            AddBooksService.bookData.put(serialNumber, books);
            logger.info("Login Successfully");
        }
   }
}
