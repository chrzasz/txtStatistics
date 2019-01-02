import commandline.CommandLineApp;
import picocli.CommandLine;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  01:31 PM
 */
public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length > 0) {
            CommandLineApp cla = new CommandLineApp();
            new CommandLine(cla).parse(args);
            cla.run();
        } else {
            System.out.println("This programme is not running without entry parameters!");
        }

    }
}
