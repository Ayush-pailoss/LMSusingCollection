package com.lms.studentservice;

import com.lms.entity.BooksEntity;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ShowRentedBooksService {
    public static void rentedBooks() {
            Iterator<Map.Entry<String, List<BooksEntity>>> iterator = RentBookService.studentData.entrySet().iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next().getValue());
                }
            }
           }


