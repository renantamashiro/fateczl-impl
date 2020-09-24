# Exercício 1


## Recursividade direta
Recursividade direta se refere à função que chama ela mesma para execução de uma determinada tarefa. O comportamento da função é definido por um caso base em que a cada chamada recursiva (a chamada da própria função) este caso base é simplificado de forma incremental.


## Recursividade indireta
Diferentemente da recursividade direta, a indireta chama outra função recursiva para executar uma série de comandos, dentre esses comandos, a chamada da função originária. A forma da função continua a mesma: O comportamento da função é definido por um caso base em que a cada chamada recursiva (no caso a chamada de outra função) este caso base é simplificado de forma incremental.


## Divisão e conquista
Se refere à algoritmos que dividem o problema em subproblemas de mesmo tamanho e os resolvem de modo recursivo. Por fim, combinam os resultados para construir a solução do problema original.



## Busca binária e busca sequencial
A busca binária é um algoritmo de busca de complexidade O(n/2) para vetores ordenados. Com este algoritmo, podemos buscar elementos em um vetor de modo mais rápido que um algoritmo de busca sequencial, pois, enquanto este último percorre cada elemento para realizar a busca (O(n)), a busca binária divide o vetor em duas partes e verifica, para o elemento que está na metade, as seguintes condições:

* Se o elemento é igual ao valor buscado;
* Caso não seja e for maior que o elemento buscado o algoritmo utilizará a segunda metade do vetor para efetuar o mesmo procedimento;
* Por outro lado, caso não seja igual e for menor que o elemento buscado, o algoritmo utilizará a primeira metade do vetor para efetuar o mesmo procedimento.
