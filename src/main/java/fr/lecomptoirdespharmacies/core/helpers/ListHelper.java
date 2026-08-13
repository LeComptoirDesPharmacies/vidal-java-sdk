package fr.lecomptoirdespharmacies.core.helpers;

import fr.lecomptoirdespharmacies.core.exceptions.VidalResponseException;
import fr.lecomptoirdespharmacies.entities.AbstractBase;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListHelper {

    /**
     * @throws VidalResponseException if Vidal returned more than the single element expected
     */
    public static <T extends AbstractBase>  T getObject(List<T> objects) {
        if(Objects.isNull(objects) || objects.isEmpty())
            return null;

        if(objects.size() == 1){
            return objects.get(0);
        } else {
            throw new VidalResponseException("Too much element for this request.", null);
        }
    }

    public static List<String> mergeList(List<String> list1, List<String> list2){
        return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
    }
}
