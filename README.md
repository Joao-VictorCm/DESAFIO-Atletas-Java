# 🏋️‍♂️ Projeto Cadastro de Atletas

Este projeto em **Java** foi desenvolvido com o objetivo de treinar lógica de programação, estruturas de repetição, condicionais e manipulação de entradas do usuário com `Scanner`.  
O sistema coleta informações de atletas, processa os dados e gera estatísticas interessantes.

---

## 🚀 Funcionalidades

- Cadastro de atletas com:
  - Nome
  - Sexo (M/F)
  - Peso
  - Altura
- Cálculos realizados:
  - Quantidade de homens e mulheres
  - Peso médio dos atletas
  - Média de altura das mulheres
  - Percentual de homens
- Tratamento de entradas inválidas (ex: sexo diferente de M/F, peso negativo).

---

## 📂 Estrutura do Projeto

```
src/
 └── Main.java
```

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Scanner (entrada de dados)**

---

## ▶️ Como Executar

1. Clone este repositório:
   ```bash
   git clone [<URL_DO_REPOSITORIO>](https://github.com/Joao-VictorCm/DESAFIO-Atletas-Java.git)
   ```

2. Compile o código:
   ```bash
   javac src/Main.java
   ```

3. Execute:
   ```bash
   java src/Main
   ```

---

## 📊 Exemplo de Uso

```
-Digite os dados do atleta numero 1:
-Nome: Carlos Silva
-Sexo: M
-Altura: -1.5
-Valor invalido! Favor digitar um valor positivo: 0
-Valor invalido! Favor digitar um valor positivo: 1.75
-Peso: 84.8

-Digite os dados do atleta numero 2:
-Nome: Maria José
-Sexo: F
-Altura: 1.71
-Peso: 64.5

-Digite os dados do atleta numero 3:
-Nome: Teresa Borges
-Sexo: R
-Valor invalido! Favor digitar F ou M: S
-Valor invalido! Favor digitar F ou M: F
-Altura: 1.65
-Peso: 0
-Valor invalido! Favor digitar um valor positivo: -60
-Valor invalido! Favor digitar um valor positivo: 54.3

-RELATÓRIO:
-Peso médio dos atletas: 67.87
-Atleta mais alto: Carlos Silva
-Porcentagem de homens: 33.3 %
-Altura média das mulheres: 1.68
```

---

## 🎯 Objetivo

O projeto tem como principal objetivo **praticar fundamentos de Java** para iniciantes, reforçando:
- Estruturas de repetição
- Estruturas condicionais
- Entrada de dados com Scanner
- Cálculos e estatísticas com variáveis

---

## 🤝 Contribuição

Sinta-se à vontade para contribuir com melhorias ou sugestões. Basta abrir uma **issue** ou enviar um **pull request** 🚀

---

## 📜 Licença

Este projeto é de uso livre para fins de estudo.
