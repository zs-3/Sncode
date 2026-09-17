package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzl {
    private final com.google.android.gms.ads.query.QueryInfo zza;
    private final java.lang.String zzb;
    private final long zzc;
    private final int zzd;
    private final java.util.concurrent.atomic.AtomicBoolean zze;

    public zzl(com.google.android.gms.ads.query.QueryInfo r3, java.lang.String r4, long r5, int r7) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.zze = r0
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            r2.zzd = r7
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    public final com.google.android.gms.ads.query.QueryInfo zzb() {
            r1 = this;
            com.google.android.gms.ads.query.QueryInfo r0 = r1.zza
            return r0
    }

    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public final void zzd() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zze
            r1 = 1
            r0.set(r1)
            return
    }

    public final boolean zze() {
            r5 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.currentTimeMillis()
            long r2 = r5.zzc
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public final boolean zzf() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.zze
            boolean r0 = r0.get()
            return r0
    }
}
