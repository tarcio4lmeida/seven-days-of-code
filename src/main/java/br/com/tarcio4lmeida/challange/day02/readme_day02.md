

![](../../../../../../resources/img/7daysofcode.png)

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=CONCLUÍDO&color=GREEN&style=for-the-badge)

DAY 02:

No primeiro dia, você fez uma chamada para a API do IMDB para receber o JSON dos top 250 filmes como resposta. Você deve ter recebido algo como:

`
{"items":[
{"id":"tt5491994","rank":"1","title":"Planet Earth II","fullTitle":"Planet Earth II (2016)","year":"2016","image":"....”, …},
{"id":"tt0903747","rank":"2","title":"Breaking Bad","fullTitle":"Breaking Bad (2008)","year":"2008","image":”....”...},
….
],"errorMessage":""}
`

No desafio de hoje você deverá criar diferentes listas, cada uma com um atributo do filme. Uma lista com os títulos, outra com a URL da imagem e assim por diante. Exemplo:

    List<String> titles = //parseia o título de cada filme do JSON;

    List<String> urlImages = //parseia a URL do pôster de cada filme do JSON;

    // outras listas, com os anos (year) e as notas (imDbRating)

A sua tarefa de hoje será parsear essa resposta. Em outras palavras, você vai extrair as informações desse JSON. Repare que o JSON possui um array de filmes, e cada filme possui vários atributos como id, título, etc.
### 🛠️ Abrir e rodar o projeto
* Criar uma conta no IMDB para ter a chave de acesso ao serviço (apiKey), mas cuidado, essa chave não deve ser commitada no Github ou em outro repositório!
* No VM Arguments do programa colocar a url: https://imdb-api.com/en/API/Top250Movies/*(apiKey)*

### 🔨  Funcionalidades do projeto
- `Funcionalidade 1`: Imprimir a lista de parametros parseados do JSON