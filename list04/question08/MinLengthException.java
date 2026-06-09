class MinLengthException extends ValidationException {
    public MinLengthException(String field, int minLength) {
        super(field, "MIN_LENGTH", "O campo deve possuir pelo menos " + minLength + " caracteres.");
    }
}