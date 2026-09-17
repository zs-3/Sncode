package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzbhs extends com.google.android.gms.internal.ads.zzaym implements com.google.android.gms.internal.ads.zzbht {
    public static com.google.android.gms.internal.ads.zzbht zzb(android.os.IBinder r2) {
            java.lang.String r0 = "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbht
            if (r1 == 0) goto Ld
            com.google.android.gms.internal.ads.zzbht r0 = (com.google.android.gms.internal.ads.zzbht) r0
            return r0
        Ld:
            com.google.android.gms.internal.ads.zzbhr r0 = new com.google.android.gms.internal.ads.zzbhr
            r0.<init>(r2)
            return r0
    }
}
