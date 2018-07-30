package fr.lecomptoirdespharmacies.core.helpers;

import fr.lecomptoirdespharmacies.entities.Base;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListHelperTest {

    private List<Base> list1 = new ArrayList<>();

    private List<Base> list2 = new ArrayList<>();

    @BeforeEach
    void setUp(){
        Base base1 = new Base();
        base1.id = "1";
        base1.title = "Base 1";
        base1.vidalId = 1L;

        Base base2 = new Base();
        base2.id = "2";
        base2.title = "Base 2";
        base2.vidalId = 2L;

        Base base3 = new Base();
        base3.id = "3";
        base3.title = "Base 3";
        base3.vidalId = 3L;

        list1.add(base1);
        list1.add(base2);
        list2.add(base3);
    }

    @Test
    void tooMuchElementShouldThrowsException(){
        assertThrows(
                Exception.class,
                () -> ListHelper.getObject(list1),
                "Too much element for this request."
        );
    }

    @Test
    void getObjectShouldReturnFirstElementOfList(){
        try {
            final Base base = ListHelper.getObject(list2);
            assertNotEquals(null, base);
            assertEquals("3", base.id);
        }catch (Exception e){
            fail(e.getMessage());
        }
    }

    @Test
    void mergeListShouldReturnMergedList(){
        final List<String> strings1 = Arrays.asList("One","Two");
        final List<String> strings2 = Arrays.asList("Three");
        List<String> strings3 = ListHelper.mergeList(strings1,strings2);
        assertEquals(3,strings3.size());
    }

}