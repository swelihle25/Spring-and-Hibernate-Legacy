package lihle.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");

        //retrieve bean from spring container

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        //check if they are pointing to the same object
        boolean result = (theCoach == alphaCoach);

        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for theCoach" + theCoach);

        System.out.println("\nMemory location for alphaCoach" + alphaCoach + "\n");

        context.close();
    }
}

