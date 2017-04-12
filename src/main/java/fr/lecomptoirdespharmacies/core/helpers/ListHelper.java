package fr.lecomptoirdespharmacies.core.helpers;

import fr.lecomptoirdespharmacies.entities.BaseEntity;

import java.util.List;

public class ListHelper {

    public static <T extends BaseEntity>  T getObject(List<T> objects) throws Exception{
        if(objects.size() == 1){
            return objects.get(0);
        } else if (objects.size() > 1) {
            throw new Exception("Too much element for this request.");
        }
        return null;
    }
}
