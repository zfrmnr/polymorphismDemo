public class Main {

    public static void main(String[] args) {

     //   EmailLogger logger=new EmailLogger(); deneme1

       // logger.log("E mail log mesajı");      deneme1

     /*   BaseLogger[] loggers =new BaseLogger[]{new FileLogger(),new EmailLogger(),new DataBaseLogger(),new ConsoleLogger() };

        for (BaseLogger logger : loggers ){


            logger.log("   log mesajı:::::");  /* deneme2
        }


      */
        CustomerManager customerManager=new CustomerManager(new DataBaseLogger());
        customerManager.Add();







    }
}
