package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbxr {
    public zzbxr() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final com.google.android.gms.internal.ads.zzbxf zza(android.content.Context r4, java.lang.String r5, com.google.android.gms.internal.ads.zzbpl r6) {
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)
            r1 = 0
            java.lang.String r2 = "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl"
            com.google.android.gms.internal.ads.zzbxq r3 = new com.google.android.gms.internal.ads.zzbxq     // Catch: android.os.RemoteException -> L31 com.google.android.gms.ads.internal.util.client.zzp -> L33
            r3.<init>()     // Catch: android.os.RemoteException -> L31 com.google.android.gms.ads.internal.util.client.zzp -> L33
            java.lang.Object r4 = com.google.android.gms.ads.internal.util.client.zzq.zzb(r4, r2, r3)     // Catch: android.os.RemoteException -> L31 com.google.android.gms.ads.internal.util.client.zzp -> L33
            com.google.android.gms.internal.ads.zzbxj r4 = (com.google.android.gms.internal.ads.zzbxj) r4     // Catch: android.os.RemoteException -> L31 com.google.android.gms.ads.internal.util.client.zzp -> L33
            r2 = 243220000(0xe7f3e20, float:3.1461089E-30)
            android.os.IBinder r4 = r4.zze(r0, r5, r6, r2)     // Catch: android.os.RemoteException -> L31 com.google.android.gms.ads.internal.util.client.zzp -> L33
            if (r4 != 0) goto L1c
            goto L30
        L1c:
            java.lang.String r5 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)     // Catch: android.os.RemoteException -> L31 com.google.android.gms.ads.internal.util.client.zzp -> L33
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzbxf     // Catch: android.os.RemoteException -> L31 com.google.android.gms.ads.internal.util.client.zzp -> L33
            if (r6 == 0) goto L2a
            com.google.android.gms.internal.ads.zzbxf r5 = (com.google.android.gms.internal.ads.zzbxf) r5     // Catch: android.os.RemoteException -> L31 com.google.android.gms.ads.internal.util.client.zzp -> L33
        L28:
            r1 = r5
            goto L30
        L2a:
            com.google.android.gms.internal.ads.zzbxd r5 = new com.google.android.gms.internal.ads.zzbxd     // Catch: android.os.RemoteException -> L31 com.google.android.gms.ads.internal.util.client.zzp -> L33
            r5.<init>(r4)     // Catch: android.os.RemoteException -> L31 com.google.android.gms.ads.internal.util.client.zzp -> L33
            goto L28
        L30:
            return r1
        L31:
            r4 = move-exception
            goto L34
        L33:
            r4 = move-exception
        L34:
            java.lang.String r5 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r5, r4)
            return r1
    }
}
