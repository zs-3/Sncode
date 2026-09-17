package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzegl implements com.google.android.gms.internal.ads.zzegk {
    public final com.google.android.gms.internal.ads.zzegk zza;
    private final com.google.android.gms.internal.ads.zzfxq zzb;

    public zzegl(com.google.android.gms.internal.ads.zzegk r1, com.google.android.gms.internal.ads.zzfxq r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfgt r2, com.google.android.gms.internal.ads.zzfgh r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzegk r0 = r1.zza
            com.google.common.util.concurrent.ListenableFuture r2 = r0.zza(r2, r3)
            com.google.android.gms.internal.ads.zzfxq r3 = r1.zzb
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzm(r2, r3, r0)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(com.google.android.gms.internal.ads.zzfgt r2, com.google.android.gms.internal.ads.zzfgh r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzegk r0 = r1.zza
            boolean r2 = r0.zzb(r2, r3)
            return r2
    }
}
