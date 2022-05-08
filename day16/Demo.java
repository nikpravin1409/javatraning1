public class Demo {

    public static void main(String[] args) {
        Test<Integer> ob1=new Test<>(10);
        Test<String> ob2=new Test<>("Hello");
        ob1.show();
        ob2.show();
        Student st=new Student();
        Test<Student> ob3=new Test<>(st);
        ob3.show();
    }
}

 
class Test<T,V>{
    T i;
    V j;
    Test(T x,V y){
        i=x;
        j=y;
    }
    void show(){
        System.out.println(i);
        System.out.println(i.getClass().getName());
        System.out.println(j);
        System.out.println(j.getClass().getName());
    }

}
