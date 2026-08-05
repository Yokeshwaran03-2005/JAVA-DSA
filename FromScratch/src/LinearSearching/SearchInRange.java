package LinearSearching;

public class SearchInRange {
    static void main(String[] args) {
        int[] arr={22,45,67,89,399,77,55};
        int target=89;
        System.out.println(linearsearch(arr,target,0,6));

    }
    static int linearsearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            int element =arr[i];
            if(element == target){
                return  i;
            }

        }
        return target;
    }
}
