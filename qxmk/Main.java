package qxmk;

import java.util.Objects;

import static qxmk.ejz.ejzto;
import static qxmk.ejz.toejz;

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("----错误----\n格式：\n   加密： 1 要加密的内容 key\n   解密： 2 要解密的内容 key");
        } else {
            if (Objects.equals(args[0], "1")) {
                System.out.println(toejz(args[1], args[2]));
            } else if (Objects.equals(args[0], "2")) {
                System.out.println(ejzto(args[1], args[2]));
            }
        }
    }
}