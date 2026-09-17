package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbzu {
    public zzbzu() {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(android.content.Context r3, int r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcas r4 = new com.google.android.gms.internal.ads.zzcas
            r4.<init>()
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            boolean r0 = com.google.android.gms.ads.internal.util.client.zzf.zzu(r3)
            if (r0 == 0) goto L18
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.internal.ads.zzbzt r1 = new com.google.android.gms.internal.ads.zzbzt
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
        L18:
            return r4
    }
}
