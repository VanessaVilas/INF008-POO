class ValidationException extends Exception {
    private String field;
    private String errorCode;

    public ValidationException(String field, String errorCode, String message) {
        super(message);
        this.field = field;
        this.errorCode = errorCode;
    }

    public String fieldName() {
        return field;
    }

    public String errorCode() {
        return errorCode;
    }
}