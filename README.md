# Padrões de Projetos Criacionais PT-BR 🇧🇷

Cada padrão descreve um problema que ocorre frequentemente. Descreve uma solução que possa ser usada outras vezes na prática e sempre adaptar para outra solução que pode ou não ser exsitente.

Parte dessas anotações são do meu aprendizado vindo do curso "Padrões de Projeto em Java - COD3R" ,  e do livro "GOF - Padrões de Design: Elementos de Software Orientado a Objetos Reutilizáveis"

...

## Factory Method
É um padrão que define a instanciação de outras classes.

**Meu Problema:** 

* Como posso escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface? 

* Tenho muito acoplamento dentro da minha aplicação! 

* E como consigo  deixar meu código desacoplado das classes concretas?

**Solução do Factory:** 

* Extrair a lógica de criação dos objetos para um factory method.

* Invocar o factory method para receber uma instância qualquer que implemente uma determinada interface.


> Dentro do factory method podem ser abordadas outras formas, no livro do GOF nomeia-se de *Simple* e *Half-Simple*

*Half-Simple:* Coloca-se as classes concretas com um nome de factory dentro de uma interface, e depois é chamadas as factorys nos construtores.
Algumas desvantagens dessa abordagem é a complexidade e um código não usual.

*Simple:* Modelos de factory mais simples. Uso uma única classe que encapsula as demais com os parâmtros necessários.


## Abstract Factory
Provê uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

**Meu Problema:** 

* Como posso criar um código onde as classes instanciadas possam variar de acordo com a modificação?

* Como consigo garantir que um conjunto de objetos relacionados ou dependentes possam ser criados mantendo o contexto único?

**Solução do Abstract Factory:**

* Extrair a lógica de criação dos objetos para um abstract factory (fábrica).

* Criar uma implementação do abstract factory para cada contexto, dessa forma consigo garantir que todos os objetos estejam relacionados entre si.


> No Abstract Factory utiliza-se de classes relacionadas para aplicar na necessidade do contexto entendido
> Factory Method e Abstract Factory podem ser usados juntos! Pode tornar seu código flexível.


## Singleton
Neste padrão é provido um ponto de acesso global. Garante que uma classe  só tenha um única instância.
*É um padrão não muito aceito dentro da comunidade por ferir alguns pontos do SOLID*

**Meu Problema:** 

* Como posso garantir que uma classe tenha apenas uma instância?

* Como fazer com que essa instância possa ser acessível globalmente?

**Solução do Singleton:**
* Esconder o construtor dessa classe.

* Defino um ponto de criação estático PRIVATE que retorne uma instância única.

*Quanto menor o acoplamento melhor*

> **Desvantagens do Singleton:** Esse design pattern costuma não ser muito aceito dentro da comunidade, como dito anteriormente por ferir alguns princípios de SOLID, e uma grande desvatagem de utiliza-lo é a possiblidade de trabalhar apenas com classes concretas, para a implementação de uma interface por exemplo, não é possível.


**Builder:** 
Padrão que sempre foi evoluindo conforme necessidade software e entrega, trazendo outras abordagens.

**Meu Problme:** 
* Como uma classe pode criar diferentes representações de um mesmo objeto implementado de forma complexa? - Objeto implementado de forma complexa é aquele objeto que possui muitos atribuots. Ex.: Pessoa Fisica- 

**Solução do Builder:** 
* Delegar a função do objeto para um método que irá construir suas caracteristicas ao invés de instanciar o objeto diretamente

* Dividir a criação do objeto em partes

* Ecncapsular a criação e montagem dessas partes em um builder separado.


**Prototype**
Neste padrão é posspivel criar um objeto a partir de um protótipo, mais comummente conhecido como clone. Aqui também é possível trabalhar em cima de objetos clonados, o que proporciona a evolução do estado da aplicação.

É legal salientar que no prototype especificamos os tipos dos objetos a serem criados usando uma instância e depois cria-se novos objetos ao copiar este protótipo.
Ex.: Dentro do código do projeto onde encapsulo a *Pessoa* com um método *clone*

**Meus Problemas:**
* Como posso criar um novo objeto aproveitando o estado previamente existente de outro objeto?


**Solução do Propotype:**
* Definir um prototype que retorna a cópia de si mesmo


...

Espero que minhas anotações e meu projeto com exemplos tenha ajudado de alguma forma ou reforçado algum conceito de Polimorfismo, Orientação a Objetos além do essencial que é os Design Patterns Criacionais! 


