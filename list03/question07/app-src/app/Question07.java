/********************************************************************************************************************************************
7. Pacotes, CLASSPATH e arquivos .jar

Problema: Separe uma aplicação em duas partes: uma biblioteca utilitária e um programa cliente que a utiliza.

Guia de implementação:
    - Coloque classes utilitárias em um pacote próprio, como br.edu.util.
    - Compile a biblioteca e gere um arquivo .jar contendo essas classes.
    - Configure a execução do programa cliente usando o .jar no CLASSPATH.
    - Entregue também um roteiro com os comandos de compilação e execução usados.
********************************************************************************************************************************************/

package app;

import br.edu.util.Calculator;
import br.edu.util.TextUtils;

class Main {
    public static void main(String[] args) {
        int sum = Calculator.add(10, 5);
        System.out.println("Soma: " + sum);

        String text = TextUtils.uppercase("vanessa");
        System.out.println("Texto: " + text);
    }

    // Entregue também um roteiro com os comandos de compilação e execução usados.

    // # Compilar biblioteca
    // javac -d build util-src/br/edu/util/*.java

    // # Criar jar
    // jar cf lib/util.jar -C build br

    // # Compilar cliente
    // javac -cp lib/util.jar -d build app-src/app/Main.java

    // # Executar
    // java -cp "build;lib/util.jar" app.Main   # Windows
}
// Configure a execução do programa cliente usando o .jar no CLASSPATH.