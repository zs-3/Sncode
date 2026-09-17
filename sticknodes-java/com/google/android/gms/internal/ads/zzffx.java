package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzffx implements com.google.android.gms.internal.ads.zzeoq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzffy zza;

    zzffx(com.google.android.gms.internal.ads.zzffy r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final void zza() {
            r3 = this;
            com.google.android.gms.internal.ads.zzffy r0 = r3.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzffy r1 = r3.zza     // Catch: java.lang.Throwable -> Lb
            r2 = 0
            com.google.android.gms.internal.ads.zzffy.zzt(r1, r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzeoq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzdqi r4 = (com.google.android.gms.internal.ads.zzdqi) r4
            com.google.android.gms.internal.ads.zzffy r0 = r3.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzffy r1 = r3.zza     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzffy.zzt(r1, r4)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzdx     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L28
            com.google.android.gms.internal.ads.zzfgv r4 = r4.zzd()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzffy r1 = r3.zza     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzfgu r1 = com.google.android.gms.internal.ads.zzffy.zzs(r1)     // Catch: java.lang.Throwable -> L33
            r4.zza = r1     // Catch: java.lang.Throwable -> L33
        L28:
            com.google.android.gms.internal.ads.zzffy r4 = r3.zza     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzdqi r4 = com.google.android.gms.internal.ads.zzffy.zzr(r4)     // Catch: java.lang.Throwable -> L33
            r4.zzk()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r4
    }
}
