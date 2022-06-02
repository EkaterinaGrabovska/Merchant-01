package ProgectMerchant;

public class MerchantA extends Merchant implements Bonus {
    String email;

    public MerchantA(String name, String phone, String email,String surname) {
        super(name, phone, surname);
        this.email = email;
    }

    public String infoMerchant() {
        String name = getName();
        String phone = getPhone();
        String surname=getSurname();
        return "\nMerchant: " + name + ", "+"  "+surname+" , " + phone + ", " + email + "\n";
    }

    @Override
    public double calcBonus(double sales) {
        if (sales <= 10000) {
            return sales * 5 / 100;
        } else if (sales > 10000 && sales <= 30000) {
            return sales * 10 / 100;
        } else if (sales >30000 && sales <=60000){
            return sales * 15 / 100;
        } else return sales *20/100;
    }
}
