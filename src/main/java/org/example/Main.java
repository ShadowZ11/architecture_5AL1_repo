package org.example;

import org.example.inputs.CsvReader;
import org.example.inputs.InputChecker;

import java.io.FileNotFoundException;
import java.util.List;

import static org.example.calculate.Calcul.calculateRecords;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        if (!InputChecker.isInputsValid(args)) {
            throw new RuntimeException("Inputs are invalid");
        }
        List<String> records = new CsvReader().readCsv(args[1]);
        int finalResult = calculateRecords(records, args[2]);
        ConsolePrinter.printResult(finalResult, args[2]);
    }

}