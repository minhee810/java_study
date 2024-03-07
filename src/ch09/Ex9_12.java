package ch09;

public class Ex9_12 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);
        sb.append('5').append(56);
        // sb = 0123556

        StringBuffer sb3 = sb.append(78);  // sb = 012345678
        sb3.append(9.0);  // sb = 0123456789.0

        System.out.println("sb = " + sb); // sb = 0123456789.0
        System.out.println("sb2 = " + sb2); // sb2 = 0123456789.0
        System.out.println("sb3 = " + sb3); // sb3 = 0123456789.0

        System.out.println();

        System.out.println("sb = " + sb.deleteCharAt(10)); // sb = 01234567890
        System.out.println("sb = " + sb.delete(3, 6));  // sb = 0127890
        System.out.println("sb = " + sb.insert(3, "abc"));  // sb = 012abc7890
        System.out.println("sb = " + sb.replace(6, sb.length(), "END"));  // sb = 012abcEND

        System.out.println("capacity = " + sb.capacity()); // 18
        System.out.println("length = " + sb.length()); // 9

        /*
        * sb = 0123556789.0
        sb2 = 0123556789.0
        sb3 = 0123556789.0

        sb = 01235567890
        sb = 01267890
        sb = 012abc67890
        sb = 012abcEND
        capacity = 18
        length = 9
        * */

    }
}
