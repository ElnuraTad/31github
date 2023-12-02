public class CashMachine {
    private  int  get500;
    private  int get200;
    private  int get100;
    private  int get50;
    private  int get20;



    public  void addMoney(int add500, int add200,
                          int add100, int add50, int add20){
        add500 += get500;
        add200 += get200;
        add100 += get100;
        add50 += get50;
        add20 += get20;
    }



    public  void getMoney(int requestCash){
        if(requestCash % 10 != 0){
            System.out.println("Wrong sum, please enter correct sum");
        } else{
            boolean firstAnswer;
            if(get500 * 500 + get200 * 200 +
                    get100 * 100 + get50 * 50 + get20 + 20 >= requestCash){
                firstAnswer = true;
            } else {
                firstAnswer = false;
                System.out.println("not enough money");
            }
        }




    }

}
