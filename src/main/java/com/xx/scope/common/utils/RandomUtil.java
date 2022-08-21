package com.xx.scope.common.utils;

import java.util.Random;
import org.apache.commons.lang3.RandomUtils;

/**
 * 随机数工具类
 */
public class RandomUtil {
    /**
     * 生成0-max的随机数并返回
     * @param max 最大值
     */
    public static int getRandomInt(int max) {
        Random random = new Random();
        int intRandowm = random.nextInt(max);
        return intRandowm;
     }

    //length用户要求产生字符串的长度

    /**
     * 从指定的字符串里随机取出字符组成字符串返回
     * @param str 字符串
     * @param length 要取出的字符串长度
     * @return
     */
    public static String getRandomString(String str,int length){
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        System.out.println(str.length());
        for(int i=0;i<length;i++){
            int number=random.nextInt(str.length());
            char c = str.charAt(number);
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args){
//        String jmsht = getRandomString("JMSHT", 5);
//        char[] chars = a.toCharArray();
//        System.out.println(chars.length);
        int jin,mu,shui,huo,tu = 0;
//        Random random = new Random();
//        int intRandowm = random.nextInt(1);
        int num1 = 1;
        int num2 = 1;
//        int n=num1+(int)(Math.random()*(num2-num1));
//        System.out.println(Math.random()*3);
        Integer i22 = null;
            int i1 = RandomUtils.nextInt(1, 2);

                System.out.println(i22+1);

    }

}
