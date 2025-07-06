# Ingresso Cinema – Projeto de Herança e Polimorfismo em Java

Este projeto simula um sistema de vendas de ingressos de cinema, com diferentes tipos de ingressos e regras específicas para cálculo do valor final. Ele utiliza conceitos fundamentais da programação orientada a objetos como **encapsulamento**, **herança** e **polimorfismo**.

## 🧩 Funcionalidades

- Apresentação das informações do filme
- Escolha interativa do tipo de ingresso:
  - **Tradicional**: valor padrão
  - **Meia Entrada**: metade do valor do ingresso
  - **Ingresso Família**: valor multiplicado pela quantidade de pessoas com 5% de desconto para grupos maiores que 3
- Cálculo dinâmico do valor real conforme o tipo escolhido
- Uso de `Scanner` para entrada de dados via console

## 🏗️ Estrutura do Projeto

- `Ingresso.java`: classe base que contém os atributos comuns e método padrão para calcular valor
- `MeiaEntrada.java`: subclasse que sobrescreve o valor com desconto de 50%
- `IngressoFamilia.java`: subclasse que aplica multiplicação e desconto conforme regras do enunciado
- `Main.java`: classe principal que apresenta o menu e gerencia a lógica de entrada e saída

## 💡 Conceitos Usados

- **Herança:** as subclasses `MeiaEntrada` e `IngressoFamilia` herdam atributos e métodos da classe `Ingresso`
- **Polimorfismo:** o método `getValorReal()` se comporta de maneira diferente em cada classe
- **Encapsulamento:** uso de `private` para proteger atributos, com `getters` e `setters` públicos
- **Input Interativo:** uso do `Scanner` para receber entradas do usuário via terminal

## ▶️ Como executar

1. Compile todas as classes com `javac *.java`
2. Execute a classe principal:
   ```bash
   java Main
