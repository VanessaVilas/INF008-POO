class SmsNotifier implements Notifier {
    private String number;

    public SmsNotifier(String number) {
        this.number = number;
    }

    @Override
    public void send(String message) throws NotificationException {
        System.out.println("SMS: " + message);
    }
}