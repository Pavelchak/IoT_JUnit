package com.pavelchak.Tasks;

import org.junit.jupiter.api.*;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {

  private final static boolean bug = true;
  private static int count = 0;

  @BeforeAll
  public static void beforeClass() {
    System.out.println("Count beforeClass is : " + count);
  }

  @BeforeEach
  public void beforeTest() {
    System.out.println("Count before is : " + count);
  }

  @AfterEach
  public void afterTest() {
    System.out.println("Count after is : " + count);
  }

  @AfterAll
  public static void afterClass() {
    System.out.println("Count AfterClass is : " + count);
  }

  @Test//(timeout = 1000)
  public void test1AddToValue1() {
    count++;
    Sample sample = new Sample("A1");
    sample.setValue1(1);
    int value = sample.addToValue1(1);
//        assertTrue ("Result:" + value + "!= 2", value == 2);
    assertTrue(value == 2, "Result:" + value + "!= 2");
    System.out.println(Sample.finStr1);
    System.out.println(Sample.finStr2);
  }

  @Test
//    @Ignore("Feature not implemented yet") v4
  @Disabled("Feature not implemented yet")
  public void test2AddToValue1() {
    count++;
    Sample sample = new Sample("A2");
    sample.setValue1(1);
    int value = sample.addToValue1(1);
    assertEquals(value, 2);
  }

  @Test
  public void test3AddToValue1() {
    count++;
    Sample sample = new Sample("A3");
    sample.setValue1(1);
    int value = sample.addToValue1(1);
    assertNotEquals(value, 2);
  }

  @Test
  public void test4AddToValue1() {
    count++;
    if (bug) {
      assumeTrue("Test skipped due to not fixed bug", false);
    } else {
      Sample sample = new Sample("A4");
      sample.setValue1(1);
      int value = sample.addToValue1(1);
      assertNotEquals(value, 2);
    }
  }

  @Test
  public void test5Abbracadabra1() {
    count++;
    Sample sample = new Sample("A5");
    sample.setValue1(1);

    assertThrows(Exception.class, () -> {
      sample.getAbbracadabra(1);
    });
  }

  @Test
  public void test5Abbracadabra2() {
    count++;
    Sample sample = new Sample("A5");
    sample.setValue1(1);

    assertThrows(Exception.class, () -> {
      sample.getAbbracadabra(2);
    });
  }

}
