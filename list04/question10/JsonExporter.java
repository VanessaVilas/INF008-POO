class JsonExporter extends Exporter implements Compressible {
    @Override
    public void export(String data) throws ExportException {
        System.out.println("Exportação JSON concluída com sucesso!");
    }

    @Override
    public void compress() {
        System.out.println("Compressão concluída com sucesso!");
    }
}