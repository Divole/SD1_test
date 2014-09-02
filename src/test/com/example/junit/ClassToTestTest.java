package com.example.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassToTestTest {
    private ClassToTest myClass;
    @Before
    public void setUp() throws Exception {
            myClass = new ClassToTest();
    }

    @Test
    public void testSayHola() throws Exception {
        assertEquals("HOLA", myClass.sayHola());
    }
}
