# IaFuture

API do projeto IaFuture - Software que auxilia empresas/lojas de livros a captar mais clientes

# Representantes 

- Gabriel Ortiz Oliva Gil - RM: 98642 – 2TDSPK
- Rafael Noboru Watanabe Nasaha - RM:99948 – 2TDSPK
- João Pedro Kraide Máximo - RM:550974 – 2TDSPK
- Matheus de Andrade Ferreira - RM:99375 – 2TDSPK
- Larissa Pereira Biusse - RM:551062 - 2TDSPK

# Como rodar a aplicação

- Iniicialize a aplicação com o VS Code Studio ou IntelliJ
- Para testar os endpoints apenas no backend, utilize um programa como o Postman ou o Insomnia
- Basta inicializar a aplicação para que os endpoints funcionem
- Apenas o endpoint para envio de email funciona apenas no backend, utilizando algum programa para métodos CRUD, e basta utilizar o GET("/email/send-recommendation")

# Objetivos da aplicação

- A aplicação consiste em listar diversos livros que o usuário pode ter acesso e se informar
- Também ele pode publicar reviews sobre os livros em que ele lê
- Pode visualizar reviews de todos que utilizam a aplicação
- O usuário também pode consultar a OpenAI para pedir recomendações de livros
- O administrador da API poderá enviar emails para usuários, recomendando livros baseados em seus gostos
- Tanto através das reviews dos usuários, como da inteligência artificial, é possivel que a loja/empresa conheça melhor seus clientes e com base nisso, poder recomendar livros que mais possuem chance do cliente adquirir

-> Link do video explicando: 

# Recursos da aplicação

- CRUD com banco de dados PostGre
- Autenticação e criptografia de senhas
- Serviço de Mensageria (RabbitMQ) para envio de emails
- Integração de um chat com inteligência artificial (OpenAI)
- Login com conta do Google através do OAuth2
- Instalação de banco de dados por Docker, viabilizando o uso em qualquer máquina




