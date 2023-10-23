<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Novo aluno</title>
</head>
<body>
    <h1>Novo Aluno</h1>
    <form action="/aluno/insert" method="post">
        <label for="">Nome</label>
        <input type="text" name="nome" id="">
        <label for="">Idade</label>
        <input type="number" name="idade" id="">
        <button type="submit">Salvar</button>
    </form>
</body>
</html>