package com.lms.adminservice;

import com.lms.studentservice.AddBooksService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class RemoveBooksService {
    static Logger logger = Logger.getLogger(RemoveBooksService.class.getName());
   static BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
    public static void removeBooks() throws IOException {
        System.out.println("Enter Number Of Books For Remove");
        int size= Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <=size ; i++) {
            System.out.println("Enter Serial Number Of Book For Remove");
            String serialNumber= bufferedReader.readLine();
            if (serialNumber.equalsIgnoreCase(AddBooksService.bookData.get(i).getSerialNumber())){
                AddBooksService.bookData.remove(serialNumber);
                logger.info("Books Removed Successfully");
            }
            else {
                logger.warning("Invalid Serial Number");
            }
        }
    }
}
