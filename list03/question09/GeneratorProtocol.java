class GeneratorProtocol {
    // Use um atributo static para controlar a numeração sequencial global dos protocolos.
    private static int GlobalCounter = 0;
    private String protocol;

    public GeneratorProtocol() {
        GlobalCounter++;
        this.protocol = formatProtocol(GlobalCounter);
    }

    public static int getGlobalCounter() {
        return GlobalCounter;
    }

    public String getProtocol() {
        return protocol;
    }

    // Implemente métodos static utilitários para formatar protocolos e validar códigos.
    public static String formatProtocol(int numero) {
        return "PROT-" + String.format("%05d", numero);
    }

    public static boolean validateProtocol(String code) {
        return code != null && code.matches("PROT-\\d{5}");
    }
}