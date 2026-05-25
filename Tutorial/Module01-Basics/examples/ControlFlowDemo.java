/**
 * Module 01：流程控制示例
 *
 * 编译：javac ControlFlowDemo.java
 * 运行：java ControlFlowDemo
 */
public class ControlFlowDemo {

    public static void main(String[] args) {
        // ========== if-else ==========
        int score = 85;
        String level;
        if (score >= 90) {
            level = "优秀";
        } else if (score >= 80) {
            level = "良好";
        } else if (score >= 60) {
            level = "及格";
        } else {
            level = "不及格";
        }
        System.out.println("分数: " + score + ", 等级: " + level);

        // ========== switch（传统语法） ==========
        int dayOfWeek = 3;
        String dayName;
        switch (dayOfWeek) {
            case 1: dayName = "周一"; break;
            case 2: dayName = "周二"; break;
            case 3: dayName = "周三"; break;
            case 4: dayName = "周四"; break;
            case 5: dayName = "周五"; break;
            case 6: dayName = "周六"; break;
            case 7: dayName = "周日"; break;
            default: dayName = "无效";
        }
        System.out.println("第" + dayOfWeek + "天是: " + dayName);

        // ========== switch（JDK 14+ arrow 语法） ==========
        dayName = switch (dayOfWeek) {
            case 1 -> "周一";
            case 2 -> "周二";
            case 3 -> "周三";
            case 4 -> "周四";
            case 5 -> "周五";
            case 6 -> "周六";
            case 7 -> "周日";
            default -> "无效";
        };
        System.out.println("（arrow 语法）第" + dayOfWeek + "天是: " + dayName);

        // ========== for 循环 ==========
        System.out.print("普通 for: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ========== for-each 循环 ==========
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("for-each: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // ========== while 循环 ==========
        System.out.print("while: ");
        int i = 0;
        while (i < 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // ========== break 和 continue ==========
        System.out.print("break 示例（遇到 3 停止）: ");
        for (int j = 0; j < 10; j++) {
            if (j == 3) break;
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.print("continue 示例（跳过 3）: ");
        for (int j = 0; j < 6; j++) {
            if (j == 3) continue;
            System.out.print(j + " ");
        }
        System.out.println();

        // ========== 三元运算符 ==========
        int age = 20;
        String status = age >= 18 ? "成年" : "未成年";
        System.out.println("年龄 " + age + ": " + status);

        // ========== 短路逻辑 ==========
        String str = null;
        // 利用短路特性安全访问
        if (str != null && str.length() > 0) {
            System.out.println("字符串不为空");
        } else {
            System.out.println("字符串为空（短路保护生效）");
        }
    }
}
