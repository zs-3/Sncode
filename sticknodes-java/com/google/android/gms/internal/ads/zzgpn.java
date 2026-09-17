package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgpn {
    private static final com.google.android.gms.internal.ads.zzgpn zza = null;
    private final java.util.concurrent.atomic.AtomicReference zzb;

    static {
            com.google.android.gms.internal.ads.zzgpn r0 = new com.google.android.gms.internal.ads.zzgpn
            r0.<init>()
            com.google.android.gms.internal.ads.zzgpn.zza = r0
            return
    }

    zzgpn() {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            com.google.android.gms.internal.ads.zzgqf r1 = new com.google.android.gms.internal.ads.zzgqf
            r2 = 0
            r1.<init>(r2)
            com.google.android.gms.internal.ads.zzgqj r3 = new com.google.android.gms.internal.ads.zzgqj
            r3.<init>(r1, r2)
            r0.<init>(r3)
            r4.zzb = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzgpn zza() {
            com.google.android.gms.internal.ads.zzgpn r0 = com.google.android.gms.internal.ads.zzgpn.zza
            return r0
    }

    public final java.lang.Class zzb(java.lang.Class r2) throws java.security.GeneralSecurityException {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzb
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzgqj r0 = (com.google.android.gms.internal.ads.zzgqj) r0
            java.lang.Class r2 = r0.zza(r2)
            return r2
    }

    public final java.lang.Object zzc(com.google.android.gms.internal.ads.zzghd r2, java.lang.Class r3) throws java.security.GeneralSecurityException {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzb
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzgqj r0 = (com.google.android.gms.internal.ads.zzgqj) r0
            java.lang.Object r2 = r0.zzb(r2, r3)
            return r2
    }

    public final java.lang.Object zzd(com.google.android.gms.internal.ads.zzgqp r2, java.lang.Class r3) throws java.security.GeneralSecurityException {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzb
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzgqj r0 = (com.google.android.gms.internal.ads.zzgqj) r0
            java.lang.Object r2 = r0.zzc(r2, r3)
            return r2
    }

    public final synchronized void zze(com.google.android.gms.internal.ads.zzgqd r4) throws java.security.GeneralSecurityException {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzb     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgqj r0 = (com.google.android.gms.internal.ads.zzgqj) r0     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgqf r1 = new com.google.android.gms.internal.ads.zzgqf     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L1e
            r1.zza(r4)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgqj r4 = new com.google.android.gms.internal.ads.zzgqj     // Catch: java.lang.Throwable -> L1e
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzb     // Catch: java.lang.Throwable -> L1e
            r0.set(r4)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r3)
            return
        L1e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    public final synchronized void zzf(com.google.android.gms.internal.ads.zzgqq r4) throws java.security.GeneralSecurityException {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzb     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgqj r0 = (com.google.android.gms.internal.ads.zzgqj) r0     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgqf r1 = new com.google.android.gms.internal.ads.zzgqf     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L1e
            r1.zzb(r4)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgqj r4 = new com.google.android.gms.internal.ads.zzgqj     // Catch: java.lang.Throwable -> L1e
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzb     // Catch: java.lang.Throwable -> L1e
            r0.set(r4)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r3)
            return
        L1e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}
