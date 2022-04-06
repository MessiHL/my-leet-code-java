package offer.m04;

/*
在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
示例:

现有矩阵 matrix 如下：
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]

给定 target = 5，返回 true。
给定 target = 20，返回 false。
 */
public class FindNumberIn2DArray {
    /*
    从二维数组的右上角开始查找。如果当前元素等于目标值，则返回 true。
    如果当前元素大于目标值，则移到左边一列。如果当前元素小于目标值，则移到下边一行。
     */
    public boolean solution1(int nums[][],int target){
        int rows = nums.length, columns= nums[0].length;
        int column = columns-1 ,row = 0;
        while (row<rows&&column>=0){
            // 右上角开始
            int num = nums[row][column];
            if(num == target){
                System.out.println("row:"+row+"; column:"+column);
                return true;
            } else if(num>target){
                column--; // 左移一列
            } else {
                row++; // 下移一行
            }
        }

        return false;
    }
}
