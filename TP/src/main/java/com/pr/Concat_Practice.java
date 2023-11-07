package com.pr;

import java.nio.file.Paths;

public class Concat_Practice {
	static int Att_Id=4501;
	static String filename="Vaibhav.pdf";
			

	public static void main(String[] args) {
		
		try {
			System.out.println(""+Att_Id);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			System.out.println(Paths.get("DownLoadFiles/"+Att_Id+"_"+filename));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
