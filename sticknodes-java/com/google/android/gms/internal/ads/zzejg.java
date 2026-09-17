package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzejg implements com.google.android.gms.internal.ads.zzegq {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdiy zzb;
    private final java.util.concurrent.Executor zzc;

    public zzejg(android.content.Context r1, com.google.android.gms.internal.ads.zzdiy r2, java.util.concurrent.Executor r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    private static final boolean zzc(com.google.android.gms.internal.ads.zzfgt r0, int r1) {
            com.google.android.gms.internal.ads.zzfgq r0 = r0.zza
            com.google.android.gms.internal.ads.zzfhc r0 = r0.zza
            java.util.ArrayList r0 = r0.zzg
            java.lang.String r1 = java.lang.Integer.toString(r1)
            boolean r0 = r0.contains(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfgt r8, com.google.android.gms.internal.ads.zzfgh r9, com.google.android.gms.internal.ads.zzegn r10) throws com.google.android.gms.internal.ads.zzfhj, com.google.android.gms.internal.ads.zzeki {
            r7 = this;
            java.lang.Object r0 = r10.zzb
            com.google.android.gms.internal.ads.zzfia r0 = (com.google.android.gms.internal.ads.zzfia) r0
            com.google.android.gms.internal.ads.zzbpw r0 = r0.zzD()
            java.lang.Object r1 = r10.zzb
            com.google.android.gms.internal.ads.zzfia r1 = (com.google.android.gms.internal.ads.zzfia) r1
            com.google.android.gms.internal.ads.zzbpx r1 = r1.zzE()
            java.lang.Object r2 = r10.zzb
            com.google.android.gms.internal.ads.zzfia r2 = (com.google.android.gms.internal.ads.zzfia) r2
            com.google.android.gms.internal.ads.zzbqa r2 = r2.zzd()
            r3 = 1
            r4 = 6
            if (r2 == 0) goto L27
            boolean r5 = zzc(r8, r4)
            if (r5 == 0) goto L27
            com.google.android.gms.internal.ads.zzdkp r4 = com.google.android.gms.internal.ads.zzdkp.zzt(r2)
            goto L5b
        L27:
            if (r0 == 0) goto L34
            boolean r5 = zzc(r8, r4)
            if (r5 == 0) goto L34
            com.google.android.gms.internal.ads.zzdkp r4 = com.google.android.gms.internal.ads.zzdkp.zzai(r0)
            goto L5b
        L34:
            if (r0 == 0) goto L42
            r5 = 2
            boolean r5 = zzc(r8, r5)
            if (r5 == 0) goto L42
            com.google.android.gms.internal.ads.zzdkp r4 = com.google.android.gms.internal.ads.zzdkp.zzag(r0)
            goto L5b
        L42:
            if (r1 == 0) goto L4f
            boolean r4 = zzc(r8, r4)
            if (r4 == 0) goto L4f
            com.google.android.gms.internal.ads.zzdkp r4 = com.google.android.gms.internal.ads.zzdkp.zzaj(r1)
            goto L5b
        L4f:
            if (r1 == 0) goto Lb0
            boolean r4 = zzc(r8, r3)
            if (r4 == 0) goto Lb0
            com.google.android.gms.internal.ads.zzdkp r4 = com.google.android.gms.internal.ads.zzdkp.zzah(r1)
        L5b:
            com.google.android.gms.internal.ads.zzfgq r5 = r8.zza
            com.google.android.gms.internal.ads.zzfhc r5 = r5.zza
            int r6 = r4.zzc()
            java.lang.String r6 = java.lang.Integer.toString(r6)
            java.util.ArrayList r5 = r5.zzg
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto La8
            com.google.android.gms.internal.ads.zzdiy r3 = r7.zzb
            java.lang.String r5 = r10.zza
            com.google.android.gms.internal.ads.zzctu r6 = new com.google.android.gms.internal.ads.zzctu
            r6.<init>(r8, r9, r5)
            com.google.android.gms.internal.ads.zzdlb r8 = new com.google.android.gms.internal.ads.zzdlb
            r8.<init>(r4)
            com.google.android.gms.internal.ads.zzdms r9 = new com.google.android.gms.internal.ads.zzdms
            r9.<init>(r1, r0, r2)
            com.google.android.gms.internal.ads.zzdkr r8 = r3.zze(r6, r8, r9)
            com.google.android.gms.internal.ads.zzczk r9 = r10.zzc
            com.google.android.gms.internal.ads.zzeig r9 = (com.google.android.gms.internal.ads.zzeig) r9
            com.google.android.gms.internal.ads.zzely r0 = r8.zzk()
            r9.zzc(r0)
            com.google.android.gms.internal.ads.zzcyz r9 = r8.zzd()
            java.lang.Object r10 = r10.zzb
            com.google.android.gms.internal.ads.zzcof r0 = new com.google.android.gms.internal.ads.zzcof
            com.google.android.gms.internal.ads.zzfia r10 = (com.google.android.gms.internal.ads.zzfia) r10
            r0.<init>(r10)
            java.util.concurrent.Executor r10 = r7.zzc
            r9.zzo(r0, r10)
            com.google.android.gms.internal.ads.zzdkk r8 = r8.zza()
            return r8
        La8:
            com.google.android.gms.internal.ads.zzeki r8 = new com.google.android.gms.internal.ads.zzeki
            java.lang.String r9 = "No corresponding native ad listener"
            r8.<init>(r3, r9)
            throw r8
        Lb0:
            com.google.android.gms.internal.ads.zzeki r8 = new com.google.android.gms.internal.ads.zzeki
            java.lang.String r9 = "No native ad mappers"
            r8.<init>(r3, r9)
            throw r8
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(com.google.android.gms.internal.ads.zzfgt r10, com.google.android.gms.internal.ads.zzfgh r11, com.google.android.gms.internal.ads.zzegn r12) throws com.google.android.gms.internal.ads.zzfhj {
            r9 = this;
            java.lang.Object r0 = r12.zzb
            r1 = r0
            com.google.android.gms.internal.ads.zzfia r1 = (com.google.android.gms.internal.ads.zzfia) r1
            com.google.android.gms.internal.ads.zzfgq r0 = r10.zza
            com.google.android.gms.internal.ads.zzfhc r0 = r0.zza
            org.json.JSONObject r2 = r11.zzv
            java.lang.String r4 = r2.toString()
            com.google.android.gms.internal.ads.zzfgm r11 = r11.zzs
            java.lang.String r5 = com.google.android.gms.ads.internal.util.zzbs.zzm(r11)
            com.google.android.gms.internal.ads.zzczk r11 = r12.zzc
            r6 = r11
            com.google.android.gms.internal.ads.zzbpr r6 = (com.google.android.gms.internal.ads.zzbpr) r6
            com.google.android.gms.internal.ads.zzfgq r10 = r10.zza
            com.google.android.gms.internal.ads.zzfhc r10 = r10.zza
            android.content.Context r2 = r9.zza
            com.google.android.gms.internal.ads.zzbfr r7 = r10.zzi
            java.util.ArrayList r8 = r10.zzg
            com.google.android.gms.ads.internal.client.zzm r3 = r0.zzd
            r1.zzp(r2, r3, r4, r5, r6, r7, r8)
            return
    }
}
