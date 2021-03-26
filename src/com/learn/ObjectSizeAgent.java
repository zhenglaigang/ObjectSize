package com.learn;

import java.lang.instrument.Instrumentation;

/**
 * JavaAgent
 * 使用Instrumentation，是jdk自带的一种动态代理
 * 可以截获对象的二进制码，可以修改二进制码
 */
public class ObjectSizeAgent {
  private static Instrumentation inst;

  /**
   * @param agentArgs 名字是固定的
   * @param _inst
   */
  public static void premain(String agentArgs, Instrumentation _inst) {
    inst = _inst;
  }

  public static long sizeOf(Object o) {
    return inst.getObjectSize(o);//间接获取对象大小
  }
}
