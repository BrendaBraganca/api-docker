# APIs com Docker

Esse projeto foi feito usando os comando de GET, POST e DELETE para obter informações de nossos conteineres e das imangens docker. Nele podemos criar, listar, parar e encerrar os conteineres. Abaixo seguem as instruções para realizar as requisições em seu software de preferência.

## GET - containers sem filtro
`http://localhost:8080/api/containeres?all=true`

## GET - images
`http://localhost:8080/api/images`

## POST - start

`http://localhost:8080/api/containeres/{id-do-seu-container}/start`

## Post - stop

`http://localhost:8080/api/containeres/{id-do-seu-container}/stop`

## Delete

`http://localhost:8080/api/containeres/{id-do-seu-container}`

