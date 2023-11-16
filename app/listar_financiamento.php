<?php
$data = '[
    {
        "id": 1,
        "descricao": "FIES",
        "parcelas": "48",
        "valor": "399.85"
    }
]';
$myJSON = json_encode($data);
echo $myJSON;
?>