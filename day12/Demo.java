// toCharArray()
// getBytes()
// 
public class Demo{
public static void main(String[] args){
  String s1="ABC";
//CONVERT STRING OBJ INTO CHAR ARRAY
  char arr[];
  arr=s1.toCharArray();
  int i;
  for(i=0;i<arr.length;i=i+1){
  System.out.println(arr[i]);
}
//############################//enddregion
//convert string object into byte array

  byte[]arr1; 
  arr1=s1.getBytes();
  for(i=0;i<arr.length;i=i+1){
  System.out.println(arr1[i]);
}
}
}
  

