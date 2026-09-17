package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzetx implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;

    public zzetx(com.google.android.gms.internal.ads.zzgfz r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 20
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzetw r0 = new com.google.android.gms.internal.ads.zzetw
            r0.<init>()
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }
}
