package LinearSearching;

public class Arrays {
    static void main(String[] args) {
        int nums[]={22,33,44,55,667,77,88,99};
        int target=55;
        boolean ans=linearSearch3(nums,target);
        System.out.println(ans);

    }
    //search the target and return true or false

    static boolean linearSearch3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        //run for loop
        for(int elements:arr){
            //check for elements at every index if its is =target

            if(elements==target){
                return true;
            }

        }
        //this line will exceute if none of the return
        return false ;
    }

    //search the target return thre elements
    static int linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        //run for loop
        for(int elements:arr){
            //check for elements at every index if its is =target

            if(elements==target){
                return elements;
            }

        }
        //this line will exceute if none of the return
        return Integer.MAX_VALUE;
    }





    //search the array :return the index if items founds
    //otherwise return the items not found retun-1
  static int linearSearch1(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        //run for loop
      for(int i=0;i<arr.length;i++){
          //check for elements at every index if its is =target
          int elements =arr[i];
          if(elements==target){
              return i;
          }

      }
      //this line will exceute if none of the return
      return -1;
  }


}
