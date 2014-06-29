package ru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.grey.spring.knights.Knight;

/**
 * Created by User on 29.06.2014.
 */
public class KnightMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");

        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}
