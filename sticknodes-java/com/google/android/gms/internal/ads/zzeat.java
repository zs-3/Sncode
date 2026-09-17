package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeat {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final com.google.android.gms.internal.ads.zzdzx zzb;
    private final com.google.android.gms.internal.ads.zzhic zzc;
    private final com.google.android.gms.internal.ads.zzfmd zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;

    public zzeat(com.google.android.gms.internal.ads.zzgfz r1, com.google.android.gms.internal.ads.zzdzx r2, com.google.android.gms.internal.ads.zzhic r3, com.google.android.gms.internal.ads.zzfmd r4, android.content.Context r5, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            return
    }

    private final com.google.common.util.concurrent.ListenableFuture zzh(com.google.android.gms.internal.ads.zzbwa r4, com.google.android.gms.internal.ads.zzeas r5, com.google.android.gms.internal.ads.zzeas r6, com.google.android.gms.internal.ads.zzgev r7) {
            r3 = this;
            java.lang.String r0 = r4.zzd
            com.google.android.gms.ads.internal.zzu.zzp()
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzC(r0)
            if (r0 == 0) goto L16
            com.google.android.gms.internal.ads.zzeag r5 = new com.google.android.gms.internal.ads.zzeag
            r0 = 1
            r5.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzg(r5)
            goto L27
        L16:
            com.google.common.util.concurrent.ListenableFuture r5 = r5.zza(r4)
            com.google.android.gms.internal.ads.zzear r0 = new com.google.android.gms.internal.ads.zzear
            r0.<init>()
            com.google.android.gms.internal.ads.zzgfz r1 = r3.zza
            java.lang.Class<java.util.concurrent.ExecutionException> r2 = java.util.concurrent.ExecutionException.class
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzf(r5, r2, r0, r1)
        L27:
            com.google.android.gms.internal.ads.zzgff r5 = com.google.android.gms.internal.ads.zzgff.zzu(r5)
            com.google.android.gms.internal.ads.zzeap r0 = new com.google.android.gms.internal.ads.zzeap
            r0.<init>()
            com.google.android.gms.internal.ads.zzgfz r1 = r3.zza
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzn(r5, r0, r1)
            com.google.android.gms.internal.ads.zzgff r5 = (com.google.android.gms.internal.ads.zzgff) r5
            com.google.android.gms.internal.ads.zzgfz r0 = r3.zza
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzn(r5, r7, r0)
            com.google.android.gms.internal.ads.zzgff r5 = (com.google.android.gms.internal.ads.zzgff) r5
            com.google.android.gms.internal.ads.zzeaq r0 = new com.google.android.gms.internal.ads.zzeaq
            r0.<init>(r3, r6, r4, r7)
            com.google.android.gms.internal.ads.zzgfz r4 = r3.zza
            java.lang.Class<com.google.android.gms.internal.ads.zzeag> r6 = com.google.android.gms.internal.ads.zzeag.class
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzf(r5, r6, r0, r4)
            com.google.android.gms.internal.ads.zzgff r4 = (com.google.android.gms.internal.ads.zzgff) r4
            return r4
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzbwa r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzeam r0 = new com.google.android.gms.internal.ads.zzeam
            r0.<init>(r4)
            com.google.android.gms.internal.ads.zzdzx r1 = r3.zzb
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzean r2 = new com.google.android.gms.internal.ads.zzean
            r2.<init>(r1)
            com.google.android.gms.internal.ads.zzeao r1 = new com.google.android.gms.internal.ads.zzeao
            r1.<init>(r3)
            com.google.common.util.concurrent.ListenableFuture r4 = r3.zzh(r4, r2, r1, r0)
            return r4
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(org.json.JSONObject r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzboe r0 = com.google.android.gms.ads.internal.zzu.zzf()
            android.content.Context r1 = r4.zze
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r4.zzf
            com.google.android.gms.internal.ads.zzfmd r3 = r4.zzd
            com.google.android.gms.internal.ads.zzbon r0 = r0.zza(r1, r2, r3)
            com.google.android.gms.internal.ads.zzboh r1 = com.google.android.gms.internal.ads.zzbok.zza
            com.google.android.gms.internal.ads.zzeai r2 = new com.google.android.gms.internal.ads.zzeai
            r2.<init>()
            java.lang.String r3 = "AFMA_getAdDictionary"
            com.google.android.gms.internal.ads.zzbod r0 = r0.zza(r3, r1, r2)
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzh(r5)
            com.google.android.gms.internal.ads.zzgff r5 = com.google.android.gms.internal.ads.zzgff.zzu(r5)
            com.google.android.gms.internal.ads.zzgfz r1 = r4.zza
            com.google.common.util.concurrent.ListenableFuture r5 = com.google.android.gms.internal.ads.zzgfo.zzn(r5, r0, r1)
            com.google.android.gms.internal.ads.zzgff r5 = (com.google.android.gms.internal.ads.zzgff) r5
            return r5
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzeas r1, com.google.android.gms.internal.ads.zzbwa r2, com.google.android.gms.internal.ads.zzgev r3, com.google.android.gms.internal.ads.zzeag r4) throws java.lang.Exception {
            r0 = this;
            com.google.android.gms.internal.ads.zzgfz r4 = r0.zza
            com.google.common.util.concurrent.ListenableFuture r1 = r1.zza(r2)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgfo.zzn(r1, r3, r4)
            return r1
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.internal.ads.zzbwa r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzhic r0 = r2.zzc
            java.lang.Object r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzecp r0 = (com.google.android.gms.internal.ads.zzecp) r0
            int r1 = android.os.Binder.getCallingUid()
            com.google.common.util.concurrent.ListenableFuture r3 = r0.zzb(r3, r1)
            return r3
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(com.google.android.gms.internal.ads.zzbwa r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdzx r0 = r1.zzb
            java.lang.String r2 = r2.zzh
            com.google.common.util.concurrent.ListenableFuture r2 = r0.zzd(r2)
            return r2
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzf(com.google.android.gms.internal.ads.zzbwa r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzhic r0 = r1.zzc
            java.lang.Object r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzecp r0 = (com.google.android.gms.internal.ads.zzecp) r0
            java.lang.String r2 = r2.zzh
            com.google.common.util.concurrent.ListenableFuture r2 = r0.zzi(r2)
            return r2
    }

    public final com.google.common.util.concurrent.ListenableFuture zzg(com.google.android.gms.internal.ads.zzbwa r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzeaj r0 = new com.google.android.gms.internal.ads.zzeaj
            r0.<init>()
            com.google.android.gms.internal.ads.zzeak r1 = new com.google.android.gms.internal.ads.zzeak
            r1.<init>(r3)
            com.google.android.gms.internal.ads.zzeal r2 = new com.google.android.gms.internal.ads.zzeal
            r2.<init>(r3)
            com.google.common.util.concurrent.ListenableFuture r4 = r3.zzh(r4, r1, r2, r0)
            return r4
    }
}
