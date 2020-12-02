package com.atguigu.jvm.L01;

public class StackStruTest {

  /**
   * 反编译看指令
   * javap -v StackStruTest.class
   * 以下代码的指令：
   *  0: iconst_2
   *  1: istore_1
   *  2: iconst_3
   *  3: istore_2
   *  4: iload_1
   *  5: iload_2
   *  6: iadd
   *  7: istore_3
   *  8: return
   * @param args
   */
  public static void main(String[] args) {
    int i = 2;
    int j = 3;
    int k = i + j;
  }

}
