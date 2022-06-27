package corejava;

    import java.io.*;
import java.util.*;
class ThreadExample2 implements Runnable{
public void run()
{
	System.out.println("Thread is created and running successfully...");
}
public static void main(String[] args) {
	
// Runnable interface
Runnable r1 = new ThreadExample2();
Thread t1 = new Thread(r1, "HELLO ANUDIP");
// Thread object started
t1.start();
// getting the Thread
// with String Method
String str = t1.getName();
System.out.println(str);

}
}
