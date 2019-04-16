package datastruct;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class LinkedListTest {
    private LinkedList linkedList = new LinkedList();

    @Before
    public void init() {
        linkedList.clear();
        linkedList.insert(38);
        linkedList.insert(49);
        linkedList.insert(13);
        linkedList.insert(15);
    }

    @Test
    public void shouldInsertValue() {
        linkedList.insert(25);
        assertThat(linkedList.find(25).getValue(), is(25));
    }

    @Test
    public void shouldFindValue() {
        assertThat(linkedList.find(49).getValue(), is(49));
    }

    @Test
    public void shouldNotFindValue() {
        assertThat(linkedList.find(25), is(nullValue()));
    }

    @Test
    public void shouldDeleteAtValue() {
        linkedList.deleteAt(1);
        assertThat(linkedList.find(13), is(nullValue()));
    }

    @Test
    public void shouldNotDeleteAnything() {
        linkedList.deleteAt(5);
    }

    @Test
    public void shouldGetSize() {
        assertThat(linkedList.size(), is(4));
    }

    @Test
    public void shouldClear() {
        linkedList.clear();
        assertThat(linkedList.size(), is(0));
    }
}
