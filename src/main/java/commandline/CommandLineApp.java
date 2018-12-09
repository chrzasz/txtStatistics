package commandline;

import picocli.CommandLine.Parameters;
import picocli.CommandLine.Option;

import java.io.File;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  01:32 PM
 */
public class CommandLineApp {

    @Option(names = { "-v", "--verbose" }, description = "Be verbose.")
    private boolean verbose = false;

    @Parameters(arity = "1..*", paramLabel = "FILE", description = "File(s) to process.")
    private File[] inputFiles;

    //method run command line
    public void run(){


    }
}
