class Student{
int id;
String name;
Student(String a,String b){
id=a;
name=b;
}
@Override
public String toString(){
return"("+id+","name+")";
}
@Override
public int hashcode(){
int code;
code=name.hashcode()+id;
return code;

@Override
public boolean equals(Object obj){
voolean f=false;
Student st=(Student)obj;
if(id==st.id && name.equals(st.name)){
f=true;
}
return f;
}
}
public class Demo5{
public static void main(String[] args){
HashSet<Student>hs;
hs=new HashSet<>();
Student st1 = new Student(a:1,b:"A");
Student st2 = new Student(a:1,b:"A");
hs.add(st1);
hs.add(st2);
System.out.println(hs);
System.out.println(st1.hashcode());
System.out.println(st2.hashcode());
}