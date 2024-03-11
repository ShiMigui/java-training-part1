# Exceptions - Reserva de hotel

Fazer programa para ler os dados de uma reserva de hotel (número do quarto, data de entrada e saída) mostrá-los na tela, inclusive duração em dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, mostrar novamente a reserva com os dados atualizados. O prorama não deve aceitar dados inválidos para a reserva, conforme as seguintes regras:

- Alterações de reserva podem ser feitas apenas para datas futuras
- A data de saída deve ser maior que a data de entrada

## Desenho

|Reservation|
|---|
|roomNumber: Integer|
|checkin: Date|
|checkout: Date|
|duration(): Integer|
|updateDates(checkin: Date, checkou: Date): void|
