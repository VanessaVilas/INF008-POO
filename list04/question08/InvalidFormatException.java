class InvalidFormatException extends ValidationException {
    public InvalidFormatException(String field) {
        super(field, "INVALID_FORMAT", "Formato inválido.");
    }
}