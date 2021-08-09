/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sort;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {

        int[] array=  {8,4,23,42,16,15};
//        SelectionSort(array);
        mergeSort(array,0,5);
        System.out.println(array[0]);
        System.out.println(array[5]);


    }

    public static void  SelectionSort(int [] arr){
        int length=arr.length;

        for (int i=0;i<length;i++){
            int value= arr[i];
            int k=value;
            for(int j=i+1;j<length;j++){
                if (arr[j]<value){
                    value= arr[j];
                    arr[j]=k;
                }
            }
            arr[i]=value;
        }
    }

    private static void merge(int arr[], int start, int mid, int end ){
        int [] temp= new int[end-start+1];
        int i=start,j=mid+1,k=0;
        while (i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                k+=1;
                i+=1;
            }else{
                temp[k]=arr[j];
                k+=1;
                j+=1;
            }
        }

        while(i<=mid){
            temp[k]=arr[i];
            i+=1;
            k+=1;
        }

        while(j<=end){
            temp[k]=arr[j];
            j+=1;
            k+=1;
        }

        for(i = start; i <= end; i += 1) {
            arr[i] = temp[i - start];
        }
    }

    public static void mergeSort(int [] arr, int start,int end){
        if (start<end){
            int mid= (end+start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }

    }


}