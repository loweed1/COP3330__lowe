import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactItemTest {

    ContactItem c= new ContactItem();
    @Test
    void creationFailsWithAllBlankValues()
    {
        assertEquals(false,c.canAddItem("", "", "", ""));
    }

    @Test
    void creationSucceedsWithBlankEmail()
    {
        assertEquals(true,c.canAddItem("fn", "ln", "123-456-1234", ""));
    }

    @Test
    void creationSucceedsWithBlankFirstName()
    {
        assertEquals(true,c.canAddItem("", "ln", "123-456-1234", "em"));
    }
    @Test
    void creationSucceedsWithBlankLastName()
    {
        assertEquals(true,c.canAddItem("fn", "", "123-456-1234", "em"));
    }
    @Test
    void creationSucceedsWithBlankPhone()
    {
        assertEquals(true,c.canAddItem("fn", "ln", "", "em"));
    }
    @Test
    void creationSucceedsWithNonBlankValues()
    {
        assertEquals(true,c.canAddItem("fn", "ln", "123-456-1234", "em"));
    }

    @Test
    void editingFailsWithAllBlankValues()
    {
        assertEquals(false,c.setFirstName("")&&c.setLastName("")&&c.setEmailAddress("")&&c.setPhoneNumber(""));
    }

    @Test
    void editingSucceedsWithBlankEmail()
    {
        assertEquals(true,c.canAddItem("fn", "ln", "123-456-1234", ""));
    }

    @Test
    void editingSucceedsWithBlankFirstName()
    {
        assertEquals(true,c.canAddItem("", "ln", "123-456-1234", "em"));
    }

    @Test
    void editingSucceedsWithBlankLastName()
    {
        assertEquals(true,c.canAddItem("fn", "", "123-456-1234", "em"));
    }

    @Test
    void editingSucceedsWithBlankPhone()
    {
        assertEquals(true,c.canAddItem("fn", "ln", "", "em"));
    }

    @Test
    void editingSucceedsWithNonBlankValues()
    {
        assertEquals(true,c.canAddItem("fn", "ln", "123-456-1234", "em"));
    }

    @Test
    void testToString()
    {
        c.canAddItem("fn", "ln", "123-456-1234", "em");
        assertEquals("Name:fnlnPhone:123-456-1234Email:em",c.ToString());
    }
}

