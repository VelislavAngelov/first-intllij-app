package com.company;

public class Main {

    public static void main(String[] args) {
        String s = "Vely";
        if(args.length>0){
            s = args[0];
        }
        Main m = new Main();
        m.run();



    }

    private void run() {

        System.out.println("Hello Vely !");
    }
}
