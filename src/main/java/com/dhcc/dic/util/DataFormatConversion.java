package com.dhcc.dic.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 功能描述:数据格式转换类
 * 用于各种类型的数据格式转换，整型、浮点型、双精度型、
 * 字符串型、日期型等类型内部格式的转换及类型之间的相互转换
 * @author 张继清
 * @date Jun 13,2010
 *释放内存，未测试---李世杰
 */
public class DataFormatConversion {

	
	/**
	 * 
	 * 功能描述：将传过来的金额可能存在的逗号","去掉返回去。
	 * @param value  2,000.00
	 * @return   2000.00
	 * @author zhangjiqing
	 * @date 2011-7-23 下午03:39:08
	 */
	public final static String removeComma(String value) {
		String _value = "";
		if(value!=null) {
			_value = value.replaceAll(",", "");
		}
		return _value ;
	}
	
	/**
	 *  转换为Double类型
	 * @param sdata  String
	 * @return Double
     *   i:小数点后保留位数
	 */
	
	
	public final static double getHandleDouble(String sdata, int i)
	{
		sdata = sdata.trim();
		int k = sdata.indexOf("|");
		if (k>0)
		{
			sdata = sdata.substring(0, k);
		}
		if(sdata == null || sdata.equals("")) 
			sdata = "0.00";
		if (sdata.indexOf(".") == -1) 
			sdata = sdata+".00";
		if (sdata.indexOf(".") == 0) 
			sdata="0"+sdata;
		sdata = sdata + "000000000000";
		if (i == 0)
			sdata = sdata.substring(0,sdata.indexOf("."));
		else if (i < 0) 
			sdata = sdata.substring(0,sdata.indexOf("."));
		else 
			sdata = sdata.substring(0,sdata.indexOf(".")+1+i);

		return Double.parseDouble(sdata);
	}         
   
   /**
   * @描述: 求 double a 保留 n位小数 四舍五入后的值
   * @参数: @param a
   * @参数: @param n
   * @参数: @return 
   * @日期  Mar 22, 2012
   * @作者   段海峰
    */
	public final static double getDouble_sishewuru(double a,int n)
	{
		double num = 0;
		BigDecimal num_tmp=new BigDecimal(a);
		num = num_tmp.setScale(n,BigDecimal.ROUND_HALF_UP).doubleValue();
		num_tmp = null;
		return num;
	}
		
	/*将double转换成至少包含2位小数的String型，不是四舍五入，是准确值*/
	public final static String getNumToString(double num_tmp)
	{
		String num = Double.toString(num_tmp);
		
		System.out.println("**(0) String的原始数据为** num_beg= "+num);
	
		/*如果num为空*/
		if(num==null||num.equals(""))
		{
			num=num;
			System.out.println("**(1) String转换成double型数据为** num= "+num);
	
		}
		/*如果num不为空*/
		else
		{
			int num_length = num.length();
			System.out.println("1：num的长度为 num_length= "+num_length);
		
			int a = num.indexOf(".");
			System.out.println("2：小数点所在位置为 a= "+a);
		
			int b = a+1;
			int c = num_length-b;
		
			/*如果小数点不出现在num中*/
			if(a==-1)
			{
				System.out.println("3：小数点不存在与num中 a= "+a);
				num = num+".00";
			}
		/*如果小数点存在于num中*/
		else
			{
				/*如果num最后一位是小数点*/
				int m = num_length - a;
				if(m==1)
				{
					System.out.println("4-1：小数点存在与num中的第 "+b+ "位");
					System.out.println("4-2：小数点是最后一位 ");
					System.out.println("4-3：num中存在 "+c+ "位小数");
				
					num=num+"00";
				}
				/*如果有一位小数*/
			else if(m==2)
				{
					System.out.println("5-1：小数点存在与num中的第 "+b+ "位");
					System.out.println("5-2：存在一位小数 ");
					System.out.println("5-3：num中存在 "+c+ "位小数");
				
					num=num+"0";
				}
				/*如果存在至少二位小数*/
			else
				{
					System.out.println("6-1：小数点存在与num中的第 "+b+ "位");
					System.out.println("6-2：存在至少二位小数 ");
					System.out.println("6-3：num中存在 "+c+ "位小数");
				
					num=num;
				}
			}
		
		}
		
		System.out.println("**(2) String转换成double型数据为** num_end= "+num);
		return num;
	}
	
