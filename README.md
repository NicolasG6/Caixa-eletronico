# 💳 Caixa Eletrônico em Java (Terminal)

Este projeto simula o funcionamento de um **caixa eletrônico (ATM)** desenvolvido em **Java**, executado diretamente no **terminal**.  
O sistema permite realizar operações bancárias básicas, como **consultar saldo**, **sacar**, **depositar** e **encerrar o atendimento**, aplicando lógica de programação e boas práticas de estruturação de código.

---

## 🎯 Objetivo do Projeto

O objetivo deste projeto é colocar em prática conceitos fundamentais da linguagem **Java**, como:
- Estruturas condicionais e de repetição  
- Manipulação de variáveis e entradas do usuário  
- Modularização de código através de métodos  
- Uso de laços para controle de fluxo em menus interativos  

Além disso, o projeto simula uma **interação real com o usuário** em ambiente de terminal, reforçando lógica e clareza no design do sistema.

---

## ⚙️ Funcionalidades

| Função | Descrição |
|--------|------------|
| 💰 **Consultar Saldo** | Exibe o valor atual disponível na conta. |
| 💵 **Sacar Valor** | Permite retirar um valor, validando se há saldo suficiente. |
| 💳 **Depositar Valor** | Permite adicionar um valor ao saldo atual. |
| 🚪 **Sair** | Encerra o programa de forma segura. |

> Todas as operações são realizadas no terminal, com mensagens claras e feedback imediato para o usuário.

---

## 🧠 Lógica do Sistema

O sistema utiliza um **menu interativo** em loop, onde o usuário escolhe a operação desejada através de números.  
Cada opção é tratada por meio de **estruturas condicionais** (`if` / `switch`) e a aplicação se mantém ativa até que o usuário opte por sair.

### Exemplo de fluxo:
1. O sistema inicia com um saldo inicial (ex: `R$ 1000,00`).  
2. O usuário seleciona a opção desejada:  
   - `1` → Consultar saldo  
   - `2` → Depositar  
   - `3` → Sacar  
   - `4` → Sair  
3. Após cada operação, o sistema retorna ao menu até que a opção **Sair** seja escolhida.

---

## 🧩 Tecnologias Utilizadas

- ☕ **Java (JDK 17+)**  
- 🖥️ **Terminal / Console** para entrada e saída de dados  
- 🧮 **Lógica de Programação e Estruturas de Controle**

---

## 🏗️ Estrutura do Código

| Arquivo | Descrição |
|----------|------------|
| `CaixaEletronico.java` | Contém toda a lógica do programa, incluindo menu, operações e controle de fluxo. |

---

## 📘 Exemplo de Execução

```bash
=== BEM-VINDO AO CAIXA ELETRÔNICO ===

1 - Consultar Saldo
2 - Depositar
3 - Sacar
999 - Sair

Escolha uma opção: 2
Digite o valor do depósito: 300
Depósito realizado com sucesso!

Seu novo saldo é: R$1300.00

