package tv;

public class TV {

    private int canal;
    private int volum;
    private boolean on;


    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int canalulUrmator(){
        canal++;
        if (canal == 100){
            canal = 1;
        }
        if (isOn() == false){
            canal = 0;
        }

        return canal;
    }

    public int canalulPrecedet(){
        canal--;
        if (canal == 1){
            canal = 100;
        }
        if (isOn() == false){
            canal = 0;
        }
        return canal;
    }

    public int getCanal() {
        return canal;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public int cresteVolum(){
        volum++;
        if (volum == 50){
            volum = 50;
        }
        if (isOn() == false){
            volum = 0;
        }
        return volum;
    }

    public int scadeVolum(){
        volum--;
        if (volum == 0){
            volum = 0;
        }
        if (isOn() == false){
            volum = 0;
        }
        return volum;
    }

    public int getVolum() {
        return volum;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void tvIsOff(){
        if (!on){

        }
    }
}
