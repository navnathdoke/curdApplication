package com.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.springjdbc.Entity.Student;
import com.spring.springjdbc.Inter.StudentDao;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
        StudentDao stdo=context.getBean("Student",StudentDao.class);
        
        Student s1=new Student(104,"premraj",80);
        int re=stdo.insert(s1);
        System.out.println("No of Record is inserted"+re);
     
        
       
     
    }
}
