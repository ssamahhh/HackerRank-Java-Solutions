import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Arithmetic{
    private int a;
    private int b;
    
    public void seta(int a){
        this.a=a;
    }
    
    public int geta( ){
        return a;
    }
    
    public void setb(int b){
        this.b=b;
    }
    
    public int getb( ){
        return b;
    }
    
    public int add(int a,int b)
    {
        return (a+b);
    }
}

class Adder extends Arithmetic{

       
}


public class Java_Inheritance_II{
    public static void main(String []args){
        
        Adder a = new Adder();  
        
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
