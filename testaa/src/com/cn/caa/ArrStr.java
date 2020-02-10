package com.cn.caa;

/**
 * Created by qing on 2018/9/20.
 */
public class ArrStr {
    private  String[] hanStr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    private  String[] untiArr = {"十","百","千"};
    private String toHanStr(String numStr){
        String result ="";
       // String[] strs = numStr.split("");
        for (int i = 0; i < numStr.length(); i++) {


           // String s = numStr.substring(i);
            char s =numStr.charAt(i);
            String str = String.valueOf(s);
            int num = Integer.parseInt(str);
            result += hanStr[num]+untiArr[numStr.length()-2-i];


        }
        //System.out.println(result);
        return  result;
    }


    public static void main(String[] args) {
        ArrStr as = new ArrStr();
        System.out.println(as.toHanStr("1234"));
    }

}
