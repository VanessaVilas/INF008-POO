class ExportException extends Exception {
    private String format;

    public ExportException(String format, String message) {
        super(message);
        this.format = format;
    }

    public String format() {
        return format;
    }
}