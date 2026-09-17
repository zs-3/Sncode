package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgwc {
    public static int zza(int r1) {
            r0 = 1
            if (r1 == r0) goto L6
            int r1 = r1 + (-2)
            return r1
        L6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can't get the number of an unknown enum value."
            r1.<init>(r0)
            throw r1
    }
}
