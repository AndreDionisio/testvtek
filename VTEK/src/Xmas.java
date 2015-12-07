import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Xmas {
	
	public Xmas() {
		// TODO Auto-generated constructor stub
	}
	
	private List<Integer> way = new ArrayList<Integer>();
	
	public List<Integer> path(Map<Integer, List<Integer>> map, int begin, int end) {
		if (map.containsKey(begin)) {
			List<Integer> nodes = new ArrayList(map.get(begin));
			if (nodes.contains(end)) {
				way.add(begin);
				way.add(end);
				return way;
			} else {
				way.add(begin);
				map.remove(begin);
				for (Integer node : nodes) {
					path(map, node, end);
				}
				map.put(begin, nodes);
			}
			
		} else {
			if (way.size() - 1 > -1)
				way.remove(way.size() - 1);
		}
		return way;
	}
	
}
