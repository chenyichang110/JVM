package com.atguigu.jvm.L08;

/**
 * 逃逸分析
 * 如何快速的判断是否发生了逃逸：new的对象实体是否有可能在方法外被调用
 *
 * @author chenyichang
 * @date 2020/12/2 20:11
 */
public class EscapeAnalysis {
    public EscapeAnalysis obj;

    /*
    方法返回EscapeAnalysis对象，发生逃逸
     */
    public EscapeAnalysis getInstance() {
        return obj == null ? new EscapeAnalysis() : obj;
    }

    /*
    为成员属性赋值，发生逃逸
    如果当前obj声明时static？ 还是会发生逃逸
     */
    public void setObj() {
        this.obj = new EscapeAnalysis();
    }

    /*
    对象的作用域仅在当前方法，没有发生逃逸
     */
    public void useEscapeAnalysis() {
        EscapeAnalysis ea = new EscapeAnalysis();
    }

    /*
    引用成员变量的值，发生逃逸
     */
    public void useEscapeAnalysis1() {
        EscapeAnalysis ea = getInstance();
    }
}
