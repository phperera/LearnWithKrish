package services;

public class RentProcessTaskRunner implements CommandLineRunner{

    @Autowired
    RentProcessService rentProcessService;
    public void run(String... args) throws Exception{
        if (args.length>0){
            System.out.println("tasks running with arguments");

        if(rentProcessService.validateDL(args[0])){
            System.out.println("Valid DL");
        }else {
            System.out.println("Invalid DL");
        }}else
            {
                System.out.println("task running without arguments");}
        }
    }

}
