// Decompiled by DJ v3.7.7.81 Copyright 2004 Atanas Neshkov  Date: 2006-5-10 14:12:43
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   NumToString.java

package com.dhcc.dic.util;

import java.text.DecimalFormat;


public class NumToString
{

    public NumToString()
    {
    }
    
    /**
     * 
     * 功能描述：格式化输出金额
     * @param str
     * @return
     * @author zhangjiqing
     * @date 2010-12-11
     */
    public static String parseTwo (String str) {
		DecimalFormat df = new DecimalFormat("#,##0.00");  
		if(null == str) 
			str = "";
		else 
			{double d1 =Double.parseDouble(str); str = df.format(d1);}
		return str;
	}
    /**
     * 
     * 功能描述：将科学计数法格式的数字d转换为i位小数位的字符串
     * @param d
     * @param i
     * @return 
     * @date 2010-8-27
     */
    
    private static String pNumToString(double d, int i)
    {
    	double val = DataFormatConversion.round(d, i);//先做四舍五入后在进行科学计数法转换
        String s = Double.toString(val).trim();
        char ac[] = s.toCharArray();
        String s1 = "";
        int i2 = 0;
        int j = 0;
        do
        {
            if(j >= ac.length)
                break;
            if(ac[j] == 'E' || ac[j] == 'e')
            {
                i2 = j;
                break;
            }
            j++;
        } while(true);
        int l3 = 0;
        j = 0;
        do
        {
            if(j >= ac.length)
                break;
            if(ac[j] == '.')
            {
                l3 = j;
                break;
            }
            j++;
        } while(true);
        if(l3 == 0)
            return s;
        j = 0;
        if(ac[j] == '-')
        {
            s1 = s1 + "-";
            j++;
        }
        if(i2 == 0)
        {
            for(; j < l3; j++)
                s1 = s1 + ac[j];

            if(i == 0)
                return s1;
            s1 = s1 + ".";
            j++;
            if(ac.length - l3 - 1 < i)
            {
                for(; j < ac.length; j++)
                    s1 = s1 + ac[j];

                for(int k = 0; k < i - (ac.length - l3 - 1); k++)
                    s1 = s1 + "0";

                return s1;
            }
            for(; j < l3 + 1 + i; j++)
                s1 = s1 + ac[j];

            return s1;
        }
        if(ac[j + 1] != '.')
            return s;
        if(ac[i2 + 1] == '-')
        {
            int j3 = (new Integer(s.substring(i2 + 2, ac.length))).intValue();
            System.out.println("iEIndex==" + i2 + " iArrayIndex==" + j + " iPowerNum==" + j3);
            s1 = s1 + "0.";
            int j2 = 0;
            int l = 0;
            do
            {
                if(l >= j3 - 1)
                    break;
                s1 = s1 + "0";
                if(++j2 >= i)
                    break;
                l++;
            } while(true);
            if(j2 < i)
                for(; j < i2; j++)
                {
                    if(ac[j] == '.')
                        continue;
                    s1 = s1 + ac[j];
                    if(++j2 >= i)
                        break;
                }

            for(; j2 < i; j2++)
                s1 = s1 + "0";

        } else
        {
            int k3 = (new Integer(s.substring(i2 + 1, ac.length))).intValue();
            if(i2 - j - 1 - 1 <= k3)
            {
                int k2 = i2 - j - 1;
                for(; j < i2; j++)
                    if(ac[j] != '.')
                        s1 = s1 + ac[j];

                for(int i1 = 0; i1 < (k3 - k2) + 1; i1++)
                    s1 = s1 + "0";

                s1 = s1 + ".";
                for(int j1 = 0; j1 < i; j1++)
                    s1 = s1 + "0";

            } else
            {
                int l2 = 0;
                for(; j < i2; j++)
                {
                    if(ac[j] == '.')
                        continue;
                    s1 = s1 + ac[j];
                    if(++l2 >= k3 + 1)
                        break;
                }

                j++;
                s1 = s1 + ".";
                if(i2 - j < i)
                {
                    int i3 = i2 - j;
                    for(; j < i2; j++)
                        s1 = s1 + ac[j];

                    for(int k1 = 0; k1 < i - i3; k1++)
                        s1 = s1 + "0";

                } else
                {
                    for(int l1 = 0; l1 < i; l1++)
                    {
                        s1 = s1 + ac[j];
                        j++;
                    }

                }
            }
        }
        return s1;
    }

    private static String pNumToCString(double d, int i)
    {
        String s = pNumToString(d, i);
        System.out.println("s:" + s);
        if(d < 1.0D && d > 0.0D || d > -1D && d < 0.0D)
            return s;
        char ac[] = s.toCharArray();
        String s1 = "";
        int j = 0;
        if(ac[j] == '-')
        {
            s1 = s1 + "-";
            j++;
        }
        int j1 = ac.length - i - 1 - j;
        int k1 = ac.length - i - 1;
        if(j1 <= 3)
            return s;
        for(int k = 0; k < j1 % 3; k++)
        {
            s1 = s1 + ac[j];
            j++;
        }

        if(j1 % 3 != 0)
            s1 = s1 + ",";
        for(int l = 0; l < j1 / 3; l++)
        {
            for(int i1 = 0; i1 < 3; i1++)
            {
                s1 = s1 + ac[j];
                j++;
            }

            if(j < k1)
                s1 = s1 + ",";
        }

        for(; j < ac.length; j++)
            s1 = s1 + ac[j];

        return s1;
    }

    public static String numToString(double d)
    {
        return pNumToString(d, 2);
    }

    public static String numToString(double d, int i)
    {
        if(i < 0)
            return pNumToString(d, 2);
        else
            return pNumToString(d, i);
    }

    public static String numToString(int i)
    {
        return pNumToString(i, 0);
    }

    public static String numToString(int i, int j)
    {
        if(j < 0)
            return pNumToString(i, 0);
        else
            return pNumToString(i, j);
    }

    public static String numToCString(double d)
    {
        return pNumToCString(d, 2);
    }

    public static String numToCString(double d, int i)
    {
        if(i < 0)
        {
            if(i == -1)
            {
                String s = pNumToCString(d, 2);
                if(s.equals("0.00"))
                    return "\u3000";
                else
                    return s;
            } else
            {
                return pNumToCString(d, 2);
            }
        } else
        {
            return pNumToCString(d, i);
        }
    }
    public static void main(String agrs[]){
    	
    	System.out.println(NumToString.numToCString(1.1111111119394848E10, 2));
    	System.out.println(pNumToString(1.11, 2));
    	System.out.println(numToString(1.1111111119395848E13, 2));
    	System.out.println(NumToString.numToCString(-1111111111124.90899999999));
    }
    public static String numToCString(int i)
    {
        return pNumToCString(i, 0);
    }

    public static String numToCString(int i, int j)
    {
        if(j < 0)
            return pNumToCString(i, 0);
        else
            return pNumToCString(i, j);
    }
}
