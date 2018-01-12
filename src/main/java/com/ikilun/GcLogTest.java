package com.ikilun;

import java.util.ArrayList;
import java.util.List;

public class GcLogTest {
	public static void main(String[] args) {
		//-Xmx5m
		//-XX:+PrintGCDetails -Xloggc:d:\jvm\gc.log
		List<String> strList = new ArrayList<String>();
		while(true){
			strList.add("1111111111111111111111111111111");
		}
	}
}
