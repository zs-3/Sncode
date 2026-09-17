package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzerf implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;

    zzerf(com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1, com.google.android.gms.internal.ads.zzgfz r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 54
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzere r0 = new com.google.android.gms.internal.ads.zzere
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzerg zzc() throws java.lang.Exception {
            r1 = this;
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r1.zzb
            com.google.android.gms.internal.ads.zzerg r0 = com.google.android.gms.internal.ads.zzerg.zzb(r0)
            return r0
    }
}
