package offer.m05;

/*
剑指 Offer 05. 替换空格
 */
public class ReplaceSpace {
    public String solution(String src){
        StringBuilder res = new StringBuilder();
        for(Character c:src.toCharArray()){
            if(c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }
}
