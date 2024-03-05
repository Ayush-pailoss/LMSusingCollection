package com.lms.studentservice;

import com.lms.entity.BooksEntity;

import java.util.Iterator;
import java.util.Map;

public class DisplayBooks {
    public static void display(){
        Iterator<Map.Entry<String, BooksEntity>>iterator=AddBooksService.bookData.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
