import java.util.*;
public class estttt {
	public static List<String> removeAllWrong(String target,
			List<String> list) {
			for(int k=0; k < list.size(); k++) {
			String w = list.get(k);
			if (w.equals(target)) {
			list.remove(k);
			}
			}
			return list;
			}
	public static void main(String[] args) {
		String target="cat";
		String[] values = {"cat", "cat", "mom", "dad" };
		List<String> list = Arrays.asList(values);
		System.out.println(removeAllWrong(target, list));

	}

}
