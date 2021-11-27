package Threads;

import com.sun.javafx.geom.AreaOp;

import javax.xml.soap.SOAPPart;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread");

        Thread anotherThread = new AnotherThread();

        anotherThread.start();

        System.out.println("Hello again");
    }
}
