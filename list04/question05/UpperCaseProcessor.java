class UpperCaseProcessor extends TextProcessor {
    @Override
    public String process(String input) throws InvalidInputException {
        validate(input);
        return input.toUpperCase();
    }
}