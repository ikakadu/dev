package com.excel;

import java.util.List;

import com.iq.Person;

public class ExcelDtataConvert {

	public static void testDataForExcel(String[][] arr,List<Person> list) {
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			arr[i][0] = String.valueOf(p.getId());
			arr[i][1] = p.getName();
		}
	}
}
