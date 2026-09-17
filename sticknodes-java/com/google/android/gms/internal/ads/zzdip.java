package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdip implements com.google.android.gms.internal.ads.zzcya, com.google.android.gms.internal.ads.zzdff {
    private final com.google.android.gms.internal.ads.zzbyv zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzbyz zzc;
    private final android.view.View zzd;
    private java.lang.String zze;
    private final com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza zzf;

    public zzdip(com.google.android.gms.internal.ads.zzbyv r1, android.content.Context r2, com.google.android.gms.internal.ads.zzbyz r3, android.view.View r4, com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zzf = r5
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbyv r0 = r2.zza
            r1 = 0
            r0.zzb(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzb() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzc() {
            r3 = this;
            android.view.View r0 = r3.zzd
            if (r0 == 0) goto L13
            java.lang.String r1 = r3.zze
            if (r1 == 0) goto L13
            com.google.android.gms.internal.ads.zzbyz r1 = r3.zzc
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = r3.zze
            r1.zzo(r0, r2)
        L13:
            com.google.android.gms.internal.ads.zzbyv r0 = r3.zza
            r1 = 1
            r0.zzb(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzds(com.google.android.gms.internal.ads.zzbwm r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            com.google.android.gms.internal.ads.zzbyz r8 = r6.zzc
            android.content.Context r9 = r6.zzb
            boolean r8 = r8.zzp(r9)
            if (r8 == 0) goto L2a
            com.google.android.gms.internal.ads.zzbyz r0 = r6.zzc     // Catch: android.os.RemoteException -> L24
            android.content.Context r1 = r6.zzb     // Catch: android.os.RemoteException -> L24
            java.lang.String r2 = r0.zza(r1)     // Catch: android.os.RemoteException -> L24
            com.google.android.gms.internal.ads.zzbyv r8 = r6.zza     // Catch: android.os.RemoteException -> L24
            java.lang.String r3 = r8.zza()     // Catch: android.os.RemoteException -> L24
            java.lang.String r4 = r7.zzc()     // Catch: android.os.RemoteException -> L24
            int r5 = r7.zzb()     // Catch: android.os.RemoteException -> L24
            r0.zzl(r1, r2, r3, r4, r5)     // Catch: android.os.RemoteException -> L24
            return
        L24:
            r7 = move-exception
            java.lang.String r8 = "Remote Exception to get reward item."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r8, r7)
        L2a:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zze() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzf() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzk() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzl() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcb$zza$zza r0 = r3.zzf
            com.google.android.gms.internal.ads.zzbcb$zza$zza r1 = com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza.zzk
            if (r0 != r1) goto L7
            return
        L7:
            com.google.android.gms.internal.ads.zzbyz r0 = r3.zzc
            android.content.Context r1 = r3.zzb
            java.lang.String r0 = r0.zzc(r1)
            r3.zze = r0
            com.google.android.gms.internal.ads.zzbcb$zza$zza r1 = r3.zzf
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.google.android.gms.internal.ads.zzbcb$zza$zza r2 = com.google.android.gms.internal.ads.zzbcb.zza.EnumC0006zza.zzh
            if (r1 != r2) goto L1e
            java.lang.String r1 = "/Rewarded"
            goto L20
        L1e:
            java.lang.String r1 = "/Interstitial"
        L20:
            java.lang.String r0 = r0.concat(r1)
            r3.zze = r0
            return
    }
}
