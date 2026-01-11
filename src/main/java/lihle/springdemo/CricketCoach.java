package lihle.springdemo;


public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    private String EmailAddress;
    private String team;


    //Create No-Arg Constructor
    public CricketCoach(){
        System.out.println("CricketCoach: Inside no args constructor");
    }

    public void setFortuneService(FortuneService fortuneService){
        System.out.println("CricketCoach: Inside this setter method");
        this.fortuneService = fortuneService;
    }

    public String
    getEmailAddress(){
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress){
        System.out.println("CricketCoach: Inside this setter method for setEmailAddress");
        this.EmailAddress = emailAddress;
    }
    public String getTeam(){
        return team;
    }
    public void setTeam(String team){
        System.out.println("CricketCoach: Inside this setter method  for setTeam");
        this.team = team;
    }



    @Override
    public String getDailyWorkOut() {
        return "Practice for 15 minutes";
    }
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
