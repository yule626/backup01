public class Bubble {
    public static void main(String[] args) {
        //相邻的两个元素相比
        //第一轮找到一个最大值...第二轮找剩下的最大值...
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};

        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

        System.out.println("\nAfter bubble sort!");

        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){ //不用考虑最后的值，因此只需要考虑前len(arr)-1-i个
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}

class Bubblesort{
    public static void main(String[] args) {
        int[] arr1=new int[]{56,9,10,19,28,37,34};
        for (int i =0;i<arr1.length;i++){
            System.out.print(arr1[i]+"\t");
        }

        System.out.println("\nAfter bubble sort!");
        for(int i =0;i< arr1.length-1;i++){
            boolean sorted = true;
            for(int j=0;j<arr1.length-1-i;j++){
                if (arr1[j]>arr1[j+1]){
                    int tmp = arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=tmp;
                    sorted = false;
                }
            }
            if (sorted){
                break;
            }
        }

        for (int i =0;i<arr1.length;i++){
            System.out.print(arr1[i]+"\t");
        }
    }
}
