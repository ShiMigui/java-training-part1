# Interface Aluguel de carro

Uma locadora brasileira de carros cobra um valor por hora para as locações de até 12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação será cobrada com base em um valor diário. Além do valor de locação é acrescido no preço o valor de imposto conforme regras do país que, no caso do Brasil, é 20% para valores até 100.00, ou 15% para valores acima desse. Fazer um programa que lê os dados da locação (modelo do carro, instante inicial e final da locação), bem como o valor por hora e o valor diário de locação. O programa deve então gerar a nota de pagamento (contendo valor da locação, valor do imposto e valor total do pagamento) e informar os dados na tela. Veja os exemplos.

## Entidades - Interface Aluguel de carro

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

## Services - Interface Aluguel de carro

|RentalServices|
|---|
|pricePerHour: Double|
|pricePerDay: Double|
|processInvoice(carRental: CarRental): void|

|\<\<interface>> *TaxService*|
|---|
|*tax(amount: Double): Double*|

|BrazilTaxService|
|---|
|tax(amount: Double): Double|

## Exemplos

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
