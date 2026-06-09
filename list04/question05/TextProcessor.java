abstract class TextProcessor {
    public abstract String process(String input) throws InvalidInputException;

    public String stepName() {    
        return getClass().getSimpleName();
    }

    protected void validate(String input) {
        if(input == null || input.isEmpty()) {
            throw new InvalidInputException();
        }
    }
}