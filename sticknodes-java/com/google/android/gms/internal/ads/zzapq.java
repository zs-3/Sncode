package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzapq {
    private int zza;
    private int zzb;

    public zzapq() {
            r1 = this;
            r1.<init>()
            r0 = 2500(0x9c4, float:3.503E-42)
            r1.zza = r0
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public final void zzc(com.google.android.gms.internal.ads.zzaql r5) throws com.google.android.gms.internal.ads.zzaql {
            r4 = this;
            int r0 = r4.zzb
            r1 = 1
            int r0 = r0 + r1
            r4.zzb = r0
            int r2 = r4.zza
            float r3 = (float) r2
            int r3 = (int) r3
            int r2 = r2 + r3
            r4.zza = r2
            if (r0 > r1) goto L10
            return
        L10:
            throw r5
    }
}
