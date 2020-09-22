package com.mycompany.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CalServiceTest
{
    CalService cal =  new CalService();
    @Test
    public void ShouldVerifyAddFunctionality()
    {
        Assertions.assertEquals(50, cal.sum(20, 30));
        Assertions.assertNotEquals(50, cal.sum(30, 30));
    }

    @Test
    public void ShouldVerifyMultiplyFunctionality()
    {
        Assertions.assertEquals(200, cal.multiply());
        Assertions.assertNotEquals(20, cal.multiply());
    }

    @Test
    public void ShouldVerifySubtractionFunctionality()
    {
        Assertions.assertEquals(10, cal.minus());
        Assertions.assertNotEquals(20, cal.minus());
    }

    @Test
    public void ShouldVerifyDivFunctionality()
    {
        Assertions.assertEquals(2, cal.div());
        Assertions.assertNotEquals(20, cal.div());
    }

    @Test
    public void ShouldVerifyCompoundMultiplyFunctionality()
    {
        Assertions.assertEquals(600, cal.compMultiply());
        Assertions.assertNotEquals(60, cal.compMultiply());
    }
}
