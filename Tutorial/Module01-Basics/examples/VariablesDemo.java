/**
 * Module 01：变量与数据类型示例
 *
 * 编译：javac VariablesDemo.java
 * 运行：java VariablesDemo
 */
public class VariablesDemo {

    public static void main(String[] args) {
        // ========== 基本类型 ==========
        int age = 25;
        double price = 19.99;
        char grade = 'A';
        boolean isStudent = true;
        long population = 8_000_000_000L;   // 字面量可以用下划线分隔
        float pi = 3.1415926f;              // float 精度 ~7 位有效数字
        byte small = 100;
        short medium = 10000;

        System.out.println("年龄: " + age);
        System.out.println("价格: " + price);
        System.out.println("等级: " + grade);
        System.out.println("是否学生: " + isStudent);
        System.out.println("世界人口: " + population);
        System.out.println("圆周率: " + pi);

        // ========== 类型转换 ==========
        // 隐式转换（小 -> 大）
        int a = 100;
        long b = a;          // int → long ✅
        double c = a;        // int → double ✅

        // 显式转换（大 -> 小，可能丢失精度）
        long big = 1_000_000_000_000L;
        int narrow = (int) big;   // 精度丢失！结果不可预期
        System.out.println("long → int 丢失精度: " + narrow);

        // ========== 整数除法的陷阱 ==========
        System.out.println("10 / 3 = " + (10 / 3));         // 3
        System.out.println("10 / 3.0 = " + (10 / 3.0));     // 3.333...
        System.out.println("(double) 10 / 3 = " + ((double) 10 / 3)); // 3.333...

        // ========== 自动装箱拆箱 ==========
        Integer boxed = 100;        // 自动装箱
        int unboxed = boxed;        // 自动拆箱
        System.out.println("装箱: " + boxed + ", 拆箱: " + unboxed);

        // null 拆箱 -> NullPointerException ⚠️
        Integer nullBoxed = null;
        // int danger = nullBoxed;   // ❌ 去掉注释运行会崩溃

        // ========== var 关键字 ==========
        var name = "Java 21";       // String
        var version = 21;           // int
        System.out.println(name + ", 版本 " + version);
    }
}
