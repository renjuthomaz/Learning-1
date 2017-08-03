package org.learn;

import java.io.File;
import java.io.FileFilter;

public class LambdaAnaonymousClassExample {

	public static void main(String[] args) {

		/*FileFilter fileFilter = new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java");
			}
		};*/

		FileFilter lambdaFileFilter = (File pathname) -> pathname.getName().endsWith(".java");

		File directory = new File("C:/Learning/J-8/src/org/learn");
		File[] files = directory.listFiles(lambdaFileFilter);

		for (File f : files) {
			System.out.println(f);
		}

	}

}
