/**
 * 找出陣列中任意3個值合計為0的組合，並全部列出來
 */
import java.util.*;
public class Threesum {
	public static void main(String []args){
		Solution Solution = new Solution();
		int [] num ={-1, 0, 1, 2, -1, -4,-1, 0, 1, 2, -1, -4};
	//	int [] num ={0, 0, 0, 0};
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
		result.addAll(Solution.threeSum(num));
		System.out.println(result);
	}
}
