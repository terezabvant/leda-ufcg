package problems;

/**
 * 
 * Dado um array ordenado de elementos comparaveis, com elementos possivelmente repetidos,
 * e um outro elemento x comparavel, podendo pertencer ao array ou não, implemente o metodo 
 * que retorne o índice da última ocorrência de x no array ou -1 se ele não pertencer ao array. 
 * Exemplo: A = [2,3,3,3,3,3,3,3,3,4,5,8,10]
 * lasIndexOf(A,3) = 8
 * lasIndexOf(A,8) = 11
 * lastIndexOf(A,6) = -1
 * 
 * Restricoes:
 * - Seu algoritmo DEVE ter complexidade O(k.log.n), onde k = 1
 * - Você NÃO pode usar memoria extra. O uso de memória extra deve ser O(1)
 * - Você NÃO pode usar metodos prontos da biblioteca de arrays (exceto o metodo length)
 * - Voce DEVE usar recursão
 * - Você NÃO pode declarar atributos novos na classe
 * - Você PODE modificar apenas a classe que implementa esta interface
 * - Você PODE implementar no máximo 1 método auxiliar, com, no máximo 4 parâmetros
 * - Você NÃO pode usar return em métodos void
 * - Você NÃO PODE usar break para quebrar laços/repetições ou qualquer processamento
 * - Você NÃO pode usar o comando ternário cond?exp1:exp2
 * - Assuma que o array não tem elementos nulos dentro dele
 * - Você DEVE limitar seus blocos de código entre { e }. Para usso use o formatador da ferramenta
 * - Qualquer violação das restrições acima implica na nulidade da nota de testes.
 *
 * @param <T>
 */
public interface LastIndexOf<T extends Comparable<T>> {
	public int lastIndexOf(T[] array, T elem);
}
