package chapter8.factory.leifeng;

public class LeiFen {

    public void sweep(){
        System.out.println("do sweep");
    }

    public void wash(){
        System.out.println("do wash");
    }


    public void action(){
        sweep();
        wash();
    }

}
