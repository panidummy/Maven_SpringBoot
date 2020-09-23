package com.mycompany.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MessageServiceTest
{
    @Test
    public void shouldVerifySayHello()
    {
        MessageService ms = new MessageService();
        assertEquals("Hello!", ms.sayHello());
        assertNotEquals("hello", ms.sayHello());
    }

    @Test
    public void shouldVerifySayHelloWithSpecificName()
    {
        MessageService ms = new MessageService();
        String expResult = "Hai There, Welcome to the team!";
        String expResultSpecific = "Hai Ramu, Welcome to the team!";
        assertEquals(expResultSpecific, ms.sayHello("Ramu"));
        assertEquals(expResult, ms.sayHello("OtherName"));
    }
}
