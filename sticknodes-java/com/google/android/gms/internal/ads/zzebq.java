package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzebq {
    public com.google.common.util.concurrent.ListenableFuture zza;
    private final com.google.android.gms.internal.ads.zzdaw zzb;
    private final com.google.android.gms.internal.ads.zzeay zzc;
    private final com.google.android.gms.internal.ads.zzflg zzd;
    private final com.google.android.gms.internal.ads.zzfhc zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final com.google.android.gms.internal.ads.zzfmd zzg;
    private final com.google.android.gms.internal.ads.zzfma zzh;
    private final android.content.Context zzi;
    private final com.google.android.gms.internal.ads.zzgfz zzj;

    zzebq(com.google.android.gms.internal.ads.zzdaw r1, com.google.android.gms.internal.ads.zzeay r2, com.google.android.gms.internal.ads.zzflg r3, com.google.android.gms.internal.ads.zzfhc r4, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5, com.google.android.gms.internal.ads.zzfmd r6, com.google.android.gms.internal.ads.zzfma r7, android.content.Context r8, com.google.android.gms.internal.ads.zzgfz r9) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            r0.zzf = r5
            r0.zzg = r6
            r0.zzh = r7
            r0.zzi = r8
            r0.zzj = r9
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdaw zzb(com.google.android.gms.internal.ads.zzebq r0) {
            com.google.android.gms.internal.ads.zzdaw r0 = r0.zzb
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbvf zza(com.google.android.gms.internal.ads.zzbwa r12, com.google.android.gms.internal.ads.zzedb r13) {
            r11 = this;
            java.util.Map r0 = r13.zzc
            java.lang.String r1 = r13.zze
            java.lang.String r2 = "Content-Type"
            r0.put(r2, r1)
            com.google.android.gms.ads.internal.util.zzt r0 = com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r12.zzb
            java.lang.String r1 = r1.afmaVersion
            android.content.Context r2 = r11.zzi
            java.lang.String r0 = r0.zzc(r2, r1)
            java.util.Map r1 = r13.zzc
            java.lang.String r2 = "User-Agent"
            r1.put(r2, r0)
            com.google.android.gms.internal.ads.zzbvf r0 = new com.google.android.gms.internal.ads.zzbvf
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.util.Map r1 = r13.zzc
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r6.putString(r3, r2)
            goto L2f
        L4b:
            int r5 = r13.zzb
            java.lang.String r4 = r13.zza
            byte[] r7 = r13.zzd
            boolean r8 = r13.zzf
            java.lang.String r9 = r12.zzd
            java.lang.String r10 = r12.zzh
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzbwa r6, org.json.JSONObject r7, com.google.android.gms.internal.ads.zzbwc r8) {
            r5 = this;
            com.google.android.gms.internal.ads.zzdaw r0 = r5.zzb
            r0.zzdn(r6)
            android.content.Context r0 = r5.zzi
            r1 = 9
            com.google.android.gms.internal.ads.zzflp r0 = com.google.android.gms.internal.ads.zzflo.zza(r0, r1)
            com.google.android.gms.internal.ads.zzedg r1 = new com.google.android.gms.internal.ads.zzedg
            java.lang.String r2 = r6.zzg
            com.google.android.gms.internal.ads.zzfma r3 = r5.zzh
            r1.<init>(r2, r3, r0)
            com.google.android.gms.internal.ads.zzfla r0 = com.google.android.gms.internal.ads.zzfla.zzh
            com.google.android.gms.internal.ads.zzedf r2 = new com.google.android.gms.internal.ads.zzedf
            r2.<init>(r7, r8)
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzh(r2)
            com.google.android.gms.internal.ads.zzflg r3 = r5.zzd
            com.google.android.gms.internal.ads.zzfkx r0 = r3.zzb(r0, r2)
            com.google.android.gms.internal.ads.zzfkx r0 = r0.zze(r1)
            com.google.android.gms.internal.ads.zzfkl r0 = r0.zza()
            com.google.android.gms.internal.ads.zzebm r1 = new com.google.android.gms.internal.ads.zzebm
            r1.<init>(r5, r6)
            com.google.android.gms.internal.ads.zzgfz r2 = r5.zzj
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            com.google.android.gms.internal.ads.zzflg r1 = r5.zzd
            com.google.android.gms.internal.ads.zzfla r2 = com.google.android.gms.internal.ads.zzfla.zzj
            com.google.android.gms.internal.ads.zzfkx r0 = r1.zzb(r2, r0)
            com.google.android.gms.internal.ads.zzeay r1 = r5.zzc
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzebn r2 = new com.google.android.gms.internal.ads.zzebn
            r2.<init>(r1)
            com.google.android.gms.internal.ads.zzfkx r0 = r0.zzf(r2)
            com.google.android.gms.internal.ads.zzfkl r0 = r0.zza()
            r5.zza = r0
            com.google.android.gms.internal.ads.zzboe r1 = com.google.android.gms.ads.internal.zzu.zzf()
            android.content.Context r2 = r5.zzi
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r5.zzf
            com.google.android.gms.internal.ads.zzfmd r4 = r5.zzg
            com.google.android.gms.internal.ads.zzbon r1 = r1.zza(r2, r3, r4)
            com.google.android.gms.internal.ads.zzbog r2 = com.google.android.gms.internal.ads.zzeco.zza
            com.google.android.gms.internal.ads.zzbof r3 = com.google.android.gms.internal.ads.zzbok.zzb
            java.lang.String r4 = "google.afma.response.normalize"
            com.google.android.gms.internal.ads.zzbod r1 = r1.zza(r4, r2, r3)
            com.google.android.gms.internal.ads.zzflg r2 = r5.zzd
            com.google.android.gms.internal.ads.zzfla r3 = com.google.android.gms.internal.ads.zzfla.zzk
            com.google.android.gms.internal.ads.zzfkx r0 = r2.zzb(r3, r0)
            com.google.android.gms.internal.ads.zzebl r2 = new com.google.android.gms.internal.ads.zzebl
            r2.<init>(r7, r8)
            com.google.android.gms.internal.ads.zzfkx r7 = r0.zze(r2)
            com.google.android.gms.internal.ads.zzfkx r7 = r7.zzf(r1)
            com.google.android.gms.internal.ads.zzfkl r7 = r7.zza()
            com.google.android.gms.internal.ads.zzebo r8 = new com.google.android.gms.internal.ads.zzebo
            r8.<init>(r5, r6)
            com.google.android.gms.internal.ads.zzgfz r6 = r5.zzj
            com.google.common.util.concurrent.ListenableFuture r6 = com.google.android.gms.internal.ads.zzgfo.zzn(r7, r8, r6)
            com.google.android.gms.internal.ads.zzebp r7 = new com.google.android.gms.internal.ads.zzebp
            r7.<init>(r5)
            com.google.android.gms.internal.ads.zzgfz r8 = r5.zzj
            com.google.android.gms.internal.ads.zzgfo.zzr(r6, r7, r8)
            return r6
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.internal.ads.zzbwa r4, java.io.InputStream r5) throws java.lang.Exception {
            r3 = this;
            com.google.android.gms.internal.ads.zzfgt r0 = new com.google.android.gms.internal.ads.zzfgt
            com.google.android.gms.internal.ads.zzfgq r1 = new com.google.android.gms.internal.ads.zzfgq
            com.google.android.gms.internal.ads.zzfhc r2 = r3.zze
            r1.<init>(r2)
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r5)
            com.google.android.gms.internal.ads.zzfgs r4 = com.google.android.gms.internal.ads.zzfgs.zza(r2, r4)
            r0.<init>(r1, r4)
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzh(r0)
            return r4
    }
}
