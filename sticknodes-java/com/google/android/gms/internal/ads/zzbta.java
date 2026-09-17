package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbta implements com.google.android.gms.ads.nativead.NativeCustomFormatAd {
    private final com.google.android.gms.internal.ads.zzbgw zza;
    private com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement zzb;

    public zzbta(com.google.android.gms.internal.ads.zzbgw r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbgw r0 = r2.zza     // Catch: android.os.RemoteException -> L6
            r0.zzl()     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final java.util.List<java.lang.String> getAvailableAssetNames() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbgw r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            java.util.List r0 = r0.zzk()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final java.lang.String getCustomFormatId() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbgw r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            java.lang.String r0 = r0.zzi()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
            r2 = this;
            com.google.android.gms.ads.nativead.NativeCustomFormatAd$DisplayOpenMeasurement r0 = r2.zzb     // Catch: android.os.RemoteException -> L16
            if (r0 != 0) goto L1c
            com.google.android.gms.internal.ads.zzbgw r0 = r2.zza     // Catch: android.os.RemoteException -> L16
            boolean r0 = r0.zzq()     // Catch: android.os.RemoteException -> L16
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.ads.zzbss r0 = new com.google.android.gms.internal.ads.zzbss     // Catch: android.os.RemoteException -> L16
            com.google.android.gms.internal.ads.zzbgw r1 = r2.zza     // Catch: android.os.RemoteException -> L16
            r0.<init>(r1)     // Catch: android.os.RemoteException -> L16
            r2.zzb = r0     // Catch: android.os.RemoteException -> L16
            goto L1c
        L16:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        L1c:
            com.google.android.gms.ads.nativead.NativeCustomFormatAd$DisplayOpenMeasurement r0 = r2.zzb
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final com.google.android.gms.ads.nativead.NativeAd.Image getImage(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbgw r0 = r1.zza     // Catch: android.os.RemoteException -> Le
            com.google.android.gms.internal.ads.zzbgc r2 = r0.zzg(r2)     // Catch: android.os.RemoteException -> Le
            if (r2 == 0) goto L14
            com.google.android.gms.internal.ads.zzbst r0 = new com.google.android.gms.internal.ads.zzbst     // Catch: android.os.RemoteException -> Le
            r0.<init>(r2)     // Catch: android.os.RemoteException -> Le
            return r0
        Le:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
        L14:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final com.google.android.gms.ads.MediaContent getMediaContent() {
            r3 = this;
            com.google.android.gms.internal.ads.zzbgw r0 = r3.zza     // Catch: android.os.RemoteException -> L16
            com.google.android.gms.internal.ads.zzbfz r0 = r0.zzf()     // Catch: android.os.RemoteException -> L16
            if (r0 == 0) goto L1c
            com.google.android.gms.ads.internal.client.zzfe r0 = new com.google.android.gms.ads.internal.client.zzfe     // Catch: android.os.RemoteException -> L16
            com.google.android.gms.internal.ads.zzbgw r1 = r3.zza     // Catch: android.os.RemoteException -> L16
            com.google.android.gms.internal.ads.zzbfz r1 = r1.zzf()     // Catch: android.os.RemoteException -> L16
            com.google.android.gms.internal.ads.zzbgw r2 = r3.zza     // Catch: android.os.RemoteException -> L16
            r0.<init>(r1, r2)     // Catch: android.os.RemoteException -> L16
            return r0
        L16:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        L1c:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final java.lang.CharSequence getText(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbgw r0 = r1.zza     // Catch: android.os.RemoteException -> L7
            java.lang.String r2 = r0.zzj(r2)     // Catch: android.os.RemoteException -> L7
            return r2
        L7:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbgw r0 = r1.zza     // Catch: android.os.RemoteException -> L6
            r0.zzn(r2)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbgw r0 = r2.zza     // Catch: android.os.RemoteException -> L6
            r0.zzo()     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            return
    }
}
