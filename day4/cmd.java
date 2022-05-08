class DemocmdArgs{
public static void main(String[] args){

float a,b,c;
if(args.length == 2)
{
a = Float.parseFloat(args[0]);
b = Float.parseFloat(args[1]);
c=a+b;
System.out.println("addition is "+c);
System.out.println();
}
else
{
System.out.println("please enter*2args");
}
}
}