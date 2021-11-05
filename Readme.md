<h1>Projeto Email</h1> 

<p align="center">
  <img src="https://img.shields.io/static/v1?label=spring&message=framework&color=green&style=for-the-badge&logo=SPRING"/>
  <img src="http://img.shields.io/static/v1?label=Spring&message=2.5.5&color=red&style=for-the-badge&logo=spring"/>
  <img src="https://img.shields.io/static/v1?label=&message=Kafka&color=gray&style=for-the-badge&logo=Kafka"/>
  <img src="https://img.shields.io/static/v1?label=&message=Docker&color=gray&style=for-the-badge&logo=Docker"/>
  <img src="http://img.shields.io/static/v1?label=TESTES&message=%3E1&color=GREEN&style=for-the-badge"/>
  <img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=RED&style=for-the-badge"/>
</p>


### Tópicos

[Descrição do projeto](#descrição-do-projeto)

[Funcionalidades](#funcionalidades)

[Pré-requisitos](#pré-requisitos)

[Como rodar a aplicação](#como-rodar-a-aplicação)


## Descrição do projeto

<p align="justify">
  A aplicação aqui em desenvolvimento tem o objetivo de enviar email construido após consumir as mensagem enviadas para 
  o tópico correspondente que demais aplicações produzem. 
</p>

## Funcionalidades

* A sua função é ficar escutando um tópico no Kafka para saber quais as transações que aconteceram e enviar um email para as pessoas que são donas das contas.


## Pré-requisitos

* [Docker](https://docs.docker.com/get-docker/)
* [JAVA](https://www.java.com/pt-BR/)
* [MAVEN](https://maven.apache.org/)


## Como rodar a aplicação:

* No terminal, clone o projeto:
```
git clone https://github.com/antoniomartinszup/service-email.git
```

* Com o Docker iniciado:
```
docker-compose up -d
```

* Iniciar a aplicação 
