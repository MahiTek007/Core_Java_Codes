package Core_Java_Section_3.WrapperClasses;

public class Wrapper1 {
    /*
     * Wrapper Class:
     * 1. Wrapper Class is also known as non primitive data type.
     * 2. As we know that java is not puerly object oriented programming language.
     * so we need to represent the informatio in form of puerly object oriented format we can not use primitive datatype.
     * 3.Wrapper Class is the solution of the represent the information in form of object oriented formt ,
     * Wrapper Classes Extends the properties of Object Class.
     * 4. in Java Eight wrapper classes for eight primitive datatypes.
     * 5. No any wrapper class is available for String datatype because its already represented in form of class.
     * Following are the Eight of Wrapper Class:
     *    1.Integer
     * 2.Boolean
     * 3.Byte
     * 4.Short
     * 5.Long
     * 6.Float
     * 7.Double
     * 8.Character
     *
     * AutoBoxing and Unboxing of Wrapper Class:
     * 1.The Process of converting the Primitive information into a non-primitive information is done implicitly is known as auto boxing. 
     * in other words autoBoxing is  converting the simple information into Object oriented format.
     * 2.The Process of converting the non-primitive information into a Primitive information is done implicitly is known as auto Unboxing. 
     * in other words autoUnboxing is converting the object oriented information into simple format.
    */

    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer i1 = 20;
        System.out.println(i+i1);
    }
}
