package com.lms.entity;

public class BooksEntity {
     String serialNumber;
    String bookName;

    public BooksEntity() {
    }

    public BooksEntity(String serialNumber, String bookName) {
        this.serialNumber = serialNumber;
        this.bookName = bookName;
    }

    public  String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "serialNumber = " + serialNumber +"  "+
                " bookName = " + bookName +"\n";
    }
}
