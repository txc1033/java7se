package com.javifast.tema14;

import java.io.IOException;

public class AppExcepciones {

	public void mostrar() {
		try {
			throw new IOException("IOException");
		} catch (NullPointerException | IOException | NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void main(String... javierMS) {
		AppExcepciones app = new AppExcepciones();
		app.mostrar();
	}
}
