# 🌤️ Climex — Buscador de Clima por Cidade

Projeto desenvolvido em Java para praticar consumo de API REST, tratamento de exceções, orientação a objetos e gravação de arquivos JSON.

---

## 📋 Sobre o Projeto

O **Climex** é um sistema de linha de comando onde o usuário digita o nome de cidades e recebe informações sobre o clima atual de cada uma, consultando a API do **OpenWeatherMap**. Ao encerrar o programa, todas as cidades pesquisadas são ordenadas e salvas em um arquivo `cidades.json`.

---

## 🚀 Funcionalidades

- 🔍 Busca do clima atual de qualquer cidade do mundo
- 🌡️ Exibe temperatura (°C), condição do tempo e descrição
- ⚠️ Tratamento de erros com exceção customizada (`ErronaBusca`)
- 📋 Lista de cidades pesquisadas ordenada ao encerrar
- 💾 Gravação automática dos resultados em `cidades.json`

---

## 🛠️ Tecnologias e Conceitos Utilizados

| Tecnologia / Conceito | Aplicação no Projeto |
|---|---|
| `HttpClient` / `HttpRequest` / `HttpResponse` | Requisição à API do OpenWeatherMap |
| `URLEncoder` | Codificação de nomes de cidades com espaços |
| `Gson` + `GsonBuilder` | Desserialização do JSON retornado pela API |
| `record` Java | Transferência de dados da API (`TransfeirDados`) |
| Exceção customizada | `ErronaBusca extends RuntimeException` |
| `Comparable<Cidade>` | Ordenação das cidades pesquisadas |
| `Collections.sort` | Ordenação da lista de resultados |
| `FileWriter` + `setPrettyPrinting` | Gravação do histórico em `cidades.json` |
| Variável de ambiente | Chave da API protegida via `System.getenv("API")` |

---

## 📁 Estrutura do Projeto

src/

├── principal.java                  → Ponto de entrada, loop de busca

├── br/

│   └── com/

│       ├── excecoes/

│       │   └── ErronaBusca.java    → Exceção customizada

│       └── servico/

│           ├── Buscando.java       → Requisição HTTP à API

│           ├── Cidade.java         → Modelo de dados + lista estática

│           ├── Gravando.java       → Gravação do JSON

│           ├── Ordenando.java      → Ordenação da lista

│           └── TransfeirDados.java → Record de desserialização
---

## ⚙️ Como Executar

### Pré-requisitos

- Java 11 ou superior
- Biblioteca [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson) no classpath
- Conta gratuita na [OpenWeatherMap](https://openweathermap.org/api) para obter uma API Key

### Executando

```bash
javac -cp gson.jar -d out src/**/*.java
java -cp out:gson.jar principal
```

---

### Arquivo `cidades.json` gerado:

```json
[
  {
    "nomeDaCidade": "Pau dos Ferros",
    "Temp": 28.57,
    "estadoAtual": "Clear",
    "DescritionClima": "céu limpo"
  }
]
```

---

## 📚 Aprendizados

Este projeto foi desenvolvido como prática do curso **"Java: Consumindo API, gravando arquivos e lidando com erros"**, cobrindo os seguintes tópicos:

- Requisições HTTP com `HttpClient` nativo do Java 11
- Desserialização de JSON aninhado com Gson e `record`
- Criação de exceções customizadas com `RuntimeException`
- Uso de variáveis de ambiente para proteger credenciais
- Ordenação de coleções com `Comparable` e `Collections.sort`
- Persistência de dados em arquivo JSON formatado

---

## 👨‍💻 Autor

Feito por **Guilherme** como projeto de estudo de Java.
