package com.example.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: Dovile
 * Date: 01-09-14
 * Time: 10:45
 * To change this template use File | Settings | File Templates.
 */
public class MyClassTest {
    private MyClass myClass;
    @Before
    public void setUp() throws Exception {
           myClass = new MyClass();
    }

    @Test
    public void testSayHello() throws Exception {
         assertEquals("Hello", myClass.sayHello());
    }
}
