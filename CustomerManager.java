public class CustomerManager{

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    private BaseLogger logger;


    public void Add(){

        System.out.println("musteri eklendi");
        this.logger.log("log mesajı  ");

    }


}
