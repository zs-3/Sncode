package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeqo implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final com.google.android.gms.internal.ads.zzfhc zzb;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc;
    private final com.google.android.gms.internal.ads.zzcah zzd;

    public zzeqo(com.google.android.gms.internal.ads.zzgfz r1, com.google.android.gms.internal.ads.zzfhc r2, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3, com.google.android.gms.internal.ads.zzcah r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 9
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeqn r0 = new com.google.android.gms.internal.ads.zzeqn
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeqp zzc() throws java.lang.Exception {
            r4 = this;
            com.google.android.gms.internal.ads.zzeqp r0 = new com.google.android.gms.internal.ads.zzeqp
            com.google.android.gms.internal.ads.zzcah r1 = r4.zzd
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r4.zzc
            boolean r1 = r1.zzm()
            com.google.android.gms.internal.ads.zzfhc r3 = r4.zzb
            com.google.android.gms.ads.internal.client.zzy r3 = r3.zzj
            r0.<init>(r3, r2, r1)
            return r0
    }
}
