import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	// Escreva um programa que, dado uma lista de números e
	// uma soma alvo,
	// retorne todas as combinações de um ou mais itens
	// da lista que a soma seja
	// igual a soma alvo.
	
	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	private static final int[] GIVEN = { 1, 2, 3, 4, 6,20,12,6 };
	
	
	
	public static void main(String[] args) {
		new SumsEqualTarget().find(GIVEN, 20);
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		List<Integer> one = new ArrayList<Integer>();
		List<Integer> two = new ArrayList<Integer>();
		List<Integer> tree = new ArrayList<Integer>();
			
			one.add(2);
			one.add(3);
			two.add(4);
			tree.add(5);
			
			map.put(1, one);
			map.put(2, two);
			map.put(3, tree);
		
		System.out.print( new Xmas().path(map, 1, 5));
	}
	
	/*
	 * Fazer um programa que encontra um caminho a partir de uma origem até o
	 * destino navegando entre os nós. Cada nó é representado por um número
	 * inteiro. Cada possibilidade de caminho é representado por um dicionário
	 * no formato (Inteiro -> Lista( Inteiros)), onde a chave é o número do nó,
	 * e a lista são as ligações unidirecional daquele nó. O resultado é uma
	 * lista de inteiros representando o caminho pelos nós.
	 * 
	 * Exemplo:
	 * 
	 * Entrada: origem: 1, destino: 4,
	 * 
	 * caminhos: ( 1 -> (2, 3), 2 -> (4), 3->(5) )
	 * 
	 * Saída: (1, 2, 4)
	 */
}
