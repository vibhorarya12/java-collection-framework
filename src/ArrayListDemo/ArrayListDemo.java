package ArrayListDemo;

import java.util.ArrayList;

class Student {

    public  String name;
    public  int id;

     public Student(String name, int id){
         this.name = name;
         this.id = id;
     }


     // modify the to string method //
    @Override
    public String toString() {
        return "{name='" + name + "', id=" + id + "}";
    }


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;

}


  interface Animal  {

    public  void someMethod();
    public  void someMethod(String str);
    public  void someOtherMethod();


}

class Dog implements  Animal{


    @Override
    public  void someMethod(){

        System.out.println("someMethod");
    }

    @Override
    public  void someOtherMethod(){

        System.out.println("someOtherMethod");
    }

    @Override
    public  void someMethod(String str){

        System.out.println(str);
    }
   public  void myMethod(){

       System.out.println("myMethod");

   }


}







public class ArrayListDemo {
    public static void main(String[] args) {

        Student  a = new Student("Vibhor",4156);
        Student  b = new Student("Arya",41786);
        ArrayList<Student> ls = new ArrayList();
//        ls.add(1);
//        ls.add(2);
//        ls.add(3);

        ls.add(a);
        ls.add(b);


//        for(int i =0 ; i<ls.size(); i++){
//
//            System.out.println(ls.get(i));
//
//
//        }

//for (int x : ls){
//    System.out.println(x);
//}

  Animal dg = new Dog();

dg.someMethod("hello dog");
dg.someOtherMethod();


    }
}
