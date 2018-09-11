package org.prakash.drools;

import org.kie.api.runtime.KieSession;

public class PersonService {
    private KieSession kieSession = new DroolsBeanFactory().getKieSession();

    public String getGreeting(){
        Person person = new Person("ECCORE",10);
        kieSession.insert(person);
        kieSession.fireAllRules();
        return person.getGreet();
    }

}
