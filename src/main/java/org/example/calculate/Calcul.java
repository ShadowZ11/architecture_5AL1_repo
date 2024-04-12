package org.example.calculate;

import java.util.List;

import static org.example.ConsolePrinter.showIntermediateResult;

public class Calcul {

    public static int calculateRecords(List<String> records, String operation) {
        int finalResult = Integer.parseInt(records.get(0));
        System.out.println("\t\t" + finalResult);
        for (String record : records.subList(1, records.size())) {
            int b = Integer.parseInt(record);
            finalResult = calculate(finalResult, b, operation);
        }
        return finalResult;
    }


    public static int calculate(int a, int b, String operation){
        if (!isOperationPermitted(operation)){
            throw new IllegalArgumentException("Operation not permitted");
        }
        int result;
        switch (OperationEnum.fromString(operation)) {
            case ADDITION:
                result = a + b;
                break;
            case MULTIPLICATION:
                result = a * b;
                break;
            default:
                throw new IllegalArgumentException("Operation not permitted");
        }
        showIntermediateResult(b, result, operation);
        return result;
    }


    private static boolean isOperationPermitted(String operation){
        return operation.equals("+") || operation.equals("*");
    }

}
