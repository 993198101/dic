package com.dhcc.dic.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.print.DocFlavor.STRING;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.util.CellRangeAddressList;

//import com.dh.dic.pojo.DicTableEntity;

import org.apache.poi.hssf.usermodel.HSSFHyperlink;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.hssf.usermodel.DVConstraint;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFDataValidation;

import org.apache.poi.hssf.usermodel.HSSFPatriarch;

import org.apache.poi.hssf.usermodel.HSSFSheet;

public class CustomExcelUtil {
	/**
	 * 根据path获得sheet
	 * 
	 * @param path
	 * @return List<Sheet>
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static List<HSSFSheet> getSheets(String path) throws FileNotFoundException, IOException {
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(path));
		List<HSSFSheet> sheets = new ArrayList<HSSFSheet>();
		int sheetNum = workbook.getNumberOfSheets();
		for (int i = 0; i < sheetNum; i++) {
			sheets.add(workbook.getSheetAt(i));
		}
		return sheets;
	}

	/**
	 * 根据一个sheet获得List<Row>
	 * 
	 * @param sheet
	 * @return
	 */
	public static List<HSSFRow> getRows(HSSFSheet sheet) {
		int rowNum = sheet.getLastRowNum();
		List<HSSFRow> rows = new ArrayList<HSSFRow>();
		for (int i = 0; i < rowNum; i++) {
			HSSFRow row = sheet.getRow(i);
			rows.add(row);
		}
		return rows;
	}

	/**
	 * 根据一个sheet的所有List<Row> rows，开始行row，开始col，获得sql 如（‘1’，‘2’），（‘3’，‘4’）
	 * 
	 * @param rows
	 * @param startRow
	 * @param startCol
	 * @return
	 */
	public static String getRowSql(List<HSSFRow> rows, int startRow, int startCol) {
		StringBuffer sql = new StringBuffer("");
		for (int i = startRow; i < rows.size(); i++) {
			sql.append("(");
			HSSFRow row = rows.get(i);
			for (int j = startCol; j < row.getLastCellNum(); j++) {
				String value = getCellValue(row.getCell(j)).trim();
				if (value != null && value.length() > 0) {
					sql.append("'").append(value).append("'");
				} else {
					sql.append("''");
				}
				if (j != row.getLastCellNum() - 1) {
					sql.append(",");
				}
			}
			sql.append(")");
			if (i != rows.size() - 1) {
				sql.append(",");
			}
		}
		return sql.toString();
	}

	/**
	 * 根据每一个cell获得里面的文字
	 * 
	 * @param cell
	 * @return
	 */
	private static String getCellValue(HSSFCell cell) {
		Object result = "";
		if (cell != null) {
			switch (cell.getCellType()) {
			case HSSFCell.CELL_TYPE_STRING:
				result = cell.getStringCellValue();
				break;
			case HSSFCell.CELL_TYPE_NUMERIC:
				result = cell.getNumericCellValue();
				break;
			case HSSFCell.CELL_TYPE_BOOLEAN:
				result = cell.getBooleanCellValue();
				break;
			case HSSFCell.CELL_TYPE_FORMULA:
				result = cell.getStringCellValue();
				break;
			case HSSFCell.CELL_TYPE_ERROR:
				result = cell.getErrorCellValue();
				break;
			case HSSFCell.CELL_TYPE_BLANK:
				break;
			default:
				break;
			}
		}
		return result.toString();
	}

	/**
	 * 设置某些列的值只能输入预制的数据,显示下拉框.
	 * 
	 * @param sheet
	 *            要设置的sheet.
	 * @param textlist
	 *            下拉框显示的内容
	 * @param firstRow
	 *            开始行
	 * @param endRow
	 *            结束行
	 * @param firstCol
	 *            开始列
	 * @param endCol
	 *            结束列
	 * @return 设置好的sheet.
	 */
	public static HSSFSheet setHSSFValidation(HSSFSheet sheet, String[] textlist, int firstRow, int endRow,
			int firstCol, int endCol) {
		// 加载下拉列表内容
		DVConstraint constraint = DVConstraint.createExplicitListConstraint(textlist);
		// 设置数据有效性加载在哪个单元格上,四个参数分别是：起始行、终止行、起始列、终止列
		CellRangeAddressList regions = new CellRangeAddressList(firstRow, endRow, firstCol, endCol);
		// 数据有效性对象
		HSSFDataValidation data_validation_list = new HSSFDataValidation(regions, constraint);
		sheet.addValidationData(data_validation_list);
		return sheet;
	}

	/**
	 * 给一个sheet的某个cell加提示框
	 * 
	 * @param sheet
	 * @param rowIndex
	 * @param cellIndex
	 * @param comment
	 */
	public static void setComment(HSSFSheet sheet, int rowIndex, int cellIndex, String comment) {
		HSSFPatriarch pat = sheet.createDrawingPatriarch();
		HSSFCell cell = sheet.getRow(rowIndex).getCell(cellIndex);
		HSSFClientAnchor clientAnchor = new HSSFClientAnchor(0, 0, 0, 0, (short) 12, 5, (short) 8, 11);
		HSSFComment hssfComment = pat.createComment(clientAnchor);
		cell.setCellComment(hssfComment);
	}

