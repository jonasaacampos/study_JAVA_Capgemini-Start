<p align="center">
	  <img alt="Java" src="https://img.shields.io/static/v1?color=red&label=Dev&message=Java&style=for-the-badge&logo=Java"/>
</p>

<img alt="Java" src="img/java-badge.png" width=150 align=right>

# Programa Start Java
![](https://img.shields.io/badge/feito%20com%20%E2%9D%A4%20por-jaac-cyan)
[![LinkedIn Badge](https://img.shields.io/badge/LinkedIn-Profile-informational?style=flat&logo=linkedin&logoColor=white&color=0D76A8)](https://www.linkedin.com/in/jonasaacampos)

# Table of Contents
- [Sobre a Capgemini](#sobre-a-capgemini)
- [Dependências necessárias](#dependncias-necessrias)
- [Lista Exercícios I - Lógica com Java](#lista-de-exerccio-i---lgica-com-java)
- [Contato](#contato)


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

### Crédito das imagens
- O badge Java no início do arquivo são do FlatIcon.
- A logomarca da Capgemini foi retirada do site da Capgemini e foi inserido neste documento com finalidade de contextualizar o leitor.