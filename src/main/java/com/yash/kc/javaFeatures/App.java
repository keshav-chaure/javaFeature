package com.yash.kc.javaFeatures;

import com.yash.kc.java8.LedLight;
import com.yash.kc.java8.LightEmiter;
import com.yash.kc.java8.SyskaLight;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        com.yash.kc.java5.Example app=new com.yash.kc.java5.Example();
       // app.showGeneric();
        //app.enumTest();
        //app.showGeneric();
      
     // java 8 interface default method    
        SyskaLight led=new SyskaLight();
      //   led.color="blue"; color is defined in interface so default public static final
      //  led.color="blue";
         System.out.println("led color : "+ led.color);
        System.out.println("led color : "+ led.getColor()); // behiviour from abstract method
        System.out.println("led color : "+ LightEmiter.color); // constant form interface 
      
      
      //java 8 interface static method      
    //  LightEmiter.consumes();
      
    }
}
