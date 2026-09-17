package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbgx {
    private final com.google.android.gms.internal.ads.zzbgw zza;

    public zzbgx(com.google.android.gms.internal.ads.zzbgw r3) {
            r2 = this;
            java.lang.String r0 = ""
            r2.<init>()
            r2.zza = r3
            com.google.android.gms.dynamic.IObjectWrapper r3 = r3.zzh()     // Catch: android.os.RemoteException -> L12 java.lang.NullPointerException -> L14
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch: android.os.RemoteException -> L12 java.lang.NullPointerException -> L14
            android.content.Context r3 = (android.content.Context) r3     // Catch: android.os.RemoteException -> L12 java.lang.NullPointerException -> L14
            goto L19
        L12:
            r3 = move-exception
            goto L15
        L14:
            r3 = move-exception
        L15:
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
            r3 = 0
        L19:
            if (r3 == 0) goto L2e
            com.google.android.gms.ads.formats.MediaView r1 = new com.google.android.gms.ads.formats.MediaView
            r1.<init>(r3)
            com.google.android.gms.internal.ads.zzbgw r3 = r2.zza     // Catch: android.os.RemoteException -> L2a
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L2a
            r3.zzs(r1)     // Catch: android.os.RemoteException -> L2a
            return
        L2a:
            r3 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
        L2e:
            return
    }

    public final com.google.android.gms.internal.ads.zzbgw zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbgw r0 = r1.zza
            return r0
    }

    public final java.lang.String zzb() {
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
}
