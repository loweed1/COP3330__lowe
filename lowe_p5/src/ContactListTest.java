import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactListTest {

    ContactList list = new ContactList();
    @Test
    void addingItemsIncreasesSize() {
        int size = list.getSize();
        list.AddItemToList("fn","ln","123-345-6789","e@gmain.com");
        assertEquals(size+1,list.getSize());
    }

    @Test
    void editingItemsFailsWithAllBlankValues() {
        assertEquals(false,list.EditItemToList(0,"","","",""));
    }

    @Test
    void editingItemsFailsWithInvalidIndex() {
        assertEquals(false,list.EditItemToList(1,"fn","ln","123-345-6789","e@gmain.com"));
    }

    @Test
    void editingSucceedsWithBlankFirstName() {
        list.AddItemToList("fn","ln","123-345-6789","e@gmain.com");
        assertEquals(true,list.EditItemToList(0,"","ln","123-345-6789","e@gmain.com"));
    }

    @Test
    void editingSucceedsWithBlankLastName() {
        list.AddItemToList("fn","ln","123-345-6789","e@gmain.com");
        assertEquals(true,list.EditItemToList(0,"fn","","123-345-6789","e@gmain.com"));
    }

    @Test
    void editingSucceedsWithBlankPhone() {
        list.AddItemToList("fn","ln","123-345-6789","e@gmain.com");
        assertEquals(true,list.EditItemToList(0,"fn","ln","","e@gmain.com"));
    }

    @Test
    void editingSucceedsWithNonBlankValues() {
        list.AddItemToList("fn","ln","123-345-6789","e@gmain.com");
        assertEquals(true,list.EditItemToList(0,"fn","ln","123-345-6789","e@gmain.com"));
    }

    @Test
    void newListIsEmpty() {
        list = new ContactList();
        assertEquals(0,list.getSize());
    }

    @Test
    void removingItemsDecreasesSize() {
        list.AddItemToList("fn","ln","123-345-6789","e@gmain.com");
        int size = list.getSize();
        list.removeContacts(0);
        assertEquals(size-1,list.getSize());

    }

    @Test
    void removingItemsFailsWithInvalidIndex() {
        assertEquals(false,list.removeContacts(1));
    }

    @Test
    void savedContactListCanBeLoaded() {
        assertEquals(true,list.LoadExistingContactList());
    }

}
