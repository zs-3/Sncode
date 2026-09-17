package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbsr extends com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo {
    private final java.util.List zza;
    private java.lang.String zzb;

    public zzbsr(com.google.android.gms.internal.ads.zzbfv r5) {
            r4 = this;
            java.lang.String r0 = ""
            r4.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.zza = r1
            java.lang.String r1 = r5.zzg()     // Catch: android.os.RemoteException -> L13
            r4.zzb = r1     // Catch: android.os.RemoteException -> L13
            goto L19
        L13:
            r1 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r1)
            r4.zzb = r0
        L19:
            java.util.List r5 = r5.zzh()     // Catch: android.os.RemoteException -> L45
            java.util.Iterator r5 = r5.iterator()     // Catch: android.os.RemoteException -> L45
        L21:
            boolean r1 = r5.hasNext()     // Catch: android.os.RemoteException -> L45
            if (r1 == 0) goto L44
            java.lang.Object r1 = r5.next()     // Catch: android.os.RemoteException -> L45
            boolean r2 = r1 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L45
            if (r2 == 0) goto L36
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch: android.os.RemoteException -> L45
            com.google.android.gms.internal.ads.zzbgc r1 = com.google.android.gms.internal.ads.zzbgb.zzg(r1)     // Catch: android.os.RemoteException -> L45
            goto L37
        L36:
            r1 = 0
        L37:
            if (r1 == 0) goto L21
            java.util.List r2 = r4.zza     // Catch: android.os.RemoteException -> L45
            com.google.android.gms.internal.ads.zzbst r3 = new com.google.android.gms.internal.ads.zzbst     // Catch: android.os.RemoteException -> L45
            r3.<init>(r1)     // Catch: android.os.RemoteException -> L45
            r2.add(r3)     // Catch: android.os.RemoteException -> L45
            goto L21
        L44:
            return
        L45:
            r5 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r5)
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final java.util.List<com.google.android.gms.ads.nativead.NativeAd.Image> getImages() {
            r1 = this;
            java.util.List r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final java.lang.CharSequence getText() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
