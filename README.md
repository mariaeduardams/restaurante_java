## restaurante_java

# restaurante_java

# 🍝 Pasta Bella — Sistema de Pedidos

Projeto desenvolvido para demonstrar os principais conceitos da
Programação Orientada a Objetos (POO) utilizando Java.

O sistema simula um restaurante de massas chamado **Pasta Bella**,
permitindo trabalhar com diferentes tipos de massas e pedidos.

---

# 📌 Sobre o projeto

O projeto foi desenvolvido para demonstrar os quatro principais
pilares da Programação Orientada a Objetos:

- Abstração
- Encapsulamento
- Herança
- Polimorfismo

Foram criadas diferentes classes para representar as massas e os
pedidos realizados no restaurante.

Os tipos de massa utilizados no projeto são:

- 🍝 Espaguete
- 🧀 Lasanha
- 🥟 Ravioli

Cada tipo de massa possui seu próprio comportamento para o método
`preparar()`.

---

# 💻 Tecnologias utilizadas

- Java
- Visual Studio Code
- JDK (Java Development Kit)

> Este projeto utiliza Java para executar o sistema diretamente
> pelo ambiente de desenvolvimento.

---

# 💻 Execução

1. Instalar o Java JDK
        ↓
2. Abrir o VS Code
        ↓
3. Abrir a pasta do projeto
        ↓
4. Abrir o arquivo Main.java
        ↓
5. Executar o arquivo Main.java
        ↓
6. Visualizar os resultados no terminal

---

# 📁 Estrutura do projeto

A estrutura utilizada no projeto é:

├── Main.java
├── Massa.java
├── Pedido.java
├── Espaguete.java
├── Lasanha.java
└── Ravioli.java

---

# 🧠 Funcionamento

A classe `Massa` representa a classe principal do sistema.

As classes:

- `Espaguete`
- `Lasanha`
- `Ravioli`

herdam características da classe `Massa`.

A classe `Pedido` é responsável por armazenar as massas adicionadas
ao pedido, preparar os produtos e calcular o valor total.

O programa principal está localizado no arquivo `Main.java`.

---

# 🎯 Resultado esperado

Ao executar o programa, o terminal deverá apresentar:

Preparando: Espaguete à Bolonhesa
Cozinhando o espaguete...

Preparando: Lasanha de Queijo
Montando as camadas da lasanha...

Preparando: Ravioli de Frango
Cozinhando o ravioli recheado...

Total: R$ 87.00
