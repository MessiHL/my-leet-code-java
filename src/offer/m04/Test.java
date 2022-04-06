package offer.m04;

public class Test {
    public static void main(String[] args) {
        int nums[][] = {
            {1,   4,  7, 11, 15},
            {2,   5,  8, 12, 19},
            {3,   6,  9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        FindNumberIn2DArray tool = new FindNumberIn2DArray();
        boolean flag =  tool.solution1(nums,16);
        System.out.println(flag);
    }
}
