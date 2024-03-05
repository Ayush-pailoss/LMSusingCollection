package com.lms.studentservice;

import com.lms.entity.BooksEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Logger;


public class ReturnRentedBookService {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
private static Logger  logger= Logger.getLogger(ReturnRentedBookService.class.getName());
    public static void returnBooks() throws IOException {
        System.out.println("Enter book serial number to remove:");
        String serialNumberToRemove = bufferedReader.readLine();
        for (BooksEntity book : RentBookService.list) {
            if (book.getSerialNumber().equals(serialNumberToRemove)) {
                AddBooksService.bookData.put(serialNumberToRemove,book);
                RentBookService.studentData.remove(book);
                RentBookService.list.remove(book);
               logger.info("Book Returned Successfully");
                break;
            }
            else {
                logger.info("Serial Number Not Found");
            }
        }
        }
    }






