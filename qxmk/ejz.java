package qxmk;

import static qxmk.mk.jm.jam;
import static qxmk.mk.jm.jem;

public class ejz {
    public static String toejz(String str, final String key) {
        final String k = key.split("")[8];
        final byte[] bytes = str.getBytes();
        if (bytes.length > 1) {
            String a;
            StringBuilder fh = new StringBuilder();
            String kk;
            for (int i = 0; i < bytes.length; i++) {
                a = jam(Integer.toString(bytes[i], 2), key);
                if (i < bytes.length - 1) {
                    kk = k;
                } else {
                    kk = "";
                }
                fh.append(a).append(kk);
            }
            return String.valueOf(fh);
        } else {
            return jam(Integer.toString(bytes[0], 2), key);
        }
    }
    public static String ejzto(String src, final String key) {
        final String k = key.split("")[8];
        if (src.contains(k)) {
            src = src.replace(k, ",");
            src = jem(src, key);
            String[] sr = src.split(",");
            byte[] bytes = new byte[sr.length];
            for (int i = 0; i < sr.length; i++) {
                bytes[i] = (byte) Integer.parseInt(sr[i], 2);
            }
            return new String(bytes, 0, bytes.length);
        } else {
            byte[] bytes = new byte[]{(byte) Integer.parseInt(jem(src, key), 2)};
            return new String(bytes, 0, 1);
        }
    }
}
