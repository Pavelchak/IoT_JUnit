package com.pavelchak.Tasks;

import org.junit.jupiter.api.*;

public class JUnit5TestExample1 {

  @BeforeAll
  static void initAll() {
    System.out.println("@BeforeAll - Run before all methods once");
  }

  @BeforeEach
  void init() {
    System.out.println("  @BeforeEach - Run before each test methods ");
  }

  @DisplayName("First test")
  @Test
  void testMethod1() {
    System.out.println("    Test method 1");
  }

  @Test
  @Disabled
  void testMethod2() {
    System.out.println("  Test method 2");
  }

  @Test
  void testMethod3() {
    System.out.println("    Test method 3");
  }

  @AfterEach
  void tearDown() {
    System.out.println("  @AfterEach - Run after each test methods ");
  }

  @AfterAll
  static void tearDownAll() {
    System.out.println("@AfterAll - Run after all test methods once");
  }
}
