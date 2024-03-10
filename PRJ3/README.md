# Ordem de pedido do cliente

Ler os dados de um pedido com N itens(fornecido pelo usuário). Depois, mostrar um sumário do pedido conforme exemplo. Nota: o instante do pedido deve ser o instante atual.

## Desenho

### Enum

| OrderStatus |
|---|
| PENDING_PAYMENT : int=0 |
| PROCESSING : int=1 |
| SHIPPED : int=2 |
| DELIVERED : int=3 |

### Class

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

## Exemplo

```bash
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
