public class ReverseProcessor extends TextProcessor {
    @Override
    public String process(String input) {
        validate(input);
        return new StringBuilder(input).reverse().toString();
    }
}