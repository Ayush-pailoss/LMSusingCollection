package com.lms.studentservice;

import com.lms.entity.BooksEntity;

import java.util.HashMap;
import java.util.Map;

public class AddBooksService {
   public static Map <String, BooksEntity>bookData= new HashMap<>();
    public static void showBooks(){
        bookData.put("1",new BooksEntity("1","A Road Less Traveled" ));
        bookData.put("2",new BooksEntity("2","Mein Kaimf"));
        bookData.put("3",new BooksEntity("3","A Christmas Carol "));
        bookData.put("4",new BooksEntity("4","A Tale Of Two Cities"));
        bookData.put("5",new BooksEntity("5","Discover Of India"));

    }
}
