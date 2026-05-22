# Atividade - Pilhas em Java

## Como utilizar

Implemente e execute o arquivo [App.java](src/App.java). O programa possui um menu principal com os 6 exercicios:

1. Pilha com valores fixos
2. Pilha de nomes
3. Remover 10 numeros da pilha
4. Menu interativo de pilha
5. Inverter palavra com pilha
6. Historico de navegacao

Para compilar e executar:

```bash
javac -d bin src/App.java
java -cp bin App
```

## Exercicios

### Exercicio 01

Crie um programa em Java que implemente uma pilha utilizando a classe `Stack`.

O programa deve:

- inserir os valores 10, 20, 30, 40 e 50;
- exibir a pilha completa;
- remover o elemento do topo;
- exibir a pilha novamente.

### Exercicio 02

Crie um programa em Java que armazene nomes em uma pilha.

Insira:

- Ana
- Carlos
- Pedro
- Juliana

Exiba:

- elemento do topo;
- quantidade de elementos armazenados.

### Exercicio 03

Crie um programa em Java que insira 10 numeros inteiros em uma pilha.

Utilizando estrutura de repeticao, remova todos os elementos e exiba cada elemento removido.

### Exercicio 04

Crie um programa em Java com menu interativo contendo:

```text
1 - Empilhar
2 - Desempilhar
3 - Mostrar topo
4 - Mostrar pilha
5 - Sair
```

O usuario devera manipular a pilha dinamicamente.

### Exercicio 05

Crie um programa em Java que receba uma palavra e utilize pilha para inverter seus caracteres.

Exemplo:

```text
JAVA -> AVAJ
```

### Exercicio 06

Crie uma simulacao de historico de navegacao utilizando pilha.

O sistema deve permitir:

- visitar pagina;
- voltar pagina;
- mostrar pagina atual;
- exibir historico.

## Teste local do autograder

O autograder local foi atualizado para validar os exercicios de pilha.

```bash
javac -d bin src/App.java autograde/Autograder.java
java -cp bin autograde.Autograder ex1
```

Modos disponiveis: `ex1`, `ex2`, `ex3`, `ex4`, `ex5`, `ex6`.
