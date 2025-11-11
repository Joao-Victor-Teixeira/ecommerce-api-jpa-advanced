# java-jpa-advanced-model-api

![Java](https://img.shields.io/badge/Java-21-blue?logo=java)
![Spring](https://img.shields.io/badge/Spring_Boot-3.x.x-green?logo=spring)
![License](https://img.shields.io/badge/License-MIT-green)

API RESTful focada na implementação de um modelo de domínio conceitual complexo, demonstrando mapeamentos avançados de persistência com Spring Boot, Java 21 e JPA/Hibernate.

> ⚠️ **Nota Importante:** Este é um projeto de estudo focado na minha transição de carreira.Seu principal objetivo é aplicar e demonstrar conceitos avançados de design de domínio e persistência (ORM), traduzindo um diagrama UML  complexo para uma API REST funcional.

---

## 🎯 Sobre o Projeto

Este projeto consiste na implementação do "Estudo de Caso UML" do curso DevSuperior . O objetivo principal não é criar um e-commerce completo, mas sim focar nos desafios de **Mapeamento Objeto-Relacional (ORM)**.

O desafio aqui é traduzir um modelo de domínio conceitual (UML) com alta complexidade de relacionamentos para uma implementação back-end funcional usando Spring Boot e Spring Data JPA.

## 🛠️ Tecnologias Utilizadas

O desenvolvimento deste projeto baseou-se nas seguintes tecnologias:

* **Linguagem:** Java 21
* **Framework:** Spring Boot 3
* **Persistência:** Spring Data JPA / Hibernate 
* **Gestão de Dependências:** Maven
* **Banco de Dados (Testes):** H2 Database (em memória) 

## 📖 Modelo de Domínio (UML)

O design do sistema foi **inteiramente baseado** no seguinte Diagrama de Classes UML , que define as entidades e seus complexos relacionamentos. Esta modelagem foi a primeira etapa crucial do projeto.
<img width="1328" height="692" alt="ModeloUMLfinalizado" src="https://github.com/user-attachments/assets/39f26d28-18e9-4ff6-8d4b-ef5db1e9d170" />


## ✨ Funcionalidades Principais e Conceitos Aplicados

O foco deste projeto é a **implementação correta do modelo de domínio**.As funcionalidades principais são os endpoints de API REST que provam que o mapeamento funciona.

* **Povoamento (Seeding) da Base de Dados:** Instanciação do modelo de objetos complexo e persistência no banco H2 ao iniciar a aplicação (via `CommandLineRunner`) .
***Exposição de Endpoints REST:** Criação de endpoints básicos (`/categorias/{id}`, `/clientes/{id}`, `/pedidos/{id}`) para consultar os dados mapeados.
* **Modelo de Domínio Robusto (JPA):** Implementação de um modelo complexo usando JPA/Hibernate, incluindo:
    *Relacionamentos **Um-para-Muitos** (ex: `Cliente` -> `Endereco`).
    *Relacionamentos **Muitos-para-Muitos** (ex: `Produto` -> `Categoria`).
    *Mapeamento de **Herança** (ex: `Pagamento` -> `PagamentoComBoleto` / `PagamentoComCartao`).
    *Mapeamento de **Chave Primária Composta** (ex: `ItemPedido` e `ItemPedidoPK`).
    *Mapeamento de Entidade "Fraca" / Coleção de Tipos (ex: `Telefone` em `Cliente`).
* **Tratamento de Serialização JSON:** Resolução de problemas de referência cíclica (loops infinitos) usando `@JsonIgnore`.
