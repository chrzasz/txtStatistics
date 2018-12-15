package analyzer;

/**
 * Created by Grzegorz Chrzaszczyk on 09-12-2018  12:48 PM
 */
public interface Analyzer<T> {

    T analyze (String text);
}