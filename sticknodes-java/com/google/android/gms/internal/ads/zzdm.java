package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdm {
    private boolean zza;

    public zzdm() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzdm(com.google.android.gms.internal.ads.zzdj r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public final synchronized void zza() throws java.lang.InterruptedException {
            r1 = this;
            monitor-enter(r1)
        L1:
            boolean r0 = r1.zza     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto L9
            r1.wait()     // Catch: java.lang.Throwable -> Lb
            goto L1
        L9:
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void zzb() {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
        L2:
            boolean r1 = r2.zza     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto Lc
            r2.wait()     // Catch: java.lang.InterruptedException -> La java.lang.Throwable -> L19
            goto L2
        La:
            r0 = 1
            goto L2
        Lc:
            if (r0 == 0) goto L17
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L19
            r0.interrupt()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return
        L17:
            monitor-exit(r2)
            return
        L19:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized boolean zzc() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zza     // Catch: java.lang.Throwable -> L8
            r1 = 0
            r2.zza = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized boolean zzd() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zza     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized boolean zze() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zza     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L8
            r0 = 0
            monitor-exit(r1)
            return r0
        L8:
            r0 = 1
            r1.zza = r0     // Catch: java.lang.Throwable -> L10
            r1.notifyAll()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
