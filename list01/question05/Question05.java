// Questão 5: Sistema de Configuração de Aplicação 
// Implemente uma classe AppConfig que gerencia configurações de aplicação:
class AppConfig {
    // Requisitos: 
    // Atributos privados: appName, version, maxConnections, timeoutSeconds, isDebugMode 
    private String appName;
    private String version;
    private int maxConnections;
    private int timeoutSeconds;
    private boolean isDebugMode;

    // Múltiplos construtores sobrecarregados para diferentes cenários de inicialização 
    public AppConfig(String appName) {
        this(appName, "1.0");
    }
    public AppConfig(String appName, String version) {
        this(appName, version, 10);
    }
    public AppConfig(String appName, String version, int maxConnections) {
        this(appName, version, maxConnections, 30);
    }
    public AppConfig(String appName, String version, int maxConnections, int timeoutSeconds) {
        this(appName, version, maxConnections, timeoutSeconds, false);
    }
    public AppConfig(String appName, String version, int maxConnections, int timeoutSeconds, boolean isDebugMode) {
        this.appName = appName;
        this.version = version;
        this.maxConnections = maxConnections;
        this.timeoutSeconds = timeoutSeconds;
        this.isDebugMode = isDebugMode;
    }

    // Métodos para manipulação de configuração: 
    // updateSettings(int maxConnections, int timeoutSeconds) 
    public void updateSettings(int maxConnections, int timeoutSeconds) {
        this.maxConnections = maxConnections;
        this.timeoutSeconds = timeoutSeconds;
    }

    // updateSettings(boolean isDebugMode) - versão sobrecarregada 
    public void updateSettings(boolean isDebugMode) {
        this.isDebugMode = isDebugMode;
    }

    // validateConfig() - valida se as configurações são consistentes 
    public void validateConfig() {
        if (maxConnections < 1) {
            System.out.println("Quantidade de conexões máximas inconsistente!");
        } else if (timeoutSeconds < 1) {
            System.out.println("Tempo limite inconsistente!");
        } else {
            System.out.println("Configurações consistentes.");
        }
    }

    // Desafio principal: Implemente a invocação de construtores usando this() de modo que um construtor mais complexo chame construtores mais 
    // simples, eliminando duplicação de código de inicialização.
}

public class Question05 {
    public static void main(String[] args) {
        AppConfig a1 = new AppConfig("MeuApp");

        a1.updateSettings(50, 120);
        a1.updateSettings(true);

        a1.validateConfig();
    }
}