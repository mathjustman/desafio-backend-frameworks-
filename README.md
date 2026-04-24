
# Desafio Backend Frameworks

# Objetivo

Este projeto demonstra a criação de dois back-ends utilizando diferentes tecnologias:

* Node.js com Express
* Java com Spring Boot

Ambos seguem o padrão de arquitetura em camadas (MVC).

---

# Comparação entre Frameworks

# Node.js + Express

* Fácil de configurar
* Pouco código (menos verboso)
* Flexível (você organiza como quiser)
* Usa npm para dependências

### Java + Spring Boot

* Mais robusto e estruturado
* Mais código (mais verboso)
* Usa muitas anotações (@RestController, @Service)
* Usa Maven para dependências

---

# Arquitetura em Camadas

Os dois projetos seguem o padrão MVC:

# Model

Representa os dados (ex: User)

# Controller

Recebe as requisições (HTTP)

#  Service / Routes

Faz a lógica entre controller e model

---

# Fluxo da aplicação

1. Cliente faz requisição
2. Controller recebe
3. Controller chama Service (ou lógica)
4. Service usa Model
5. Retorna resposta

---

# Estrutura

# Node

* controllers
* models
* routes

# Java

* controller
* model
* service

---

# Conclusão

O Node.js é mais simples e rápido para começar.
O Spring Boot é mais organizado e ideal para sistemas maiores.
