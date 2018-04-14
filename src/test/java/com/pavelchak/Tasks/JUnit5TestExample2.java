package com.pavelchak.Tasks;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.*;

public class JUnit5TestExample2 {
  private boolean condition=true;

  @Test
  void testMethod1() {
    assumeTrue(condition);
    System.out.println("    Test method 1");
  }

  @Test
  void testMethod2() {
    assumeFalse(condition);
    System.out.println("    Test method 2");
  }

  @Test
  void testMethod3() {
    fail("Hello! :)");
    System.out.println("    Test method 3");
  }


}
