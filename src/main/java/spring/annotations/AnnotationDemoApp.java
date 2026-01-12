package spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lesson_02_annotations/applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkOut());

        //call a method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
