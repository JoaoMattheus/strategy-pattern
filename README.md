# Padrão de Estratégia em Java

Este é um projeto de exemplo que demonstra como implementar o padrão de estratégia em Java.

## O que é o Padrão de Estratégia?

O Padrão de Estratégia é um padrão de projeto de software que permite que você altere facilmente o comportamento de um objeto. Isso é alcançado criando uma interface comum para diferentes estratégias e permitindo que o objeto escolha a estratégia apropriada em runtime.

## O Projeto

Este projeto implementa o cálculo de frete para uma loja virtual. O valor do frete é calculado com base em diferentes estratégias, como peso, distância e velocidade. O usuário fornece o valor do pedido e a estratégia desejada, e o sistema retorna o valor do frete.

## Como usar

1. Clone este repositório
2. Abra o projeto no seu ambiente de desenvolvimento Java favorito
3. Execute a classe Main
4. Siga as instruções na tela para calcular o frete com base em diferentes estratégias

## Arquivos importantes

* `Main.java`: Classe principal que solicita ao usuário o valor do pedido e chama o método `Order.calculate` para calcular o frete com base em diferentes estratégias.
* `ShippingStrategy.java`: Interface comum para todas as estratégias de envio.
* `ShippingByDistance.java`, `ShippingBySpeed.java`, `ShippingByWeight.java`: Classes que implementam a interface `ShippingStrategy` e fornecem a lógica para calcular o frete para cada estratégia.
* `Order.java`: Classe que contém o método calculate para calcular o frete com base na estratégia fornecida.