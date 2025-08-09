class Solution {

    void mergeSort(int arr[], int l, int r) {
        if(l==r) return ;
        int mid = l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,r);
    }
    private void merge(int[] arr,int start,int end){
        int mid=start+(end-start)/2;
        int i=start,j=mid+1,k=0;
        int[] temp=new int[end-start+1];
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]) temp[k++]=arr[i++];
            else temp[k++]=arr[j++];
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        for(i=start;i<=end;i++){
            arr[i]=temp[i-start];
        }
    }
}