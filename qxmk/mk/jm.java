package qxmk.mk;

public class jm {
    public static String jam(String src, String keys) {
        String[] key = keys.split("");
        String a, b;
        if (src.contains("10")) {
            a = src.replace("10", key[0]);
        } else {
            a = src;
        }
        if (a.contains("01")) {
            b = a.replace("01", key[1]);
        } else {
            b = a;
        }
        if (b.contains(" ")) {
            a = b.replace(" ", key[2]);
        } else {
            a = b;
        }
        if (a.contains(key[0] + "0")) {
            b = a.replace(key[0] + "0", key[3]);
        } else {
            b = a;
        }
        if (b.contains(key[0] + "1")) {
            a = b.replace(key[0] + "1", key[4]);
        } else {
            a = b;
        }
        if (a.contains(key[1] + "0")) {
            b = a.replace(key[1] + "0", key[5]);
        } else {
            b = a;
        }
        if (a.contains(key[1] + "1")) {
            b = a.replace(key[1] + "1", key[6]);
        } else {
            b = a;
        }
        if (b.contains("-")) {
            a = b.replace("-", key[7]);
        } else {
            a = b;
        }
        return a;
    }
    public static String jem(String src, String keys) {
        String[] key = keys.split("");
        String a, b;
        if (src.contains(key[7])) {
            a = src.replace(key[7], "-");
        } else {
            a = src;
        }
        if (a.contains(key[6])) {
            b = a.replace(key[6], key[1] + "1");
        } else {
            b = a;
        }
        if (b.contains(key[5])) {
            a = b.replace(key[5], key[1] + "0");
        } else {
            a = b;
        }
        if (a.contains(key[4])) {
            b = a.replace(key[4], key[0] + "1");
        } else {
            b = a;
        }
        if (b.contains(key[3])) {
            a = b.replace(key[3], key[0] + "0");
        } else {
            a = b;
        }
        if (a.contains(key[2])) {
            b = a.replace(key[2], " ");
        } else {
            b = a;
        }
        if (b.contains(key[1])) {
            a = b.replace(key[1], "01");
        } else {
            a = b;
        }
        if (a.contains(key[0])) {
            b = a.replace(key[0], "10");
        } else {
            b = a;
        }
        return b;
    }
}
