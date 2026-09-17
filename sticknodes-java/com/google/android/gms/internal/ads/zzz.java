package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzz {
    private final android.util.SparseBooleanArray zza;
    private boolean zzb;

    public zzz() {
            r1 = this;
            r1.<init>()
            android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
            r0.<init>()
            r1.zza = r0
            return
    }

    public final com.google.android.gms.internal.ads.zzz zza(int r3) {
            r2 = this;
            boolean r0 = r2.zzb
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            android.util.SparseBooleanArray r0 = r2.zza
            r0.append(r3, r1)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzab zzb() {
            r3 = this;
            boolean r0 = r3.zzb
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            r3.zzb = r1
            com.google.android.gms.internal.ads.zzab r0 = new com.google.android.gms.internal.ads.zzab
            android.util.SparseBooleanArray r1 = r3.zza
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }
}
