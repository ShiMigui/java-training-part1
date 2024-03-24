# Contratos do Trabalhador

Correção: [clique aqui](https://github.com/acenelio/composition1.java).

Ler os dados do trabalhador com N contratos(fornecidos pelo usuário). Daí, solicitar do usuário um mês e ano, e mostrar qual foi o salário do funcionário naquele mês, conforme exemplo:

## Desenho

| WorkerLevel |
|---|
| JUNIOR : int |
| MID_LEVEL : int |
| SENIOR : int |

| Departament |
|---|
| name : String |

| HourContract |
|---|
| date : Date |
| valuePerHour : Double |
| hours : Integer |
| totalValue() : Double |

| Worker |
|---|
| name : String |
| level : WorkerLevel |
| baseSalary : Double |
| addContract(contract : HourContract) : void |
| removeContract(contract : HourContract) : void |
| income(year : Integer, month : Integer) : Double |

## Exemplos

```shell
Enter departament's name: Design

Enter worker data
Name: Alex
Level: MID_LEVEL
Base salary: 1200.00

How many contracts to this worker? 3

Enter contract #1
Date: (DD/MM/YYYY) 20/08/2018
Value p/hour: 50.00
Duration: (hours) 20

Enter contract #2
Date: (DD/MM/YYYY) 13/06/2018
Value p/hour: 30.00
Duration: (hours) 18

Enter contract #3
Date: (DD/MM/YYYY) 25/08/2018
Value p/hour: 80.00
Duration: (hours) 10

Enter month and year to calculate income: (MM/YYYY) 08/2018
Name: Alex
Departament: Design
Income for 08/2018: 3000.00
```
