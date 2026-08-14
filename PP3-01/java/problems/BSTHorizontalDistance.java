package problems;

import adt.bst.BST;

/**
 * Interface definindo metodos para calcular a distancia horizontal de um dado na árvore.
 **/
public interface BSTHorizontalDistance<T extends Comparable<T>> extends BST<T> {
    
    /**
     * A distancia horizontal de um elemento na árvore representa quantas posições 
     * laterais (à esquerda e direita) da raiz o nó está. Um movimento para 
     * a esquerda representa -1 na distância horizontal e um movimento para 
     * a direita representa +1 na distancia horizontal. Dessa forma, essa computação 
     * de movimentos até encontrar o nó produz a distância horizontal desse nó.
     * Caso o valor não pertença a árvore, a distância horizontal é considerada infinita.
     * Considere a seguinte árvore, por exemplo:
     * 
     *          5
     *         / \
     *        3   8
     *       / \
     *      1   4
     * 
     *  A distancia horizontal de 3 é -1 porque, a partir da raiz, é preciso dar um passo 
     *  para a esquerda (-1) na árvore para encontrar o 3
     *  A distancia horizontal de 1 é -2 porque, a partir da raiz, é preciso dar dois passos 
     *  para a esquerda na árvore para encontrar o 1
     *  A distancia horizontal de 4 é 0 porque, a partir da raiz, é preciso dar um passo 
     *  para a esquerda (-1) e outro para a direita (+1) na árvore para encontrar o 4. Note 
     *  que, se traçarmos uma linha vertical na raiz, o 4 está exatamente abaixo do 5.  
     *  A distancia horizontal de 5 é 0 porque, a partir da raiz, não é preciso dar 
     *  passo algum para encontrar o 5. 
     *  A distancia horizontal de 8 é 1 porque, a partir da raiz, é preciso dar um passo
     *  para a direita (+1) para encontrar o 8. 
     *  A distancia horizontal de 25 é Integer.MAX_VALUE porque ele não será encontrado 
     *  na árvore. 
     * 
     * Restricoes:
     * - Voce DEVE usar recursão na sua implementação
     * - Voce NÃO pode usar nenhuma estrutura auxiliar. Seu uso de memória DEVE ser O(1)
     * - Voce NÃO pode converter a BST em nenhuma outra estrutura e depois tentar resolver 
     *   seu problema usando essa estrutura
     * - Voce pode ter apenas UM método auxiliar que DEVE ter no máximo 2 parâmetros
     * - Sua implementação DEVE ser O(k.log N) onde k = 1!
     * - Você NÃO pode criar atributos de classe
     * - Você NÃO pode usar return em método void
     * - Você NÃO pode usar mais de um return em métodos que retornam algum valor
     * - Voce pode reusar APENAS o método getRoot() herdado da implementação de BST
     * - Voce pode usar livremente a classe BSTNode e os métodos dela em sua implementação
     *   mas voce NÃO pode modifica-la. 
     * - Você NÃO pode usar o comando ternário exp?valor1:valor2
     * - Caso voce precise representar um número infinito, use Integer.MAX_VALUE guardando o mesmo em 
     *   alguma variável. Por exemplo, 
     *      Integer infinito = Integer.MAX_VALUE;
     **/
    public int horizontalDistance(T elem);
    
}
