package org.jcodec.platform;

/* loaded from: classes2.dex */
public class Platform {
    public static boolean arrayEqualsInt(int[] r0, int[] r1) {
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
    }

    public static java.lang.String arrayToString(java.lang.Object[] r0) {
            java.lang.String r0 = java.util.Arrays.toString(r0)
            return r0
    }

    public static byte[] getBytesForCharset(java.lang.String r0, java.nio.charset.Charset r1) {
            byte[] r0 = r0.getBytes(r1)
            return r0
    }

    public static java.lang.reflect.Method[] getDeclaredMethods(java.lang.Class<?> r0) {
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            return r0
    }

    public static java.lang.reflect.Method[] getMethods(java.lang.Class<?> r0) {
            java.lang.reflect.Method[] r0 = r0.getMethods()
            return r0
    }

    public static void invokeMethod(java.lang.Object r3, java.lang.String r4, java.lang.Object[] r5) throws java.lang.NoSuchMethodException {
            int r0 = r5.length
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
        L4:
            int r2 = r5.length
            if (r1 >= r2) goto L12
            r2 = r5[r1]
            java.lang.Class r2 = r2.getClass()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Exception -> L1e
            java.lang.reflect.Method r4 = r1.getDeclaredMethod(r4, r0)     // Catch: java.lang.Exception -> L1e
            r4.invoke(r3, r5)     // Catch: java.lang.Exception -> L1e
            return
        L1e:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }

    public static java.lang.String stringFromCharset(byte[] r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
    }

    public static java.lang.String stringFromCharset4(byte[] r1, int r2, int r3, java.nio.charset.Charset r4) {
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}
