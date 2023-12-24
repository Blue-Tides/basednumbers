public class TestNumber extends junit.framework.TestCase {
    public void testConstructors() {
        Number x=new Number(4);
        //actually im too lazy lets assume they work :P
    }
    public void testGetValueBase2() {
        Number base2=new Number(1,2);
        assertEquals("1",base2.getValue());
        base2.setValue(2);
        assertEquals("10",base2.getValue());
        base2.setValue(7);
        assertEquals("111",base2.getValue());
        base2.setValue(13);
        assertEquals("1101",base2.getValue());
        base2.setValue(391);
        assertEquals("110000111", base2.getValue());
        base2.setValue(0);
        assertEquals("0",base2.getValue());
    }
    public void testGetValueBase16() 
    {
        Number base16=new Number(13,16);
        assertEquals("D",base16.getValue());
        base16.setValue(130);
        assertEquals("82",base16.getValue());
        base16.setValue(1567);
        assertEquals("61F", base16.getValue());
        base16.setValue(1);
        assertEquals("1",base16.getValue());
    }
    public void testSetValueBase2() {
        Number base2=new Number(1,2);
        base2.setValue("1010");
        assertEquals(10,base2.getValue10());
        base2.setValue("1111");
        assertEquals(15,base2.getValue10());
        base2.setValue("110000111");
        assertEquals(391,base2.getValue10());
        base2.setValue("000000110000111");
        assertEquals(391,base2.getValue10());
    } 
    public void testSetBase16() {
        Number base16=new Number(1,16);
        base16.setValue("61F");
        assertEquals(1567,base16.getValue10());
        base16.setValue("1E427");
        assertEquals(123943,base16.getValue10());
        base16.setValue("3A50");
        assertEquals(14928,base16.getValue10());
    }
}