package sorting.linearSorting;

import sorting.AbstractSorting;

import java.util.Arrays;

/**
 * Classe que implementa a estratégia de Counting Sort vista em sala.
 *
 * Procure evitar desperdício de memória: AO INVÉS de alocar o array de contadores
 * com um tamanho arbitrariamente grande (por exemplo, com o maior valor de entrada possível),
 * aloque este array com o tamanho sendo o máximo inteiro presente no array a ser ordenado.
 *
 * Seu algoritmo deve assumir que o array de entrada nao possui numeros negativos,
 * ou seja, possui apenas numeros inteiros positivos e o zero.
 *
 */
public class CountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] array, int leftIndex, int rightIndex) {
		
		if ( array == null || array.length <=1){
		}
		else if (leftIndex > rightIndex || rightIndex > array.length - 1) {
		}
		else if (leftIndex < 0 || rightIndex < 0) {
			
		}else {
			int maiorIndicie = array[leftIndex];
			for(int i = leftIndex + 1; i <= rightIndex; i++){

				if(array[1].compareTo(maiorIndicie)>0){
					maiorIndicie = array[i];

				}

			}
			int [] arraya = new int [maiorIndicie + 1];
			for (int j = leftIndex; j <= rightIndex; j ++){

				int index = array[j];
				arraya[index]++;
			}

			Integer [] arrayb = Arrays.copyOf(array, array.length);
			for (int x = 1; x < arrayb.length; x++) {

				arrayb[x] += array[x - 1];
			}
			for (int k = rightIndex; k >= leftIndex; k--) {

				int n = arrayb[k];
				int indicie  = --arraya[n] + leftIndex;

				array[indicie] = n;
				
			}

			}

	}


	}


