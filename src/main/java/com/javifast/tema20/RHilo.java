package com.javifast.tema20;

public class RHilo implements Runnable {

    @SuppressWarnings("FieldMayBeFinal")
    private int id;

    public RHilo(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("[R]Ejecuntándose hilo de id -->" + id);
        }

    }

}
