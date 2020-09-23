package com.mycompany.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class MessageService {

    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hello!";
    }

    @GetMapping("/helloThere/{name}")
    public String sayHello(@PathVariable("name") String name)
    {
        if(Objects.equals(name, "Ramu"))
        {
            return "Hai Ramu, Welcome to the team!";
        }
        else
        {
            return "Hai There, Welcome to the team!";
        }
    }
}
