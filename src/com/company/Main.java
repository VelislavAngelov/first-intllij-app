package com.company;

public class Main {

     private  String myName;

    public Main(String me) {
        myName =me;
    }
    private void run() {

        System.out.println("Hello " + getMyName());
    }
    public String getMyName(){
        return myName;
    }

    public static void main(String[] args) {
        String s = "Vely";
        if(args.length>0){
            s = args[0];
        }
        Main m = new Main(s);
        m.run();
    }
}
