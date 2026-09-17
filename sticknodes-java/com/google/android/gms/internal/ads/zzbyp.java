package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbyp {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzbyn zzb;

    zzbyp(com.google.android.gms.common.util.Clock r1, com.google.android.gms.internal.ads.zzbyn r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzbyp zza(android.content.Context r0) {
            com.google.android.gms.internal.ads.zzbza r0 = com.google.android.gms.internal.ads.zzbza.zzd(r0)
            com.google.android.gms.internal.ads.zzbyp r0 = r0.zzb()
            return r0
    }

    public final void zzb(int r2, long r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbyn r0 = r1.zzb
            r0.zza(r2, r3)
            return
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfw r4) {
            r3 = this;
            com.google.android.gms.common.util.Clock r4 = r3.zza
            long r0 = r4.currentTimeMillis()
            com.google.android.gms.internal.ads.zzbyn r4 = r3.zzb
            r2 = -1
            r4.zza(r2, r0)
            return
    }

    public final void zzd() {
            r4 = this;
            com.google.android.gms.common.util.Clock r0 = r4.zza
            long r0 = r0.currentTimeMillis()
            com.google.android.gms.internal.ads.zzbyn r2 = r4.zzb
            r3 = -1
            r2.zza(r3, r0)
            return
    }
}
