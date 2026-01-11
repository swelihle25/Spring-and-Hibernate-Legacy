package lihle.springdemo;

public class BaseBallCoach  implements  Coach{

// define a private field dependency
    private FortuneService fortuneService;

    // define a constructor dependency injection
    public BaseBallCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkOut(){
        return "Spend 30 mins on batting practice";
    }
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}

