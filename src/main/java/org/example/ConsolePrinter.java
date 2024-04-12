package org.example;

public class ConsolePrinter {


    public static void printResult(int finalResult, String operation) {
        System.out.println("\t\t-------");
        System.out.println("total = " + finalResult + (operation.equals("+") ? " (addition)" : " (multiplication)"));
    }

    public static void showIntermediateResult(int additionateWith, int result, String operation){
        System.out.println("\t\t" + operation + additionateWith + " (=" + result + ")");
    }

}
