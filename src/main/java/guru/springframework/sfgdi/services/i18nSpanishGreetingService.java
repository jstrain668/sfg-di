package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class i18nSpanishGreetingService implements GreetingsService{

    @Override
    public String sayGreeting(){

        return "Hola Mundo - ES";
    }
}