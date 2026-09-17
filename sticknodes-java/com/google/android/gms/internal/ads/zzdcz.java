package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdcz implements com.google.android.gms.internal.ads.zzday {
    private int zza;
    private int zzb;

    public zzdcz() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbk
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.zza = r0
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmu
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.zzb = r0
            return
    }

    public final synchronized int zzc() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.zza     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized int zzd() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.zzb     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdn(com.google.android.gms.internal.ads.zzbwa r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final synchronized void zzdo(com.google.android.gms.internal.ads.zzfgt r3) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzbl     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L25
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L23
            com.google.android.gms.internal.ads.zzfgs r3 = r3.zzb     // Catch: java.lang.NullPointerException -> L21 java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzfgk r3 = r3.zzb     // Catch: java.lang.NullPointerException -> L21 java.lang.Throwable -> L25
            int r0 = r3.zzc     // Catch: java.lang.NullPointerException -> L21 java.lang.Throwable -> L25
            r2.zza = r0     // Catch: java.lang.NullPointerException -> L21 java.lang.Throwable -> L25
            int r3 = r3.zzd     // Catch: java.lang.NullPointerException -> L21 java.lang.Throwable -> L25
            r2.zzb = r3     // Catch: java.lang.NullPointerException -> L21 java.lang.Throwable -> L25
            monitor-exit(r2)
            return
        L21:
            monitor-exit(r2)
            return
        L23:
            monitor-exit(r2)
            return
        L25:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
