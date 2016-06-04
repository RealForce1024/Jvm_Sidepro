package OOM;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Jvm args: -Xmx20M -XX:MaxDirectMemorySize=10M
 * Created by fqc on 6/4/16.
 * 极有可能导致机器死机..慎执行
 */
public class DirectMemoryOOM {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);

        while (true) {
            unsafe.allocateMemory(_1MB);
        }

    }

}
