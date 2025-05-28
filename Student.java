package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("22")
    private int rno;

    @Autowired
    @Qualifier("pencil")
    private Writer writer;


    public Student(){
        System.out.println("Student const");
    }

    public void show(){
        System.out.println("show student method");
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public Writer getWriter() {
        return writer;
    }

   
    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void WriteExam(){
       writer.write();
    }



}
