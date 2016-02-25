# **Introdução**

Este documento descreve o jogo de perguntas e respostas NetQuiz, desenvolvido como projeto da disciplina de Aplicações Distribuídas do curso de Sistemas de Informação da Universidade Federal de Goiás. O propósito do jogo é estabelecer uma conexão cliente/servidor multiusuário utilizando Web Service com o protocolo SOAP (Simple Object Access Protocol). Web service é uma solução utilizada na integração de sistemas e na comunicação entre aplicações diferentes. Com esta tecnologia é possível que novas aplicações possam interagir com aquelas que já existem e que sistemas desenvolvidos em plataformas diferentes sejam compatíveis. O protocolo SOAP baseia-se numa invocação remota de um método e para tal necessita especificar o endereço do componente, o nome do método e os argumentos para esse método. Apresentar funcionalidade e usabilidade reforçando os conceitos básicos de sistemas de computação distribuída.  

## **Visão Geral do Documento**
Esta introdução fornece as informações necessárias para utilizar este documento, explicitando os objetivos e as convenções que foram adotadas no texto. As demais seções apresentam as especificações do sistema e estão organizadas como descrito abaixo:

- **Requisitos Funcionais**: Compreende o conjunto de requisitos funcionais do sistema a ser desenvolvido, descrevendo as suas prioridades.
- **Requisitos Não Funcionais**: Contém os requisitos não funcionais do sistema a ser desenvolvido, descrevendo atríbutos de qualidade que o sistema deve possuir, ou restrições que ele deve satisfazer.

## **Prioridades dos Requisitos**
A atribuição de prioridade dos requisitos pode ser de 3 (três) tipos: `essencial`, `importante` e `desejável`. A prioridade dos requisitos pode ser usada no gerenciamento do escopo do projeto e na definição das prioridades para o desenvolvimento do sistema.

- **Essencial**: Requisito sem o qual o sistema não entra em funcionamento, são requisitos imprescindíveis e devem ser disponibilizados na implantação do sistema.
- **Importante**: Requisito sem o qual o sistema entra em funcionamento, mas de forma não satisfatória, não impedem a implantação do sistema, mas devem ser implementados o mais breve possível.
- **Desejável**: Requisito que, embora não implementado, ainda permite o sistema funcionar de modo satisfatório sem comprometer as funcionalidades básicas do sistema. Pode ser entregue a qualquer momento, sem prejuízo aos serviços oferecidos pelo sistema.

### **Requisitos Funcionais**
**[RF01]** O jogo será iniciado apenas quando os dois jogadores estiverem conectados.  
Prioridade: Essencial   

**[RF02]** O jogo será disputado por 2 (dois) jogadores, esses jogadores serão 2 (dois) humanos.  
Prioridade: Essencial

**[RF03]** O jogo terá 1 (um) jogador controlado pelo computador (BOT).  
Prioridade: Desejável 

**[RF04]** O jogador deverá escolher apenas uma questão por rodada.  
Prioridade: Essencial 

**[RF05]** A mesma questão não poderá ser escolhida pelo mesmo jogador e pelo seu adversário.  
Prioridade: Essencial        

**[RF06]** O jogador deverá aguardar o adversário terminar a rodada, para começar a sua jogada.  
Prioridade: Essencial 

**[RF07]** A cada jogada será exibida a pontuação do jogador em caso de acerto ou erro.  
Prioridade: Essencial

**[RF08]** A cada resposta correta o jogador ganhará 1 ponto.  
Prioridade: Essencial 

**[RF09]** A cada resposta incorreta jogador não ganhará ponto, a pontuação será 0 (zero).  
Prioridade: Essencial 

**[RF10]** O jogo terá 16 questões, cada jogador escolherá 8 (oito) questões.  
Prioridade: Essencial 

**[RF11]** Todas as questões serão numeradas.  
Prioridade: Essencial 

**[RF12]** Cada questão terá 4 (quatro) opções de respostas numeradas, de 1 (um) ao 4 (quatro), sendo possível escolher apenas uma opção entre as alternativas.  
Prioridade: Essencial 

**[RF13]** Toda questão terá 1 (uma) resposta correta e 3 (três) incorretas.  
Prioridade: Essencial 

**[RF14]** As questões serão armazenadas no servidor de dados, a cada partida as questões e a ordem serão alteradas, não haverá questões especificas para cada numeração.  
Prioridade: Essencial

**[RF15]** Ao final do jogo será informado a pontuação dos jogadores, qual jogador venceu e caso ambos acertem a mesma quantidade de questões haverá empate.  
Prioridade: Essencial 


### **Requisitos Não Funcionais**  
**[RNF01]** O jogo será iniciado em até 5 segundos após a conexão dos usuários.  
Prioridade: Essencial  

**[RNF01]** O jogo será desenvolvido na linguagem Java.  
Prioridade: Essencial  

**[RNF03]** Será utilizado o servidor de dados HSQLDB ( inglês Hyper Structured Query Language Database) escrito ja linguagem Java.    
Prioridade: Essencial  

**[RNF04]** Será utilziado o GitLab, plataforma open source, para repositório da documentação e códigos do projeto.  
Prioridade: Importante  

**[RNF05]** O jogo poderá ser jogado em qualquer sistema operacional.  
Prioridade: Essencial  

**[RNF06]** A conexão entre os jogadores será através de Web Service utilizando o protoocolo SOAP (Simple Object Access Protocol), composto por cliente e servidor.  
Prioridade: Essencial  

**[RNF07]** Será utilizado Java Persistence API (JPA) uma API padrão da linguagem Java que descreve uma interface comum para frameworks de persistência de dados.  
Prioridade: Essencial  

**[RNF08]** Será utilizado Maven para gerenciar dependências, ciclo de vida e etapas de construção do projeto.  
Prioridade: Essencial  

**[RFN09]** Para o padrão arquitetural do software será utilizado o MVC que separa a aplicação em 3 camadas. A camada de interação do usuário *(view)*, a camada de manipulação dos dados *(model)* e a camada de controle *(controller)*.  
Prioridade: Essencial  

**[RNF10]** Utilizando o code Ansii para que melhore a UI através do uso de cores.    
Prioridade: Desejável  

