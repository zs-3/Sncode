package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeub implements com.google.android.gms.internal.ads.zzexh {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgfz zzb;

    zzeub(com.google.android.gms.internal.ads.zzgfz r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 57
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeua r0 = new com.google.android.gms.internal.ads.zzeua
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zzb
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeuc zzc() throws java.lang.Exception {
            r2 = this;
            com.google.android.gms.internal.ads.zzeuc r0 = new com.google.android.gms.internal.ads.zzeuc
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r1 = r2.zza
            java.lang.Integer r1 = com.google.android.gms.ads.internal.util.zzt.zzs(r1)
            r0.<init>(r1)
            return r0
    }
}
