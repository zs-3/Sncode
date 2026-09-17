package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbtx extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbty {
    public static com.google.android.gms.internal.ads.zzbty zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbty
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbty r0 = (com.google.android.gms.internal.ads.zzbty) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbtw r0 = new com.google.android.gms.internal.ads.zzbtw
            r0.<init>(r2)
            return r0
    }
}
