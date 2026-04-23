/********************************************************************************************************************************************
8. Maven e uso de bibliotecas externas

Problema: Crie uma aplicação Java que leia um arquivo CSV de Sales e gere um relatório resumido em JSON.

Guia de implementação:
    - Estruture o projeto com Maven.
    - Adicione dependências externas para leitura de CSV e geração de JSON.
    - Implemente classes de domínio para representar Sale e relatório.
    - Gere um relatório com total vendido, product mais vendido e média por Sale.
    - Entregue o pom.xml configurado e instruções para executar com Maven.
********************************************************************************************************************************************/

package app;

import com.opencsv.CSVReader;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStreamReader;
import java.util.*;

public class Question08 {
    public static void main(String[] args) throws Exception {

        List<Sale> sales = new ArrayList<>();
        
        // Ler CSV da pasta resources
        CSVReader reader = new CSVReader(new InputStreamReader(
                Question08.class.getResourceAsStream("/sales.csv")
        ));

        String[] line;
        reader.readNext(); // pula cabeçalho

        while ((line = reader.readNext()) != null) {
            String product = line[0];
            int quantity = Integer.parseInt(line[1]);
            double price = Double.parseDouble(line[2]);

            sales.add(new Sale(product, quantity, price));
        }

        // Processamento
        double total = 0;
        Map<String, Integer> count = new HashMap<>();

        for (Sale v : sales) {
            total += v.getTotal();
            count.put(v.getProduct(),
                    count.getOrDefault(v.getProduct(), 0) + 1);
        }

        // Produto mais vendido
        String bestSelling = Collections.max(count.entrySet(),
                Map.Entry.comparingByValue()).getKey();

        double average = total / sales.size();

        Report report = new Report(total, bestSelling, average);

        // Gerar JSON
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(report);

        System.out.println(json);
        
        // Entregue o pom.xml configurado e instruções para executar com Maven.

        // # Compilar
        // mvn compile

        // # Executar
        // mvn exec:java
    }
}