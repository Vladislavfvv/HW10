import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringEx obj = new StringEx("1234-abc-5558-rty-1a2b");
        //String mystr = "1234-qwe-5678-rty-1q2y";
//        System.out.println("¬ведите строку в формате: xxxx-yyy-xxxx-yyy-xyxy" +
//                "где х - это число, а у - единица");
//        Scanner scanner = new Scanner(System.in);
//        obj.setStr1(scanner.nextLine());
//        System.out.println(obj.str1.toString());
//        System.out.println(mystr.substring(0, 4) + mystr.substring(10, 13));

        StringEx.partOfStringTask1(obj.getStr1());
        System.out.println();
        StringEx.changeOnStarsTask1(obj.getStr1());
        System.out.println();
        StringEx.replaceCharTask1(obj.getStr1());

        StringEx.replaceWithStringBuilder(obj.getStr1());
        System.out.println();
        StringEx.checkABC(obj.getStr1());
        StringEx.check555(obj.getStr1());
        StringEx.check1a2b(obj.getStr1());


        StringEx obj2 = new StringEx("Sasha 35 Vasya 125test 35 qwertyuiop");
        StringEx.findShortSubstring(obj2.getStr1());

        StringEx obj3 = new StringEx("32 aaa 11111 fffff ab f 1234 jkjk");
        StringEx.findWordForTask3(obj3.getStr1());

        StringEx obj31 = new StringEx("32 aaa 11111 fffff ab f 1234 jkjk");
        StringEx.findWordForTask31(obj31.getStr1());

        StringEx obj4 = new StringEx("palidro0m  Occomocco test oo11oo mouse testset");
        StringEx.palidrom(obj4.getStr1());

        StringEx obj5 = new StringEx("palidro0m  Occomocco test oo11oo mouse testset");
        StringEx.checkOnPalidrom(obj5.getStr1());

        StringEx obj6 = new StringEx("Hello");
        StringEx.dublicate(obj6.getStr1());
    }
}
