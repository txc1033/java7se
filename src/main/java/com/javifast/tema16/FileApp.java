package com.javifast.tema16;

import java.io.File;
import java.io.IOException;

public class FileApp {

	public static void main(String... javierMS) throws IOException {
		
		File f1 = new File("Archivos");
		
		File f2 = new File("Archivos","SubArchivos");
		
		File f3 = new File(f1, "javifast.txt");
		
		System.out.println(f3.createNewFile());
		
	}
}
