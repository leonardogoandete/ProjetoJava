# ProjetoJava

#Testes a serem efetuados:
usuario faz solicitações de itens que tem em estoque, que ele está
autorizado a solicitar e que ele ainda tem cota:

~~5.1) usuario faz solicitação (numPedido=1), com apenas um item.~~

~~5.2) usuario faz solicitação (numPedido=3), com 3 itens.~~

5.3) usuario tenta retirar pedido 1 (não passa, pois ainda não foi autorizado).

5.4) usuario tenta retirar pedido 3 (não passa, pois ainda não foi autorizado).

5.5) supervisor autoriza pedido 1.

5.6) usuario tenta retirar pedido 3 (não passa).

5.7) usuario tenta retirar pedido 1.

5.8) supervisor reprova pedido 3.

5.9) usuario tenta retirar pedido 3 (não passa).

#Usuario faz solicitações inválidas:
5.10) usuario faz solicitação (numPedido=4) excedendo sua cota.

5.11) usuario faz solicitação (ou tenta) de item que ele não está autorizado.

5.12) usuario solicita item que não tem em estoque.

Obs.: testar se os pedidos reprovados não são contabilizados na cota do usuario.

# Funcionalidades (Telas) a serem implementadas na aplicação:
5.13) Usuario faz uma solicitação com um ou mais itens.

5.14) Para um usuario, listar todas as suas solicitações e os itens da
solicitação.