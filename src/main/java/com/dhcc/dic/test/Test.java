package com.dhcc.dic.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test {
 
	
	
	public int getLastWordSize(String str){
        String strArr[]=str.split(" ");
        str =strArr[strArr.length-1];
        return str.length();
    }
    public static void main(String ...args){
//    	Test test=new Test();
//    	Solution s=test.new Solution();
//      System.out.print(test.getLastWordSize("ABSIB T"));
//        
//      System.out.println(543/10*(3-1));
    	int[] te = { 5,51,51,56 };
    	
    	te[2]=te[3];
    	Arrays.fill(te,5);
    	System.out.println(Arrays.toString(te));
//        test.sort(te);
        
    }
    public List<char[]> sort(int [] arr){
    	List<Integer> intList=new ArrayList<Integer>();
    	for(int i=0;i<arr.length;i++){
    		intList.add(arr[i]);
    	}
    	
    	Collections.sort(intList, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				int o1Length=o1.toString().length();
				int o2Length=o2.toString().length();
				int first;
				int o2first;
				if(o1Length!=1){
					first=(int) (o1/(Math.pow(10, o1Length-1)));
				}else{
					first=o1;
				}
				if(o2Length!=1){
					o2first=(int) (o2/(Math.pow(10, o2Length-1)));
				}else{
					o2first=o2;
				}
				
				return (int) (first-o2first);
			}

			

			
    	});
    	
    	
    	return null;
    }
    boolean equal(Integer o1,Integer o2){
    	int o1Length=o1.toString().length();
		int o2Length=o2.toString().length();
		int first;
		int o2first;
		if(o1Length!=1){
			first=(int) (o1/(Math.pow(10, o1Length-1)));
		}else{
			first=o1;
		}
		if(o2Length!=1){
			o2first=(int) (o2/(Math.pow(10, o2Length-1)));
		}else{
			o2first=o2;
		}
		return (first-o2first)==0;
    }
    public void sql(){
   	
    	
    	
    }
   
    class StringComparator implements Comparator<String> {  
        public int compare(String a, String b) {  
            if (a.length() == b.length()) {  
                return b.compareTo(a);
            } else {
                String ab = a + b;  
                String ba = b + a;  
                return ba.compareTo(ab);  
            }  
        }  
    }  
      
     class Solution {  
        public String largestNumber(int[] num) {  
            StringBuffer sbuf = new StringBuffer();  
            ArrayList<String> numstrings = new ArrayList<String>(num.length);  
      
            for (int i : num) 
            	numstrings.add(String.valueOf(i));  
            Collections.sort(numstrings,  new StringComparator());  
            for (String s : numstrings) sbuf.append(s);  
      
            String res = sbuf.toString();  
            if (res.length() > 0 && res.charAt(0) == '0') return "0";  
      
            return res;  
        }  
     }
}
