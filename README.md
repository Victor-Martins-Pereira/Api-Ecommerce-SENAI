# API E-commerce - Projeto SENAI

## Descrição do Projeto

Este projeto é uma API RESTful para gerenciamento de produtos de um sistema e-commerce. Desenvolvido como parte do curso do SENAI, ele oferece endpoints para operações CRUD de produtos, utilizando Spring Boot e banco de dados.

## Tecnologias e Ferramentas

- Java (Usando IntelliJ IDEA)
- Spring Boot
- Banco de dados (MySQL)
- Postman (para testes de API)

## Estrutura do Projeto

O projeto segue a estrutura padrão de um projeto Spring Boot:

```
src/main/java/com/ecommerce/ecommerce/
├── controller/      # Controladores REST
├── model/           # Entidades do sistema
├── repository/      # Interfaces de repositório JPA
├── service/         # Lógica de negócios
```

## Principais Funcionalidades

- Cadastro de produtos
- Listagem de produtos
- Atualização de dados de produtos
- Remoção de produtos

## Configuração e Execução

Para executar o projeto localmente:

1. Clone o repositório:
   ```bash
   git clone https://github.com/Victor-Martins-Pereira/Api-Ecommerce-SENAI.git
   ```

2. Configure o arquivo `application.properties` com as credenciais do seu banco de dados.

3. Execute o projeto usando Maven:
   ```bash
   mvn spring-boot:run
   ```

## Endpoints da API

- `GET /produtos` - Lista todos os produtos
- `GET /produtos/{id}` - Retorna um produto pelo ID
- `POST /produtos` - Cria um novo produto
- `PUT /produtos/{id}` - Atualiza um produto existente
- `DELETE /produtos/{id}` - Remove um produto

## Autor

Victor Martins Pereira - [GitHub](https://github.com/Victor-Martins-Pereira)

## Licença

Este projeto é de uso educacional e não possui uma licença oficial.
