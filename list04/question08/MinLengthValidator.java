class MinLengthValidator extends Validator {
    private int minLength;

    public MinLengthValidator(String field, int minLength) {
        this.field = field;
        this.minLength = minLength;
    }

    public  void validate(String value) 
        throws ValidationException {
            if(value.length() < minLength) {
                throw new MinLengthException(field, minLength);
            }
        }
}