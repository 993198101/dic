package com.dhcc.dic.test;

public class Test {

	    
	public int getLastWordSize(String str){
        String strArr[]=str.split(" ");
        str =strArr[strArr.length-1];
        return str.length();
    }
    public static void main(String ...args){
    	Test test=new Test();
        System.out.print(test.getLastWordSize("ABSIB T"));
        
    }
    public void sql(){
   	
    	
    	
    }
	
}
