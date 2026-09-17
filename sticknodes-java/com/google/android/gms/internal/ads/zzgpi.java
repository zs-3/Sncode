package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgpi {
    private static final com.google.android.gms.internal.ads.zzgpi zza = null;
    private final java.util.Map zzb;

    static {
            com.google.android.gms.internal.ads.zzgpi r0 = new com.google.android.gms.internal.ads.zzgpi
            r0.<init>()
            com.google.android.gms.internal.ads.zzgpi.zza = r0
            return
    }

    public zzgpi() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzb = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzgpi zza() {
            com.google.android.gms.internal.ads.zzgpi r0 = com.google.android.gms.internal.ads.zzgpi.zza
            return r0
    }

    public final synchronized void zzb(com.google.android.gms.internal.ads.zzgph r2, java.lang.Class r3) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zzb     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.ads.zzgph r0 = (com.google.android.gms.internal.ads.zzgph) r0     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L1a
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L12
            goto L1a
        L12:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = "Different key creator for parameters class already inserted"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L21
            throw r2     // Catch: java.lang.Throwable -> L21
        L1a:
            java.util.Map r0 = r1.zzb     // Catch: java.lang.Throwable -> L21
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r1)
            return
        L21:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
