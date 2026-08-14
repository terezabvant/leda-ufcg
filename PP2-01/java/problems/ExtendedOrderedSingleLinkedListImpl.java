package problems;

import java.util.Comparator;

import adt.linkedList.LinkedList;
import adt.linkedList.SingleLinkedListNode;

/**
 * Para testar essa classe voce deve implementar seu comparador. Primeiro
 * implemente todos os métodos requeridos. Depois implemente dois comparadores
 * (com idéias opostas) e teste sua classe com eles. Dependendo do comparador
 * que você utilizar a lista funcionar como ascendente ou descendente, mas a
 * implemntação dos métodos é independente disso.
 * 
 * IMPORTANTE: A LISTA PODE TER ELEMENTOS DUPLICADOS. 
 */
public class ExtendedOrderedSingleLinkedListImpl<T extends Comparable<T>> implements
		LinkedList<T> {

	protected SingleLinkedListNode<T> head;
	protected Comparator<T> comparator;

	public ExtendedOrderedSingleLinkedListImpl(Comparator<T> comparator) {
		this.head = new SingleLinkedListNode<T>();
		this.comparator = comparator;
	}


	/*
	 * Restrições:
	 * - A não observação de qualquer restrição abaixo anulará a nota de testes.
	 * - O uso de memória extra de seu algoritmo deve ser O(1)
     * - O tempo de seu algoritmo deve ser O(k.N), onde k = 1.
	 * - A inserção de elementos duplicados deve ser feita como a PRIMEIRA ocorrencia. 
	 *   Por exemplo, considere duas ocorrências do elemento 7, sendo 7 e 7'. 
	 *   Embora eles representem o mesmo valor, são considerados objetos diferentes que 
	 *   estarão duplicados na lista. Suponha que voce tem a lista:
	 *   L = 2 -> 4 -> 5 -> 7 -> 9 -> 11 -> NIL
	 *   e deseja inserir uma nova ocorrencia do 7 (7'). O efeito dessa inserção seria:
	 *   L = 2 -> 4 -> 5 -> 7' -> 7 -> 9 -> 11 -> NIL
	 * 
     * - Voce NÃO pode usar recursão
     * - Você NÃO pode declarar atributos na classe
     * - Você NÃO pode usar return em métodos void
     * - Você NÃO pode usar mais de um return em métodos que retornam algum valor
     * - Você NÃO pode usar comandos break ou continue
	 * - Você NÃO pode usar o comando ternário: cond?exp1:exp2
     * - Você NÃO pode implementar método auxiliar para usar neste método.
	 * - Qualquer comparação entre objetos to tipo T DEVE ser feita pelo comparator.
	 * - Você NÃO pode olhar para o próximo elemento (node.getNext()) em condições de comandos de decisão
	 *   nem em condições de laços.
     **/
	@Override
	public void insert(T element) {
		if(element != null){
			SingleLinkedListNode<T> data = new SingleLinkedListNode<>();
			SingleLinkedListNode<T> next = null;
			
			if(!this.head.isNIL()){
				
				next = data.getNext();
				//data.setNext()
				


			}else{
				this.head = data;
				next = data.getNext();
			
			}

		}
	}

	// trabalhar com dois apontadores, ok 
	// não preciso apontar a primeira possição pra head 
	// enquanto o próximo é diferente de nil eu avanço e aponto, verifico se eh maior ou igual 
	// se for ascedente trabalho com 2 ponteiros, certo?! e se for descendentes trabalho com 3 (?)
	/*
	 * Restrições:
	 * - A não observação de qualquer restrição abaixo anulará a nota de testes.
	 * - O uso de memória extra de seu algoritmo deve ser O(1)
     * - O tempo de seu algoritmo deve ser O(k.N), onde k = 1.
	 * - A remoção deve eliminar a ÚLTIMA ocorrência do elemento a ser removido.
	 *   Por exemplo, considere a lista com duas ocorrências do 7: 7 e 7'. 
	 *   L = 2 -> 4 -> 5 -> 7' -> 7 -> 9 -> 11 -> NIL
	 *   Ao remover o 7 da lista, o resultado seria:
	 *   L = 2 -> 4 -> 5 -> 7' -> 9 -> 11 -> NIL
	 *   
	 *   Obviamente, se houver apenas uma ocorrência do elemento, ela será removida. 
	 * 
     * - Voce NÃO pode usar recursão
     * - Você NÃO pode declarar atributos na classe
     * - Você NÃO pode usar return em métodos void
     * - Você NÃO pode usar mais de um return em métodos que retornam algum valor
     * - Você NÃO pode usar comandos break ou continue
	 * - Você NÃO pode usar o comando ternário: cond?exp1:exp2
     * - Você NÃO pode implementar método auxiliar para usar neste método.
	 * - Qualquer comparação entre objetos to tipo T DEVE ser feita pelo comparator.
     **/
	@Override
	public void remove(T element) {
		if(element != null){
			if(!this.head.isNIL()){

			}

		}



		
		
	}
	// caso base : ter só um elemento, removo 

	// NAO REMOVA NEM MODIFIQUE OS MÉTODOS ABAIXO. OS QUE SERÃO TESTADOS JÁ ESTÃO IMPLEMENTADOS
	public SingleLinkedListNode<T> getHead(){
		return this.head;
	}

	@Override
	public boolean isEmpty() {
		return this.isEmpty();
	}

	@Override
	public int size() {
		// TODO NAO PRECISA IMPLEMENTAR ESTE MÉTODO, POIS ELE NÃO SERÁ TESTADO
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public T search(T element) {
		// TODO NAO PRECISA IMPLEMENTAR ESTE MÉTODO, POIS ELE NÃO SERÁ TESTADO
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public T[] toArray() {
		// TODO NAO PRECISA IMPLEMENTAR ESTE MÉTODO, POIS ELE NÃO SERÁ TESTADO
		throw new UnsupportedOperationException("Not implemented yet!");
	}
}
