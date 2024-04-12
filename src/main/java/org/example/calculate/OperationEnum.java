package org.example.calculate;

public enum OperationEnum {
    ADDITION("+"),
    MULTIPLICATION("*");

    private final String operation;

    OperationEnum(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public static OperationEnum fromString(String text) throws IllegalArgumentException {
        for (OperationEnum o : OperationEnum.values()) {
            if (o.getOperation().equals(text)) {
                return o;
            }
        }
        throw new IllegalArgumentException("Aucune constante d'énumération avec le texte " + text + " trouvé");
    }

}
