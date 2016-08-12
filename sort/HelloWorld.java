package com.imooc.text;






public class HelloWorld {
    
    //完成 main 方法
    public static void main(String[] args) {
        int[] scores = {89,-23,64,91,119,52,73};
        HelloWorld hello = new HelloWorld();    
        System.out.println("考试成绩的前三名为：");    
        hello.sort(scores);
    }
    
    //定义方法完成成绩排序并输出前三名的功能
    public void sort(int[] scores)
    {
        int temp,count = 0;
        for(int i = 0;i < scores.length - 1;i++)
        {
            for(int j =0;j < scores.length - 1 - i;j++)
            {
                if(scores[j] < scores[j + 1])
                {
                    temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
//        for (int num :scores){
//        	System.out.println(num);
//        }
        for(int k = 0;count < 3;k++)
        {
            if(scores[k] >= 0 && scores[k] <= 100)
            {
                System.out.println(scores[k]);
                count++;
            }
        }
    }
    
    
    
    
    
    
    
    
}