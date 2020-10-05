Interface
----

- Interface é um tipo que define um conjunto de operações que uma classe deve implementar;
- A interface estabelece um contrato que a classe deve cumprir.
- Uma interface normalmente é composta por métodos publicos e abstratos;
- Ao implementar uma interface a classe concreta utiliza a palavra reservada *implements*, exemplo abaixo;


```
public interface ExemploInterface {

    double area();
    double perimetro();

}

```

```
publica class ExemploClasseConcreta implements ExemploInterface {

    public double area(){
        //implementação da regra de negócio;
    }

    public double perimetro(){
        //implementação da regra de negócio;
    }

}

```

Pra quê interfaces?
----
- Para criar sistemas com baixo acoplamento;
- Flexibilizar a implementação através de classes concretas;
- Evitar excessivos pontos de alterações ou manutenções no projeto;
- Para criar contratos de implementação, onde que as classes concretas sigam esses contratos;
- Injeção de dependencia por meio do construtor (Upcasting);
- Inversão de controle;
- implementação da interface *comparable*;
  
  