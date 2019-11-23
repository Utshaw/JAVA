public class MyEnum {
    /*
    https://coursetro.com/courses/5/Getting-Started-with-Java/lessons/64
    Properties:
    Why use enums instead of constants: https://goo.gl/54fdPH (for type safety)
    Using enum we can enforce type safety & we can add some features with the enum constants(using constructor & give value for the constants)
    Constructor of enum is always private so, new can't be used to create objects
    All the constants declared in enum are static & final implicitly
    Though the name of the objects can't be changed but the value of associated with that object can be changed
    Actually  ,the constants are objects
    public static enum-type[] values() - return the array of Enum objects for Enumeration type for iteration
    Enum can't be subclassed
    Enum can implement interface
    Enum can't extend class
    Normal methods & variables can be declared just as we do in normal class
    The values we assign to this constants are not final & can be changed.
    compare two Enums using compare()
    e1 == e2 is same as e1.equals(e2)
    Enum can be used in switch statements
    
     */

    public static void main(String[] args) {

        ChineseMenu[] menu = ChineseMenu.values();
        for(ChineseMenu chineseMenu : menu)
        {
            System.out.println(chineseMenu + "  " + chineseMenu.getValue() + "  " +chineseMenu.ordinal());
        }
    }
}
