class EmailValidator extends Validator {
    public EmailValidator(String field) {
        this.field = field;
    }

    public  void validate(String value) 
        throws ValidationException {
            if(!value.contains("@")) {
                throw new InvalidFormatException(field);
            }
        }
}