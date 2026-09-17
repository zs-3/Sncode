package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbia extends com.google.android.gms.ads.formats.UnifiedNativeAd {
    private final com.google.android.gms.internal.ads.zzbhz zza;
    private final java.util.List zzb;
    private final com.google.android.gms.internal.ads.zzbgd zzc;
    private final com.google.android.gms.ads.VideoController zzd;
    private final java.util.List zze;

    public zzbia(com.google.android.gms.internal.ads.zzbhz r6) {
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzb = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.zzd = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zze = r1
            r5.zza = r6
            r1 = 0
            java.util.List r6 = r6.zzu()     // Catch: android.os.RemoteException -> L5b
            if (r6 == 0) goto L5f
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L5b
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L5b
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L5b
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L5b
            if (r3 == 0) goto L4d
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L5b
            if (r2 != 0) goto L3a
            goto L4d
        L3a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L5b
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzbgc     // Catch: android.os.RemoteException -> L5b
            if (r4 == 0) goto L47
            com.google.android.gms.internal.ads.zzbgc r3 = (com.google.android.gms.internal.ads.zzbgc) r3     // Catch: android.os.RemoteException -> L5b
            goto L4e
        L47:
            com.google.android.gms.internal.ads.zzbga r3 = new com.google.android.gms.internal.ads.zzbga     // Catch: android.os.RemoteException -> L5b
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L5b
            goto L4e
        L4d:
            r3 = r1
        L4e:
            if (r3 == 0) goto L27
            java.util.List r2 = r5.zzb     // Catch: android.os.RemoteException -> L5b
            com.google.android.gms.internal.ads.zzbgd r4 = new com.google.android.gms.internal.ads.zzbgd     // Catch: android.os.RemoteException -> L5b
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L5b
            r2.add(r4)     // Catch: android.os.RemoteException -> L5b
            goto L27
        L5b:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        L5f:
            com.google.android.gms.internal.ads.zzbhz r6 = r5.zza     // Catch: android.os.RemoteException -> L8e
            java.util.List r6 = r6.zzv()     // Catch: android.os.RemoteException -> L8e
            if (r6 == 0) goto L92
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L8e
        L6b:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L8e
            if (r2 == 0) goto L92
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L8e
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L8e
            if (r3 == 0) goto L80
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L8e
            com.google.android.gms.ads.internal.client.zzdh r2 = com.google.android.gms.ads.internal.client.zzdg.zzb(r2)     // Catch: android.os.RemoteException -> L8e
            goto L81
        L80:
            r2 = r1
        L81:
            if (r2 == 0) goto L6b
            java.util.List r3 = r5.zze     // Catch: android.os.RemoteException -> L8e
            com.google.android.gms.ads.internal.client.zzdi r4 = new com.google.android.gms.ads.internal.client.zzdi     // Catch: android.os.RemoteException -> L8e
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L8e
            r3.add(r4)     // Catch: android.os.RemoteException -> L8e
            goto L6b
        L8e:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        L92:
            com.google.android.gms.internal.ads.zzbhz r6 = r5.zza     // Catch: android.os.RemoteException -> La1
            com.google.android.gms.internal.ads.zzbgc r6 = r6.zzk()     // Catch: android.os.RemoteException -> La1
            if (r6 == 0) goto La5
            com.google.android.gms.internal.ads.zzbgd r2 = new com.google.android.gms.internal.ads.zzbgd     // Catch: android.os.RemoteException -> La1
            r2.<init>(r6)     // Catch: android.os.RemoteException -> La1
            r1 = r2
            goto La5
        La1:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
        La5:
            r5.zzc = r1
            com.google.android.gms.internal.ads.zzbhz r6 = r5.zza     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbfv r6 = r6.zzi()     // Catch: android.os.RemoteException -> Lbb
            if (r6 == 0) goto Lba
            com.google.android.gms.internal.ads.zzbfw r6 = new com.google.android.gms.internal.ads.zzbfw     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbhz r1 = r5.zza     // Catch: android.os.RemoteException -> Lbb
            com.google.android.gms.internal.ads.zzbfv r1 = r1.zzi()     // Catch: android.os.RemoteException -> Lbb
            r6.<init>(r1)     // Catch: android.os.RemoteException -> Lbb
        Lba:
            return
        Lbb:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r6)
            return
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r1.zza     // Catch: android.os.RemoteException -> L6
            r0.zzz(r2)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r1.zza     // Catch: android.os.RemoteException -> L7
            boolean r2 = r0.zzJ(r2)     // Catch: android.os.RemoteException -> L7
            return r2
        L7:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(android.os.Bundle r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r1.zza     // Catch: android.os.RemoteException -> L6
            r0.zzC(r2)     // Catch: android.os.RemoteException -> L6
            return
        L6:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final com.google.android.gms.ads.VideoController zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L14
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzh()     // Catch: android.os.RemoteException -> L14
            if (r0 == 0) goto L1a
            com.google.android.gms.ads.VideoController r0 = r2.zzd     // Catch: android.os.RemoteException -> L14
            com.google.android.gms.internal.ads.zzbhz r1 = r2.zza     // Catch: android.os.RemoteException -> L14
            com.google.android.gms.ads.internal.client.zzeb r1 = r1.zzh()     // Catch: android.os.RemoteException -> L14
            r0.zzb(r1)     // Catch: android.os.RemoteException -> L14
            goto L1a
        L14:
            r0 = move-exception
            java.lang.String r1 = "Exception occurred while getting video controller"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        L1a:
            com.google.android.gms.ads.VideoController r0 = r2.zzd
            return r0
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final com.google.android.gms.ads.formats.NativeAd.Image zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbgd r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.Double zzc() {
            r6 = this;
            r0 = 0
            com.google.android.gms.internal.ads.zzbhz r1 = r6.zza     // Catch: android.os.RemoteException -> L13
            double r1 = r1.zze()     // Catch: android.os.RemoteException -> L13
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto Le
            goto L12
        Le:
            java.lang.Double r0 = java.lang.Double.valueOf(r1)     // Catch: android.os.RemoteException -> L13
        L12:
            return r0
        L13:
            r1 = move-exception
            java.lang.String r2 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)
            return r0
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.Object zzd() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> Ld
            com.google.android.gms.dynamic.IObjectWrapper r0 = r0.zzl()     // Catch: android.os.RemoteException -> Ld
            if (r0 == 0) goto L13
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch: android.os.RemoteException -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        L13:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zze() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            java.lang.String r0 = r0.zzn()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zzf() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            java.lang.String r0 = r0.zzo()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zzg() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            java.lang.String r0 = r0.zzp()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zzh() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            java.lang.String r0 = r0.zzq()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zzi() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            java.lang.String r0 = r0.zzs()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.lang.String zzj() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbhz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            java.lang.String r0 = r0.zzt()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final java.util.List zzk() {
            r1 = this;
            java.util.List r0 = r1.zzb
            return r0
    }
}
