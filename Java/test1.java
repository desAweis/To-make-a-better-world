package com.day2;
public class test1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int s1 = 1, s2 = 1, s, month = 24;
        System.out.println("第1个月的兔子总数：\t"+1);
        System.out.println("第2个月的兔子总数：\t"+1);
        for(int i = 3; i <= month; i++)
        {
            //每个月的兔子总数是前两个月的总和
            s = s2;
            s2 += s1;
            s1 = s;
            System.out.println("第"+i+"个月的兔子总数：\t"+s2);
        }
        
    }

}
