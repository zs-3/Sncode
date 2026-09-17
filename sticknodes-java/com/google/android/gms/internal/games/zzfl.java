package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzfl {
    public static java.lang.String zza(int r3) {
            if (r3 == 0) goto L25
            r0 = 1
            if (r3 == r0) goto L22
            r0 = 2
            if (r3 != r0) goto Lb
            java.lang.String r3 = "ALL_TIME"
            return r3
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown time span "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L22:
            java.lang.String r3 = "WEEKLY"
            return r3
        L25:
            java.lang.String r3 = "DAILY"
            return r3
    }
}
