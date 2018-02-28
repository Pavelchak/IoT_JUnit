package com.pavelchak.Tasks;

public class Sample {

  private String name;
  private int value1;
  private int value2;
  private int value3;

  static final String finStr1 = "foo1";
  protected static final String finStr2 = "foo2";

  public Sample(String name) {
    this.name = name;
  }

  public int addToValue1(int value) {
    return value + value1;
  }

  public void calcValue3() {
    value3 = value1 + value2;
  }

  public int getValue1() {
    return value1;
  }

  public void setValue1(int value1) {
    this.value1 = value1;
  }

  public int getValue2() {
    return value2;
  }

  public void setValue2(int value2) {
    this.value2 = value2;
  }

  public int getValue3() {
    return value3;
  }

  public void setValue3(int value3) {
    this.value3 = value3;
  }
}
