# DRPRIBEIRAOPRETO-PI-em-Computação-I-Turma-001-Grupo-003

API para Sistema de Gerenciamento de Estoque para loja de Roupas

## Funcionalidades

### Rotas Publicas
- Login [público] `POST /login`
- Incluir Usuário [público] `POST /usuarios`

### Usuarios [Rota Privada]
- Cadastrar Usuario [privado] `POST /produtos/cadastrar-produto`
- Alterar Cadastro de Usuario [privado] `PUT /produtos/alterar/{id}`
- Excluir Usuario [privado] `DELETE /produtos/excluir/{id}`

### Recurso [Rota Privada]
- Adicionar Recurso [privado] `POST /fornecedores/cadastrar-fornecedor`
- Listar Recursos [privado] `GET /fornecedores/listar-fornecedores`
- Remover Recurso [privado] `DELETE /fornecedores/excluirFornecedor`

### Financiamento [Rota privada]
- Adicionar Financiamento [privado] `POST /financiamento/cadastrar-entrada`
- Listar Financiamento [privado] `GET /financiamento/listar`
- Remover Financiamento [privado] `DELETE /financiamento/adicionar-produto/{id}`

## Dependências
- Java 11
- MySQL 8
- Criar objetos do banco de dados: `sql/SCHEMA.sql`
- Carga inicial: `sql/INSERT.sql`
- Arquivo do Postman: `sql/ProjetoIntegrador.postman_collection.json`