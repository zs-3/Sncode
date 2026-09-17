package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfji implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfjl zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfjm zzb;

    zzfji(com.google.android.gms.internal.ads.zzfjm r1, com.google.android.gms.internal.ads.zzfjl r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzfjm r3 = r2.zzb
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzfjm r0 = r2.zzb     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            com.google.android.gms.internal.ads.zzfjm.zzc(r0, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r4) {
            r3 = this;
            java.lang.Void r4 = (java.lang.Void) r4
            com.google.android.gms.internal.ads.zzfjm r4 = r3.zzb
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzfjm r0 = r3.zzb     // Catch: java.lang.Throwable -> L24
            r1 = 0
            com.google.android.gms.internal.ads.zzfjm.zzc(r0, r1)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzfjm r0 = r3.zzb     // Catch: java.lang.Throwable -> L24
            java.util.ArrayDeque r0 = com.google.android.gms.internal.ads.zzfjm.zzb(r0)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzfjl r1 = r3.zza     // Catch: java.lang.Throwable -> L24
            r0.addFirst(r1)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzfjm r0 = r3.zzb     // Catch: java.lang.Throwable -> L24
            int r1 = com.google.android.gms.internal.ads.zzfjm.zzg(r0)     // Catch: java.lang.Throwable -> L24
            r2 = 1
            if (r1 != r2) goto L22
            com.google.android.gms.internal.ads.zzfjm.zzd(r0)     // Catch: java.lang.Throwable -> L24
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L24
            throw r0
    }
}
