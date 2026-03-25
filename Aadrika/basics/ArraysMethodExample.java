class ArraysMethodExample{

public static void main(String[] args){

  int[] arr = {40,10,30,20);
  
  System.out,println("original Array:");
  System.out.println(arr);
  System.out.println(Array.toString(arr));
  //output: [40,10,30,20]
  
  //2. sorting the array
  Array.sort(arr);
  System.out.println("Sorted Array:");
  System.out.println(Array.toString(arr_));
  
  int index =Array.binarysearch(arr,30);
  System.out.println(Index of 30:"+index):
  
  int[] arr2 = {10,20,30,40};
  
  boolen isequal = Array.equals(arr,arr2);
  System.out,println("Both array are equal:"+isequal);
  
  int[]arr3 = new int[5];
  
  Array.fill(arr3,7);
  
  System.out.println("filled Array:");
  System.out.println(Array.toString(arr3));
  }
  }