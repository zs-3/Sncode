package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzejn implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgh zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzejo zzb;

    zzejn(com.google.android.gms.internal.ads.zzejo r1, com.google.android.gms.internal.ads.zzfgh r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzejo r0 = r3.zzb
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzejo r1 = r3.zzb     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzejp r1 = com.google.android.gms.internal.ads.zzejo.zza(r1)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzfgh r2 = r3.zza     // Catch: java.lang.Throwable -> L39
            r1.zzb(r4, r2)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzejo r4 = r3.zzb     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzejp r4 = com.google.android.gms.internal.ads.zzejo.zza(r4)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzfgh r4 = r4.zza()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzfgh r1 = r3.zza     // Catch: java.lang.Throwable -> L39
            boolean r1 = r1.zzav     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L30
        L1e:
            if (r4 == 0) goto L37
            com.google.android.gms.internal.ads.zzejo r1 = r3.zzb     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzejo.zzc(r1, r4)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzejo r4 = r3.zzb     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzejp r4 = com.google.android.gms.internal.ads.zzejo.zza(r4)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzfgh r4 = r4.zza()     // Catch: java.lang.Throwable -> L39
            goto L1e
        L30:
            if (r4 == 0) goto L37
            com.google.android.gms.internal.ads.zzejo r1 = r3.zzb     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzejo.zzc(r1, r4)     // Catch: java.lang.Throwable -> L39
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return
        L39:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r4
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzejo r0 = r3.zzb
            com.google.android.gms.internal.ads.zzekf r4 = (com.google.android.gms.internal.ads.zzekf) r4
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzejo r1 = r3.zzb     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zzejp r1 = com.google.android.gms.internal.ads.zzejo.zza(r1)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zzfgh r2 = r3.zza     // Catch: java.lang.Throwable -> L23
            r1.zzc(r4, r2)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zzejo r4 = r3.zzb     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zzejp r4 = com.google.android.gms.internal.ads.zzejo.zza(r4)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zzfgh r4 = r4.zza()     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L21
            com.google.android.gms.internal.ads.zzejo r1 = r3.zzb     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zzejo.zzc(r1, r4)     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r4
    }
}
