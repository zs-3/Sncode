package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzmc {
    private final com.google.android.gms.internal.ads.zzab zza;
    private final android.util.SparseArray zzb;

    public zzmc(com.google.android.gms.internal.ads.zzab r5, android.util.SparseArray r6) {
            r4 = this;
            r4.<init>()
            r4.zza = r5
            android.util.SparseArray r0 = new android.util.SparseArray
            int r1 = r5.zzb()
            r0.<init>(r1)
            r1 = 0
        Lf:
            int r2 = r5.zzb()
            if (r1 >= r2) goto L28
            int r2 = r5.zza(r1)
            java.lang.Object r3 = r6.get(r2)
            com.google.android.gms.internal.ads.zzmb r3 = (com.google.android.gms.internal.ads.zzmb) r3
            java.util.Objects.requireNonNull(r3)
            r0.append(r2, r3)
            int r1 = r1 + 1
            goto Lf
        L28:
            r4.zzb = r0
            return
    }

    public final int zza(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzab r0 = r1.zza
            int r2 = r0.zza(r2)
            return r2
    }

    public final int zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzab r0 = r1.zza
            int r0 = r0.zzb()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzmb zzc(int r2) {
            r1 = this;
            android.util.SparseArray r0 = r1.zzb
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.ads.zzmb r2 = (com.google.android.gms.internal.ads.zzmb) r2
            java.util.Objects.requireNonNull(r2)
            return r2
    }

    public final boolean zzd(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzab r0 = r1.zza
            boolean r2 = r0.zzc(r2)
            return r2
    }
}
