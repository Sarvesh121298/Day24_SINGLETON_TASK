package Day24_SINGLETON_Task;
public class Bank {
    private static Bank instance;
    private String status;
    
    private Bank() {
        this.status = "Open";
    }
    
    public static Bank getInstance() {
        if (instance == null) {
            instance = new Bank();
        }
        return instance;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
