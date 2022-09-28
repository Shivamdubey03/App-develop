            // PRIVATE ACCESS-MODIFIER

class A{  
    private int data=40;  
    private void msg(){System.out.println("Hello java");}  
    }   
  

public class Modifiersinjava {
    public static void main(String[] args) {
        A obj=new A();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
    }

    Note: A class cannot be private or protected except nested class.
}








                       // DEFAULT ACCESS-MODIFIER
