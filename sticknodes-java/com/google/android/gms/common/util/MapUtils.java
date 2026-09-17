package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class MapUtils {
    public MapUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void writeStringMapToJson(java.lang.StringBuilder r5, java.util.HashMap<java.lang.String, java.lang.String> r6) {
            java.lang.String r0 = "{"
            r5.append(r0)
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 1
        Lf:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r2 != 0) goto L22
            java.lang.String r2 = ","
            r5.append(r2)
        L22:
            java.lang.Object r2 = r6.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "\""
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "\":"
            r5.append(r3)
            if (r2 != 0) goto L3d
            java.lang.String r2 = "null"
            r5.append(r2)
            goto L46
        L3d:
            r5.append(r4)
            r5.append(r2)
            r5.append(r4)
        L46:
            r2 = 0
            goto Lf
        L48:
            java.lang.String r6 = "}"
            r5.append(r6)
            return
    }
}
