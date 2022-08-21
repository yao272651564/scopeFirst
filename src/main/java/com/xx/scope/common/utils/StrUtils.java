package com.xx.scope.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrUtils {
        private static Logger logger = LoggerFactory.getLogger(StrUtils.class);

        /**
         *  集合转字符串
         * @param strList 字符串集合
         * @param separateStr 分隔符
         * @return String
         */

        public static String jointStr(List<String> strList, String separateStr){
            StringBuffer join = new StringBuffer();
            for (String str : strList) {
                join.append(str).append(separateStr);
            }
            if(join.length() > 1){
                return join.deleteCharAt(join.length() - separateStr.length()).toString();
            }
            return "";
        }
        /**
         * 字符串转换成List(逗号隔开)
         * @param str 传入的字符串
         * @return List<String>
         */
        public static List<String> stringToList(String str) {
            if (StringUtils.isEmpty(str)){
                return new ArrayList<>();
            }
            String[] arr = str.split(",");
            List<String> arrayList = Arrays.asList(arr);
            return arrayList;
        }

        /**
         * 字符串转换成List(分隔符隔开)
         * @param str 要转换的字符串
         * @param separateStr 分隔符
         * @return List<String>
         */
        public static List<String> stringToList(String str, String separateStr) {
            if (StringUtils.isEmpty(str)){
                return new ArrayList<>();
            }
            String[] arr = str.split(separateStr);
            List<String> arrayList = Arrays.asList(arr);
            return arrayList;
        }

        /**
         * 字符串转换成Set(逗号隔开)
         * @param str 传入的字符串
         * @return List<String>
         */
        public static Set<String> stringToSet(String str) {
            if (StringUtils.isEmpty(str)){
                return new HashSet<>();
            }
            String[] arr = str.split(",");
            Set<String> arrayList = new HashSet<>(Arrays.asList(arr));
            return arrayList;
        }

        /**
         * 字符串转换成数组(逗号隔开)
         * @param str 传入的字符串
         * @return String[]
         */
        public static String[] stringToArray(String str) {
            if (StringUtils.isEmpty(str)){
                return new String[0];
            }
            String[] arr = str.split(",");
            return arr;
        }

        /**
         * 字符串转数字
         * @param str 传入的字符串
         * @return Integer 或者 null
         */
        public static Integer strToInt(String str) {
            Integer b = null;
            try {
                b = Integer.valueOf(str);
            } catch (NumberFormatException e) {
            }
            return b;
        }
        /**
         * 字符串转数字
         * @param str 传入的字符串
         * @return Long 或者 null
         */
        public static Long strToLong(String str) {
            Long b = null;
            try {
                b = Long.valueOf(str);
            } catch (NumberFormatException e) {
            }
            return b;
        }

        /**
         * 字符串转Bigdemal
         * @param str 传入的字符串
         * @return BigDecimal 或者 null
         */
        public static BigDecimal strToBigDecimal(String str, int scale) {
            BigDecimal b = null;
            try {
                b = new BigDecimal(str).setScale(scale, BigDecimal.ROUND_HALF_UP);
            } catch (Exception e) {
            }
            return b;
        }


        /**
         * 验证字符串是否是<=2位小数的数字并且不能为负数(金额验证)
         * @param str 传入的字符串
         * @return true="是" false="不是"
         */
        public static boolean isNumberOrfloatingNumber(String str){
            Pattern pattern=Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$"); // 判断小数点后2位的数字的正则表达式
            Matcher match=pattern.matcher(str);
            if(match.matches()==false){
                return false;
            }else{
                return true;
            }
        }

        /**
         * 验证字符串是否是<=3位小数的数字并且不能为负数(金额验证)
         * @param str 传入的字符串
         * @return true="是" false="不是"
         */
        public static boolean isNumberOrfloatingThreeNumber(String str){
            Pattern pattern=Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,3})?$"); // 判断小数点后2位的数字的正则表达式
            Matcher match=pattern.matcher(str);
            if(match.matches()==false){
                return false;
            }else{
                return true;
            }
        }

        /**
         * 判断字符串是否是正整数
         * @param str 传入的字符串
         * @return true="是" false="不是"
         */
        public static boolean isNumeric(String str){
            Pattern pattern = Pattern.compile("[0-9]*");
            if(StringUtils.isNotEmpty(str) && pattern.matcher(str).matches() ){
                return true;
            }
            return false;
        }

        /**
         * @description: 十六进制转十进制
         * @param: content 要转换的16进制
         * @return: int
         */
        public static int hexadecimalConvertTen(String content){
            int number=0;
            content = content.toUpperCase();
            if(!content.matches("[0-9a-fA-F]*")){
                return number;
            }
            String [] HighLetter = {"A","B","C","D","E","F"};
            Map<String,Integer> map = new HashMap<>();
            for(int i = 0;i <= 9;i++){
                map.put(i+"",i);
            }
            for(int j= 10;j<HighLetter.length+10;j++){
                map.put(HighLetter[j-10],j);
            }
            String[]str = new String[content.length()];
            for(int i = 0; i < str.length; i++){
                str[i] = content.substring(i,i+1);
            }
            for(int i = 0; i < str.length; i++){
                number += map.get(str[i])*Math.pow(16,str.length-1-i);
            }
            return number;
        }

        /**
         * 格式化百分数
         * @param x
         * @param y
         * @return
         */
        public static String getPercent(Object x, Object y, int decimalPlace) {
            String percent = "0%";
            try {
                BigDecimal xBigDecimal = new BigDecimal(String.valueOf(x));
                BigDecimal yBigDecimal = new BigDecimal(String.valueOf(y));
                BigDecimal rate = xBigDecimal.divide(yBigDecimal, decimalPlace, BigDecimal.ROUND_HALF_UP).multiply(BigDecimal.TEN).multiply(BigDecimal.TEN).setScale(decimalPlace);
                percent =  rate + "%";
            } catch (Exception e) {
                logger.warn("百分比x/y转换失败， 参数是：x="+x+",y="+y+",保留位数="+decimalPlace);
            }
            return percent;
        }

        /**
         *  字符串转换为Ascii
         * @param value
         * @return
         */
        public static String stringToAscii(String value){
            StringBuffer sbu = new StringBuffer();
            char[] chars = value.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(i != chars.length - 1){
                    sbu.append((int)chars[i]).append(",");
                } else {
                    sbu.append((int)chars[i]);
                }
            }
            return sbu.toString();
        }

        /**
         *  Ascii转换为字符串
         * @param value
         * @return
         */
        public static String asciiToString(String value){
            StringBuffer sbu = new StringBuffer();
            String[] chars = value.split(",");
            for (int i = 0; i < chars.length; i++) {
                sbu.append((char) Integer.parseInt(chars[i]));
            }
            return sbu.toString();
        }
}
