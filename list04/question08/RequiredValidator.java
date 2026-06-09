class RequiredValidator extends Validator {
    public RequiredValidator(String field) {
        this.field = field;
    }

    public  void validate(String value) 
        throws ValidationException {
            if(value.isEmpty()) {
                throw new RequiredFieldException(field);
            }
        }
}