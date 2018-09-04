package com.cigniti.utilities;

import java.io.File;

public class CleanReports {

	private static CleanReports cleanReports = null;

	private CleanReports() {
		try {
			File file = new File("./Results/HTML");
			File[] listFiles = file.listFiles();
			for (int i = 0; i < listFiles.length; i++) {
				listFiles[i].delete();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static CleanReports cleanReports() {
		if (null == cleanReports) {
			cleanReports = new CleanReports();
		}
		return cleanReports;
	}

}
