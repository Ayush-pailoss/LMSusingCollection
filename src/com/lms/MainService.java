package com.lms;
import com.lms.choice.UserChoice;
import com.lms.studentservice.AddBooksService;

import java.io.IOException;
public class MainService {
    static {
        AddBooksService.showBooks();
    }
    public static void main(String[] args) throws IOException {
        UserChoice.choice();
    }
}