	/*将 String 转换成至少包含2位小数的String型，不是四舍五入，是准确值*/
	public final static String getStringToNum_Str(String num)
	{
		
		System.out.println("**(0) String的原始数据为** num= "+num);
	
		/*如果num为空*/
		if(num==null||num.equals(""))
		{
			num=num;
			System.out.println("**(1) String转换成double型数据为** num= "+num);
	
		}
		/*如果num不为空*/
		else
		{
			int num_length = num.length();
			System.out.println("1：num的长度为 num_length= "+num_length);
		
			int a = num.indexOf(".");
			System.out.println("2：小数点所在位置为 a= "+a);
		
			int b = a+1;
			int c = num_length-b;
		
			/*如果小数点不出现在num中*/
			if(a==-1)
			{
				System.out.println("3：小数点不存在与num中 a= "+a);
				num = num+".00";
			}
		/*如果小数点存在于num中*/
		else
			{
				/*如果num最后一位是小数点*/
				int m = num_length - a;
				if(m==1)
				{
					System.out.println("4-1：小数点存在与num中的第 "+b+ "位");
					System.out.println("4-2：小数点是最后一位 ");
					System.out.println("4-3：num中存在 "+c+ "位小数");
				
					num=num+"00";
				}
				/*如果有一位小数*/
			else if(m==2)
				{
					System.out.println("5-1：小数点存在与num中的第 "+b+ "位");
					System.out.println("5-2：存在一位小数 ");
					System.out.println("5-3：num中存在 "+c+ "位小数");
				
					num=num+"0";
				}
				/*如果存在至少二位小数*/
			else
				{
					System.out.println("6-1：小数点存在与num中的第 "+b+ "位");
					System.out.println("6-2：存在至少二位小数 ");
					System.out.println("6-3：num中存在 "+c+ "位小数");
				
					num=num;
				}
			}
		
		}
		
		System.out.println("**(2) String转换成double型数据为** num_end= "+num);
		return num;
	}
	
	 /**
     * 功能描述：将double类型的数据按指定精度四舍五入
     * @param v
     * @param scale
     * @return
     */
	public static double round(double v,int scale)
	{
		double num;
		String temp="##########.";  
		for (int i=0;i<scale ;i++ )  
		{  
			temp+="0";  
		}
		Double a = Double.valueOf(new java.text.DecimalFormat(temp).format(v));
		num = a.doubleValue();
		
		return num;
	}
	/**
	 * 
	 * 功能描述：将 String类型的数字 转换成带规定小数位的String
	 * @param num
	 * @return String
	 * @author dongfushuai
	 * @date Oct 16, 2008
	 * @修改日志：
	 */
	public final static String getDoubleToStringValue(String num,int i){
		String numValue = "";
		if(num==null || "".equals(num) || ".".equals(num)){
			numValue = "0.00";
		}
		else{
			//num = getZero(num);
			int no = num.indexOf("-");
			if(no >= 0) {
				num = num.substring(no);
			}
			double num_tmp = 0.00;
			num_tmp = Double.parseDouble(num);
			numValue = NumToString.numToString(num_tmp, i);
		}
		return numValue;
	}
	
	/**
	 * 
	 * 功能描述：将 String类型的数字 转换成带规定小数位的String等  值为 0 的时候 改为空
	 * @param num 
	 * @return String
	 * @author dongfushuai
	 * @date Oct 16, 2008
	 * @修改日志：
	 */
	public final static String getDoubleToStringValue1(double num,int i){
		String numValue = "";
	if (num ==0.00){	
		numValue ="0";
	  } else{
			double num_tmp = 0.00;
			numValue = NumToString.numToString(num, i)+"%";
		}
		return numValue;
	}
	
	
	
