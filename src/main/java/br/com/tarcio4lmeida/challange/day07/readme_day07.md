![](../../../../../../resources/img/7daysofcode.png)

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=CONCLUÍDO&color=GREEN&style=for-the-badge)

DAY 07:

No mundo Java, é possível ordenar uma coleção usando o método sort() da classe Collections, cuja base é algo como:

`Collections.sort(contentList); ` // mas qual é o critério de ordenação?

Esse método sabe ordenar listas, desde que você defina uma regra - é aí que vai entrar o seu modelo. A partir dele, você poderá definir essa regra, que também é chamada de "ordem natural". Ou seja, para ter essa regra no modelo, você deverá implementar um método bem definido pela interface Comparable. Dessa forma, os objetos da classe se tornarão comparáveis.

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=&message=EXTRA&color=G&style=for-the-badge)

Não pare por aí! Vamos usar este último dia para praticar mais e mais de Java!

1. Implemente outras formas de comparação usando um Comparator. Você pode usar o método Comparator.comparing(a, b), que recebe a lista e o método que será utilizado na comparação.


2. Se você implementou a API da Marvel, junte as listas das séries e dos filmes em uma só. Para tal, use a API de Streams para fazer um join, algo como:
`List<? extends Content> mixedList = Stream.of(seriesList, moviesList)
.flatMap(Collection::stream)
.collect(Collectors.toList());
`


3. Ao misturar as duas listas, pode fazer sentido indicar na sua página HTML se o elemento da lista é uma série ou filme. Para tal, crie um novo método type() na interface Content. Implemente esse método no modelo (em Series e em Movie) e mostre o resultado no seu HTML.

<p align="center">
  <img src="../../../../../../resources/img/exfilmecomnome.png"/>
</p>

### 🛠️ Abrir e rodar o projeto
* Criar uma conta na MARVEL para ter a chave de acesso ao serviço (apiKey), mas cuidado, essa chave não deve ser commitada no Github ou em outro repositório!
* No VM Arguments do programa colocar a url: http://gateway.marvel.com/v1/public/series?ts=1&apikey=(apiKey)&hash=(hash)

### 🔨  Funcionalidades do projeto
- `Funcionalidade 1`: Gerar Page HTML da lista de Series e Filmes
