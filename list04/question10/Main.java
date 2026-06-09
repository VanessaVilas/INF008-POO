public class Main {
    public static void main(String[] args) {
        Exporter[] exporters = { new CsvExporter(), new JsonExporter(), new XmlExporter() };
        String[] data = { "Alice,30", "Bob,25", null }; // null causa falha proposital
        for (int i = 0; i < exporters.length; i++) {
            try {
                exporters[i].export(data[i]);
                if (exporters[i] instanceof Compressible c) {
                    c.compress(); // Apenas exporters que suportam compressão
                }
            } catch (ExportException e) {
                System.out.println("Erro ao exportar [" + e.format() + "]: " + e.getMessage());
            }
        }
    }
}