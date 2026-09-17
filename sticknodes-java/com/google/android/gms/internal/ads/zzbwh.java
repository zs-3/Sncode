package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbwh {
    private final java.util.WeakHashMap zza;

    public zzbwh() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    static /* bridge */ /* synthetic */ java.util.WeakHashMap zza(com.google.android.gms.internal.ads.zzbwh r0) {
            java.util.WeakHashMap r0 = r0.zza
            return r0
    }

    public final java.util.concurrent.Future zzb(android.content.Context r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.android.gms.internal.ads.zzbwf r1 = new com.google.android.gms.internal.ads.zzbwf
            r1.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r3 = r0.zzb(r1)
            return r3
    }
}