	/**
	 * 
	 * 功能描述：将 String类型的数字 转换成带规定小数位的String等  值为 0 的时候 改为空
	 * @param num 
	 * @return String
	 * @author dongfushuai
	 * @date Oct 16, 2008
	 * @修改日志：
	 */
	public final static String getDoubleToStringValue11(double num,int i){
		String numValue = "";
	if (num ==0){	
		numValue ="0.00";
	  } else{ 
		  numValue = NumToString.numToString(num, i);
		}
		return numValue;
	}
	/**
	 * 
	 * 功能描述：将 Double类型转换为int类型，例2.00 转换成2
	 * @param num
	 * @return int
	 * @author zhouyufei
	 * @date Nov 28, 2008
	 * @修改日志：
	 */
	public final static int doubleToInt(double num){
		String num_tmp = Double.toString(num);
		Double num1 = Double.valueOf(num_tmp);
		int numValue = 0;
		if(num1==null){
			numValue = 0;
		}
		else{
			numValue  = num1.intValue();
		}
		return numValue;
	}
	/**
	 * 
	 * 功能描述：将 String类型的前面带0的整数，例00200 转换成不带0的整数的String型200
	 * @param num
	 * @return String
	 * @author dongfushuai
	 * @date Oct 16, 2008
	 * @修改日志：
	 */
	public final static String getIntStrToStringValue(String num){
		String numValue = "";
		if(num==null || "".equals(num) || ".".equals(num)){
			numValue = "0";
		}
		else{
			//num = getZero(num);
			int no = num.indexOf("-");
			if(no >= 0) {
				num = num.substring(no);
			}
			int num_tmp = 0;
			num_tmp = Integer.parseInt(num);
			numValue = String.valueOf(num_tmp);
		}
		return numValue;
	}
	/**
	 * 
	 * 功能描述：将 String类型2000 转换成带千分位的整数的String型2,000(金额型，后面两位小数)
	 * @param num
	 * @return String
	 * @author lx
	 * @date May 16, 2009
	 * @修改日志：
	 */
	public final static String getIntStrToStringCommafy(String num){
		String numValue = "";
		
		if(num==null || "".equals(num) || ".".equals(num)){
			numValue = "0.00";
		}else {
			num = num.trim();//不能放到if上面，如果num为空的话会报空指针异常
			//num = getZero(num);
			int no = num.indexOf("-");
			if(no >= 0) {
				num = num.substring(no);
			}
			DecimalFormat myformat = new DecimalFormat("#,##0.00");
			double num_tmp = 0.00;
			num_tmp = Double.valueOf(num);
			numValue = String.valueOf(myformat.format(num_tmp));
			myformat = null;
		}
		return numValue;
	}
	/**
	 * 
	 * 功能描述：将 String类型2000 转换成带千分位的整数的String型2,000（整数型，后面没有小数）
	 * @param num
	 * @return
	 * @author zhushuai
	 * @date 2010-10-11
	 * @修改日志：
	 */
	public final static String getIntStrToString(String num){
		String numValue = "";
		
		if(num==null || "".equals(num) || ".".equals(num)){
			numValue = "0";
		}else {
			num = num.trim();//不能放到if上面，如果num为空的话会报空指针异常
			//num = getZero(num);
			int no = num.indexOf("-");
			if(no >= 0) {
				num = num.substring(no);
			}
			DecimalFormat myformat = new DecimalFormat("#,###");
			double num_tmp = 0;
			num_tmp = Double.valueOf(num);
			numValue = String.valueOf(myformat.format(num_tmp));
			myformat = null;
		}
		return numValue;
	}
	/**
	 * 
	 * 功能描述：将 double类型2000 转换成带千分位的整数的String型2,000
	 * @param num
	 * @return String
	 * @author lx
	 * @date May 16, 2009
	 * @修改日志：
	 */
	
	public final static String getIntStrToStringCommafy(double num){
		String numValue = "";
		if("".equals(num)){
			numValue = "0.00";
		} else {
			DecimalFormat myformat = new DecimalFormat("#,##0.00");
			numValue = (String)myformat.format(num);
			myformat = null;
		}
		return numValue;
	}
	/**
	 * 
	 * 功能描述：将 String类型. 转换成带千分位的整数的String型0.00
	 * @param num
	 * @return String
	 * @author lx
	 * @date May 16, 2009
	 * @修改日志：
	 */
	
	public final static String getZero(String num){
		String numValue = num.trim();
		if(".".equals(num)){
			numValue = "0.00";
		}
		return numValue;
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
        String s = Double.toString(d).trim();
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
            boolean flag = false;
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
	/**
	 * 测试用方法
	 * @param args
	 */
	public static void main(String args[]) {
		
		
//		Double dd = 1.3468d;
//		
//		print(round(dd,3));
//		print(DataFormatConversion.getDouble_sishewuru(dd, 2));
//		print("------------------------------------------");
//		print(DataFormatConversion.getNumToString(dd));
//		print("------------------------------------------");
//		
//		String str = "1.3468";
//		print(DataFormatConversion.getStringToNum_Str(str));
//		print("------------------------------------------");
//		print(DataFormatConversion.getHandleDouble(str, 2));	
//		print("------------------------------------------");
		double jf_amt = 1.1211214844401999E11;
		double df_amt = 1.1211214844402E11;
		
		print(pNumToString((jf_amt-df_amt),6));
	}
	
	public static void print(Object obj) {
		System.out.println(obj);
	}
	
}
