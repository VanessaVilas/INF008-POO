class PushNotifier implements Notifier {
    private String token;

    public PushNotifier(String token) {
        this.token = token;
    }

    @Override
    public void send(String message) throws NotificationException {
        if (token.length() > 16) {
            System.out.println("Push: " + message);
        } else {
            throw new NotificationException();
        }
    }
}