	/**
	 * 给某个cell加链接
	 * 
	 * @param wb
	 * @param cell
	 * @param linkUrl
	 */
	public static void setLink(HSSFWorkbook wb, HSSFCell cell, String linkUrl) {
		CreationHelper createHelper = wb.getCreationHelper();
		Hyperlink hl = createHelper.createHyperlink(HyperlinkType.DOCUMENT);
		hl.setAddress(linkUrl);
		cell.setHyperlink(hl);
	}

	/**
	 * 
	 * @param sheet
	 * @param sheetData
	 * @param startRow
	 * @param startCol
	 */
	public static void writeSheet(HSSFSheet sheet, List<List<String>> sheetData, int startRow, int startCol) {
		for (int i = startRow; i < sheetData.size(); i++) {
			HSSFRow row = sheet.createRow(i);
			List<String> colValues = sheetData.get(i);
			for (int j = startCol; j < colValues.size(); j++) {
				HSSFCell cell = row.createCell(j);
				cell.setCellValue(colValues.get(j));
			}
		}
	}

	/**
	 * 
	 * @param sheet
	 * @param rowIdx
	 * @param style
	 * @param cellValMap
	 * @param commentMap
	 */
	public void execute(HSSFSheet sheet, int rowIdx, HSSFCellStyle style, Map<Integer, Object> cellValMap,
			Map<Integer, HSSFComment> commentMap) {
		HSSFRow row = null; // 工作行对象
		HSSFCell cell = null; // 单元格对象
		HSSFComment tempComment = null;
		Object obj = null;
		Iterator it = null;
		int idx = 0;
		row = sheet.createRow(rowIdx);
		/* 为每个cell赋值 */
		if (cellValMap != null) {
			it = cellValMap.keySet().iterator();
			while (it.hasNext()) {

				idx = Integer.parseInt(it.next().toString());
				cell = row.createCell(idx);

				if (style != null) {
					cell.setCellStyle(style);
				}
				obj = cellValMap.get(idx);
				if (obj != null) {
					if (Integer.class.equals(obj.getClass())) {
						cell.setCellValue(Integer.parseInt(obj.toString()));
					} else if (String.class.equals(obj.getClass())) {
						cell.setCellValue(obj.toString());
					}
				}
			}
		}
		/* 判断是否添加批注 */
		if (commentMap != null) {
			it = commentMap.keySet().iterator();
			while (it.hasNext()) {
				idx = Integer.parseInt(it.next().toString());
				tempComment = commentMap.get(idx);
				cell = row.getCell(idx);
				if (tempComment != null) {
					cell.setCellComment(tempComment);
				}
			}
		}

		it = null;
		obj = null;
		cellValMap = null;
		commentMap = null;
	}

	public static void main(String... args)
			throws FileNotFoundException, IOException, SQLException, ClassNotFoundException {
//		Class.forName("oracle.jdbc.OracleDriver");
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "CS", "123456");
//		Statement stm = conn.createStatement();
//		ResultSet rs = stm.executeQuery("select * from DIC_TABLE where OWNER_USR='DATADIC'");
//		List<DicTableEntity> lsts = new ArrayList<>();
//		while (rs.next()) {
//			DicTableEntity dic_table = new DicTableEntity();
//			dic_table.setTab_name(rs.getString("tab_name"));
//			dic_table.setTab_dsc(rs.getString("tab_dsc"));
//			dic_table.setOwner_usr(rs.getString("owner_usr"));
//			dic_table.setTablespace(rs.getString("tablespace"));
//			dic_table.setIdx_cnt(rs.getDouble("idx_cnt"));
//			dic_table.setCreate_date(rs.getInt("create_date"));
//			dic_table.setCreate_tel(rs.getString("create_tel"));
//			dic_table.setTab_brf(rs.getString("tab_brf"));
//			dic_table.setTable_type(rs.getString("table_type"));
//			dic_table.setHas_init_data(rs.getString("has_init_data"));
//			lsts.add(dic_table);
//		}
//		List<List<String>> exceldata = new ArrayList<List<String>>();
//		for (int i = 0; i < lsts.size(); i++) {
//			DicTableEntity dt = lsts.get(i);
//			List<String> dicTableString = new ArrayList<String>();
//			dicTableString.add(dt.getTab_name());
//			dicTableString.add(dt.getCreate_tel());
//			dicTableString.add(dt.getHas_init_data());
//			dicTableString.add(dt.getTab_dsc());
//			dicTableString.add(dt.getOwner_usr());
//			dicTableString.add(dt.getTablespace());
//			dicTableString.add(String.valueOf(dt.getIdx_cnt()));
//			dicTableString.add(String.valueOf(dt.getCreate_date()));
//			dicTableString.add(dt.getTab_brf());
//			dicTableString.add(dt.getTable_type());
//			exceldata.add(dicTableString);
//		}
//
//		FileOutputStream is = new FileOutputStream("d:\\book1.xls");
//		HSSFWorkbook workbook = new HSSFWorkbook();
//		HSSFSheet sheet = workbook.createSheet("test");
//		writeSheet(sheet, exceldata, 0, 0);
//		workbook.write(is);
//		System.out.println("ss");
	}
}
