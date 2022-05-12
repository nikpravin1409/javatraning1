// 3. Write a Program that take 5 numbers into array and print square value of each number.

class arr{
public static void main(String[] args){
int[] temp ={0,5,8,3,8};
for(int i=0; i<temp.length; i++){
System.out.println(temp[i]+ "\t"+(int)Math.pow(temp[i],2));
}
}
}