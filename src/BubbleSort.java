/**
 * 使用冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,7,11,2,6};
        int temp;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j <arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        System.out.println("以下是排序结果：");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

}
