# Exercício 1


## Lista Estática
Arranjo simples de alocação estática de memória em que os elementos são organizados um após o outro e de tamanho previamente estabelecido

#### Simulações
![lista-encadeada](https://github.com/renantamashiro/fateczl-impl/blob/master/data-structures/java/atividade1/diagrams/lista-encadeada.png)

## Lista Circular
Mesma definição da lista estática, entretanto, o último elemento possui uma ligação com o primeiro da lista. Dessa forma, caso um elemento seja removido da lista, não ocorre a realocação das posições dos outros elementos, e a posição do elemento removido ficará disponível para inserção de novos dados.

#### Simulações
![lista-circular](https://github.com/renantamashiro/fateczl-impl/blob/master/data-structures/java/atividade1/diagrams/lista-circular.png)

## Pilha
Estrutura de dados embasada no conceito do Último que entra Primeiro que sai (LIFO). Assim, a inserção e remoção de dados dessa estrutura são realizadas em apenas uma extremidade.

#### Simulações
![pilha](https://github.com/renantamashiro/fateczl-impl/blob/master/data-structures/java/atividade1/diagrams/pilha.png)

## Fila de Prioridades
Estrutura de dados baseada no conceito de Primeiro que entra Primeiro que sai (FIFO). Os dados são movimentados, restritamente, apenas nas duas extremidas da estrutura, ou seja, a inserção dos elementos ocorre apenas no final da fila e a remoção no início. Em caso de remoção, todos os registros deverão ser movimentados.

#### Simulações
![fila-prioridades](https://github.com/renantamashiro/fateczl-impl/blob/master/data-structures/java/atividade1/diagrams/fila-prioridades.png)

## Fila Circular
Utiliza o mesmo conceito da Fila de prioridades, entretanto, permite que qualquer elemento em uma determinada posição seja removido, assim, essa posição ficará vazia e disponível para inserçao de um novo elemento. Nessa operação, os outros registros permanecem em suas posições e não ocorre qualquer movimentação.

#### Simulações
![fila-circular](https://github.com/renantamashiro/fateczl-impl/blob/master/data-structures/java/atividade1/diagrams/fila-circular.png)

## Lista Ligada
Estrutura de dados organizada de forma linear e dinâmica. Os elementos de uma lista ligada possuem uma relação de ordem, pois indicam qual é o próximo elemento. Além disso, essa estrutura é dinâmica, uma vez que a alocação de memória é feita em tempo de execução e inexiste limitação de tamanho da estrutura (a limitação é memória física)

#### Simulações
![lista-ligada](https://github.com/renantamashiro/fateczl-impl/blob/master/data-structures/java/atividade1/diagrams/lista-encadeada.png)
