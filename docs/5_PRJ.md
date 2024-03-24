
# Taxa de produtos

Correção do professor: [clique aqui](https://github.com/acenelio/inheritance5-java)

Fazer um programa para ler os dados de N produtos(fornecidos pelo usuário). Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.

Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados possuem uma data de fabricação. Estes dados especificos devem ser acrescentados na etiqueda de preço conforme exemplo (abaixo). Para produtos importados, a taxa e o produto deve ser acrescentada ao preço final do produto.

Favor implementar o programa conforme projeto ao lado.

## Desenho

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

## Exemplos

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
