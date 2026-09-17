package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbst extends com.google.android.gms.ads.nativead.NativeAd.Image {
    private final com.google.android.gms.internal.ads.zzbgc zza;
    private final android.graphics.drawable.Drawable zzb;
    private final android.net.Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbst(com.google.android.gms.internal.ads.zzbgc r4) {
            r3 = this;
            java.lang.String r0 = ""
            r3.<init>()
            r3.zza = r4
            r1 = 0
            com.google.android.gms.dynamic.IObjectWrapper r4 = r4.zzf()     // Catch: android.os.RemoteException -> L15
            if (r4 == 0) goto L19
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)     // Catch: android.os.RemoteException -> L15
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4     // Catch: android.os.RemoteException -> L15
            goto L1a
        L15:
            r4 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
        L19:
            r4 = r1
        L1a:
            r3.zzb = r4
            com.google.android.gms.internal.ads.zzbgc r4 = r3.zza     // Catch: android.os.RemoteException -> L23
            android.net.Uri r1 = r4.zze()     // Catch: android.os.RemoteException -> L23
            goto L27
        L23:
            r4 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
        L27:
            r3.zzc = r1
            com.google.android.gms.internal.ads.zzbgc r4 = r3.zza     // Catch: android.os.RemoteException -> L30
            double r1 = r4.zzb()     // Catch: android.os.RemoteException -> L30
            goto L36
        L30:
            r4 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L36:
            r3.zzd = r1
            r4 = -1
            com.google.android.gms.internal.ads.zzbgc r1 = r3.zza     // Catch: android.os.RemoteException -> L40
            int r1 = r1.zzd()     // Catch: android.os.RemoteException -> L40
            goto L45
        L40:
            r1 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r1)
            r1 = -1
        L45:
            r3.zze = r1
            com.google.android.gms.internal.ads.zzbgc r1 = r3.zza     // Catch: android.os.RemoteException -> L4e
            int r4 = r1.zzc()     // Catch: android.os.RemoteException -> L4e
            goto L52
        L4e:
            r1 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r1)
        L52:
            r3.zzf = r4
            return
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final android.graphics.drawable.Drawable getDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
            r2 = this;
            double r0 = r2.zzd
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final android.net.Uri getUri() {
            r1 = this;
            android.net.Uri r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }
}
