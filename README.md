# Padrões de Projetos Criacionais PT-BR 🇧🇷

Cada padrão descreve um problema que ocorre frequentemente. Descreve uma solução que possa ser usada outras vezes na prática e sempre adaptar para outra solução que pode ou não ser exsitente.

Parte dessas anotações são do meu aprendizado vindo do curso "Padrões de Projeto em Java - COD3R" ,  e do livro "GOF - Padrões de Design: Elementos de Software Orientado a Objetos Reutilizáveis"

...

## Factory Method
É um padrão que define a instanciação de outras classes.

**Meu Problema: ** 

-> Como posso escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface? 

-> Tenho muito acoplamento dentro da minha aplicação! 

-> E como consigo  deixar meu código desacoplado das classes concretas?

**Solução do Padrão: ** 

-> Extrair a lógica de criação dos objetos para um factory method.

-> Invocar o factory method para receber uma instância qualquer que impolemente uma determinada interface.


Dentro do factory method podem ser abordadas outras formas, no livro do GOF nomeia-se de *Simple* e *Half-Simple*

*Half-Simple: * Coloca-se as classes concretas com um nome de factory dentro de uma interface, e depois é chamadas as factorys nos construtores.
Algumas desvantagens dessa abordagem é a complexidade e um código não usual.

*Simple: * Modelos de factory mais simples. Uso uma única classe que encapsula as demais com os parâmtros necessários.


