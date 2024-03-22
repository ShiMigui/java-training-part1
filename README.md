# Curso de Java completo - Projetos para treinamento de java

## Índice

- [Links](#links)
- [Lista de exercícios](#exercícios)
  - PRJ 1 - [Contratos do Trabalhador](#contratos-do-trabalhador)
  - PRJ 2 - [Comentários](#comentários)
  - PRJ 3 - [Pedido do cliente](#pedido-do-cliente)
  - PRJ 4 - [Pagamentos de funcionários](#pagamentos-de-funcionários)
  - PRJ 5 - [Taxa de produtos](#taxa-de-produtos)
  - PRJ 6 - [Pagadores de taxa](#pagadores-de-taxa)
  - **Tratamento de exceções**
    - PRJ 7 - [Reserva de hotel](#exceptions-reserva-de-hotel)
    - PRJ 8 - [Conta bancária](#exceptions-conta-bancária)
  - **Arquivos**
    - PRJ 9 - [Itens vendidos](#files-itens-vendidos)
  - **Interfaces**
    - PRJ 10 - [Aluguel de carro](#interface-aluguel-de-carro-1)

## Links

Curso: [Java completo - Programação Orientada a Objetos + Projetos](https://www.udemy.com/course/java-curso-completo/).

Youtube: [Dev Superior](https://www.youtube.com/@DevSuperior).

Github: [Nelio Alves](https://github.com/acenelio).

Site: [Dev Superior](https://devsuperior.com.br).

## Exercícios

### Contratos do Trabalhador

Correção: [clique aqui](https://github.com/acenelio/composition1.java).

Ler os dados do trabalhador com N contratos(fornecidos pelo usuário). Daí, solicitar do usuário um mês e ano, e mostrar qual foi o salário do funcionário naquele mês, conforme exemplo:

#### Desenho - Contratos do Trabalhador

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

#### Exemplos - Contratos do Trabalhador

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

### Comentários

Instancie manualmente os objetos mostrados abaixo e mostre-os na tela do terminal, conforme exemplo:

#### Desenho - Comentários

|Post|
|---|
|moment: Date|
|title: String|
|content: String|
|likes: Integer|

|Comment|
|---|
|text: String|

#### Exemplo 1 - Comentários

|Post|
|---|
|moment = 21/06/2018 13:05:44|
|title = Traveling to New Zealand|
|content = I'm going to visit this wonderful country!|
|likes = 12|

|Comment|
|---|
|text = Have a nice trip|

|Comment|
|---|
|text = Wow that's aweasome|

```shell
Traveling to New Zealand
12 likes - 21/06/2018 13:05:44 
I'm going to visit this wonderful country!
Comments:
Have a nice trip
Wow that's awesome
```

#### Exemplo 2 - Comentários

|Post|
|---|
|moment = 28/07/2018 23:14:19|
|title = Good night guys|
|content = See you tomorrow|
|likes = 5|

|Comment|
|---|
|text = Good night|

|Comment|
|---|
|text = Maybe the Force be with you|

```shell
Good night guys
5 likes - 28/07/2018 23:14:19 
See you tomorrow
Comments:
Good night
Maybe the Force be with you
```

### Pedido do cliente

Ler os dados de um pedido com N itens(fornecido pelo usuário). Depois, mostrar um sumário do pedido conforme exemplo. Nota: o instante do pedido deve ser o instante atual.

#### Desenho - Pedido do cliente

| OrderStatus |
|---|
| PENDING_PAYMENT : int=0 |
| PROCESSING : int=1 |
| SHIPPED : int=2 |
| DELIVERED : int=3 |

| Client |
|---|
| name : String |
| email : String |
| birthDate : Date |

| Product |
|---|
| name : String |
| price :  Double |

| OrderItem |
|---|
| quantity : Integer |
| price : Double |
| product : Product |
| subTotal() : Double |

| Order |
|---|
| moment : Date |
| status : OrderStatus |
| client : Client |
| itens : List\<OrderItem> |
| total() : Double |
| addItem(item:OrderItem) : void |
| removeItem(item:OrderItem) : void |

#### Exemplos - Pedido do cliente

```shell
Client
Name: Alex Green
Email: alex@gmail.com
Birth date: (DD/MM/YYYY) 15/03/1985

Order
Status: PROCESSING
How many products? 2

Product #1
Name: TV
Price: 1000.00
Quantity: 1

Product #2
Name: Mouse
Price: 40.00
Quantity: 2

Order summary
Moment: 20/04/2018 11:25:09
Status: Processing
Client: Alex Green (15/03/1985) - alex@gmail.com
Products
TV, $1000.00, Quantity: 1, Subtotal: $1000.00
Mouse, $40.00, Quantity: 2, Subtotal: $80.00
Total: $1080.00
```

### Pagamentos de funcionários

Uma empresa possio funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora. Funcionários terceirizados possuem ainda uma despesa adicional.

O pagamento dos funcionários corresponde às horas trabalhadas multiplicadas pelo valor por hora, sendo que nos casos de terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.

Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.

Construa o progama conforme projeto abaixo.

#### Desenho - Pagamentos de funcionários

| Employee |
|---|
| name : String |
| hours : Integer |
| valueperHour : Double |
| payment() : Double |

| OutsourceEmployee |
|---|
| additionalCharge : Double |

#### Exemplos - Pagamentos de funcionários

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

### Taxa de produtos

Correção do professor: [clique aqui](https://github.com/acenelio/inheritance5-java)

Fazer um programa para ler os dados de N produtos(fornecidos pelo usuário). Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.

Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados possuem uma data de fabricação. Estes dados especificos devem ser acrescentados na etiqueda de preço conforme exemplo (abaixo). Para produtos importados, a taxa e o produto deve ser acrescentada ao preço final do produto.

Favor implementar o programa conforme projeto ao lado.

#### Desenho - Taxa de produtos

| Product |
|---|
| name : String |
| price : Double |
| priceTag() : String |

| ImportedProduct |
|---|
| customsFee : Double |
| priceTag() : String |
| totalPrice() : Double |

| UsedProduct |
|---|
| manufactureDate : Date |
| priceTag() : String |

#### Exemplos - Taxa de produtos

```shell
Enter the number of products: 3
Product #1 data:
Common, used or imported? (c/u/i) i
Name: Tablet
Price: 260.00
Customs fee: 20.00
Product #2 data:
Common, used or imported? (c/u/i) c
Name: Notebook
Price: 1100.00
Product #3 data:
Common, used or imported? (c/u/i) u
Name: Iphone
Price: 400.00
Manufacture date? (DD/MM/YYYY) 15/03/2017

PRICE TAGS
Tablet $ 280.00 (Customs fee: $ 20.00)
Notebook $ 1100.00
Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)
```

### Pagadores de taxa

Fazer um programa que leia os dados de N contribuintes, os quais podem ser pessoa física ou jurídica, daí mostrar o valor de imposto pago cada um, bem como o total de imposto arrecadado.

Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica são nome, renda anual e número de funcionários. As regras para cáclulo de impostos são as seguintes:

- **Pessoa física**: No caso da renda ser menor de 20.000,00 pagam 15%, no caso de tenda maior pagam 25%. Se a pessoa gastou com saúde, 50% destes gastos é abatido no imposto. Exemplo: uma pessoa cuja renda foi 50.000,00 e gastou 2.000,00 com saúde, o imposto fica: (50000 \* 0.25) - (2000 \* 0.50) = 11500,00
- **Pessoa jurídica**: Pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, paga 14%. Exemplo: Numa empresa de renda igual a 400000,00 e possui 25 funcionários, o imposto fica: 400000 * 0.14 = 56000.

#### Desenho - Pagadores de taxa

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

### Exceptions Reserva de hotel

Fazer programa para ler os dados de uma reserva de hotel (número do quarto, data de entrada e saída) mostrá-los na tela, inclusive duração em dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, mostrar novamente a reserva com os dados atualizados. O prorama não deve aceitar dados inválidos para a reserva, conforme as seguintes regras:

- Alterações de reserva podem ser feitas apenas para datas futuras
- A data de saída deve ser maior que a data de entrada

#### Desenho - Exceptions Reserva de hotel

|Reservation|
|---|
|roomNumber: Integer|
|checkin: Date|
|checkout: Date|
|duration(): Integer|
|updateDates(checkin: Date, checkou: Date): void|

### Exceptions Conta bancária

Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque de conta. Implemente a conta bancária conforme projeto abaixo:

#### Desenho - Exceptions Conta bancária

| Account |
|---|
|number: Integer|
|holder: String|
|balance: Double|
|withdrawLimit: Double|
|deposit(amount: Double): void|
|withdraw(amount: Double): void|

### Files Itens vendidos

Fazer um programa para ler o caminho de um arquivo `.csv` contendo os dados de itens vendidos. Cada item possui um nome, preço unitário e quantidade, separados por vírgula. Você deve gerar um novo arquivo chamado `summary.csv`, localizado em uma subpasta chamada `out` a partir da pasta original do arquivo de origem, contendo apenas o nome e o valor total para aquele item (preço unitário multiplicando pela quantidade), conforme exemplo:

#### Exemplos - Files Itens vendidos

```csv
TV LED,1290.99,1
Video Game Chair,350.50,3
Iphone X,900.00,2
Samsung Galaxy 9,850.00,2
```

```csv
TV LED,1290.99
Video Game Chair,1051.50
Iphone X,1800.00
Samsung Galaxy 9,1700.00
```

### Interface Aluguel de carro 1

Uma locadora brasileira de carros cobra um valor por hora para as locações de até 12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação será cobrada com base em um valor diário. Além do valor de locação é acrescido no preço o valor de imposto conforme regras do país que, no caso do Brasil, é 20% para valores até 100.00, ou 15% para valores acima desse. Fazer um programa que lê os dados da locação (modelo do carro, instante inicial e final da locação), bem como o valor por hora e o valor diário de locação. O programa deve então gerar a nota de pagamento (contendo valor da locação, valor do imposto e valor total do pagamento) e informar os dados na tela. Veja os exemplos.

#### Entidades - Interface Aluguel de carro 1

|Vehicle|
|---|
|model: String|

|CarRental|
|---|
|start: LocalDateTime|
|finish: LocalDateTime|

|Invoice|
|---|
|basicPayment: Double|
|tax: Double|
|totalPayment: Double|

#### Services - Interface Aluguel de carro 1

|RentalServices|
|---|
|pricePerHour: Double|
|pricePerDay: Double|
|processInvoice(carRental: CarRental): void|

|BrazilTaxService|
|---|
|tax(amount: Double): Double|

#### Exemplos - Interface Aluguel de carro 1

```shell
Enter rental data
Car model: Civic
Pickup (dd/MM/yyyy hh:mm): 25/06/2018 10:30
Return (dd/MM/yyyy hh:mm): 25/06/2018 14:40
Enter price per hour: 10.00
Enter price per day: 130.00
INVOICE:
Basic payment: 50.00
Tax: 10.00
Total payment: 60.00
```

```shell
Enter rental data
Car model: Civic
Pickup (dd/MM/yyyy hh:mm): 25/06/2018 10:30
Return (dd/MM/yyyy hh:mm): 27/06/2018 11:40
Enter price per hour: 10.00
Enter price per day: 130.00
INVOICE:
Basic payment: 390.00
Tax: 58.50
Total payment: 448.50
```
