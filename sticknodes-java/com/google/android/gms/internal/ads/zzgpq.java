package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgpq {
    private static final com.google.android.gms.internal.ads.zzgpq zza = null;
    private final java.util.concurrent.atomic.AtomicReference zzb;

    static {
            com.google.android.gms.internal.ads.zzgpo r0 = new com.google.android.gms.internal.ads.zzgpo
            r0.<init>()
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgrf.zza(r0)
            com.google.android.gms.internal.ads.zzgpq r0 = (com.google.android.gms.internal.ads.zzgpq) r0
            com.google.android.gms.internal.ads.zzgpq.zza = r0
            return
    }

    public zzgpq() {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            com.google.android.gms.internal.ads.zzgqx r1 = new com.google.android.gms.internal.ads.zzgqx
            r1.<init>()
            com.google.android.gms.internal.ads.zzgrd r2 = new com.google.android.gms.internal.ads.zzgrd
            r3 = 0
            r2.<init>(r1, r3)
            r0.<init>(r2)
            r4.zzb = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzgpq zzc() {
            com.google.android.gms.internal.ads.zzgpq r0 = com.google.android.gms.internal.ads.zzgpq.zza
            return r0
    }

    public final com.google.android.gms.internal.ads.zzghd zza(com.google.android.gms.internal.ads.zzgqw r2, com.google.android.gms.internal.ads.zzghw r3) throws java.security.GeneralSecurityException {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzb
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzgrd r0 = (com.google.android.gms.internal.ads.zzgrd) r0
            com.google.android.gms.internal.ads.zzghd r2 = r0.zza(r2, r3)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzghs zzb(com.google.android.gms.internal.ads.zzgqw r2) throws java.security.GeneralSecurityException {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzb
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzgrd r0 = (com.google.android.gms.internal.ads.zzgrd) r0
            com.google.android.gms.internal.ads.zzghs r2 = r0.zzb(r2)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzgqw zzd(com.google.android.gms.internal.ads.zzghd r2, java.lang.Class r3, com.google.android.gms.internal.ads.zzghw r4) throws java.security.GeneralSecurityException {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzb
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzgrd r0 = (com.google.android.gms.internal.ads.zzgrd) r0
            com.google.android.gms.internal.ads.zzgqw r2 = r0.zzc(r2, r3, r4)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzgqw zze(com.google.android.gms.internal.ads.zzghs r2, java.lang.Class r3) throws java.security.GeneralSecurityException {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzb
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzgrd r0 = (com.google.android.gms.internal.ads.zzgrd) r0
            com.google.android.gms.internal.ads.zzgqw r2 = r0.zzd(r2, r3)
            return r2
    }

    public final synchronized void zzf(com.google.android.gms.internal.ads.zzgoi r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzgqx r0 = new com.google.android.gms.internal.ads.zzgqx     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzb     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgrd r1 = (com.google.android.gms.internal.ads.zzgrd) r1     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            r0.zza(r3)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgrd r3 = new com.google.android.gms.internal.ads.zzgrd     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzb     // Catch: java.lang.Throwable -> L1e
            r0.set(r3)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)
            return
        L1e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void zzg(com.google.android.gms.internal.ads.zzgom r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzgqx r0 = new com.google.android.gms.internal.ads.zzgqx     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzb     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgrd r1 = (com.google.android.gms.internal.ads.zzgrd) r1     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            r0.zzb(r3)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgrd r3 = new com.google.android.gms.internal.ads.zzgrd     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzb     // Catch: java.lang.Throwable -> L1e
            r0.set(r3)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)
            return
        L1e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void zzh(com.google.android.gms.internal.ads.zzgpv r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzgqx r0 = new com.google.android.gms.internal.ads.zzgqx     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzb     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgrd r1 = (com.google.android.gms.internal.ads.zzgrd) r1     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            r0.zzc(r3)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgrd r3 = new com.google.android.gms.internal.ads.zzgrd     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzb     // Catch: java.lang.Throwable -> L1e
            r0.set(r3)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)
            return
        L1e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void zzi(com.google.android.gms.internal.ads.zzgpz r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzgqx r0 = new com.google.android.gms.internal.ads.zzgqx     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.atomic.AtomicReference r1 = r2.zzb     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgrd r1 = (com.google.android.gms.internal.ads.zzgrd) r1     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            r0.zzd(r3)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.zzgrd r3 = new com.google.android.gms.internal.ads.zzgrd     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzb     // Catch: java.lang.Throwable -> L1e
            r0.set(r3)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r2)
            return
        L1e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final boolean zzj(com.google.android.gms.internal.ads.zzgqw r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzb
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzgrd r0 = (com.google.android.gms.internal.ads.zzgrd) r0
            boolean r2 = r0.zzi(r2)
            return r2
    }

    public final boolean zzk(com.google.android.gms.internal.ads.zzgqw r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzb
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzgrd r0 = (com.google.android.gms.internal.ads.zzgrd) r0
            boolean r2 = r0.zzj(r2)
            return r2
    }
}
