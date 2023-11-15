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
    }
]';
$myJSON = json_encode($data);
echo $myJSON;
?>