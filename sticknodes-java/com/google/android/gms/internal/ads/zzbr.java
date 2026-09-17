package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbr {
    private final com.google.android.gms.internal.ads.zzz zza;

    public zzbr() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzz r0 = new com.google.android.gms.internal.ads.zzz
            r0.<init>()
            r1.zza = r0
            return
    }

    public final com.google.android.gms.internal.ads.zzbr zza(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzz r0 = r1.zza
            r0.zza(r2)
            return r1
    }

    public final com.google.android.gms.internal.ads.zzbr zzb(com.google.android.gms.internal.ads.zzbt r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzab r4 = com.google.android.gms.internal.ads.zzbt.zza(r4)
            r0 = 0
        L5:
            int r1 = r4.zzb()
            if (r0 >= r1) goto L17
            com.google.android.gms.internal.ads.zzz r1 = r3.zza
            int r2 = r4.zza(r0)
            r1.zza(r2)
            int r0 = r0 + 1
            goto L5
        L17:
            return r3
    }

    public final com.google.android.gms.internal.ads.zzbr zzc(int... r4) {
            r3 = this;
            r0 = 0
        L1:
            r1 = 20
            if (r0 >= r1) goto Lf
            com.google.android.gms.internal.ads.zzz r1 = r3.zza
            r2 = r4[r0]
            r1.zza(r2)
            int r0 = r0 + 1
            goto L1
        Lf:
            return r3
    }

    public final com.google.android.gms.internal.ads.zzbr zzd(int r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            com.google.android.gms.internal.ads.zzz r2 = r0.zza
            r2.zza(r1)
        L7:
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbt zze() {
            r3 = this;
            com.google.android.gms.internal.ads.zzz r0 = r3.zza
            com.google.android.gms.internal.ads.zzbt r1 = new com.google.android.gms.internal.ads.zzbt
            com.google.android.gms.internal.ads.zzab r0 = r0.zzb()
            r2 = 0
            r1.<init>(r0, r2)
            return r1
    }
}
