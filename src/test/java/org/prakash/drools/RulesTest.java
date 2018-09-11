package org.prakash.drools;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class RulesTest {
    @Test
    public void testRules(){
        assertTrue( "The Tests is working fine",true);
    }

    @Test
    public void testGreetPerson(){
        PersonService personService = new PersonService();
        String greet = personService.getGreeting();
        assertEquals("Good Morning ECCORE", greet);

    }
}
