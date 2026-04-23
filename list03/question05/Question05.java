/********************************************************************************************************************************************
5. Sobrecarga de métodos

Problema: Desenvolva uma classe CalculadoraFrete para uma loja virtual.

Guia de implementação:
    - Sobrecarregue o método calcularFrete para diferentes entradas: por peso, por peso e distância, por peso, distância e tipo de entrega.
    - Crie também uma versão que receba dimensões do pacote para calcular volume.
    - Defina regras de negócio diferentes para cada assinatura.
    - No main, mostre chamadas para todas as versões e compare os resultados.
********************************************************************************************************************************************/

class ShippingCalculator {
    // Sobrecarregue o método calcularFrete para diferentes entradas: por peso, por peso e distância, por peso, distância e tipo de entrega.
    // Defina regras de negócio diferentes para cada assinatura.
    public float calculateShipping(float weight) {
        return weight * 5;
    }

    public float calculateShipping(float weight, float distance) {
        return calculateShipping(weight) + (distance * 0.1f);
    }

    public float calculateShipping(float weight, float distance, String deliveryType) {
        float baseValue = calculateShipping(weight, distance);

        switch (deliveryType.toLowerCase()) {
            case "expresso":
                return baseValue * 1.5f;
            case "normal":
                return baseValue;
            case "economico":
                return baseValue * 0.9f;
            default:
                System.out.println("Tipo inválido, usando normal.");
                return baseValue;
        }
    }

    // Crie também uma versão que receba dimensões do pacote para calcular volume.
    public float calculateShipping(float height, float width, float length) {
        float volume = height * width * length;
        return volume * 0.2f;
    }
}

class Main {
    public static void main(String[] args) {
        // No main, mostre chamadas para todas as versões e compare os resultados.
        ShippingCalculator s1 = new ShippingCalculator();

        System.out.println("Frete (peso): R$ " + s1.calculateShipping(10f));
        System.out.println("Frete (peso + distância): R$ " + s1.calculateShipping(10f, 100f));
        System.out.println("Frete (expresso): R$ " + s1.calculateShipping(10f, 100f, "expresso"));
        System.out.println("Frete (econômico): R$ " + s1.calculateShipping(10f, 100f, "economico"));
        System.out.println("Frete (volume): R$ " + s1.calculateShipping(2f, 3f, 4f));
    }
}