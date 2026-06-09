public class TrimProcessor extends TextProcessor {
    @Override
    public String process(String input) {
        validate(input);
        return input.trim();
    }
}