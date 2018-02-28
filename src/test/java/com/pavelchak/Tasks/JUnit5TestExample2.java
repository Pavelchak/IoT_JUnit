package com.pavelchak.Tasks;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.*;

public class JUnit5TestExample2 {
  private boolean condition=true;

  @Test
  void testMethod1() {
    assumeTrue(condition);
    System.out.println("    Test method 1");

  }

}
