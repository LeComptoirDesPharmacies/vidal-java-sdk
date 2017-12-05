package fr.lecomptoirdespharmacies.core.helpers;

import fr.lecomptoirdespharmacies.entities.AbstractBase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListHelper {

    public static <T extends AbstractBase>  T getObject(List<T> objects) throws Exception{
        if(objects.size() == 1){
            return objects.get(0);
        } else if (objects.size() > 1) {
            throw new Exception("Too much element for this request.");
        }
        return null;
    }

    public static List<String> mergeList(List<String> list1, List<String> list2){
        return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
    }
}
