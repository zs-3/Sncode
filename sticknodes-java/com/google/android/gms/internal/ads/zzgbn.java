package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgbn {
    public static java.util.ArrayList zza(int r1) {
            java.lang.String r0 = "initialArraySize"
            com.google.android.gms.internal.ads.zzfzu.zza(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    public static java.util.List zzb(java.util.List r1, com.google.android.gms.internal.ads.zzfxq r2) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto La
            com.google.android.gms.internal.ads.zzgbk r0 = new com.google.android.gms.internal.ads.zzgbk
            r0.<init>(r1, r2)
            goto Lf
        La:
            com.google.android.gms.internal.ads.zzgbm r0 = new com.google.android.gms.internal.ads.zzgbm
            r0.<init>(r1, r2)
        Lf:
            return r0
    }
}
