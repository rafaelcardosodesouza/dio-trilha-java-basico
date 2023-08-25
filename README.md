# Projeto ContaBanco - Desafio DIO


### Sobre o Projeto

Neste projeto, desenvolvemos o ContaBanco, uma aplicação simples que simula as operações de uma conta bancária. Usando a linguagem de programação Java e aplicando os conceitos de sintaxe e entrada/saída de dados, criamos uma experiência interativa para o usuário.

### Funcionalidades Principais

- **Entrada de Dados Via Terminal**: Usamos a entrada via terminal para coletar informações essenciais da conta bancária, como número da agência, número da conta, nome do cliente e saldo.

- **Mensagem Personalizada**: Utilizamos concatenação de strings para criar uma mensagem personalizada de boas-vindas ao novo cliente. A mensagem inclui informações como nome do cliente, agência, número da conta e saldo disponível.

## Como Executar

1. Clone este repositório.
2. Abra o projeto em um ambiente de desenvolvimento Java.
3. Execute o arquivo `ContaTerminal.java` localizada em: src/application.
4. Siga as instruções no terminal para inserir os detalhes da conta.

## Atributos da Conta

Nossa aplicação trabalha com os seguintes atributos da conta:

| Atributo       | Tipo     | Exemplo         |
|----------------|----------|-----------------|
| Numero         | Inteiro  | 1021            |
| Agencia        | Texto    | 067-8           |
| NomeCliente    | Texto    | MARIO ANDRADE   |
| Saldo          | Decimal  | 237.48          |

## Mensagem de Boas-Vindas

Após inserir os detalhes da conta, nosso programa exibe uma mensagem de boas-vindas personalizada:

"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque."

**Importante**: Lembre-se de substituir os espaços entre colchetes pelos valores inseridos pelo usuário.


