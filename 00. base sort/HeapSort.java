import java.util.Arrays;

/**
 * 选择排序の二叉树/堆排序
 * 基本原理：构建大/小顶堆，将堆顶与最小叶子交换，然后忽略此最小叶子，调整大/小顶堆，递归循环。
 *                0
 *           1        2
 *        3    4    5   6
 *      7  8  9
 *              \\
 *                0
 *           1        2
 *        3    9    5   6
 *      7  8  4
 *              \\
 *                0
 *           1        2
 *        8    9    5   6
 *      7  3  4
 *              \\
 *                0
 *           9        6
 *        8    4    5   2
 *      7  3  1
 *              \\
 *                9
 *           8        6
 *        7    4    5   2
 *      0  3  1
 *
 *     交换堆顶与最后一个叶子的值
 *
 *                1
 *           8        6
 *        7    4    5   2
 *      0  3  9
 *
 *   忽略最后一个叶子，构建大顶堆，递归循环
 *
 *                0
 *           1        2
 *        3    4    5   6
 *      7  8  9
 */

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("初始是：" + Arrays.toString(arr));
        sort(arr);
        System.out.println("结果是：" + Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        //1.构建大顶堆
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr, i, arr.length);
            System.out.println("第" + i + "次构建大顶堆结果是：" + Arrays.toString(arr));
        }

        System.out.println("\n\t\t\t构建大顶堆结束\n");

        //2.调整堆结构+交换堆顶元素与末尾元素
        for (int j = arr.length - 1; j > 0; j--) {
            swap(arr, 0, j);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr, 0, j);//重新对堆进行调整
            System.out.println("第" + j + "次交换堆顶元素结果是：" + Arrays.toString(arr));
        }
    }

    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     */
    public static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];//先取出当前元素i
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {//从i结点的左子结点开始，也就是2i+1处开始
            if (k + 1 < length && arr[k] < arr[k + 1]) {//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if (arr[k] > temp) {//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
            System.out.println("\t第" + k + "次调整堆结构结果是：" + Arrays.toString(arr));
        }
        arr[i] = temp;//将temp值放到最终的位置
    }

    public static void adjustHeap1(int[] arr, int i, int length) {
        int temp = arr[i];
        int k = 2 * i + 1;
        while (k < length) {
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (k + 1 < length && arr[k] < arr[k + 1]) {
                k++;
            }
            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= arr[k]) {
                break;
            }
            // 把孩子结点的值赋给父结点
            arr[i] = arr[k];
            // 选取孩子结点的左孩子结点,继续向下筛选
            i = k;
            k = 2 * k + 1;
        }

        arr[i] = temp;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void swap1(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }
}
