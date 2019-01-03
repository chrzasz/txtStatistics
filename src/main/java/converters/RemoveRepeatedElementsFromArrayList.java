package converters;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Grzegorz Chrzaszczyk on 03-01-2019  11:22 PM
 */
public class RemoveRepeatedElementsFromArrayList {

  private List<String> lst= new ArrayList<>();

  public void removeDuplicates( List<String> list) {

    // remove duplicate element without affecting order
    // LinkedHashSet will guaranteed the order and since it's set
    // it will not allow us to insert duplicates.
    // repeated elements will automatically filtered.

    Set<String> setWithoutDuplicates = new LinkedHashSet<>(list);

    lst.clear();
    lst.addAll(setWithoutDuplicates);

  }
}
