package com.mycompany.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalService
{
    @GetMapping("/sum/{a}/{b}")
    public int sum(@PathVariable("a") int a, @PathVariable("b") int b)
    {
        return a + b;
    }
    @GetMapping("/multiply")
    public int multiply() {
        return 10*20;
    }

    @GetMapping("/minus")
    public int minus() {
        return (20-10);
    }

    @GetMapping("/div")
    public int div() {
        return 20/10;
    }

    @GetMapping("/compMultiply")
    public int compMultiply() {
        return 10*20*3;
    }
}
