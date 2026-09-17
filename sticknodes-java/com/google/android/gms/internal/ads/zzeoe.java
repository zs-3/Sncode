package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeoe implements com.google.android.gms.internal.ads.zzdal {
    private final java.util.concurrent.atomic.AtomicReference zza;

    public zzeoe() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.zza = r0
            return
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzdr r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zza
            r0.set(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdal
    public final void zzh(com.google.android.gms.ads.internal.client.zzu r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzeod r0 = new com.google.android.gms.internal.ads.zzeod
            r0.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r2 = r1.zza
            com.google.android.gms.internal.ads.zzfdm.zza(r2, r0)
            return
    }
}
