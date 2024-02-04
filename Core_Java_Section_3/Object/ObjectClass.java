package Core_Java_Section_3.Object;

/**
 * ObjectClass
 */
public class ObjectClass {
        /*
         * Object Class:
         *  1. Object Class is decleared inside java.lang pkg.
         *  2. Object Class is supermost class of every java class thats why java is Object Oriented Programming language.
         * 
         *  Following are the methods of Object Class:
         *              1.getClass()
         *              2.toString()
         *             3.hashCode()
         *           4.equals()
         *        5.clone()
         *    6.notify()
         *    7.notifyAll()
         *    8.wait()
         * 
         */ 
           public static void main(String[] args) {
        TV tv1= new TV("Samsung",25000.00);
        TV tv2= new TV("Apple",30000.00);
        System.out.println(TV.class.getName());
        System.out.println(tv1.company);
        System.out.println(tv1.price);
        System.out.println(tv1);
        System.out.println(tv1.hashCode()==tv2.hashCode());
        System.out.println(tv1==tv2);
        System.out.println(tv1.equals(tv2));

    }
    
}