package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbpd {
    private static com.google.android.gms.internal.ads.zzbpd zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb;

    zzbpd() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.zzb = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzbpd zza() {
            com.google.android.gms.internal.ads.zzbpd r0 = com.google.android.gms.internal.ads.zzbpd.zza
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.ads.zzbpd r0 = new com.google.android.gms.internal.ads.zzbpd
            r0.<init>()
            com.google.android.gms.internal.ads.zzbpd.zza = r0
        Lb:
            com.google.android.gms.internal.ads.zzbpd r0 = com.google.android.gms.internal.ads.zzbpd.zza
            return r0
    }

    public final java.lang.Thread zzb(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzb
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Lc
            r4 = 0
            return r4
        Lc:
            java.lang.Thread r0 = new java.lang.Thread
            com.google.android.gms.internal.ads.zzbpc r1 = new com.google.android.gms.internal.ads.zzbpc
            r1.<init>(r3, r4, r5)
            r0.<init>(r1)
            r0.start()
            return r0
    }
}
