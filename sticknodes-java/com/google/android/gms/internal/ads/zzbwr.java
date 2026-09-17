package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbwr extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbws {
    public static com.google.android.gms.internal.ads.zzbws zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbws
            if (r1 == 0) goto L11
            com.google.android.gms.internal.ads.zzbws r0 = (com.google.android.gms.internal.ads.zzbws) r0
            return r0
        L11:
            com.google.android.gms.internal.ads.zzbwq r0 = new com.google.android.gms.internal.ads.zzbwq
            r0.<init>(r2)
            return r0
    }
}
