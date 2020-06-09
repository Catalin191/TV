package tv;

public class Main {

    public static void main(String[] args) {

        TV tv = new TV();

        tv.setOn(false);

        if (tv.isOn()){

        tv.setCanal(10);
        tv.canalulUrmator();
        System.out.println(tv.getCanal());

        tv.canalulPrecedet();
        System.out.println(tv.getCanal());

        tv.setVolum(34);
        tv.cresteVolum();
        System.out.println(tv.getVolum());
        tv.scadeVolum();
        System.out.println(tv.getVolum());

        }else {
            tv.cresteVolum();
            System.out.println(tv.getVolum());
            System.out.println("TV is of");

        }


    }
}
