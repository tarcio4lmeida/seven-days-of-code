![](../../../../../../resources/img/7daysofcode.png)

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=CONCLUÍDO&color=GREEN&style=for-the-badge)

DAY 06:

Você usou a **API do IMDB** como exemplo para implementar o seu projeto, mas existem várias outras APIs por aí que também fornecem informações sobre filmes e séries, como, por exemplo, a [**API da Marvel.**](https://developer.marvel.com/?utm_source=ActiveCampaign&utm_medium=email&utm_content=%237DaysOfCode+-+Java+6%2F7%3A+%F0%9F%91%A9%F0%9F%8F%BD%E2%80%8D%F0%9F%92%BB+Criando+abstra%C3%A7%C3%B5es&utm_campaign=%5BAlura+%237Days+Of+Code%5D%28Java%29+Dia+6%2F7%3A+Criando+abstra%C3%A7%C3%B5es)

Voltando para o seu código e com a **API da Marvel** em mente, o seu desafio será que o HTML seja gerado independentemente do conteúdo em questão (seja ele um filme, uma série, uma história em quadrinhos ou outro).

Você deverá deixar o seu código mais genérico, ou seja, preparado para receber dados de outras APIs. Para isso, entram em cena as interfaces, que permitem implementações diferentes.

Então, vamos lá: o seu modelo deverá implementar uma nova interface que irá definir o comportamento comum de um conteúdo. Você pode chamá-la de Content, e ela poderá ter os seguintes métodos:

`public interface Content {
String title();
String urlImage();
String rating();
String year();
}`

E a sua classe (ou record) Movie se tornará um Content, dessa forma:

`public class Movie implements Content {...}
`

Sendo assim, você também poderá pensar em uma abstração para o parser de JSON. Você pode criar uma interface chamada 'JsonParser':

`public interface JsonParser{
public List<? extends Content> parse();
}`

Repare que o método devolve uma lista que possui elementos do tipo <? extends Content>. Como o Movie implementa a interface Content, esse código vai funcionar!

A partir daí, você poderá usar a nova interface JsonParser na classe ImdbMovieJsonParser:

`public class ImdbMovieJsonParser implements JsonParser{ }
`

Resumindo, você criará duas abstrações: uma para o seu modelo chamado de Content e outra para o JsonParser. Basta que futuras implementações sigam essas interfaces e o seu gerador de HTML continuará funcionando! Ou seja, você desacoplou o parseamento do JSON da geração de HTML.
### 🛠️ Abrir e rodar o projeto
* Criar uma conta na MARVEL para ter a chave de acesso ao serviço (apiKey), mas cuidado, essa chave não deve ser commitada no Github ou em outro repositório!
* No VM Arguments do programa colocar a url: http://gateway.marvel.com/v1/public/series?ts=1&apikey=(apiKey)&hash=(hash)

### 🔨  Funcionalidades do projeto
- `Funcionalidade 1`: Gerar Page HTML da lista de Series
- `Funcionalidade 2`: Criar Abstrações para as classes Modelo e para a classes de Parseamento de API