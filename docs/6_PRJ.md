# Pagadores de taxa

Fazer um programa que leia os dados de N contribuintes, os quais podem ser pessoa física ou jurídica, daí mostrar o valor de imposto pago cada um, bem como o total de imposto arrecadado.

Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica são nome, renda anual e número de funcionários. As regras para cáclulo de impostos são as seguintes:

- **Pessoa física**: No caso da renda ser menor de 20.000,00 pagam 15%, no caso de tenda maior pagam 25%. Se a pessoa gastou com saúde, 50% destes gastos é abatido no imposto. Exemplo: uma pessoa cuja renda foi 50.000,00 e gastou 2.000,00 com saúde, o imposto fica: (50000 \* 0.25) - (2000 \* 0.50) = 11500,00
- **Pessoa jurídica**: Pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, paga 14%. Exemplo: Numa empresa de renda igual a 400000,00 e possui 25 funcionários, o imposto fica: 400000 * 0.14 = 56000.

## Desenho

> Com base no enunciado meu desenho é:

|*Payer*|
|---|
|name:String|
|income:Double|
|*getTax()*:Double|
|getDiscount():Double|
|getTotalTax():Double|
|generateNFE():StringBuilder|

|Individual -> Payer|
|---|
|medicalCosts:Double|

|Company -> Payer|
|---|
|qtEmployees:Integer|
