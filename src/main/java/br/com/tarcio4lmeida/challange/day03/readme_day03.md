![](../../../../../../resources/img/7daysofcode.png)
####![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=CONCLUÍDO&color=GREEN&style=for-the-badge)

DAY 03:

No desafio de hoje, a ideia será modelar, ou pelo menos iniciar uma modelagem melhor do seu código.

Pensando um pouco sobre Orientação a Objetos, uma pergunta simples pode ajudar: no caso do seu projeto, o título e o pôster se referem a que tipo de objeto? A um filme, claro. Mas você ainda não tem nenhuma estrutura que defina o que é um filme.

Qual vai ser a cara disso? Um filme (Movie) deve ter os seguintes atributos:
* título (title)
* URL da imagem do pôster (urlImage)
* nota (rating)
* ano (year)

Em outras palavras, em vez de ter várias listas diferentes, uma para cada atributo do filme, é bem melhor organizar isso em uma única List<Movie>, onde cada filme encapsula os seus próprios dados. Bora implementar essa classe?

####![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=DICA&message=RESPOSTA&color=&style=for-the-badge)
Algumas reflexões: você acha que faz sentido ter setters ou um construtor padrão? Um filme deve ser interfaceado? Deve ser imutável? Justifique a sua decisão no seu repositório.
* Usei records pois são portadores transparentes para dados imutáveis, visto que estamos utilizando uma API externa para consumo, não faz sentido alterar os dados consumidos.
* Depende, para o nosso código ficar com mais abstrações e não depender da estrutura Movie, e sim de uma abstração onde movie a implementaria, sim. 
### 🛠️ Abrir e rodar o projeto
* Criar uma conta no IMDB para ter a chave de acesso ao serviço (apiKey), mas cuidado, essa chave não deve ser commitada no Github ou em outro repositório!
* No VM Arguments do programa colocar a url: https://imdb-api.com/en/API/Top250Movies/*(apiKey)*

### 🔨  Funcionalidades do projeto
- `Funcionalidade 1`: Parsear resposta do JSON para uma lista de objetos do tipo **Movie**