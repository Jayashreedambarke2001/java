package corejava;

    import java.io.*;
import java.util.*;
 class ExampleThread {
public static void main(String args[]){
	// Thread object created
// and initiated with data
Thread t = new Thread("Hello ANUDIP!");
// Thread gets started
t.start();
// getting data of
// Thread through String
String s = t.getName();
System.out.println(s);

}
}