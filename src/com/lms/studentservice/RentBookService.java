package com.lms.studentservice;

import com.lms.entity.BooksEntity;
import com.lms.entity.UserEntity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class RentBookService {
    static Logger logger= Logger.getLogger(RentBookService.class.getName());
      static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static List<BooksEntity> list ;
    public static Map<String,List< BooksEntity>> studentData;

    public static void rentBooks() throws IOException {
         studentData= new HashMap<>();
        System.out.println("Enter Number Of Books You Want to Borrow");
        int num = Integer.parseInt(bf.readLine());
        String sNo;
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter Serial Number Of Book You want to Borrow");
            sNo = bf.readLine();
            if (AddBooksService.bookData.containsKey(sNo)) {
              list  = new ArrayList<>();
                list.add(AddBooksService.bookData.get(sNo));
                AddBooksService.bookData.remove(sNo);
                logger.info("Books Added Successfully");

            } else {
                logger.info("Serial Number Not Found");
            }
        }
                    studentData.put(UserEntity.User.STUDENT.getEmail(), list);
        }
    }

