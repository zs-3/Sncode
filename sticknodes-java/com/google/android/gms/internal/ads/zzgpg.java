package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgpg {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzgpf zzb = null;
    private static final com.google.android.gms.internal.ads.zzgpg zzc = null;
    private final java.util.Map zzd;

    static {
            com.google.android.gms.internal.ads.zzgpe r0 = new com.google.android.gms.internal.ads.zzgpe
            r0.<init>()
            com.google.android.gms.internal.ads.zzgpg.zzb = r0
            com.google.android.gms.internal.ads.zzgpg r0 = zze()
            com.google.android.gms.internal.ads.zzgpg.zzc = r0
            return
    }

    public zzgpg() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzd = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzgpg zzb() {
            com.google.android.gms.internal.ads.zzgpg r0 = com.google.android.gms.internal.ads.zzgpg.zzc
            return r0
    }

    private final synchronized com.google.android.gms.internal.ads.zzghd zzd(com.google.android.gms.internal.ads.zzghs r3, java.lang.Integer r4) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.zzd     // Catch: java.lang.Throwable -> L35
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzgpf r0 = (com.google.android.gms.internal.ads.zzgpf) r0     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L15
            com.google.android.gms.internal.ads.zzghd r3 = r0.zza(r3, r4)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r2)
            return r3
        L15:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r1 = "Cannot create a new key for parameters "
            r0.append(r1)     // Catch: java.lang.Throwable -> L35
            r0.append(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = ": no key creator for this class was registered."
            r0.append(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L35
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L35
            throw r4     // Catch: java.lang.Throwable -> L35
        L35:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    private static com.google.android.gms.internal.ads.zzgpg zze() {
            com.google.android.gms.internal.ads.zzgpg r0 = new com.google.android.gms.internal.ads.zzgpg
            r0.<init>()
            com.google.android.gms.internal.ads.zzgpf r1 = com.google.android.gms.internal.ads.zzgpg.zzb     // Catch: java.security.GeneralSecurityException -> Ld
            java.lang.Class<com.google.android.gms.internal.ads.zzgoq> r2 = com.google.android.gms.internal.ads.zzgoq.class
            r0.zzc(r1, r2)     // Catch: java.security.GeneralSecurityException -> Ld
            return r0
        Ld:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected error."
            r1.<init>(r2, r0)
            throw r1
    }

    public final com.google.android.gms.internal.ads.zzghd zza(com.google.android.gms.internal.ads.zzghs r1, java.lang.Integer r2) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.android.gms.internal.ads.zzghd r1 = r0.zzd(r1, r2)
            return r1
    }

    public final synchronized void zzc(com.google.android.gms.internal.ads.zzgpf r3, java.lang.Class r4) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            java.util.Map r0 = r2.zzd     // Catch: java.lang.Throwable -> L39
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzgpf r0 = (com.google.android.gms.internal.ads.zzgpf) r0     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L32
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L12
            goto L32
        L12:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r0.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "Different key creator for parameters class "
            r0.append(r1)     // Catch: java.lang.Throwable -> L39
            r0.append(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = " already inserted"
            r0.append(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L39
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L39
            throw r3     // Catch: java.lang.Throwable -> L39
        L32:
            java.util.Map r0 = r2.zzd     // Catch: java.lang.Throwable -> L39
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r2)
            return
        L39:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
