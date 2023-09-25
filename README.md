# PooSolid

1 - Elabore uma classe Conta Bancária com os seguintes atributos: nomeCliente numConta saldo E os seguintes métodos: sacar (o saldo não pode ficar negativo) depositar Crie também duas subclasses chamadas ContaPoupanca e ContaEspecial, com as seguintes características: 
ContaPoupanca atributo diaRendimento método calcularNovoSaldo, recebe taxa de rendimento da poupaça e atualiza o saldo ContaEspecial atributo limite sobrescreva o método sacar com a nova lógica necessária Crie uma classe Teste que contenha a
seguinte lógica: Criar contas Sacar um valor das contas Depositar Mostrar um novo saldo a partir de um rendimento Mostrar os dados da conta do cliente 
 
2 - Nosso banco precisa tributar dinheiro de alguns bens que nossos clientes possuem. Para isso, vamos criar uma interface para o cálculo dos tributos. Lemos essa interface da seguinte maneira: "todos que quiserem ser tributáveis precisam saber calcular tributos, 
devolvendo um double". Alguns bens são tributáveis e outros não, a. ContaPoupanca não é tributável b. já para ContaCorrente você precisa pagar 1% da conta c. SeguroDeVida tem uma taxa fixa de 42 reais.
Escreva classes que implementam esta interface e calcule o tributo de acordo com a regra de negócio acima. 
 
3 - Criar um dicionário que representa os objetos e suas cores. Para isso, o dicionário deverá ter como chave String e como valor uma lista de Strings. Exemplo dos valores: bola -> azul boneca -> amarela dado -> rosa Em seguida crie um arquivo com seu método main,
imprimir no Main todas as chaves junto com seus valores associados. Para isso, utilize o foreach com as chaves. 

4 Um animal contém nome, comprimento, número de patas (padrão é 4), cor, ambiente e velocidade (em m/s). Um peixe é um animal, tem 0 patas, seu ambiente é o mar (padrão), cor cinzenta (padrão). Além disso tem como características barbatanas e cauda. 
Um mamífero é um animal e seu ambiente padrão é terra. Um urso é um mamífero, cor castanho e seu alimento preferido é o mel. Crie as classes Animal, Peixe e Mamífero. Para a classe Animal, coloque os atributos: Nome Comprimento NumPatas Cor Ambiente 
Velocidade Para a classe Peixe, codifique o atributo características. Para a classe Mamífero, coloque o atributo alimento. Por último, crie uma classe main de forma a ter um jardim zoológico com os seguintes animais: camelo, tubarão, urso-do-canadá, iguana, leão, mico-leão-dourado.
