//generics1
class Student{
    int id;
    String name;
}
class Test<T>{
    T i;
   Test(T x){
     i=x;
    }
    void show(){
    System.out.println(i);
    System.out.println(i.getClass().getName());
    }

}
