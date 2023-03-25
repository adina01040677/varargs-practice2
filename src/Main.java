import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       // varargs(new int[]{22, 19, 17}, "Nurayiym", "Adina", "Bayastan");
//  System.out.println(a.endsWith("na")); Возвращает boolean значение. Проверяет наличие вами данной строки в конце
//  System.out.println(a.startsWith("Mal")); Тоже возвращает boolean значение. Проверяет наличие данной вами строки в начале
   //     System.out.println(a.indexOf('a')); // Возвращает индекс вам данного символа
//        static void varargs( String ... varargs){
//            for (String vararg : varargs) {
//                System.out.print(vararg+" ");
//            }
//
//            System.out.println();
//            for (int i = 2; i < varargs.length; i++) {
//                System.out.print(varargs[i]+" ");
//            }



//    static void varargs( int[] age, String... varargs) {
//        for (int i = 0; i < age.length; i++) {
//            System.out.println(varargs[i] + " "+age[i]);
//        }
     String a = "  I like java!!!";
        System.out.println(a.charAt(a.length()-1));
         System.out.println(a.startsWith("  I like"));
         System.out.println(a.endsWith( "!!!"));
        System.out.println(a.contains("java"));
        System.out.println(a.replace("a","o"));
        String word = a.substring(9,13);
        System.out.println(word.toUpperCase(Locale.ROOT));
        System.out.println(word.toLowerCase(Locale.ROOT));
        System.out.println(a.length());
        System.out.println(a.trim());
     }
    }


