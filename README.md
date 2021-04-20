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



# Creational Design Patterns EN-USA 🇺🇸
Each pattern describes a problem that occurs frequently. Describes a solution that can be used other times in practice and always adapt to another solution that may or may not be exsitent.

Part of these notes are from my learning from the course "Design Patterns in Java - COD3R" and the book "GOF - Design Patterns: Reusable Object Oriented Software Elements"

...

#Factory Method
It is a pattern that defines the instantiation of other classes.

**My Problem:** 

* How can I write code where instantiated classes may vary within the same interface? 

* I have a lot of coupling within my application! 

* And how do I get my code unbound from the concrete classes?

**Factory solution:** 

* Extract the creation logic of the objects to a factory method.

* Invoke the factory method to receive any instance that implements a particular interface.

> Within the factory method can be addressed in other ways, in the GOF book it is called *Simple* and *Half-Simple*

*Half-Simple:* You place the concrete classes with a factory name inside an interface, and then the factorys are called in the constructors.
Some disadvantages of this approach are complexity and unusual code.

*Simple:* Simpler factory models. I use a single class that encapsulates the other ones with the necessary parameters.

#Abstract Factory
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

**My Problem:** 

* How can I create code where instantiated classes may vary depending on the modification?

* How can I ensure that a set of related or dependent objects can be created while maintaining the single context?

**Abstract Factory Solution:**

* Extract the creation logic of the objects to an abstract factory.

* Create an abstract factory implementation for each context, so I can ensure that all objects are related to each other.

> In the Abstract Factory, it uses related classes to apply the need for the understood context
> Factory Method and Abstract Factory can be used together! You can make your code flexible.

## Singleton
In this pattern a global access point is provided. Ensures that a class has only one instance.
*It's a not-too-accepted standard within the community for hurting some SOLID points*

**My Problem:** 

* How can I ensure that a class has only one instance?

* How can i make this instance accessible globally?

**Singleton solution:**
* Hide the constructor of this class.

* I define a PRIVATE static creation point that returns a single instance.

*The smaller the coupling the better*

> **Disadvantages of Singleton:** This design pattern is usually not widely accepted within the community, as stated earlier by hurting some principles of SOLID, and a great desvatagem of using it is the possibility of working only with concrete classes, for the implementation of an interface for example, it is not possible.

**Builder:** 
Standard that has always been evolving according to software and delivery need, bringing other approaches.

**My Problme:** 
* How can a class create different representations of the same complexly implemented object? - Object implemented in a complex way is that object that has many atribuots. E.g. Physically- 

**Builder Solution:** 
* Delegate the object function to a method that will build its characteristics rather than instantiate the object directly

* Divide object creation into parts

* Ecncapsular the creation and assembly of these parts in a separate builder.

**Prototype**
In this pattern it is possible to create an object from a prototype, more commonly known as a clone. Here it is also possible to work on top of cloned objects, which provides the evolution of the state of the application.

It is nice to note that in prototype we specify the types of objects to be created using an instance and then create new objects when copying this prototype.
E.g. Within the project code where I encapsulat the *Person* with a *clone* method

**My Problems:**
* How can I create a new object by taking advantage of the previously existing state of another object?

**Propotype solution:**
* Set a prototype that returns the copy of itself

...

I hope that my notes and my project with examples have helped in some way or reinforced some concept of Polymorphism, Object Orientation beyond the essentials that is Creational Design Patterns! 
