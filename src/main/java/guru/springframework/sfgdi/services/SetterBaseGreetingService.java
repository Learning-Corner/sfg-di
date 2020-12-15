package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterBaseGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - setter";
    }
}
