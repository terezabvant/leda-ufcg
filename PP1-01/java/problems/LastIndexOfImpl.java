package problems;


public class LastIndexOfImpl<T extends Comparable<T>>  implements LastIndexOf<T>{
	
	public int lastIndexOf(T[] array, T elem){
		return bs(array,elem,0,array.length-1);
	}
	private int bs(T[] array, T elem, int l, int r){
		int result = -1;
		if(l <= r){
			int m = (l + r) / 2;
			if(array[m].compareTo(elem) == 0){
				result = m;
				int aux = bs(array, elem, m + 1, r);
				if (aux != -1){
					result = aux;
				}
			}else if (array[m].compareTo(elem) > 0){
				result = bs(array, elem, l, m -1);
			}else{
				result = bs(array, elem, m + 1, r);
			}

		}

		return result;
	}
}
