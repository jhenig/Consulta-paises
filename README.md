# Consultar paises - Java
Aplicação em Java para consulta de Países utilizando API.

<h2> Como funciona 🎮 </h2>
<ul>
  <li> Buscar por nome do País utilizando a API Rest countries. </li>
  <li> Utiliza a biblioteca nativa java.net.http(HttpClient). </li>
  <li> Uso da bibliboteca Gson para converter respostas da API em objetos Java e vice-versa. </li>
  <li> Gera autmaticamente um arquivo .json com as informações do país pesquisado no diretório do projeto. </li>
</ul>

## Tecnologias 🚀 
 <ul>
  <li> Java 17+. </li>
  <li> API REST. </li>
  <li> HTTP Client. </li>
  <li> Biblioteca Gson (Google): Para manipulação de JSON. </li>
</ul>

## Como executar ▶️
 <ul>
   <li> Abrir o projeto em uma IDE de sua preferência. </li>
   <li> Certifique-se de ter o JDK 17+ instalado e a biblioteca gson-x.x.x.jar no seu classpath. </li>
   <li> Rodar a classe Main. </li>
   <li> Digitar o nome de um país(ex: Brasil). </li>
   <li> O console exibirá os detalhes e um arquivo como Brasil.json será criado. </li>
 </ul>

##Exemplo de Saída (Console) 💡 
Digite um País para consultar: 
Brasil
País: Brazil
Capital: Brasília
Região: Americas
População: 212559417

 ## Aprendizado 📝
 Neste projeto, desenvolvi habilidades como:
 <ul>
   <li> Consumo de API REST aprendi a utilizar o HttpClient nativo do Java (introduzido no Java 11). </li>
   <li> Manipulação de JSON com Gson. </li>
   <li> Utilizei Java Records para criar classes de dados imutáveis. </li>
   <li> Codificação de URLs, aprendi a importância do URLEncoder para tratar nomes de países com espaços ou caracteres especiais (ex: "South Africa"), evitando erros de URL inválida. </li>
   <li> Boas Práticas e Clean Code, dividi as responsabilidades do sistema em classes distintas (Consulta, Gerador, Main), facilitando a manutenção e leitura do código. </li>
   <li> Organização do código com POO (Programação Orientada a Objetos). </li>
 </ul>
