package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbfw extends com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo {
    private final com.google.android.gms.internal.ads.zzbfv zza;
    private final java.util.List zzb;
    private java.lang.String zzc;

    public zzbfw(com.google.android.gms.internal.ads.zzbfv r5) {
            r4 = this;
            java.lang.String r0 = ""
            r4.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.zzb = r1
            r4.zza = r5
            java.lang.String r1 = r5.zzg()     // Catch: android.os.RemoteException -> L15
            r4.zzc = r1     // Catch: android.os.RemoteException -> L15
            goto L1b
        L15:
            r1 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r1)
            r4.zzc = r0
        L1b:
            java.util.List r5 = r5.zzh()     // Catch: android.os.RemoteException -> L58
            java.util.Iterator r5 = r5.iterator()     // Catch: android.os.RemoteException -> L58
        L23:
            boolean r1 = r5.hasNext()     // Catch: android.os.RemoteException -> L58
            if (r1 == 0) goto L57
            java.lang.Object r1 = r5.next()     // Catch: android.os.RemoteException -> L58
            boolean r2 = r1 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L58
            r3 = 0
            if (r2 == 0) goto L4a
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch: android.os.RemoteException -> L58
            if (r1 != 0) goto L37
            goto L4a
        L37:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch: android.os.RemoteException -> L58
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbgc     // Catch: android.os.RemoteException -> L58
            if (r3 == 0) goto L45
            r3 = r2
            com.google.android.gms.internal.ads.zzbgc r3 = (com.google.android.gms.internal.ads.zzbgc) r3     // Catch: android.os.RemoteException -> L58
            goto L4a
        L45:
            com.google.android.gms.internal.ads.zzbga r3 = new com.google.android.gms.internal.ads.zzbga     // Catch: android.os.RemoteException -> L58
            r3.<init>(r1)     // Catch: android.os.RemoteException -> L58
        L4a:
            if (r3 == 0) goto L23
            java.util.List r1 = r4.zzb     // Catch: android.os.RemoteException -> L58
            com.google.android.gms.internal.ads.zzbgd r2 = new com.google.android.gms.internal.ads.zzbgd     // Catch: android.os.RemoteException -> L58
            r2.<init>(r3)     // Catch: android.os.RemoteException -> L58
            r1.add(r2)     // Catch: android.os.RemoteException -> L58
            goto L23
        L57:
            return
        L58:
            r5 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r5)
            return
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final java.util.List<com.google.android.gms.ads.formats.NativeAd.Image> getImages() {
            r1 = this;
            java.util.List r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final java.lang.CharSequence getText() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }
}
