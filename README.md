# Projeto de Gerenciamento de Frota de Ônibus

Este é um projeto de exemplo para gerenciar uma frota de ônibus de viagem, motoristas e passageiros em Java.

## Classes

O projeto inclui as seguintes classes:

- `Motorista`: Representa os motoristas contratados pela empresa. Cada motorista possui um nome, número de habilitação e idade.

- `Passageiro`: Representa os passageiros que adquirem passagens para viagens. Cada passageiro possui um nome, registro de identidade e idade. Passageiros com mais de 60 anos têm direito a desconto.

- `Onibus`: Representa os ônibus da frota. Cada ônibus é identificado por um número e tem capacidade para passageiros sentados. Os ônibus realizam viagens entre cidades, podem ter um motorista atribuído, podem iniciar e finalizar viagens e registrar os passageiros.

- `Principal`: Classe principal (classe de teste) para demonstrar o uso das classes `Motorista`, `Passageiro` e `Onibus`.

## Exemplo de Uso

Um exemplo de uso das classes está disponível na classe `Principal`. Ela cria motoristas, ônibus, passageiros, atribui motoristas aos ônibus, inicia uma viagem, adquire passagens, verifica informações da viagem e finaliza a viagem.

## Como Executar

Para executar o exemplo, você pode compilar e rodar o arquivo `Principal.java`. Certifique-se de que todas as classes estejam no mesmo pacote ou ajuste os imports conforme necessário.

```bash
javac Principal.java
java Principal
