import java.util.Arrays;

/**
 * Module 01：字符串操作示例
 *
 * 编译：javac StringDemo.java
 * 运行：java StringDemo
 */
public class StringDemo {

    public static void main(String[] args) {
        // ========== 创建字符串 ==========
        String s1 = "Hello";                    // 字符串常量池
        String s2 = "Hello";                    // 复用池中对象
        String s3 = new String("Hello");        // 堆上新对象

        System.out.println("s1 == s2: " + (s1 == s2));        // true（同一对象）
        System.out.println("s1 == s3: " + (s1 == s3));        // false（不同对象）
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true（内容相同）

        // ========== String 不可变性 ==========
        String s = "  Hello, Java World!  ";
        System.out.println("原始: [" + s + "]");
        System.out.println("trim: [" + s.trim() + "]");    // 去首尾空格

        // 注意：s 本身没有改变！
        System.out.println("调用 trim 后原始不变: [" + s + "]");

        // ========== 常用方法 ==========
        System.out.println("\n=== 常用方法 ===");
        String text = "Hello, Java!";
        System.out.println("length: " + text.length());
        System.out.println("charAt(1): " + text.charAt(1));
        System.out.println("substring(7, 11): " + text.substring(7, 11));
        System.out.println("indexOf('Java'): " + text.indexOf("Java"));
        System.out.println("contains('Java'): " + text.contains("Java"));
        System.out.println("startsWith('He'): " + text.startsWith("He"));
        System.out.println("endsWith('!'): " + text.endsWith("!"));

        // split 和 join
        String csv = "apple,banana,orange";
        String[] fruits = csv.split(",");
        System.out.println("split: " + Arrays.toString(fruits));
        String joined = String.join(" | ", fruits);
        System.out.println("join: " + joined);

        // ========== StringBuilder ==========
        System.out.println("\n=== StringBuilder ===");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i);
            if (i < 9) sb.append(", ");
        }
        System.out.println("StringBuilder 结果: " + sb.toString());

        // StringBuilder 链式调用
        StringBuilder chain = new StringBuilder()
                .append("[")
                .append("Hello")
                .append(", ")
                .append("World")
                .append("]");
        System.out.println("链式调用: " + chain.toString());

        // ========== 格式化输出 ==========
        System.out.println("\n=== 格式化 ===");
        String name = "Alice";
        int age = 25;
        double score = 92.5;
        System.out.printf("姓名: %s, 年龄: %d, 分数: %.1f%n", name, age, score);

        String formatted = String.format("姓名: %s, 年龄: %d", name, age);
        System.out.println("String.format: " + formatted);
    }
}
