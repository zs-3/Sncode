package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfny implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfoa zza;

    zzfny(com.google.android.gms.internal.ads.zzfoa r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfoa r0 = r2.zza
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.internal.ads.zzfoa.zze(r0)
            r1 = 0
            r0.set(r1)
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzfni
            if (r0 == 0) goto L19
            com.google.android.gms.internal.ads.zzfni r3 = (com.google.android.gms.internal.ads.zzfni) r3
            int r3 = r3.zza()
            if (r3 == 0) goto L17
            goto L19
        L17:
            r3 = 0
            throw r3
        L19:
            com.google.android.gms.internal.ads.zzfoa r3 = r2.zza
            r0 = 1
            com.google.android.gms.internal.ads.zzfoa.zzg(r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zzb(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfoa r0 = r2.zza
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.internal.ads.zzfoa.zze(r0)
            r1 = 0
            r0.set(r1)
            if (r3 == 0) goto L20
            com.google.android.gms.internal.ads.zzfoa r0 = r2.zza
            com.google.android.gms.internal.ads.zzfnm r0 = com.google.android.gms.internal.ads.zzfoa.zzb(r0)
            r0.zzc()
            com.google.android.gms.internal.ads.zzfoa r0 = r2.zza
            com.google.android.gms.internal.ads.zzfoa.zzf(r0, r3)
            com.google.android.gms.internal.ads.zzfoa r3 = r2.zza
            com.google.android.gms.internal.ads.zzfoa.zzg(r3, r1)
            return
        L20:
            com.google.android.gms.internal.ads.zzfoa r3 = r2.zza
            r0 = 1
            com.google.android.gms.internal.ads.zzfoa.zzg(r3, r0)
            return
    }
}
