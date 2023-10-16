package com.example.gcptest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GcpTestApplicationTests {

    @Test
    void test() {
        Assertions.assertEquals(1+1, 2);
    }

    @Test
    void test1() {
        Assertions.assertEquals(1 + 10, 10);
    }

}
