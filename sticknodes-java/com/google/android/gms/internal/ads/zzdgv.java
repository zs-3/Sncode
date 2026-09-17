package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdgv extends com.google.android.gms.internal.ads.zzddr {
    private boolean zzb;

    protected zzdgv(java.util.Set r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public final void zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdgs r0 = new com.google.android.gms.internal.ads.zzdgs
            r0.<init>()
            r1.zzq(r0)
            return
    }

    public final void zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdgr r0 = new com.google.android.gms.internal.ads.zzdgr
            r0.<init>()
            r1.zzq(r0)
            return
    }

    public final synchronized void zzc() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzb     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L10
            com.google.android.gms.internal.ads.zzdgt r0 = new com.google.android.gms.internal.ads.zzdgt     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            r1.zzq(r0)     // Catch: java.lang.Throwable -> L1a
            r0 = 1
            r1.zzb = r0     // Catch: java.lang.Throwable -> L1a
        L10:
            com.google.android.gms.internal.ads.zzdgu r0 = new com.google.android.gms.internal.ads.zzdgu     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            r1.zzq(r0)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)
            return
        L1a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void zzd() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdgt r0 = new com.google.android.gms.internal.ads.zzdgt     // Catch: java.lang.Throwable -> Le
            r0.<init>()     // Catch: java.lang.Throwable -> Le
            r1.zzq(r0)     // Catch: java.lang.Throwable -> Le
            r0 = 1
            r1.zzb = r0     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
