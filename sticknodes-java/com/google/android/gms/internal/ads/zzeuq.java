package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeuq implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final com.google.android.gms.internal.ads.zzdxb zzb;

    zzeuq(com.google.android.gms.internal.ads.zzgfz r1, com.google.android.gms.internal.ads.zzdxb r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 23
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeup r0 = new com.google.android.gms.internal.ads.zzeup
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeur zzc() throws java.lang.Exception {
            r8 = this;
            com.google.android.gms.internal.ads.zzdxb r0 = r8.zzb
            com.google.android.gms.internal.ads.zzeur r7 = new com.google.android.gms.internal.ads.zzeur
            java.lang.String r2 = r0.zzc()
            boolean r3 = r0.zzr()
            com.google.android.gms.ads.internal.util.zzay r0 = com.google.android.gms.ads.internal.zzu.zzs()
            boolean r4 = r0.zzl()
            com.google.android.gms.internal.ads.zzdxb r0 = r8.zzb
            boolean r5 = r0.zzp()
            boolean r6 = r0.zzs()
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
    }
}
