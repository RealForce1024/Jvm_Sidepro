package OOM;

import java.util.ArrayList;

/**
 * VM Args: -Xmx20m -Xms20m -XX:+HeapDumpOnOutOfMemoryError
 * Created by fqc on 6/4/16.
 */
public class HeapOOM {
    static class OOMObj {

    }

    public static void main(String[] args) {
        ArrayList<OOMObj> oomObjs = new ArrayList<>();
        while (true) {
            oomObjs.add(new OOMObj());
        }
    }
}

/**
 * /Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/bin/java -Xmx20m -Xms20m -XX:+HeapDumpOnOutOfMemoryError -Didea.launcher.port=7534 "-Didea.launcher.bin.path=/Applications/IntelliJ IDEA 15.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_77.jdk/Contents/Home/lib/tools.jar:/Users/fqc/github/scala_sidepro/out/production/jvm_sidepro:/Applications/IntelliJ IDEA 15.app/Contents/lib/idea_rt.jar" com.intellij.rt.execution.application.AppMain OOM.HeapOOM
 java.lang.OutOfMemoryError: Java heap space
 Dumping heap to java_pid7235.hprof ...    //--->>>>>>>>>>>java_pid7235.hprof 该文件产生20多m,可以通过具体工具分析
 Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 at java.util.Arrays.copyOf(Arrays.java:3210)
 at java.util.Arrays.copyOf(Arrays.java:3181)
 at java.util.ArrayList.grow(ArrayList.java:261)
 at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
 at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
 at java.util.ArrayList.add(ArrayList.java:458)
 at OOM.HeapOOM.main(HeapOOM.java:17)
 at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
 at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
 at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
 at java.lang.reflect.Method.invoke(Method.java:498)
 at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)
 Heap dump file created [27727894 bytes in 0.188 secs]

 Process finished with exit code 1
 */
