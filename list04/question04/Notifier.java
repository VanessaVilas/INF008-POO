interface Notifier {
    public abstract void send(String message) throws NotificationException;
}