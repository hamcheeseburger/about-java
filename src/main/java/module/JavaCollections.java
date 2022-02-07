package module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class JavaCollections {
    public List<String> getUnmodifiableList() {
        ArrayList<String> list = new ArrayList<>();
        return Collections.unmodifiableList(list);
    }

}
