package Day24_SINGLETON_Task;
public class CheckBank {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        String currentTime = args[0];
        if(currentTime>9 && currentTime<17){
            bank.setStatus("Open");
        }else{
            bank.setStatus("Closed");
        }
        System.out.println("Bank status: " + bank.getStatus());
    }
}
