package Week03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。

 示例:

 输入: [1,2,3]
 输出:
 [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/permutations
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FullPermutation {

    static List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> ans = new LinkedList<>();
        dfs(nums, ans);
        return res;
    }

    public static void dfs(int[] nums, LinkedList<Integer> result) {
        if (result.size() == nums.length) {
            res.add(new LinkedList<>(result));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (result.contains(nums[i])) {
                continue;
            }
            result.add(nums[i]);
            dfs(nums, result);
            result.removeLast();
        }
    }

}
