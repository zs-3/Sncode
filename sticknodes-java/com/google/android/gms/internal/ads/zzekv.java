package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzekv implements com.google.android.gms.internal.ads.zzegq {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdqn zzb;

    public zzekv(android.content.Context r1, com.google.android.gms.internal.ads.zzdqn r2) {
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
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.REWARDED
            r0.<init>(r5, r1, r2)
            com.google.android.gms.internal.ads.zzctu r1 = new com.google.android.gms.internal.ads.zzctu
            java.lang.String r2 = r6.zza
            r1.<init>(r4, r5, r2)
            com.google.android.gms.internal.ads.zzdqk r4 = new com.google.android.gms.internal.ads.zzdqk
            r4.<init>(r0)
            com.google.android.gms.internal.ads.zzdqn r5 = r3.zzb
            com.google.android.gms.internal.ads.zzdqj r4 = r5.zze(r1, r4)
            com.google.android.gms.internal.ads.zzcys r5 = r4.zzc()
            r0.zzb(r5)
            com.google.android.gms.internal.ads.zzczk r5 = r6.zzc
            com.google.android.gms.internal.ads.zzeig r5 = (com.google.android.gms.internal.ads.zzeig) r5
            com.google.android.gms.internal.ads.zzelr r6 = r4.zzo()
            r5.zzc(r6)
            com.google.android.gms.internal.ads.zzdqi r4 = r4.zzi()
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final void zzb(com.google.android.gms.internal.ads.zzfgt r11, com.google.android.gms.internal.ads.zzfgh r12, com.google.android.gms.internal.ads.zzegn r13) throws com.google.android.gms.internal.ads.zzfhj {
            r10 = this;
            java.lang.Object r0 = r13.zzb     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.internal.ads.zzbrk r0 = (com.google.android.gms.internal.ads.zzbrk) r0     // Catch: android.os.RemoteException -> L63
            java.lang.String r1 = r12.zzZ     // Catch: android.os.RemoteException -> L63
            r0.zzq(r1)     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.internal.ads.zzfgq r0 = r11.zza     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.internal.ads.zzfhc r0 = r0.zza     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.internal.ads.zzfgp r0 = r0.zzo     // Catch: android.os.RemoteException -> L63
            int r0 = r0.zza     // Catch: android.os.RemoteException -> L63
            r1 = 3
            r2 = 0
            if (r0 != r1) goto L3c
            java.lang.Object r0 = r13.zzb     // Catch: android.os.RemoteException -> L63
            r3 = r0
            com.google.android.gms.internal.ads.zzbrk r3 = (com.google.android.gms.internal.ads.zzbrk) r3     // Catch: android.os.RemoteException -> L63
            java.lang.String r4 = r12.zzU     // Catch: android.os.RemoteException -> L63
            org.json.JSONObject r12 = r12.zzv     // Catch: android.os.RemoteException -> L63
            java.lang.String r5 = r12.toString()     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.internal.ads.zzfgq r11 = r11.zza     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.internal.ads.zzfhc r11 = r11.zza     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.ads.internal.client.zzm r6 = r11.zzd     // Catch: android.os.RemoteException -> L63
            android.content.Context r11 = r10.zza     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.internal.ads.zzeku r8 = new com.google.android.gms.internal.ads.zzeku     // Catch: android.os.RemoteException -> L63
            r8.<init>(r10, r13, r2)     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.internal.ads.zzczk r11 = r13.zzc     // Catch: android.os.RemoteException -> L63
            r9 = r11
            com.google.android.gms.internal.ads.zzbpr r9 = (com.google.android.gms.internal.ads.zzbpr) r9     // Catch: android.os.RemoteException -> L63
            r3.zzo(r4, r5, r6, r7, r8, r9)     // Catch: android.os.RemoteException -> L63
            return
        L3c:
            java.lang.Object r0 = r13.zzb     // Catch: android.os.RemoteException -> L63
            r3 = r0
            com.google.android.gms.internal.ads.zzbrk r3 = (com.google.android.gms.internal.ads.zzbrk) r3     // Catch: android.os.RemoteException -> L63
            java.lang.String r4 = r12.zzU     // Catch: android.os.RemoteException -> L63
            org.json.JSONObject r12 = r12.zzv     // Catch: android.os.RemoteException -> L63
            java.lang.String r5 = r12.toString()     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.internal.ads.zzfgq r11 = r11.zza     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.internal.ads.zzfhc r11 = r11.zza     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.ads.internal.client.zzm r6 = r11.zzd     // Catch: android.os.RemoteException -> L63
            android.content.Context r11 = r10.zza     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.dynamic.IObjectWrapper r7 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.internal.ads.zzeku r8 = new com.google.android.gms.internal.ads.zzeku     // Catch: android.os.RemoteException -> L63
            r8.<init>(r10, r13, r2)     // Catch: android.os.RemoteException -> L63
            com.google.android.gms.internal.ads.zzczk r11 = r13.zzc     // Catch: android.os.RemoteException -> L63
            r9 = r11
            com.google.android.gms.internal.ads.zzbpr r9 = (com.google.android.gms.internal.ads.zzbpr) r9     // Catch: android.os.RemoteException -> L63
            r3.zzp(r4, r5, r6, r7, r8, r9)     // Catch: android.os.RemoteException -> L63
            return
        L63:
            r11 = move-exception
            java.lang.String r12 = "Remote exception loading a rewarded RTB ad"
            com.google.android.gms.ads.internal.util.zze.zzb(r12, r11)
            return
    }
}
