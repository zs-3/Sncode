package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeln implements com.google.android.gms.internal.ads.zzegq {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzdqn zzc;

    public zzeln(android.content.Context r1, java.util.concurrent.Executor r2, com.google.android.gms.internal.ads.zzdqn r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.Executor zzc(com.google.android.gms.internal.ads.zzeln r0) {
            java.util.concurrent.Executor r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzeln r0, com.google.android.gms.internal.ads.zzfgt r1, com.google.android.gms.internal.ads.zzfgh r2, com.google.android.gms.internal.ads.zzegn r3) {
            zze(r1, r2, r3)
            return
    }

    private static final void zze(com.google.android.gms.internal.ads.zzfgt r1, com.google.android.gms.internal.ads.zzfgh r2, com.google.android.gms.internal.ads.zzegn r3) {
            java.lang.Object r0 = r3.zzb     // Catch: java.lang.Exception -> L14
            com.google.android.gms.internal.ads.zzfia r0 = (com.google.android.gms.internal.ads.zzfia) r0     // Catch: java.lang.Exception -> L14
            com.google.android.gms.internal.ads.zzfgq r1 = r1.zza     // Catch: java.lang.Exception -> L14
            com.google.android.gms.internal.ads.zzfhc r1 = r1.zza     // Catch: java.lang.Exception -> L14
            com.google.android.gms.ads.internal.client.zzm r1 = r1.zzd     // Catch: java.lang.Exception -> L14
            org.json.JSONObject r2 = r2.zzv     // Catch: java.lang.Exception -> L14
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L14
            r0.zzk(r1, r2)     // Catch: java.lang.Exception -> L14
            return
        L14:
            r1 = move-exception
            java.lang.String r2 = r3.zza
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Fail to load ad from adapter "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfgt r9, com.google.android.gms.internal.ads.zzfgh r10, com.google.android.gms.internal.ads.zzegn r11) throws com.google.android.gms.internal.ads.zzfhj, com.google.android.gms.internal.ads.zzeki {
            r8 = this;
            com.google.android.gms.internal.ads.zzctu r0 = new com.google.android.gms.internal.ads.zzctu
            java.lang.String r1 = r11.zza
            r0.<init>(r9, r10, r1)
            com.google.android.gms.internal.ads.zzdqk r9 = new com.google.android.gms.internal.ads.zzdqk
            com.google.android.gms.internal.ads.zzelj r10 = new com.google.android.gms.internal.ads.zzelj
            r10.<init>(r11)
            r9.<init>(r10)
            com.google.android.gms.internal.ads.zzdqn r10 = r8.zzc
            com.google.android.gms.internal.ads.zzdqj r9 = r10.zze(r0, r9)
            com.google.android.gms.internal.ads.zzcyz r10 = r9.zzd()
            com.google.android.gms.internal.ads.zzcof r0 = new com.google.android.gms.internal.ads.zzcof
            java.lang.Object r1 = r11.zzb
            com.google.android.gms.internal.ads.zzfia r1 = (com.google.android.gms.internal.ads.zzfia) r1
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r8.zzb
            r10.zzo(r0, r1)
            com.google.android.gms.internal.ads.zzczh r6 = r9.zze()
            com.google.android.gms.internal.ads.zzcxy r5 = r9.zzb()
            com.google.android.gms.internal.ads.zzdag r4 = r9.zza()
            com.google.android.gms.internal.ads.zzdgj r7 = r9.zzg()
            com.google.android.gms.internal.ads.zzczk r10 = r11.zzc
            com.google.android.gms.internal.ads.zzeih r10 = (com.google.android.gms.internal.ads.zzeih) r10
            com.google.android.gms.internal.ads.zzelm r11 = new com.google.android.gms.internal.ads.zzelm
            r2 = r11
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r10.zzc(r11)
            com.google.android.gms.internal.ads.zzdqi r9 = r9.zzi()
            return r9
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(com.google.android.gms.internal.ads.zzfgt r8, com.google.android.gms.internal.ads.zzfgh r9, com.google.android.gms.internal.ads.zzegn r10) throws com.google.android.gms.internal.ads.zzfhj {
            r7 = this;
            java.lang.Object r0 = r10.zzb
            com.google.android.gms.internal.ads.zzfia r0 = (com.google.android.gms.internal.ads.zzfia) r0
            boolean r0 = r0.zzC()
            if (r0 != 0) goto L33
            com.google.android.gms.internal.ads.zzell r0 = new com.google.android.gms.internal.ads.zzell
            r0.<init>(r7, r8, r9, r10)
            com.google.android.gms.internal.ads.zzczk r1 = r10.zzc
            com.google.android.gms.internal.ads.zzeih r1 = (com.google.android.gms.internal.ads.zzeih) r1
            r1.zzd(r0)
            java.lang.Object r0 = r10.zzb
            android.content.Context r2 = r7.zza
            r1 = r0
            com.google.android.gms.internal.ads.zzfia r1 = (com.google.android.gms.internal.ads.zzfia) r1
            com.google.android.gms.internal.ads.zzfgq r8 = r8.zza
            com.google.android.gms.internal.ads.zzfhc r8 = r8.zza
            com.google.android.gms.internal.ads.zzczk r10 = r10.zzc
            r5 = r10
            com.google.android.gms.internal.ads.zzbwx r5 = (com.google.android.gms.internal.ads.zzbwx) r5
            org.json.JSONObject r9 = r9.zzv
            java.lang.String r6 = r9.toString()
            com.google.android.gms.ads.internal.client.zzm r3 = r8.zzd
            r4 = 0
            r1.zzh(r2, r3, r4, r5, r6)
            return
        L33:
            zze(r8, r9, r10)
            return
    }
}
