<h2>Folha de Ponto Application</h2>

Com base no esqueleto do projeto (https://github.com/arthurfnsc/ilia-folha-de-ponto),
foi feita uma aplicação REST para controle de horário de funcionários utilizando Spring Boot.

Dentro da aplicação, segui os seguintes tópicos para sua construção:

* Setup inicial de projeto com o Spring Boot Initialzr.
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados.
* Desenvolvimento de operações para o gerenciamento das batidas de ponto.
* Relação das operações acima com o padrão arquitetural REST.
* Desenvolvimento de testes unitários para validação das funcionalidades.
* Implantação do sistema na nuvem através do Heroku.

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta abrir no Postman o seguinte endereço:

```
http://localhost:8080/v1/batidas
```


São necessários os seguintes pré-requisitos para a execução do projeto:

* Java 15 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* SDKMan! para o gerenciamento de múltiplcas versões de Java, Maven e Spring Boot.
* Intellj IDEA Community Edition ou alguma IDE de sua escolha.
* Controle de versão GIT instalado na sua máquina.
* Conta no GitHub para o armazenamento do seu projeto na nuvem.
* Conta no Heroku para o deploy do projeto na nuvem
* Postman para execução de testes de integração para a validação de ponta a ponta da API.


(Projeto não finalizado)