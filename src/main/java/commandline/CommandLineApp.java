package commandline;

import picocli.CommandLine.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  01:32 PM
 */
public class CommandLineApp {

    @Option(names = {"-V", "--version"}, versionHelp = true, description = "display version info")
    boolean versionInfoRequested;

    @Option(names = {"-v", "--verbose"}, description = "Be verbose.")
    private boolean verbose = false;

    @Parameters(index = "0", description = "File to process.")
    private File file;

    public void run() throws Exception {

        if (versionInfoRequested) showVersion();
        System.out.println("verbose = " + verbose);

//        File file = new File("C:\\Users\\admin\\IdeaProjects\\txtStatistics\\test1.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }

    private static void showVersion(){
        System.out.println("Version:1.0.0");
    }


}


