<p align="center">
	  <img alt="Java" src="https://img.shields.io/static/v1?color=red&label=Dev&message=Java&style=for-the-badge&logo=Java"/>
</p>

<img alt="Java" src="img/java-badge.png" width=150 align=right>

<h1>Programa Start Java</h1>

Notas, projetos e insights gerados ao longo do curso, com o objetivo de documentar o aprendizado para futuras consultas e auxiliar interessados em programação no seu pontapé inicial.

![](https://img.shields.io/badge/feito%20com%20%E2%9D%A4%20por-jaac-cyan)
[![LinkedIn Badge](https://img.shields.io/badge/LinkedIn-Profile-informational?style=flat&logo=linkedin&logoColor=white&color=0D76A8)](https://www.linkedin.com/in/jonasaacampos)

<h2>Table of Contents</h2>

- [Sobre a Capgemini](#sobre-a-capgemini)
- [Dependências necessárias](#dependências-necessárias)
- [Lógica de Programação com JAVA // Projetos em TI](#lógica-de-programação-com-java--projetos-em-ti)
- [Java Avançado](#java-avançado)
- [HTML Avançado](#html-avançado)
- [CSS Avançado](#css-avançado)
- [Contato](#contato)
- [Crédito das imagens](#crédito-das-imagens)


É uma iniciativa da Capgemini para acelerar a formação de novos talentos
em tecnologia, valorizando a inclusão e a diversidade.

<img  src="https://www.capgemini.com/br-pt/wp-content/themes/capgemini-komposite/assets/images/logo.svg"  width=250 align=right>

## Sobre a Capgemini

> _A Capgemini tem um papel fundamental a desempenhar para garantir que o futuro cumpra todas as suas promessas. Acreditamos que todas as tecnologias podem trazer o progresso para todos, se, antes de mais nada, forem projetadas por e através das pessoas. Como empresa responsável, o Grupo Capgemini é realista, tanto no que diz respeito às promessas como aos riscos da inovação tecnológica: o nosso papel é torná-la útil, acessível e ética. Esse propósito deve funcionar como uma bússola para cada um dos funcionários.”_
>
> Paul Hermelin, Chairman of the Board, and Aiman Ezzat, Chief Executive Officer of Capgemini

## Dependências necessárias

Instruções para instalação no linux 

**JAVA**
```
 sudo apt-get purge oracle-java7-installer*
 sudo apt-get install ppa-purge
 sudo ppa-purge ppa:eugenesan/java
 sudo apt-get clean
 sudo apt-get update
```

**XAMPP**
```
//verificar a versão mais recente em
// https://www.apachefriends.org/pt_br/download.html


wget https://www.apachefriends.org/xampp-files/7.4.29/xampp-linux-x64-7.4.29-0-installer.run
chmod +x xampp-installer.run
sudo ./xampp-installer.run
```
-----
## Lógica de Programação com JAVA // Projetos em TI

<details>
<summary>
<strong>Lista de Exercício I - Lógica com Java</strong>
</summary>

- [x] 01 - Soma de dois números
- [x] 02 - Operações matemáticas elementares
- [x] 03 - Cálculo de consumo médio de combustível
- [x] 04 - Cálculo de comissão de um vendedor
- [x] 05 - Boletim escolar
- [x] 06 - Troca de valores entre variáveis
- [x] 07 - Conversor de temperatura
- [x] 08 - Conversor monetário
- [x] 09 - Cálculo rendimento aplicação
- [x] 10 - Cálculo valor prestações
- [x] 11 - Cálculo de preço de venda com base em margem de lucro
- [x] 12 - Cálculo de preço de venda de um veículo
- [x] 13 - Verifique se o valor inserido é maior que 10
- [x] 14 - Verifique qual o maior número de 2 valores
- [x] 15 - Verifique se os números digitados estão entre 100-200
- [x] 16 - Boletim escolar melhorado
- [x] 17 - Verifica se o número está em um intervalo
- [x] 18 - Verifica se possui mais de 18 anos de x pessoas
- [x] 19 - Algoritmo que coleta informações pessoais e classifica-as no final
- [x] 20 - Sistema da concessionária Carango velho

</details>

<details>
<summary>
<strong>Lista de Exercício II - Orientação a Objetos  com Java</strong>
</summary>

- [x] 1 - Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.
- [x] 2 - Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
  número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
  saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
- [x] 3 - Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
  seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
  atributos a classes deve conter os seguintes métodos: a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente. c. alterarValor; //altera o valor do litro do combustível. d. alterarCombustivel; //altera o tipo do combustível. e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
- [x] 4 - Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
  prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o
  térreo), capacidade do elevador e quantas pessoas estão presentes nele.
- [ ] 5 - 
- [x] 6 - Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para
  representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações
  como atributos:  o número do item faturado,  a descrição do item,  a quantidade comprada do item e  o preço unitário do item. Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0.  Forneça os métodos getters e setters para cada variável de instância. Além disso, forneça um método  chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice.


</details>

<details>
<summary><strong>Projetos em TI</strong></summary>

_Melhor do que pensar e começar a codificar, é em um papel as ideias anotar._

1. Definição geral do projeto
2. Requisitos
3. Regras de negócio
4. Escopo tecnológico

</details>

O projeto desenvolvido nesta curso foi um gerenciador de tarefas, que está disponível e documentado [neste repositório](https://github.com/jonasaacampos/GerenciadorDeProjetos).

Os requisitos foram levantados, a documentação inicial foi feita e foi confeccionado um checklist para acompanhamento do desenvolvimento.

## Java Avançado
<details>
<summary><strong>Interfaces</strong></summary>

Interfaces são objetos do Java que podem ser utilizadas de forma específica para cada classe.

É um agrupamento de classes que contenham caracteríscas em comum.
Diferente da herança, uma interface pode ser utilizada em várias classes.

<blockquote>Os métodos na interface não possue retorno.</blockquote>

Ex.:
Podemos criar um construtor de `AnimaisFazenda`, e todos os animais criados teriam obrigatoriamente os mesmos métodos, mas com saídas diferentes.

</details>

<details>
<summary><strong>Construtores</strong></summary>

Construtor com sobrecarga é quando definimos que os dados serão passados diretamente no construtor.


</details>

<details>
<summary><strong>Enumeradores</strong></summary>

*Como se fosse um case, uma valor predefinido dentro no método.*

Serve para evitar que tenhamos que criar uma tabela no banco de dados para guardar apenas alguns valores.

</details>

<details>
<summary><strong>Modificadores de Acesso</strong></summary>

private > default > protected > public

Existem em dois níveis, nível superior e nível de membro.
</details>

<details>
<summary><strong>Arrays</strong></summary>
Arrays são estruturas de dados homogêneos. Podem ser declarados como a seguir:

```
int[] numeros = new int[4];

int numerosOutroJeito;
numerosOutroJeito = new int[4];

//varios arrays
int numeros1 = new int[10], numeros2 = new int[11], numeros3 = new int[5];

valores padrão array
numetos = 0
boolean = false
referencias = null

```

</details>


<details>
<summary><strong>Matrizes</strong></summary>

Java Collections

Colection é uma estrutura de dados que permite adicionar diversos objetos.

<blockquote>arrayList não é um array</blockquote>

Altera/resgata com base na posição
Remove com base no conteúdo

ArrayList = meio da lista
LinkedList = extremidades da lista

</details>

<details>
<summary><strong>Anotations (informações comnplementares no codigo fonte)</strong></summary>

*São como metadados*, fornecem dados sobre um programa que não faz parte do próprio programa. As anotações não têm efeito direto sobre a operação do código que anotam.

As anotações têm vários usos, entre eles:

- **Informações para o compilador:** As anotações podem ser usadas pelo compilador para detectar erros ou suprimir avisos.
- **Processamento em tempo de compilação e implantação:** Ferramentas de software podem processar informações de anotação para gerar código, arquivos XML e assim por diante.
- **Processamento em tempo de execução:** Algumas anotações estão disponíveis para serem examinadas em tempo de execução.

**Para saber mais**

The Java™ Tutorials [Lesson: Annotations](https://docs.oracle.com/javase/tutorial/java/annotations/)

Nelson Glauber [Java Custom Annotations](https://nglauber.medium.com/java-custom-annotations-49b2418b75e1)

</details>

## HTML Avançado

<details>
<summary><strong>Onpage SEO</strong></summary>

- *não confundir com site OnePage!*
- não tem relação com colocar palavras chave nos códigos. Isso era usado quando os mecanismos de busca verificavam o código
- é o inverso do outbound (panfletagem). Aqui **primeiro você explica, e depois mostra o produto**

**offpage** é o que está fora, de comos os outros sites falam de você.

**principais elementos**
- url amigável
- meta title
- meta description
- site map
- título da página
- conteúdo de texto

---

**☑️ Checklist ONPAGE SEO**

- [ ] Título da página (h1): Sem limite de caracteres, mas usar bom senso
- [ ] Meta Title (SEO Title): 
    - [ ] Título da aba `<title>`
    - [ ] Máx. 70 caracteres
- [ ] Meta Description
    - [ ] Deve conter o resumo da página
    - [ ] call to action (verbo no imperativo)
    - [ ] máx. 160 caracteres.
    - [ ] <meta name="description" content="ZPTO">
- [ ] URL Amigável
    - [ ] incluir palavras chave, sem caracteres especiais
    - [ ] separar por hífen
- [ ] Sitemap (0arts?)
    - [ ] xml com todas as páginas do site
    - [ ] facilita o acesso, pois não é preciso esperar o crawler do google encontrar seu site
- [ ] Imagens
    - [ ] usar atributo ALT e DESCRIÇÃO da imagem
    - [ ] nome do arquivo otimizado
    - [ ] <img scr="camisa-polo-rosa" alt="camisa polo rosa" title="Camisa Polo Rosa Promoção"/>
    - [ ] usar title na imagem
- [ ] Campos únicos
    - [ ] Dados relacionados ao SEO, como meta title
    - [ ] Não copiar de outras empresas
    - [ ] Não copiar de suas próprias páginas
- [ ] Conteúdo
    - [ ] Sempre original
    - [ ] Preze pela qualidade
    - [ ] Relevância para o tema abordado
- [ ] Hiperlinks
    - [ ] Use sempre que possível, deixando o texto interativo
- [ ] Intertítulos <h2>
    - [ ] Facilita a leitura
    - [ ] Organiza do conteúdo
- [ ] Mobile-frendliness
- [ ] Velocidade de Carregamento
- [ ] Legibilidade
- [ ] Sem Erros
- [ ] Segurança
- [ ] +200...

</details>
<details>
<summary><strong>Acessibilidade</strong></summary>

Aplicações devem ser acessíveis independentemente da capacidade auditiva, visual, física ou cognitiva dos usuários.

Sites seguros (do ponto de vista da saúde do usuário)

- Pensar nas cores e tamanhos
- Sem telas piscantes (prejudicam pessoas com epilepsia)
- Sem itens que possam causar dor de cabeça

[Teste compatibilidade dispositivos móveis](https://search.google.com/test/mobile-friendly)

1. Bom para atração de público
2. Boa usabilidade em dispositivos móveis
3. Fácil de ser desenvolvido
4. Aumenta a audiẽncia do site


- **Boas práticas de acessibilidade** da [Mozilla Fondation](https://developer.mozilla.org/pt-BR/docs/Learn/Accessibility/HTML).

</details>

<details>
<summary><strong>Segurança (de software)</strong></summary>

- SSL/TLC
- CORS
- CSP
- OWASP top 10

**SSL:** Secure Sockets Layer. Camadade Socket Segura. Depreciado, se possível usar o TLS.

**TLS:** Transport Layer Secure. Segurança na camada de transporte
Protocolos criptografados que garantem maior segurança na comunicação, impedindo o uso das informações por terceiros.
Usuários podem usar com http ou com https

**CORS:** Cross-origin resource Sharing (compartilhamento de recursos de origem diferentes)

**Possíveis erros**
* XML HTTP Request - objetos pra interafir com servidores. Da obetanção de dados da url até uma atualização completa
* Fetch APIs - interfaces para buscar recursos, usadas para acessar e manipular recursos ctml
* CSS shapes
* carregamentos de imagens

**soluções possívels CORS**

Geralmente problemas são causados por ausência de header
há a possibilidade de fazer estas configurações no servidor web

**CSP:** Content Secure policy

Camada adicional de seguranção, que visa detectar ataques, como inselão de dados e Cross Site Scripting XSS

[Content Security Policy Reference](https://content-security-policy.com/)


[The Mozilla Observatory](https://observatory.mozilla.org/)

</details>

<details>
<summary><strong>OWSP Top 10</strong></summary>
Aponta as principais falhas de segurança, de acordo com especialistas do mundo todo. É um documento de conscientização para segurança web.

[Site oficial](https://owasp.org/www-project-top-ten/)


</details>

<details>
<summary><strong>PWA (Progressive Web Application)</strong></summary>

É basicamente uma página web. Pode ser desenvolvido para se comportar como app nativo

**Vantagens de uso**

- Poucas alterações no fonte
- usos API para controle de hardware
- Envio de notificações push
- Pode ser usado offline
- Multiplataforma

**Desvantagens**

- Não fica disponível nas lojas de apps
- Fica lento se a aplicação for pesada
- Acesso limitado ou inexistente para alguns recursos

Para ver quais recursos são suportados nas plataformas, usar o [What Web Can Do Today?](https://whatwebcando.today/)

</details>

<details>
<summary><strong>App Shell</strong></summary>
É um mínimo de html, js e css que alimenta a interface para o usuário, com o objetivo de:
Carregamento rápido
GFerar armazenamento em cache
Ter exibição dinãmica

Priorizar cache inicial
Carregamento assíncrono
ferramentas de gerenciamento de conteúdo confiável para armazenar e atualizar o cache

`npm install serviceWorker`

```
<script>
    if ('serviceWorker' in navigator) {
        navigator.serviceWorker.register('generate-sw.js');
}
</script>
```
**Ferramentas úteis para gerar o PWA**

- [Web App Manifest Generator](app-manifest.firebaseapp.com)
- [PWA Manifest Generator](https://www.simicart.com/manifest-generator.html/)


**cache**

Service Worker e suas principais etapas
- Install: só é chamado uma vez,é chamamo novamnte somente em caso de alteração
- Activate
- Fetch
- message
- sync
- push

</details>

## CSS Avançado

Css são folhas de estilo compostas por camadas. CSS avançado expande a capacidade traz algumas *melhorias ao css raiz*.

<details>
<summary><strong>Pré processadores CSS</strong></summary>

A falta de dinamismo do css deixa o código repetitivo e extenso.

Pré porcessadores são linguagens intermediárias, que adicionam recursos com menos linhas de código. Lêem todo o código gerado e convertem para css.

Exemplos de pré processadores de css:

- LESS
- Sass
- Stylus

**Vantagens**

- Criação de variáveis, condicionais, laços, imports, extends, funções, Mixins
- Facilita a manutenção do código
- Permite um código limpo
- Códigos reutilizáveis
- Código mais legível

**Desvantagens**

- Aumenta de complexidade em relação ao CSS
- Pode acarretar baixo desempenho caso mau uso

</details>

<details>
<summary><strong>LESS</strong></summary>

[lesscss.org](lesscss.org)

- baseado em js.
- reduz redundancia de codigo

**Variáveis:**

```
@cor = blue;
@cor3 = navy;
```

**Hierarquia**

```
 p {
    color: @cor;
    b {
        background-color = cor3;
        }
    }
```

**[Funções](lesscss.org/functions/)**

```
@larguraColuna = 0.75;

p {
   width: percentage(@width);
}
```

**MixIns** (como uma função)

usado quando há itens iguais em mais de um seletor

```
.cores(){
    color: @cor1;
}
```
</details>

--------
<!-- CONTACT -->
## Contato

<p align='center'>
  <a href='https://github.com/jonasaacampos'>
    <img src='https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white'/>
  </a>
  <a href='https://www.linkedin.com/in/jonasaacampos/'>
    <img src='https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white'/>
  </a>
</p>

**Author:** Jonas Araujo de Avila Campos

**Confira mais projetos: [AQUI](https://github.com/jonasaacampos)**

## Crédito das imagens
- O badge Java no início do arquivo são do FlatIcon.
- A logomarca da Capgemini foi retirada do site da Capgemini e foi inserido neste documento com finalidade de contextualizar o leitor.