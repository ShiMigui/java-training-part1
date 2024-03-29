# Votos dos candidatos

Na contagem de votos de uma eleição, são gerados vários registros de votação contendo o nome do candidato e a quantidade de votos (formatos .csv) que ele obeteve em uma urna de votação a partir de um arquivo, daí gerar um relatório consolidados com os totais de cada candidato.

## Exemplo

Arquivo de exemplo:

```csv
Alex Blue,15
Maria Green,22
Bob Brown,21
Alex Blue,30
Bob Brown,15
Maria Green,27
Maria Green,22
Bob Brown,25
Alex Blue,31
```

Execução:

```bash
Enter file full path: c:\\temp\\in.txt
Alex Blue: 76
Maria Green: 71
Bob Brown: 61
```
