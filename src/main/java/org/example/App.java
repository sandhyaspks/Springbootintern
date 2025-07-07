package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources.xml");
        Faculty f = (Faculty) context.getBean("Fac");
        f.faculty();
        Mentor m = (Mentor) context.getBean("Men");
        m.mentee("sandhya");
        Prof p = (Prof) context.getBean("Pro");
        p.proff();
        Student s = (Student) context.getBean("Stu");
        s.intership();
        Tranier t =(Tranier) context.getBean("Tra");
        t.training();
    }
}
