import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEx {
    String str1;

    public StringEx(String str1) {
        this.str1 = str1;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public static void partOfStringTask1(String s) {
        String[] arr = s.split("-");
        //List<String> myList = new ArrayList<String>();
        //String[] arr1 = new String[10];
        String regex = "(\\d{4})";
        for (String a : arr) {
            if (a.matches(regex)) {
                System.out.print(a);
            }
        }
        //return myList;
    }

    public static void changeOnStarsTask1(String s) {
        String[] arr = s.split("-");
        String regex = "([a-zA-Z]{3})";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].matches(regex)) {
                arr[i] = "***";
            }
            if (i < arr.length - 1) System.out.print(arr[i] + "-");
            else System.out.print(arr[i]);
        }
    }

    public static void replaceCharTask1(String s) {
        String regex1 = "(\\d{1,4})";
        String s1 = s.replaceAll("-", "")
                .replaceAll(regex1, "/")
                .substring(1)
                .toLowerCase();
        System.out.println(s1);
    }

    public static void replaceWithStringBuilder(String s) {
        String s1 = s.toUpperCase();
        StringBuilder sb = new StringBuilder(s1);
        sb.delete(0, 5).insert(3, "/")
                .delete(4, 10)
                .delete(7, 9)
                .delete(8, 9)
                .insert(8, "/")
                .insert(7, "/")
                .insert(0, "\"Letters:")
                .append("\"");
        System.out.print(sb);
    }

    public static void checkABC(String s) {
        Pattern pattern = Pattern.compile("([a-cA-C]{3})");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) System.out.println("����� ��������� �������� ������������������ abc");
        else System.out.println("����� ��������� �� �������� ������������������ abc");
    }

    public static void check555(String s) {
        Pattern pattern = Pattern.compile("([555]{3})");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) System.out.println("����� ��������� �������� ������������������ 555");
        else System.out.println("����� ��������� �� �������� ������������������ 555");
    }

    public static void check1a2b(String s) {//18-21
        System.out.println(s.substring(18, 22));
        if (s.substring(18, 22).contains("1a2b"))
            System.out.println("����� ��������� �������� ������������������ 1a2b");
        else System.out.println("����� ��������� �� �������� ������������������ 1a2b");
    }


    public static void findShortSubstring(String s) {
        String[] arr = s.split(" ");
        String min;
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i; j >= 0; j--)
                if (arr[j].toCharArray().length > arr[j + 1].toCharArray().length) {
                    min = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = min;
                }
        System.out.println("��� ��������������� ������ ����: " + Arrays.toString(arr));
        System.out.println("����� �������� �����: " + arr[0]);
        System.out.println("����� ������� �����: " + arr[arr.length - 1]);
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) == 0) k = i + 1;
        }
        System.out.println(arr[k]);
    }


    public static void findWordForTask3(String s) {
        String pattern = "(?:a{2,})|(?:b{2,})|(?:c{2,})|(?:d{2,})|(?:e{2,})|(?:f{2,})" +
                "|(?:g{2,})|(?:h{2,})|(?:i{2,})|(?:j{2,})|(?:k{2,})|(?:l{2,})" +
                "|(?:m{2,})|(?:n{2,})|(?:o{2,})|(?:p{2,})|(?:q{2,})|(?:r{2,})" +
                "|(?:s{2,})|(?:t{2,})|(?:u{2,})|(?:v{2,})|(?:w{2,})|(?:x{2,})|(?:y{2,})|(?:z{2,})" +
                "|(?:1{2,})|(?:2{2,})|(?:3{2,})|(?:4{2,})|(?:5{2,})|(?:6{2,})|(?:7{2,})|(?:8{2,})|(?:9{2,})|(?:0{2,})|(?:\\+{2,})";
        Pattern ptrn = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = ptrn.matcher(s);
        if (matcher.find()) {
            System.out.println("�����, ������� �������� ����������� ���������� ������ ��������: " + matcher.group(0));
        } else {
            System.out.println("������ ����� ���");
        }
    }

    public static void findWordForTask31(String s) {
        String[] arr = s.split(" ");
        int rez = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            char[] ch = arr[i].toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (ch[0] == ch[j]) count++;
                if (count == ch.length + 1) System.out.println("Variant 2: " + arr[i]);
            }

        }


//        String pattern = "(?:a{2,})|(?:b{2,})|(?:c{2,})|(?:d{2,})|(?:e{2,})|(?:f{2,})" +
//                "|(?:g{2,})|(?:h{2,})|(?:i{2,})|(?:j{2,})|(?:k{2,})|(?:l{2,})" +
//                "|(?:m{2,})|(?:n{2,})|(?:o{2,})|(?:p{2,})|(?:q{2,})|(?:r{2,})" +
//                "|(?:s{2,})|(?:t{2,})|(?:u{2,})|(?:v{2,})|(?:w{2,})|(?:x{2,})|(?:y{2,})|(?:z{2,})" +
//                "|(?:1{2,})|(?:2{2,})|(?:3{2,})|(?:4{2,})|(?:5{2,})|(?:6{2,})|(?:7{2,})|(?:8{2,})|(?:9{2,})|(?:0{2,})|(?:\\+{2,})";
//        Pattern ptrn = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = ptrn.matcher(s);
//        if (matcher.find()) {
//            System.out.println("�����, ������� �������� ����������� ���������� ������ ��������: " + matcher.group(0));
//        } else {
//            System.out.println("������ ����� ���");
//        }
    }

    public static void palidrom(String s) {
        String s1 = s.toLowerCase();
        if ((s1 == "null") || (s1.length() == 0)) {
            System.out.println("������ ������");
        } else {
            String[] arr = s1.split(" ");
            for (int i = 0; i < arr.length; i++) {
                String str = new StringBuffer(arr[i]).reverse().toString();
                if (arr[i].equals(str)) {
                    System.out.println("���������: " + arr[i]);
                }
            }
        }
    }

    public static void checkOnPalidrom(String s) {
        System.out.println("���� ������:\n" + s);
        System.out.println("������� ����� �����, ������� ������ ���������: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s1 = s.toLowerCase();
        String[] arr = s1.split(" ");
        int size = arr.length - 1;
        if ((s1 == "null") || (s1.length() == 0)) {
            System.out.println("������ ������");
        } else if (n > arr.length) {
            System.out.println("������� �������� �����, ��� ��� � ������ ����� " + size + " ����");
        } else {
            String str = new StringBuffer(arr[n]).reverse().toString();
            if (arr[n].equals(str)) {
                System.out.println("����� " + arr[n] + " �������� ����������");
            } else {
                System.out.println("����� " + arr[n] + " �� �������� ����������");
            }
        }
    }


    public static void dublicate(String s) {
        System.out.println("���� ������" + s);
        char[] chars = s.toCharArray();
        char[] newchar = new char[chars.length * 2];
        for (int i = 0, t = 0; i < newchar.length; i++) {
            if (i % 2 == 0) {
                newchar[i] = chars[t];
            } else {
                newchar[i] = chars[t];
                t++;
            }
        }
        String newString = new String(newchar);
        System.out.println("���� ����� ������: " + newString);

/*
        StringBuffer strBuffer = new StringBuffer(s);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.setLength(strBuffer.length() * 2);
        for (int j = 0, k = 0; j < stringBuffer2.length();  j++) {
            if (j % 2 == 0) stringBuffer2.insert(j, chars[k]);
            else {
                stringBuffer2.insert(j, chars[k]);
                k++;
            }
        }
        System.out.println(stringBuffer2.toString());
*/

    }
}

