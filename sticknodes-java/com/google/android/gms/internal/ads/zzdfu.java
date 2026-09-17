package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdfu extends com.google.android.gms.internal.ads.zzddr implements com.google.android.gms.internal.ads.zzayv {
    private final java.util.Map zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzfgh zzd;

    public zzdfu(android.content.Context r2, java.util.Set r3, com.google.android.gms.internal.ads.zzfgh r4) {
            r1 = this;
            r1.<init>(r3)
            java.util.WeakHashMap r3 = new java.util.WeakHashMap
            r0 = 1
            r3.<init>(r0)
            r1.zzb = r3
            r1.zzc = r2
            r1.zzd = r4
            return
    }

    public final synchronized void zza(android.view.View r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.Map r0 = r3.zzb     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.zzayw r0 = (com.google.android.gms.internal.ads.zzayw) r0     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L1b
            android.content.Context r0 = r3.zzc     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.zzayw r1 = new com.google.android.gms.internal.ads.zzayw     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r0, r4)     // Catch: java.lang.Throwable -> L4d
            r1.zzc(r3)     // Catch: java.lang.Throwable -> L4d
            java.util.Map r0 = r3.zzb     // Catch: java.lang.Throwable -> L4d
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L4d
            r0 = r1
        L1b:
            com.google.android.gms.internal.ads.zzfgh r4 = r3.zzd     // Catch: java.lang.Throwable -> L4d
            boolean r4 = r4.zzX     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L48
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzbs     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r1.zza(r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L4d
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L48
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzbr     // Catch: java.lang.Throwable -> L4d
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r1.zza(r4)     // Catch: java.lang.Throwable -> L4d
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L4d
            long r1 = r4.longValue()     // Catch: java.lang.Throwable -> L4d
            r0.zzg(r1)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r3)
            return
        L48:
            r0.zzf()     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r3)
            return
        L4d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void zzb(android.view.View r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zzb     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1b
            java.util.Map r0 = r1.zzb     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.internal.ads.zzayw r0 = (com.google.android.gms.internal.ads.zzayw) r0     // Catch: java.lang.Throwable -> L1d
            r0.zze(r1)     // Catch: java.lang.Throwable -> L1d
            java.util.Map r0 = r1.zzb     // Catch: java.lang.Throwable -> L1d
            r0.remove(r2)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)
            return
        L1b:
            monitor-exit(r1)
            return
        L1d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final synchronized void zzdp(com.google.android.gms.internal.ads.zzayu r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdft r0 = new com.google.android.gms.internal.ads.zzdft     // Catch: java.lang.Throwable -> Lb
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lb
            r1.zzq(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
