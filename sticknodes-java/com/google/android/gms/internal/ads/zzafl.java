package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzafl {
    protected final com.google.android.gms.internal.ads.zzaeh zza;

    protected zzafl(com.google.android.gms.internal.ads.zzaeh r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    protected abstract boolean zza(com.google.android.gms.internal.ads.zzek r1) throws com.google.android.gms.internal.ads.zzbo;

    protected abstract boolean zzb(com.google.android.gms.internal.ads.zzek r1, long r2) throws com.google.android.gms.internal.ads.zzbo;

    public final boolean zzf(com.google.android.gms.internal.ads.zzek r2, long r3) throws com.google.android.gms.internal.ads.zzbo {
            r1 = this;
            boolean r0 = r1.zza(r2)
            if (r0 == 0) goto Le
            boolean r2 = r1.zzb(r2, r3)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }
}
