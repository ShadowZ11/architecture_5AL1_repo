package org.example.inputs;

public class InputChecker {

    public static boolean isInputsValid(String[] args) {
        if (args.length != 3) {
            return false;
        }

        String programName = args[0];
        String fileName = args[1];
        String operation = args[2];

        if (!programName.equals("calc")) {
            return false;
        }

        if (!(operation.equals("+") || operation.equals("*"))) {
            return false;
        }

        if (!fileName.contains(".csv")) {
            return false;
        }
        return true;
    }
}
