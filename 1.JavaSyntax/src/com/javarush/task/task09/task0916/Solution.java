package com.javarush.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Перехват checked-исключений
*/

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());

    }

    public static void handleExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch(RemoteException exR){
            System.out.println(exR);
        }
        catch(IOException exIO){
            System.out.println(exIO);
        }
        catch(NoSuchFieldException exNF){
            System.out.println(exNF);
        }
    }

    public void method1() throws IOException, NoSuchFieldException, RemoteException {
        this.method2();
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException, RemoteException {
        this.method3();
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
