import com.detectlanguage.DetectLanguage;
import com.detectlanguage.Result;
import commandline.CommandLineApp;
import picocli.CommandLine;

import java.util.List;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  01:31 PM
 */
public class Main {

    public static void main(String[] args) throws Exception {

        DetectLanguage.apiKey = "f6454aefb7cd00e46e56974ecc0ea137";

        List<Result> results = DetectLanguage.detect("Ala ma kota");

        Result result = results.get(0);

        System.out.println("Language: " + result.language);
        System.out.println("Is reliable: " + result.isReliable);
        System.out.println("Confidence: " + result.confidence);


        if (args.length > 0) {
            CommandLineApp cla = new CommandLineApp();
            new CommandLine(cla).parse(args);
            cla.run();
        } else {
            System.out.println("This programme is not running without entry parameters!");
        }

    }
}
