abstract class Validator {
    protected String field;

    public String fieldName() {
        return field;
    }

    public abstract void validate(String value) throws ValidationException;
}