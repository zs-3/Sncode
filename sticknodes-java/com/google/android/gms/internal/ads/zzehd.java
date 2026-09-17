package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzehd implements com.google.android.gms.internal.ads.zzegq {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcqf zzb;

    zzehd(android.content.Context r1, com.google.android.gms.internal.ads.zzcqf r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfgt r4, com.google.android.gms.internal.ads.zzfgh r5, com.google.android.gms.internal.ads.zzegn r6) throws com.google.android.gms.internal.ads.zzfhj, com.google.android.gms.internal.ads.zzeki {
            r3 = this;
            com.google.android.gms.internal.ads.zzeip r0 = new com.google.android.gms.internal.ads.zzeip
            java.lang.Object r1 = r6.zzb
            com.google.android.gms.internal.ads.zzbrk r1 = (com.google.android.gms.internal.ads.zzbrk) r1
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD
            r0.<init>(r5, r1, r2)
            com.google.android.gms.internal.ads.zzctu r1 = new com.google.android.gms.internal.ads.zzctu
            java.lang.String r2 = r6.zza
            r1.<init>(r4, r5, r2)
            com.google.android.gms.internal.ads.zzdhc r4 = new com.google.android.gms.internal.ads.zzdhc
            r2 = 0
            r4.<init>(r0, r2)
            com.google.android.gms.internal.ads.zzcqd r2 = new com.google.android.gms.internal.ads.zzcqd
            int r5 = r5.zzaa
            r2.<init>(r5)
            com.google.android.gms.internal.ads.zzcqf r5 = r3.zzb
            com.google.android.gms.internal.ads.zzcqc r4 = r5.zza(r1, r4, r2)
            com.google.android.gms.internal.ads.zzcys r5 = r4.zzc()
            r0.zzb(r5)
            com.google.android.gms.internal.ads.zzczk r5 = r6.zzc
            com.google.android.gms.internal.ads.zzeig r5 = (com.google.android.gms.internal.ads.zzeig) r5
            com.google.android.gms.internal.ads.zzels r6 = r4.zzj()
            r5.zzc(r6)
            com.google.android.gms.internal.ads.zzcql r4 = r4.zza()
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(com.google.android.gms.internal.ads.zzfgt r9, com.google.android.gms.internal.ads.zzfgh r10, com.google.android.gms.internal.ads.zzegn r11) throws com.google.android.gms.internal.ads.zzfhj {
            r8 = this;
            java.lang.Object r0 = r11.zzb     // Catch: android.os.RemoteException -> L31
            com.google.android.gms.internal.ads.zzbrk r0 = (com.google.android.gms.internal.ads.zzbrk) r0     // Catch: android.os.RemoteException -> L31
            java.lang.String r1 = r10.zzZ     // Catch: android.os.RemoteException -> L31
            r0.zzq(r1)     // Catch: android.os.RemoteException -> L31
            java.lang.Object r0 = r11.zzb     // Catch: android.os.RemoteException -> L31
            r1 = r0
            com.google.android.gms.internal.ads.zzbrk r1 = (com.google.android.gms.internal.ads.zzbrk) r1     // Catch: android.os.RemoteException -> L31
            java.lang.String r2 = r10.zzU     // Catch: android.os.RemoteException -> L31
            org.json.JSONObject r10 = r10.zzv     // Catch: android.os.RemoteException -> L31
            java.lang.String r3 = r10.toString()     // Catch: android.os.RemoteException -> L31
            com.google.android.gms.internal.ads.zzfgq r9 = r9.zza     // Catch: android.os.RemoteException -> L31
            com.google.android.gms.internal.ads.zzfhc r9 = r9.zza     // Catch: android.os.RemoteException -> L31
            com.google.android.gms.ads.internal.client.zzm r4 = r9.zzd     // Catch: android.os.RemoteException -> L31
            android.content.Context r9 = r8.zza     // Catch: android.os.RemoteException -> L31
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch: android.os.RemoteException -> L31
            com.google.android.gms.internal.ads.zzehc r6 = new com.google.android.gms.internal.ads.zzehc     // Catch: android.os.RemoteException -> L31
            r9 = 0
            r6.<init>(r11, r9)     // Catch: android.os.RemoteException -> L31
            com.google.android.gms.internal.ads.zzczk r9 = r11.zzc     // Catch: android.os.RemoteException -> L31
            r7 = r9
            com.google.android.gms.internal.ads.zzbpr r7 = (com.google.android.gms.internal.ads.zzbpr) r7     // Catch: android.os.RemoteException -> L31
            r1.zzi(r2, r3, r4, r5, r6, r7)     // Catch: android.os.RemoteException -> L31
            return
        L31:
            r9 = move-exception
            java.lang.String r10 = "Remote exception loading an app open RTB ad"
            com.google.android.gms.ads.internal.util.zze.zzb(r10, r9)
            com.google.android.gms.internal.ads.zzfhj r10 = new com.google.android.gms.internal.ads.zzfhj
            r10.<init>(r9)
            throw r10
    }
}
