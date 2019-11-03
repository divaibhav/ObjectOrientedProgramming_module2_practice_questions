/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 03-Nov-19
 *  Time: 4:09 PM
 */
package wrapper.question1;

public class Solution1 {
    public static void main(String[] args) {
        Integer objInteger = new Integer(10);
        Byte objByte = new Byte((byte) 12);
        Short objShort = new Short((short) 15);
        Long objLong = new Long(123L);
        Double objDouble = new Double(12.34);
        Float objFloat = new Float(12.3f);
        Boolean objBoolean = new Boolean(true);
        Character objCharacter = new Character('c');

        System.out.println(objInteger);
        System.out.println(objBoolean);
        System.out.println(objByte);
        System.out.println(objDouble);
        System.out.println(objCharacter);
        System.out.println(objFloat);
        System.out.println(objLong);
        System.out.println(objShort);

    }
}
