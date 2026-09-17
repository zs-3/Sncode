package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzejk implements com.google.android.gms.internal.ads.zzegq {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdiy zzb;
    private com.google.android.gms.internal.ads.zzbqa zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;

    public zzejk(android.content.Context r1, com.google.android.gms.internal.ads.zzdiy r2, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzd = r3
            return
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzejk r0, com.google.android.gms.internal.ads.zzbqa r1) {
            r0.zzc = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfgt r5, com.google.android.gms.internal.ads.zzfgh r6, com.google.android.gms.internal.ads.zzegn r7) throws com.google.android.gms.internal.ads.zzfhj, com.google.android.gms.internal.ads.zzeki {
            r4 = this;
            com.google.android.gms.internal.ads.zzfgq r0 = r5.zza
            com.google.android.gms.internal.ads.zzfhc r0 = r0.zza
            java.util.ArrayList r0 = r0.zzg
            r1 = 6
            java.lang.String r1 = java.lang.Integer.toString(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5e
            com.google.android.gms.internal.ads.zzbqa r0 = r4.zzc
            com.google.android.gms.internal.ads.zzdkp r0 = com.google.android.gms.internal.ads.zzdkp.zzt(r0)
            com.google.android.gms.internal.ads.zzfgq r1 = r5.zza
            com.google.android.gms.internal.ads.zzfhc r1 = r1.zza
            int r2 = r0.zzc()
            java.lang.String r2 = java.lang.Integer.toString(r2)
            java.util.ArrayList r1 = r1.zzg
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L55
            com.google.android.gms.internal.ads.zzdiy r1 = r4.zzb
            java.lang.String r2 = r7.zza
            com.google.android.gms.internal.ads.zzctu r3 = new com.google.android.gms.internal.ads.zzctu
            r3.<init>(r5, r6, r2)
            com.google.android.gms.internal.ads.zzdlb r5 = new com.google.android.gms.internal.ads.zzdlb
            r5.<init>(r0)
            com.google.android.gms.internal.ads.zzdms r6 = new com.google.android.gms.internal.ads.zzdms
            com.google.android.gms.internal.ads.zzbqa r0 = r4.zzc
            r2 = 0
            r6.<init>(r2, r2, r0)
            com.google.android.gms.internal.ads.zzdkr r5 = r1.zze(r3, r5, r6)
            com.google.android.gms.internal.ads.zzczk r6 = r7.zzc
            com.google.android.gms.internal.ads.zzeig r6 = (com.google.android.gms.internal.ads.zzeig) r6
            com.google.android.gms.internal.ads.zzels r7 = r5.zzj()
            r6.zzc(r7)
            com.google.android.gms.internal.ads.zzdkk r5 = r5.zza()
            return r5
        L55:
            com.google.android.gms.internal.ads.zzeki r5 = new com.google.android.gms.internal.ads.zzeki
            r6 = 1
            java.lang.String r7 = "No corresponding native ad listener"
            r5.<init>(r6, r7)
            throw r5
        L5e:
            com.google.android.gms.internal.ads.zzeki r5 = new com.google.android.gms.internal.ads.zzeki
            r6 = 2
            java.lang.String r7 = "Unified must be used for RTB."
            r5.<init>(r6, r7)
            throw r5
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(com.google.android.gms.internal.ads.zzfgt r12, com.google.android.gms.internal.ads.zzfgh r13, com.google.android.gms.internal.ads.zzegn r14) throws com.google.android.gms.internal.ads.zzfhj {
            r11 = this;
            java.lang.Object r0 = r14.zzb     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.internal.ads.zzbrk r0 = (com.google.android.gms.internal.ads.zzbrk) r0     // Catch: android.os.RemoteException -> L74
            java.lang.String r1 = r13.zzZ     // Catch: android.os.RemoteException -> L74
            r0.zzq(r1)     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r11.zzd     // Catch: android.os.RemoteException -> L74
            int r0 = r0.clientJarVersion     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzbK     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: android.os.RemoteException -> L74
            java.lang.Object r1 = r2.zza(r1)     // Catch: android.os.RemoteException -> L74
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: android.os.RemoteException -> L74
            int r1 = r1.intValue()     // Catch: android.os.RemoteException -> L74
            r2 = 0
            if (r0 >= r1) goto L47
            java.lang.Object r0 = r14.zzb     // Catch: android.os.RemoteException -> L74
            r3 = r0
            com.google.android.gms.internal.ads.zzbrk r3 = (com.google.android.gms.internal.ads.zzbrk) r3     // Catch: android.os.RemoteException -> L74
            java.lang.String r4 = r13.zzU     // Catch: android.os.RemoteException -> L74
            org.json.JSONObject r13 = r13.zzv     // Catch: android.os.RemoteException -> L74
            java.lang.String r5 = r13.toString()     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.internal.ads.zzfgq r12 = r12.zza     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.internal.ads.zzfhc r12 = r12.zza     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.ads.internal.client.zzm r6 = r12.zzd     // Catch: android.os.RemoteException -> L74
            android.content.Context r12 = r11.zza     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r12)     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.internal.ads.zzejj r8 = new com.google.android.gms.internal.ads.zzejj     // Catch: android.os.RemoteException -> L74
            r8.<init>(r11, r14, r2)     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.internal.ads.zzczk r12 = r14.zzc     // Catch: android.os.RemoteException -> L74
            r9 = r12
            com.google.android.gms.internal.ads.zzbpr r9 = (com.google.android.gms.internal.ads.zzbpr) r9     // Catch: android.os.RemoteException -> L74
            r3.zzm(r4, r5, r6, r7, r8, r9)     // Catch: android.os.RemoteException -> L74
            return
        L47:
            java.lang.Object r0 = r14.zzb     // Catch: android.os.RemoteException -> L74
            r3 = r0
            com.google.android.gms.internal.ads.zzbrk r3 = (com.google.android.gms.internal.ads.zzbrk) r3     // Catch: android.os.RemoteException -> L74
            java.lang.String r4 = r13.zzU     // Catch: android.os.RemoteException -> L74
            org.json.JSONObject r13 = r13.zzv     // Catch: android.os.RemoteException -> L74
            java.lang.String r5 = r13.toString()     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.internal.ads.zzfgq r13 = r12.zza     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.internal.ads.zzfhc r13 = r13.zza     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.ads.internal.client.zzm r6 = r13.zzd     // Catch: android.os.RemoteException -> L74
            android.content.Context r13 = r11.zza     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r13)     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.internal.ads.zzejj r8 = new com.google.android.gms.internal.ads.zzejj     // Catch: android.os.RemoteException -> L74
            r8.<init>(r11, r14, r2)     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.internal.ads.zzczk r13 = r14.zzc     // Catch: android.os.RemoteException -> L74
            r9 = r13
            com.google.android.gms.internal.ads.zzbpr r9 = (com.google.android.gms.internal.ads.zzbpr) r9     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.internal.ads.zzfgq r12 = r12.zza     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.internal.ads.zzfhc r12 = r12.zza     // Catch: android.os.RemoteException -> L74
            com.google.android.gms.internal.ads.zzbfr r10 = r12.zzi     // Catch: android.os.RemoteException -> L74
            r3.zzn(r4, r5, r6, r7, r8, r9, r10)     // Catch: android.os.RemoteException -> L74
            return
        L74:
            r12 = move-exception
            com.google.android.gms.internal.ads.zzfhj r13 = new com.google.android.gms.internal.ads.zzfhj
            r13.<init>(r12)
            throw r13
    }
}
