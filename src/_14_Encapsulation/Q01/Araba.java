package _14_Encapsulation.Q01;

public class Araba {
  private  String model;
  private  String renk;
  private  int motor;
  private  int yil;

    public Araba(String model, String renk, int motor, int yil) {
        this.model = model;
        setRenk(renk);
        //this.renk = renk;
        //this.motor = motor;
        setMotor(motor);
        this.yil = yil;
    }
    Araba(){

    }
    Araba(String model, String renk,int motor){
        this.model = model;

        //this.renk = renk;
        //this.motor = motor;
        setMotor(motor);
        setRenk(renk);

    }
    Araba(String model, int yil){
        this.model = model;
        this.yil = yil;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        if (renk.contains("yesil")||renk.contains("beyaz")||renk.contains("gri")) {
            this.renk = renk;
        }else{
            System.out.println("girdiginiz renkte araba bulunmamakatadir");
        }
    }

    public int getMotor() {

        return motor;
    }

    public void setMotor(int motor) {
        if (motor <1000){
            System.out.println("gecerli bir motor hacmi degildir. 1000 den yüksek olmalıdir");
        }else
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {

        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
