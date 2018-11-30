import java.util.ArrayList;
import java.util.Random;

/**
 * @author Li Ersan
 */
public class Main1 {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        Random random = new Random();

        int n = 1000;

        for (int i = 0; i < n; i++) {
            bst.add(random.nextInt(10000));
        }

        ArrayList<Integer> nums = new ArrayList<>();
        while (!bst.isEmpty()) {
            nums.add(bst.removeMin());
        }

        System.out.println(nums);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) > nums.get(i)) {
                throw new IllegalArgumentException("出错了！");
            }
        }
        System.out.println("完成测试");

        for (int i = 0; i < n; i++) {
            bst.add(random.nextInt(10000));
        }
        nums = new ArrayList<>();
        while (!bst.isEmpty()) {
            nums.add(bst.removeMax());
        }

        System.out.println(nums);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) < nums.get(i)) {
                throw new IllegalArgumentException("出错了！");
            }
        }
        System.out.println("完成测试");
    }
}
