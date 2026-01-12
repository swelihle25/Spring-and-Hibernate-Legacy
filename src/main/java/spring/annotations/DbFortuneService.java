package spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class DbFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Db fortune";
    }
}
