# Tarefas Orientação a Objetos - 2
## Fala Pessoal! 👋🏽
 Esta é a segunda tarefa do curso de Analise e Desenvolvimento de Sistemas sobre Orientação a Objetos <br/>
 Nela eu pratiquei a biblioteca Java.text.NumberFormat, utilizando ela em moeda e percentual.
 
### Segue as tarefas:
### Questão 1: Estoque
##### Escreva uma classe em Java chamada Estoque. Ela deverá possuir:

##### &emsp; a) os atributos nome (string), qtdAtual (int) e qtdMinima (int) do tipo private. <br/>
##### &emsp; b) um construtor sem parâmetros <br/>
##### &emsp; c) um construtor contendo os parâmetros nome, qtdAtual e qtdMínima.
##### &emsp; d) Os métodos settters e getters.
##### &emsp; e) os métodos com as seguintes assinaturas:
##### &emsp; &emsp; - void darBaixa(int qtde)
##### &emsp; &emsp; - String mostra()
##### &emsp; &emsp; - boolean precisaRepor()
##### &emsp; &emsp; O método darBaixa(int qtde) recebe uma quantidade e atualiza o estoque. Porém, o estoque não poderá ficar negativo.
##### &emsp; &emsp; O método mostra() retorna uma String contendo o nome do produto, sua quantidade mínima, sua quantidade atual.
##### &emsp; &emsp; O método precisaRepor() retorna true caso a quantidade atual esteja menor ou igual à quantidade mínima e false, caso contrário.
##### &emsp; f) Escreva um main que entre com os dados solicitados pelo construtor. Movimente o estoque e utilize a chamada dos métodos criados
### Questão 2: Rendimento
##### Criar uma classe para calcular rendimentos de um investimento de acordo com uma taxa fixa ao mês. A classe deverá possuir o construtor com investimento inicial, taxa do rendimento e número de meses. Fazer um método para calcular e mostrar o rendimento.
#### No main: Ler as variáveis utilizando a classe Scanner e instanciar um objeto com os valores. Chamar o método que mostra o rendimento
