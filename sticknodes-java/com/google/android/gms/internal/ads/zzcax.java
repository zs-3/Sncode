package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcax implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcaz zza;

    zzcax(com.google.android.gms.internal.ads.zzcaz r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcaz r2 = r1.zza
            java.util.concurrent.atomic.AtomicInteger r2 = com.google.android.gms.internal.ads.zzcaz.zzf(r2)
            r0 = -1
            r2.set(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zzb(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcaz r2 = r1.zza
            java.util.concurrent.atomic.AtomicInteger r2 = com.google.android.gms.internal.ads.zzcaz.zzf(r2)
            r0 = 1
            r2.set(r0)
            return
    }
}
