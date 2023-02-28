# 📁 COLLECTION FRAMEWORK

    🔓 COLLECTION: é um objeto que agrupa múltiplos elementos (variáveis primitivas ou objeto)
    dentro de uma única unidade, armazena e processa conjunto de dados de forma eficiente.

## 📌 LIST (java.util.list) 

    - Elementos dublicados e garante ordem de inserção
    - ArrayList deve ser usado onde mais operações de pesquisa são necessárias e LinkedList
    dever ser usado onde mais operações de inserções e exclusão são necessárias;

## 📌 SET (java.util.set)

    - Não permite elementos dublicados, não tem índece

## 📌 MAP (java.util.Map)

    - Elementos únicos (key) para cada valor (value)

## 📌 STREAM API

    Classe Anônima: A classe anônima é uma classe que não recebeu um nome e é declarado e instanciado
    em uma única instrução. Considere o uso de uma classe anônima sempre que você precisa para criar
    uma classe que será instanciado apenas uma vez.

    Functional Interface: Interface com um SAM(Singel Abstract Method) é uma interface funcional e sua 
    implementação pode ser tratada como expressões lambda.

    Lambda: Lambda é uma função sem declaração, não é necessário colocar um nome, tipo retorno e o modificador
    de acesso. A ideia é que método seja declarado no mesmo lugar em que vai ser usada. Lambda em java tem a 
    sintaxe definida como (argumento) -> (corpo).

    Reference Method: É o um recurso do java 8 que permite fazer referência a um método ou construtor de uma
    classe e indicar que ele deve ser utilizado num ponto específico do código, deixando mais simples e legível.
    Basta informar uma classe ou referência seguida do símbolo "::" e o nome do método sem os parênteses no final.

    Streams API: Streams API traz uma nova opção para a manpulação de coleções em java seguindo os princípios da
    progromação funcional. Com as expressões lambda, ela proporciona uma forma diferente de lidar conjutos de 
    elemetos oferecendo ao desenvolvedor uma maneira simples e concisa de escrever código que facilita a manutenção
    e paralelização sem efeitos indesejados em tempo de execução.

