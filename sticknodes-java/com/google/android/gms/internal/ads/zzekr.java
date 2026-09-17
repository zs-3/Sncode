package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzekr implements com.google.android.gms.internal.ads.zzegq {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzdqn zzc;

    public zzekr(android.content.Context r1, java.util.concurrent.Executor r2, com.google.android.gms.internal.ads.zzdqn r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfgt r3, com.google.android.gms.internal.ads.zzfgh r4, com.google.android.gms.internal.ads.zzegn r5) throws com.google.android.gms.internal.ads.zzfhj, com.google.android.gms.internal.ads.zzeki {
            r2 = this;
            com.google.android.gms.internal.ads.zzctu r0 = new com.google.android.gms.internal.ads.zzctu
            java.lang.String r1 = r5.zza
            r0.<init>(r3, r4, r1)
            com.google.android.gms.internal.ads.zzdqk r3 = new com.google.android.gms.internal.ads.zzdqk
            com.google.android.gms.internal.ads.zzekq r4 = new com.google.android.gms.internal.ads.zzekq
            r4.<init>(r5)
            r3.<init>(r4)
            com.google.android.gms.internal.ads.zzdqn r4 = r2.zzc
            com.google.android.gms.internal.ads.zzdqj r3 = r4.zze(r0, r3)
            com.google.android.gms.internal.ads.zzcyz r4 = r3.zzd()
            com.google.android.gms.internal.ads.zzcof r0 = new com.google.android.gms.internal.ads.zzcof
            java.lang.Object r1 = r5.zzb
            com.google.android.gms.internal.ads.zzfia r1 = (com.google.android.gms.internal.ads.zzfia) r1
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r2.zzb
            r4.zzo(r0, r1)
            com.google.android.gms.internal.ads.zzczk r4 = r5.zzc
            com.google.android.gms.internal.ads.zzeig r4 = (com.google.android.gms.internal.ads.zzeig) r4
            com.google.android.gms.internal.ads.zzekx r5 = r3.zzn()
            r4.zzc(r5)
            com.google.android.gms.internal.ads.zzdqi r3 = r3.zzi()
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(com.google.android.gms.internal.ads.zzfgt r4, com.google.android.gms.internal.ads.zzfgh r5, com.google.android.gms.internal.ads.zzegn r6) throws com.google.android.gms.internal.ads.zzfhj {
            r3 = this;
            com.google.android.gms.internal.ads.zzfgq r4 = r4.zza     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.zzfhc r4 = r4.zza     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.zzfgp r0 = r4.zzo     // Catch: java.lang.Exception -> L37
            int r0 = r0.zza     // Catch: java.lang.Exception -> L37
            r1 = 3
            if (r0 != r1) goto L21
            java.lang.Object r0 = r6.zzb     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.zzfia r0 = (com.google.android.gms.internal.ads.zzfia) r0     // Catch: java.lang.Exception -> L37
            android.content.Context r1 = r3.zza     // Catch: java.lang.Exception -> L37
            com.google.android.gms.ads.internal.client.zzm r4 = r4.zzd     // Catch: java.lang.Exception -> L37
            org.json.JSONObject r5 = r5.zzv     // Catch: java.lang.Exception -> L37
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.zzczk r2 = r6.zzc     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.zzbpr r2 = (com.google.android.gms.internal.ads.zzbpr) r2     // Catch: java.lang.Exception -> L37
            r0.zzr(r1, r4, r5, r2)     // Catch: java.lang.Exception -> L37
            return
        L21:
            java.lang.Object r0 = r6.zzb     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.zzfia r0 = (com.google.android.gms.internal.ads.zzfia) r0     // Catch: java.lang.Exception -> L37
            android.content.Context r1 = r3.zza     // Catch: java.lang.Exception -> L37
            com.google.android.gms.ads.internal.client.zzm r4 = r4.zzd     // Catch: java.lang.Exception -> L37
            org.json.JSONObject r5 = r5.zzv     // Catch: java.lang.Exception -> L37
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.zzczk r2 = r6.zzc     // Catch: java.lang.Exception -> L37
            com.google.android.gms.internal.ads.zzbpr r2 = (com.google.android.gms.internal.ads.zzbpr) r2     // Catch: java.lang.Exception -> L37
            r0.zzq(r1, r4, r5, r2)     // Catch: java.lang.Exception -> L37
            return
        L37:
            r4 = move-exception
            java.lang.String r5 = r6.zza
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "Fail to load ad from adapter "
            java.lang.String r5 = r6.concat(r5)
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r5, r4)
            return
    }
}
