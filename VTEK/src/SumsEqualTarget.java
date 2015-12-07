import java.util.Arrays;
import java.util.Stack;

public class SumsEqualTarget {
	
	private Stack<Integer> stack = new Stack<Integer>();
	
	private int sum = 0;
	
	public void find(int[] given, int target) {
		if (given != null) {
			Arrays.sort(given);
			find(given, 0, given.length, target);
		}
	}
	
	public void find(int[] given, int from, int end, int target) {
		
		
		if (sum >= target) {
			if (sum == target) {
				print(stack, target);
			}
			return;
		}
		for (int current = from; current < end; current++) {
			
			if (sum + given[current] <= target) {
				stack.push(given[current]);
				sum += given[current];
				find(given, current + 1, end, target);
				sum -= (Integer) stack.pop();
			}
		}
	}
	
	private void print(Stack<Integer> stack, int target) {
		StringBuilder sb = new StringBuilder();
		sb.append(target).append(" = (");
		for (Integer i : stack) {
			sb.append(i).append("+");
		}
		System.out.println(sb.deleteCharAt(sb.length() - 1).append(")").toString());
	}
	
}
