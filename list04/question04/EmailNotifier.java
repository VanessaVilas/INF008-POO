class EmailNotifier implements Notifier {
    private String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void send(String message) throws NotificationException {
        System.out.println("Email: " + message);
    }
}