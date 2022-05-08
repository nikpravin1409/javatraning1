// ARRAY SEARCHING// 
import java.util.*;
class DemoArray2{

public static void main(String[]args){

int i,item;
Scanner sc=new Scanner(System.in);
//declare int array of size is 

int[] arr={2,3,7,9,1,4,6,3,2};
boolean isfound =false;
System.out.println("enter item to search");
item=sc.nextInt();
for(i=0;i<arr.length;i=i+1)
{
if(item==arr[i]);
isfound= true;
break;
}
,
if(isfound == true)
{
System.out.println("item found");
}
else
{
System.out.println("item not found");
}
}
}