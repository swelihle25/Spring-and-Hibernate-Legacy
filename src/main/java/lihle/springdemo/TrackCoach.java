package lihle.springdemo;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

     public TrackCoach(FortuneService theFortuneService){
         fortuneService = theFortuneService;
     }


    @Override
    public String getDailyWorkOut() {
        return ("Run a hard 5k");
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It Bro:" + fortuneService.getFortune();
    }

    //add init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    //add destroy method
    public void doMyCleanupStuff(){
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }
}

