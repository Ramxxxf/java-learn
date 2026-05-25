import java.util.Arrays;

/**
 * Module 01：数组操作示例
 */
public class ArrayDemo {

    public static void main(String[] args) {
        // ========== 创建数组 ==========
        int[] arr1 = new int[5];            // [0, 0, 0, 0, 0]
        int[] arr2 = {10, 20, 30, 40, 50};  // 直接初始化

        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr2.length: " + arr2.length);

        // ========== 遍历 ==========
        // 普通 for
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        System.out.println("普通 for 求和: " + sum);

        // for-each
        int product = 1;
        for (int num : arr2) {
            product *= num;
        }
        System.out.println("for-each 求积: " + product);

        // ========== Arrays 工具类 ==========
        int[] unsorted = {42, 17, 8, 99, 33};
        System.out.println("原始: " + Arrays.toString(unsorted));

        Arrays.sort(unsorted);
        System.out.println("排序后: " + Arrays.toString(unsorted));

        int idx = Arrays.binarySearch(unsorted, 33);  // 二分查找（需先排序）
        System.out.println("33 的位置: " + idx);

        // 数组拷贝
        int[] copy = Arrays.copyOf(unsorted, 3);      // 前 3 个元素
        System.out.println("拷贝前3个: " + Arrays.toString(copy));

        // ========== 二维数组 ==========
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("matrix[1][2]: " + matrix[1][2]);  // 6

        // 遍历二维数组
        System.out.println("二维数组遍历:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // ========== 练习：统计随机数组 ==========
        System.out.println("\n=== 统计随机数组 ===");
        int[] randoms = new int[10];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random() * 100) + 1;  // 1~100
        }
        System.out.println("随机数组: " + Arrays.toString(randoms));

        int max = randoms[0];
        int min = randoms[0];
        int total = 0;
        for (int num : randoms) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            total += num;
        }
        System.out.println("最大值: " + max);
        System.out.println("最小值: " + min);
        System.out.println("平均值: " + (double) total / randoms.length);
    }
}
