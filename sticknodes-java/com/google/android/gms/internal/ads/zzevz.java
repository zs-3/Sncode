package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzevz implements com.google.android.gms.internal.ads.zzexh {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    zzevz(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 31
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r3 = this;
            java.lang.String r0 = r3.zza
            java.lang.String r1 = r3.zzb
            com.google.android.gms.internal.ads.zzewa r2 = new com.google.android.gms.internal.ads.zzewa
            r2.<init>(r0, r1)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzh(r2)
            return r0
    }
}
