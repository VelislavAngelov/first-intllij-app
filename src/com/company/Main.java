package com.company;

public class Main {

     String name;

    public Main(String me) {
        name=me;
    }

    public static void main(String[] args) {
        String s = "Vely";
        if(args.length>0){
            s = args[0];
        }
        Main m = new Main(s);
        m.run();



    }

    private void run() {

        System.out.println("Hello " + name);
    }
}
