package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbgi extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbgj {
    public static com.google.android.gms.internal.ads.zzbgj zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbgj
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbgj r0 = (com.google.android.gms.internal.ads.zzbgj) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbgh r0 = new com.google.android.gms.internal.ads.zzbgh
            r0.<init>(r2)
            return r0
    }
}
