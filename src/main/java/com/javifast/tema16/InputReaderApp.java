package com.javifast.tema16;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class InputReaderApp {

	public void leerPorFileReader() throws IOException {
		Reader fr = null;
		try {
			fr = new FileReader("javifast.txt");
			int i = fr.read();

			while (i != -1) {
				System.out.println((char) i + "-" + i);
				i = fr.read();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (fr != null) {
				fr.close();
			}
		}
	}

	public void leerPorFileInputStream() throws IOException {

		//bytes[]
		long ini = System.currentTimeMillis();
		try (InputStream fis = new FileInputStream("javifast.png")) {

			byte[] arreglo = new byte[1024];
			int i = fis.read(arreglo);

			while (i != -1) {
				//System.out.println("bytes leidos " + i);
				i = fis.read(arreglo);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo InputStream bytes[] " + (fin - ini));
		
		//byte a byte
		ini = System.currentTimeMillis();
		try (InputStream fis = new FileInputStream("javifast.png")) {
			
			int i = fis.read();

			while (i != -1) {
				//System.out.println("bytes leidos " + i);
				i = fis.read();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo InputStream byte " + (fin - ini));
	}
	
	public void leerPorBufferedInputStream(){
		long ini = System.currentTimeMillis();
		
		int cantidad = 1024;
		try (InputStream fis = new BufferedInputStream(new FileInputStream("javifast.png"), cantidad)) {
			int i = fis.read();
			while(i != -1){				
				i = fis.read();				
			}
				
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		long fin = System.currentTimeMillis();
		
		System.out.println("Tiempo BufferedInputStream " + (fin - ini));
	}

	public static void main(String[] args) throws IOException {
		InputReaderApp app = new InputReaderApp();
		app.leerPorFileInputStream();
		app.leerPorBufferedInputStream();
	}
}
