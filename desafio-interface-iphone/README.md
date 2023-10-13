## Realização do Desafio da DIO: Diagrama de Classes de IPhone
Explanação do conceito de polimorfimo dinâmico com o uso de interface

> Foi solicitado a modelagem e diagramação da representação em UML e código no que se refere ao iPhone.

> Com base no vídeo de lançamento do iPhone em 2007 conforme link abaixo, foi solicitado para elaborar a diagramação <br>
das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musical, Aparelho Telefônico e <br>
Navegador de Internet. <br>
Foi solicitado também para criar as classes e interfaces no formato de arquivos .java

> Os métodos foram definidos de forma simples para fins didáticos. <br>

Definimos 3 **Interfaces**, abaixo:

- **ReprodutorMusical**  &rarr; representação abstrata de um reprodutor musical.
- **AparelhoTelefonico** &rarr; representação abstrata de um aparelho telefônico.
- **NavegadorInternet**  &rarr; representação abstrata de um navegador de internet.

Comportamentos definidos:
---

**RepodutorMusical**: tocar, pausar, selecionarMusica.<br>
**AparelhoTelefonico**: ligar, atender, iniciarCorrerioVoz.<br>
**NavegadorInternet**: exibirPagina, adicionarNovaAba, atualizarPagina.<br>

Definimos 3 classes que implementa individualmente cada interface acima:

- **IPod**  &rarr; Classe que implementa as funcionalidades de um reprodutor musical.
- **Celular** &rarr; Classe que implementa as funcionalidades de um aparelho telefônico.
- **Safari**  &rarr; Classe que implementa as funcionalidades de um navegador de internet.

Também definimos uma classe que implementa as 3 interfaces de uma vez, representando o IPhone:

- **IPhone**  &rarr; Classe que implementa todas as funcionalidades (ReprodutoMusical, AparelhoTelefonico e NavegadorInternet).

Para melhor visualização e compreensão, segue imagem do diagrama de classes:

![](https://github.com/marcioiherrero/dio-trilha-java-basico/blob/main/desafio-interface-iphone/diagrama-classe-iphone-fundo-branco.png)

[Marcio](https://github.com/marcioiherrero)
