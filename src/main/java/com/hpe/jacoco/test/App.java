package com.hpe.jacoco.test;
import java.util.UUID;
public class App
{

    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
    }

    public String generateUniqueKey(){

    	String id = UUID.randomUUID().toString();
    	return id;

    }

    public void dummyFunction(){
        System.out.println("dummy message");
    }

    public void dummyFunction2(){
        System.out.println("dummy message2");
    }

    public void dummyFunction3(){
        System.out.println("dummy message2");
    }

}