package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeir implements com.google.android.gms.internal.ads.zzegq {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdic zzb;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc;
    private final java.util.concurrent.Executor zzd;

    public zzeir(android.content.Context r1, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2, com.google.android.gms.internal.ads.zzdic r3, java.util.concurrent.Executor r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzc = r2
            r0.zzb = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfgt r3, com.google.android.gms.internal.ads.zzfgh r4, com.google.android.gms.internal.ads.zzegn r5) throws com.google.android.gms.internal.ads.zzfhj, com.google.android.gms.internal.ads.zzeki {
            r2 = this;
            com.google.android.gms.internal.ads.zzctu r0 = new com.google.android.gms.internal.ads.zzctu
            java.lang.String r1 = r5.zza
            r0.<init>(r3, r4, r1)
            com.google.android.gms.internal.ads.zzdhc r3 = new com.google.android.gms.internal.ads.zzdhc
            com.google.android.gms.internal.ads.zzeiq r4 = new com.google.android.gms.internal.ads.zzeiq
            r4.<init>(r2, r5)
            r1 = 0
            r3.<init>(r4, r1)
            com.google.android.gms.internal.ads.zzdic r4 = r2.zzb
            com.google.android.gms.internal.ads.zzdgz r3 = r4.zze(r0, r3)
            com.google.android.gms.internal.ads.zzcyz r4 = r3.zzd()
            com.google.android.gms.internal.ads.zzcof r0 = new com.google.android.gms.internal.ads.zzcof
            java.lang.Object r1 = r5.zzb
            com.google.android.gms.internal.ads.zzfia r1 = (com.google.android.gms.internal.ads.zzfia) r1
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r2.zzd
            r4.zzo(r0, r1)
            com.google.android.gms.internal.ads.zzczk r4 = r5.zzc
            com.google.android.gms.internal.ads.zzeig r4 = (com.google.android.gms.internal.ads.zzeig) r4
            com.google.android.gms.internal.ads.zzely r5 = r3.zzk()
            r4.zzc(r5)
            com.google.android.gms.internal.ads.zzdgy r3 = r3.zzg()
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(com.google.android.gms.internal.ads.zzfgt r8, com.google.android.gms.internal.ads.zzfgh r9, com.google.android.gms.internal.ads.zzegn r10) throws com.google.android.gms.internal.ads.zzfhj {
            r7 = this;
            java.lang.Object r0 = r10.zzb
            r1 = r0
            com.google.android.gms.internal.ads.zzfia r1 = (com.google.android.gms.internal.ads.zzfia) r1
            com.google.android.gms.internal.ads.zzfgq r8 = r8.zza
            com.google.android.gms.internal.ads.zzfhc r8 = r8.zza
            org.json.JSONObject r0 = r9.zzv
            java.lang.String r4 = r0.toString()
            com.google.android.gms.internal.ads.zzfgm r9 = r9.zzs
            java.lang.String r5 = com.google.android.gms.ads.internal.util.zzbs.zzm(r9)
            android.content.Context r2 = r7.zza
            com.google.android.gms.internal.ads.zzczk r9 = r10.zzc
            r6 = r9
            com.google.android.gms.internal.ads.zzbpr r6 = (com.google.android.gms.internal.ads.zzbpr) r6
            com.google.android.gms.ads.internal.client.zzm r3 = r8.zzd
            r1.zzo(r2, r3, r4, r5, r6)
            return
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzegn r2, boolean r3, android.content.Context r4, com.google.android.gms.internal.ads.zzcyn r5) throws com.google.android.gms.internal.ads.zzdij {
            r1 = this;
            java.lang.Object r5 = r2.zzb     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            com.google.android.gms.internal.ads.zzfia r5 = (com.google.android.gms.internal.ads.zzfia) r5     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            r5.zzv(r3)     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r1.zzc     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            int r3 = r3.clientJarVersion     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zzaM     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            java.lang.Object r5 = r0.zza(r5)     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            int r5 = r5.intValue()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            if (r3 >= r5) goto L25
            java.lang.Object r2 = r2.zzb     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            com.google.android.gms.internal.ads.zzfia r2 = (com.google.android.gms.internal.ads.zzfia) r2     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            r2.zzx()     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            return
        L25:
            java.lang.Object r2 = r2.zzb     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            com.google.android.gms.internal.ads.zzfia r2 = (com.google.android.gms.internal.ads.zzfia) r2     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            r2.zzy(r4)     // Catch: com.google.android.gms.internal.ads.zzfhj -> L2d
            return
        L2d:
            r2 = move-exception
            java.lang.String r3 = "Cannot show interstitial."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r3)
            com.google.android.gms.internal.ads.zzdij r3 = new com.google.android.gms.internal.ads.zzdij
            java.lang.Throwable r2 = r2.getCause()
            r3.<init>(r2)
            throw r3
    }
}
