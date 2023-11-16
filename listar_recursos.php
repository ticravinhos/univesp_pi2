<?php
$data = '[
    {
        "id": 1,
        "descricao": "Agua",
        "tipo": "DESPESA",
        "categoria": "Moradia",
        "valor": "30.25"
    },
    {
        "id": 2,
        "descricao": "Luz",
        "tipo": "DESPESA",
        "categoria": "Moradia",
        "valor": "122.38"
    },
    {
        "id": 3,
        "descricao": "Escritorio",
        "tipo": "RECEITA",
        "categoria": "Salario",
        "valor": "2010.99"
    },
    {
        "id": 4,
        "descricao": "Aluguel",
        "tipo": "DESPESA",
        "categoria": "Moradia",
        "valor": "650.00"
    },
    {
        "id": 5,
        "descricao": "Mercado",
        "tipo": "DESPESA",
        "categoria": "Alimentacao",
        "valor": "430.00"
    },
    {
        "id": 6,
        "descricao": "Celular",
        "tipo": "DESPESA",
        "categoria": "Telecomunicacao",
        "valor": "99.00"
    },
    {
        "id": 7,
        "descricao": "Onibus",
        "tipo": "DESPESA",
        "categoria": "Transporte",
        "valor": "247.55"
    }
]';
$myJSON = json_encode($data);
echo $myJSON;
?>