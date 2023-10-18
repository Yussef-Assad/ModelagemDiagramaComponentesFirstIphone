# Modelo de Diagrama de Componentes do Primeiro iPhone em Java

Este projeto é uma modelagem e implementação em Java do primeiro iPhone, representando suas funcionalidades como reprodutor musical, aparelho telefônico e navegador de internet. O objetivo é fornecer um exemplo simples de como as interfaces e classes podem ser usadas para modelar um dispositivo multifuncional.

## Requisitos de Configuração

Para executar este projeto, você precisará do seguinte:

- Java Development Kit (JDK) 8 ou superior
- Eclipse IDE (ou outra IDE Java de sua preferência)

## Instruções de Uso

1. Clone ou faça o download deste repositório.
2. Abra o Eclipse ou sua IDE Java preferida.
3. Importe o projeto para a IDE.
4. Execute a classe `ClasseTeste.java` para testar a funcionalidade do primeiro iPhone.

## Exemplo de Uso

Aqui está um exemplo de código que demonstra como criar uma instância do iPhone e usar suas funcionalidades:

```java
public class ClasseTeste {
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

        meuiPhone.play();
        meuiPhone.fazerChamada("123-456-7890");
        meuiPhone.receberChamada();
        meuiPhone.abrirPaginaWeb("https://www.example.com");
        meuiPhone.navegarPaginaWeb();
        meuiPhone.pause();
        meuiPhone.encerrarChamada();
        meuiPhone.fecharPaginaWeb();
    }
}
