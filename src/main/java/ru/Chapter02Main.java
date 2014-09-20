package ru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.grey.spring.chapter02_wiring.Performer;

/**
 * Created by User on 05.07.2014.
 */
public class Chapter02Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("chapter02_wiring.xml");

        Performer performer = (Performer) context.getBean("duke");
        performer.perform();
    }
}
