abstract class Exporter {
    public abstract void export(String data) throws ExportException;

    public String formatName() {
        return getClass().getSimpleName();
    }
}