package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhif {
    static java.util.HashSet zza(int r1) {
            java.util.HashSet r0 = new java.util.HashSet
            int r1 = zzd(r1)
            r0.<init>(r1)
            return r0
    }

    public static java.util.LinkedHashMap zzb(int r1) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = zzd(r1)
            r0.<init>(r1)
            return r0
    }

    public static java.util.List zzc(int r1) {
            if (r1 != 0) goto L7
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    private static int zzd(int r1) {
            r0 = 3
            if (r1 >= r0) goto L6
            int r1 = r1 + 1
            return r1
        L6:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r0) goto L13
            float r1 = (float) r1
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
        L13:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }
}
