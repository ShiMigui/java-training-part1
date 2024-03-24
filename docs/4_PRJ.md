# Pagamentos de funcionários

Uma empresa possio funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora. Funcionários terceirizados possuem ainda uma despesa adicional.

O pagamento dos funcionários corresponde às horas trabalhadas multiplicadas pelo valor por hora, sendo que nos casos de terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.

Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.

Construa o progama conforme projeto abaixo.

## Desenho

| Employee |
|---|
| name : String |
| hours : Integer |
| valueperHour : Double |
| payment() : Double |

| OutsourceEmployee |
|---|
| additionalCharge : Double |

## Exemplos

```shell
Enter the number of employees: 3
Employee #1 data
Outsourced: (y/n) n
Name: Alex
Hours: 50
Value per hour: 20
Employee #2 data
Outsourced: (y/n) y
Name: Bob
Hours: 100
Value per hour: 15
Additional charge: 200
Employee #3 data
Outsourced: (y/n) n
Name: Maria
Hours: 60
Value per hour: 20

PAYMENTS:
Alex - $ 1000.00
Bob - $ 1720.00
Maria - $ 1200.00
```
