//package com.dhcc.dic.test;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import org.apache.catalina.tribes.util.Arrays;
//
//import com.dhcc.dic.entity.TTableField;
//
//public class Test0824 {
//	static class People implements Runnable {
//		static int i = 0;
//
//		@Override
//		public void run() {
//			if (i != 99) {
//				i++;
//			} else {
//
//			}
//		}
//	}
//
//	/**
//	 * 
//	 * @param oldField
//	 * @param newField
//	 * @return 0完全一致 
//	 * @throws SecurityException
//	 * @throws NoSuchMethodException
//	 * @throws InvocationTargetException
//	 * @throws IllegalArgumentException
//	 * @throws IllegalAccessException
//	 */
//	public static int compareTableField(List<TTableField> oldFieldList, List<TTableField> newFieldList){
//		int result = 0;
//		List<Integer> removeField=new ArrayList<Integer>();
//		List<Integer> insertField=new ArrayList<Integer>();
//		for(int i=0;i<oldFieldList.size();i++){
//			for(int j=0;j<newFieldList.size();j++){
//				if(oldFieldList.get(i).getfId().equals(newFieldList.get(j).getfId())){
//					
//					break;
//				}
//				removeField.add(i);
//			}
//		}
//		return result;
//	}
//
//	public static void main(String... a) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//	TTableField tableField=new TTableField();
//	tableField.setfId("1");
//	tableField.setfName("cs");
////	compareTableField(tableField,tableField);
//	}
//
//}
