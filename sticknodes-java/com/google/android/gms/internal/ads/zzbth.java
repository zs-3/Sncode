package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbth extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbti {
    public static com.google.android.gms.internal.ads.zzbti zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbti
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbti r0 = (com.google.android.gms.internal.ads.zzbti) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbtg r0 = new com.google.android.gms.internal.ads.zzbtg
            r0.<init>(r2)
            return r0
    }
}
