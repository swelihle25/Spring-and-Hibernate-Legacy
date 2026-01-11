package lihle.springdemo;

import lihle.springdemo.Coach;
import lihle.springdemo.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main (String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("CricketCoach", CricketCoach.class);

        System.out.println(theCoach.getDailyWorkOut());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(((CricketCoach) theCoach).getEmailAddress());

        System.out.println(((CricketCoach) theCoach).getTeam());


        context.close();
    }
}
