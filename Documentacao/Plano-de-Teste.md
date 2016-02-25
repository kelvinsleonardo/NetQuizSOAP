# **Plano de Teste**  

# **Objetivo**  

O documento do plano de teste de software tem o objetivo de executar o software de modo sistemático afim de encontrar `defeitos`, `erros` e `falhas`. E além disso os testes objetivam aumentar a confiabilidade do software desenvolvido, aumentado a probabildiade de que o jogo funcionará sem falhas durante um período de tempo.  

# **Sequência de teste**  

- **Teste 1**  

Abrir um terminal para o cliente 1 (jogador  1), independente do sistema operacional utilizado.  

Inserir o nome do primeiro jogador.  

Possível falha: Jogador 1 iniciar o jogo antes do jogador 2 conectar-se.  

Resultado esperado: Jogador 1 conectar-se ao jogo.   

- **Teste 2**  

Abrir um terminal para o jogador  1 e inserir o nome do jogador.  

Possível falha: Não ser exibida a mensagem de que o jogador 1 esta pronto para se conectar.  

Resultado esperado: Ser exibida a mensagem de que o jogador 1 esta pronto para iniciar o jogo.  

- **Teste 3**  

Abrir um terminal para o jogador  1 e inserir o nome do jogador.   

Possível falha: Mensagem não ser exibida e o jogador 1 conectar-se ao jogo antes do jogador 2.  

Resultado esperado: Ser exibida a mensagem para que o jogador 1 aguarde o jogador 2 conectar-se ao jogo.  

- **Teste 4**  

Abrir o segundo terminal para o cliente 2 (jogador 2). 

Inserir o nome do segundo jogador.  

Possível falha: Jogador não conectar no jogo e o jogo não ser iniciado.  

Resultado esperado: Jogador 2 conectar-se ao jogo.  

- **Teste 5**  

Abrir o terminal para o jogador 2 e inserir o nome do jogador.  

Possível falha: Mensagens não serem exibidas e o jogador 2 conectar-se ao jogo.  

Resultado esperado: Exibir as mensagens de que o jogador 2 esta pronto para iniciar o jogo, o jogo esta sendo iniciado e aguardar a jogada do oponente.  

- **Teste 6**  

Após a conexão dos 2 jogadores, tentar conectar outros jogadores ao jogo antes de encerrar a partida.  

Possível falha: Na mesma partida conectarem 3 ou mais jogadores.  

Possível falha: Não ser exibidas as mensagens de restrição aos demais jogadores que tentarem conectar ao jogo.  

Resultado esperado: Não conectar na mesma partida mais de 2 jogadores.  

Resultado esperado: Ser exibida mensagens de restrição aos demais jogadores que tentarem conectar no jogo,  informando a restrição para ter acesso a partida.  

- **Teste 7**  

Após a conexão dos 2 jogadores o jogo irá iniciar.  

Será apresentado ao jogador 1, o menu de questões, com os números das questões disponíveis de 1 a 16.  

Uma janela será apresentado ao jogador . Nesta janela irá conter o menu de questões, com os números das questões disponíveis.  

Possível falha: Janela não exibir o menu de questões para o jogador.  

Resultado esperado: Ser exibido ao jogador 1 o menu contendo o número das questões.  

- **Teste 8**  

Após o jogador 1 visualizar o menu de questões, haverá uma mensagem explicando a regra do jogo, no qual questões selecionadas por qualquer um dos jogadores não poderão ser escolhidas.  

Possível falha: Abaixo do menu de questões não ser exibida a mensagem explicativa.  

Resultado esperado: Exibir janela com menu de questões e abaixo do menu mensagem explicativa.  

- **Teste 9**  

O jogador deverá digitar o número de uma questão que não esta disponível no menu de questões.  

Deverá ser exibida uma mensagem de restrição ao jogador, para que escolha uma questão válida de acordo com o menu.  

Possível falha: Não ser exibida a mensagem de restrição após o jogador escolher o número de uma questão que não esta no menu.  

Possível falha: Ser exibida a questão escolhida que não esta no menu de questões.  

Resultado esperado: Exibir a mensagem de restrição ao jogador que escolher uma questão que não esta disponível no menu.  

Resultado esperado: Não ser exibida a questão escolhida que não esta no menu de questões.   

- **Teste 10**  

O jogador deverá digitar caracteres que não condizem com o número das questões disponíveis no menu. Letras e caracteres especiais.  

Possível falha: Não ser exibida a mensagem de restrição a caracteres que sejam diferentes de números inteiros.  

Resultado esperado: Exibir a mensagem de restrição ao jogador, para que  o mesmo insira números inteiros.  

- **Teste 11**  

O jogador deverá escolher uma questão de 1 a 16.  

Possível falha: Não exibir a questão escolhida.  

Resultado esperado: Exibir a questão escolhida contendo as opções de 1 a 4 para a escolha da resposta.  

- **Teste 12**  

Após o jogador escolher o número da questão, será apresentada a questão com opções de escolha, de 1 a 4.  

Possível falha: Não apresentar as opções das questões.  

Resultado esperado: Apresentar as opções das questões.  

- **Teste 13**  

Após a escolha da resposta, será apresentada uma mensagem ao jogador, informando se a resposta esta correta ou incorreta. Será apresentando o ranking da pontuação informando o nome e a pontuação individual dos jogadores.  

Caso a resposta seja correta a pontuação será 1 (um), caso esteja incorreta será zero (0).  

Possível falha: Não apresentar mensagem sobre a resposta se esta correta ou incorreta.  

Possível falha: Não apresentar o ranking informando nome e a pontuação dos jogadores.  

Resultado esperado: Informar a mensagem sobre a reposta.  

Resultado esperado: Informar o ranking com os nomes e a pontuação do jogadores.  

- **Teste 14**  

Após o jogador 1 terminar a sua jogada, será a vez do jogador 2 realizar a sua jogada.  

Será exibido para o primeiro jogador, uma mensagem para aguardar o oponente, jogador 2, realizar a sua jogada. Essa mensagem deverá ser exibida a cada rodada para ambos os jogadores, até o termino do jogo.  

Possível falha: Não ser exibida mensagem ao jogador 1, para aguardar o oponente, jogador 2, realizar a sua jogada.  

Resultado esperado: Exibir mensagem ao jogador 1 para aguardar o oponente, jogador 2, realizar a sua jogada.   

- **Teste 15**  

Após o final das 8 rodadas será informada a pontuação individual dos jogadores.  

Caso o jogo termine empatado será exibido uma mensagem referente ao resultado do jogo.  

Possível falha: Não ser exibida a pontuação individual dos jogadores.  

Possível falha: Não ser exibida a mensagem referente ao resultado do jogo.  

Resultados esperados: Exibir a pontuação individual dos jogadores.  

Resultados esperados: Exibir a mensagem referente ao resultado do jogo.  

- **Teste 16**  

Após o final das 8 rodadas será informada a pontuação individual dos jogadores.  

Caso o jogo não termine empatado, será exibida uma mensagem individual aos jogadores.  

A mensagem será respectiva ao resultado dos jogadores em caso de derrota e vitória.  

O vencedor será o jogador que possuir a maior pontuação.  

Possível falha: Não informar a pontuação individual dos jogadores.  

Possível falha: Não ser exibida a mensagem individual aos jogadores, respectiva ao resultado de cada jogador.  

Resultado esperado: Mostrar a pontuação individual dos jogadores.  

Resultado esperado: Exibir a mensagem individual a cada jogador, com os respectivos resultados.  





















