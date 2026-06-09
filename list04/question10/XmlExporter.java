class XmlExporter extends Exporter {
    @Override
    public void export(String data) throws ExportException {
        if(data == null) {
            throw new ExportException("XML", "Dados não podem ser nulos.");
        } else {
            System.out.println("Exportação XML concluída com sucesso!");
        }
    }
}