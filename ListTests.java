import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class ListTests {
    
    @Test 
	public void testFilterEmpty() {
        List<String> strList = new ArrayList<>();
        List<String> expectedList = new ArrayList<>();
        StringChecker sc = new strContains("a");
        assertArrayEquals(expectedList.toArray(), ListExamples.filter(strList, sc).toArray());
	}
    @Test 
	public void testFilter1() {
        List<String> strList = new ArrayList<>();
        List<String> expectedList = new ArrayList<>();
        strList.add("test");
        StringChecker sc = new strContains("a");
        assertArrayEquals(expectedList.toArray(), ListExamples.filter(strList, sc).toArray());
	}
    @Test 
	public void testFilter2() {
        List<String> strList = new ArrayList<>();
        List<String> expectedList = new ArrayList<>();
        strList.add("test");
        strList.add("a");
        expectedList.add("a");
        StringChecker sc = new strContains("a");
        assertArrayEquals(expectedList.toArray(), ListExamples.filter(strList, sc).toArray());
	}
    @Test 
	public void testFilterDupes() {
        List<String> strList = new ArrayList<>();
        List<String> expectedList = new ArrayList<>();
        strList.add("test");
        strList.add("test");
        strList.add("bc");
        strList.add("bc");
        expectedList.add("bc");
        expectedList.add("bc");
        StringChecker sc = new strContains("bc");
        assertArrayEquals(expectedList.toArray(), ListExamples.filter(strList, sc).toArray());
	}
    /*
        @Test 
        public void testFilterNull() {
            List<String> strList = new ArrayList<>();
            List<String> expectedList = new ArrayList<>();
            strList.add(null);
            strList.add("a&b");
            expectedList.add("a&b");
            StringChecker sc = new strContains("a&b");
            assertArrayEquals(expectedList.toArray(), ListExamples.filter(strList, sc).toArray());
        }
        @Test 
        public void testFilterNull2() {
            List<String> strList = new ArrayList<>();
            List<String> expectedList = new ArrayList<>();
            strList.add(null);
            strList.add("real");
            expectedList.add(null);
            StringChecker sc = new strContains(null);
            assertArrayEquals(expectedList.toArray(), ListExamples.filter(strList, sc).toArray());
	    }
    */
    @Test 
	public void testFilterOrder() {
        List<String> strList = new ArrayList<>();
        List<String> expectedList = new ArrayList<>();
        strList.add("aaron");
        strList.add("apple");
        strList.add("blueberry");
        strList.add("acorn");
        expectedList.add("aaron");
        expectedList.add("apple");
        expectedList.add("acorn");
        StringChecker sc = new strContains("a");
        assertArrayEquals(expectedList.toArray(), ListExamples.filter(strList, sc).toArray());
	}

    ////////////////////////////////////

    @Test 
	public void testMergeEmpty() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> expectedList = new ArrayList<>();
        assertArrayEquals(expectedList.toArray(), ListExamples.merge(list1, list2).toArray());
	}
    @Test 
	public void testMerge1Each() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        List<String> list2 = new ArrayList<>();
        list2.add("b");
        List<String> expectedList = new ArrayList<>();
        expectedList.add("a");
        expectedList.add("b");
        assertArrayEquals(expectedList.toArray(), ListExamples.merge(list1, list2).toArray());
	}
    
}

class strContains implements StringChecker {

    String sc;
    strContains(String sc) {
        this.sc = sc;
    }

    @Override
    public boolean checkString(String s) {
        return (s.contains(this.sc));
    }

} 
