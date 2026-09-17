package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzn {
    public static boolean zza(android.os.Bundle r9, android.os.Bundle r10) {
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L8b
            if (r10 == 0) goto L8b
            int r2 = r9.size()
            int r3 = r10.size()
            if (r2 == r3) goto L11
            return r1
        L11:
            java.util.Set r2 = r9.keySet()
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r10.containsKey(r3)
            if (r4 != 0) goto L2c
            return r1
        L2c:
            java.lang.Object r4 = r9.get(r3)
            java.lang.Object r3 = r10.get(r3)
            if (r4 == 0) goto L87
            if (r3 != 0) goto L39
            goto L87
        L39:
            boolean r5 = r4 instanceof android.os.Bundle
            if (r5 == 0) goto L4c
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L4b
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.Bundle r3 = (android.os.Bundle) r3
            boolean r3 = zza(r4, r3)
            if (r3 != 0) goto L19
        L4b:
            return r1
        L4c:
            java.lang.Class r5 = r4.getClass()
            boolean r5 = r5.isArray()
            if (r5 == 0) goto L80
            int r5 = java.lang.reflect.Array.getLength(r4)
            java.lang.Class r6 = r3.getClass()
            boolean r6 = r6.isArray()
            if (r6 == 0) goto L7f
            int r6 = java.lang.reflect.Array.getLength(r3)
            if (r5 != r6) goto L7f
            r6 = 0
        L6b:
            if (r6 >= r5) goto L19
            java.lang.Object r7 = java.lang.reflect.Array.get(r4, r6)
            java.lang.Object r8 = java.lang.reflect.Array.get(r3, r6)
            boolean r7 = com.google.android.gms.common.internal.Objects.equal(r7, r8)
            if (r7 != 0) goto L7c
            return r1
        L7c:
            int r6 = r6 + 1
            goto L6b
        L7f:
            return r1
        L80:
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L19
            return r1
        L87:
            r10 = r3
            r9 = r4
            goto L8b
        L8a:
            return r0
        L8b:
            if (r9 != 0) goto L90
            if (r10 != 0) goto L90
            return r0
        L90:
            return r1
    }
}
