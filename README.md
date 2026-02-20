## BancoApp
**Descrição Geral** 📄<br>
Este projeto apresenta uma implementação prática de um **sistema bancário** em **Java**, aplicando os pilares da **Programação Orientada a Objetos (POO)**. O sistema modela **contas bancárias**, incluindo **Conta Corrente e Conta Poupança**, demonstrando **abstração, herança, encapsulamento e polimorfismo**. Além disso, utiliza **interfaces** para padronizar operações bancárias e **exceções personalizadas** para tratamento de erros, registrando depósitos, saques, transferências e saldo atualizado com rendimentos ou taxas.

---
**Objetivo** 🎯 <br> 
O objetivo principal do projeto é exemplificar o uso dos conceitos de POO em um contexto financeiro, permitindo compreender como classes, interfaces e métodos podem ser organizados para gerenciar contas, operações e histórico de transações de forma prática.

---
**Tecnologias Utilizadas** 💻 <br>
* ***Java*** - linguagem principal.
* ***Programação Orientada a Objetos (POO):***
  * Abstração;
  * Herança;
  * Polimorfismo;
  * Encapsulamento.
* ***Collections (List / ArrayList).***
* ***Interfaces Java para operações bancárias (OperacoesBancarias).***
* ***Exceções personalizadas para tratamento de erros (SaldoInsuficienteException).***

---
**Arquitetura e Estrutura do Código** 🧱 <br><br>
***1. Classe Abstrata Conta*** <br>
Representa o conceito genérico de uma conta bancária. <br>
Ela contém:
* ***Atributos privados:*** número, titular, saldo.
* ***Lista de histórico de operações.***
* ***Métodos concretos:***
  * depositar(valor)
  * sacar(valor)
* ***Método abstrato:*** 
  * atualizarSaldo()

A classe não pode ser instanciada diretamente e serve como base para os tipos de contas.

***2. Classe ContaCorrente*** <br>
Herdeira de **Conta**, representa uma conta corrente. <br>
Implementa **atualizarSaldo()** aplicando taxas, e métodos de transferência e extrato.

***3. Classe ContaPoupanca*** <br>
Herdeira de **Conta**, representa uma conta poupança. <br>
Implementa **atualizarSaldo()** calculando rendimento, e métodos de transferência e extrato.

***4. Interface OperacoesBancarias*** <br>
Define operações comuns de contas bancárias, como:
* ***transferir(destino, valor)***
* ***imprimirExtrato()***

***5. Classe SaldoInsuficienteException*** <br>
Exceção personalizada para tratar tentativas de saque ou transferência com saldo insuficiente.

***6. Classe BancoApp (Main)*** <br>
Ponto de entrada do sistema. <br>
Nela ocorre:
* ***Criação de contas (corrente e poupança).*** 
* ***Depósitos, saques e transferências.***
* ***Atualização de saldo com rendimentos/taxas.***
* ***Impressão de extratos e histórico de operações***

---
**Conceitos de POO Demonstrados** 🔍 <br><br>
✅ ***Abstração:*** <br>
A classe **Conta** é abstrata, definindo métodos genéricos que devem ser implementados nas subclasses.

✅***Herança:*** <br>
**ContaCorrente e ContaPoupanca** estendem **Conta**, herdando atributos e comportamentos.

✅***Polimorfismo:*** <br>
O método **atualizarSaldo()** é sobrescrito nas subclasses, sendo executado dinamicamente conforme o tipo de conta.

✅***Encapsulamento:*** <br>
Atributos de **Conta** são privados, acessados por métodos públicos **(getters/setters)** ou métodos de operação.

✅***Interfaces:*** <br>
A interface **OperacoesBancarias** define métodos obrigatórios, garantindo padronização das contas.

✅***Tratamento de Exceções:*** <br>
**SaldoInsuficienteException** demonstra como capturar e tratar erros de negócio.

---
**Como Executar o Projeto** ▶️ <br><br>
***1. Compile os arquivos:*** <br>
```javac Conta.java ContaCorrente.java ContaPoupanca.java OperacoesBancarias.java SaldoInsuficienteException.java BancoApp.java```

***2. Execute o programa:*** <br>
```java BancoApp```

***Exemplo de saída:***<br>
```
Conta Corrente - Seu saldo atual é de: R$1000.0
Conta Poupança - Seu saldo atual é de: R$4000.0
Deposito de 200 realizado com sucesso!
Saque de 300 realizado com sucesso!
...
Conta Poupança transferiu R$100 para a conta: 12345 com êxito.
Conta Corrente - Rendimento/Taxa aplicado: ...
```

---
**Conclusão** 📌 <br>
Este projeto demonstra de forma clara e prática a aplicação dos conceitos de **Programação Orientada a Objetos** em Java no contexto de um sistema financeiro. Ele evidencia o uso de **abstração, herança, polimorfismo, encapsulamento, interfaces e tratamento de exceções**, mostrando como construir sistemas organizados, reutilizáveis e com controle de erros eficiente.
