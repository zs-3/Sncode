package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgoe {
    private static final java.util.logging.Logger zza = null;
    private static final com.google.android.gms.internal.ads.zzgoe zzb = null;
    private final java.util.concurrent.ConcurrentMap zzc;
    private final java.util.concurrent.ConcurrentMap zzd;

    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzgoe> r0 = com.google.android.gms.internal.ads.zzgoe.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.android.gms.internal.ads.zzgoe.zza = r0
            com.google.android.gms.internal.ads.zzgoe r0 = new com.google.android.gms.internal.ads.zzgoe
            r0.<init>()
            com.google.android.gms.internal.ads.zzgoe.zzb = r0
            return
    }

    public zzgoe() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zzc = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zzd = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzgoe zzc() {
            com.google.android.gms.internal.ads.zzgoe r0 = com.google.android.gms.internal.ads.zzgoe.zzb
            return r0
    }

    private final synchronized com.google.android.gms.internal.ads.zzghe zzg(java.lang.String r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ConcurrentMap r0 = r2.zzc     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L13
            java.util.concurrent.ConcurrentMap r0 = r2.zzc     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zzghe r3 = (com.google.android.gms.internal.ads.zzghe) r3     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            return r3
        L13:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "No key manager found for key type "
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = r0.concat(r3)     // Catch: java.lang.Throwable -> L23
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    private final synchronized void zzh(com.google.android.gms.internal.ads.zzghe r6, boolean r7, boolean r8) throws java.security.GeneralSecurityException {
            r5 = this;
            monitor-enter(r5)
            r7 = r6
            com.google.android.gms.internal.ads.zzgon r7 = (com.google.android.gms.internal.ads.zzgon) r7     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = r7.zza     // Catch: java.lang.Throwable -> L89
            java.util.concurrent.ConcurrentMap r8 = r5.zzd     // Catch: java.lang.Throwable -> L89
            boolean r8 = r8.containsKey(r7)     // Catch: java.lang.Throwable -> L89
            if (r8 == 0) goto L29
            java.util.concurrent.ConcurrentMap r8 = r5.zzd     // Catch: java.lang.Throwable -> L89
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> L89
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L89
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L89
            if (r8 == 0) goto L1d
            goto L29
        L1d:
            java.lang.String r6 = "New keys are already disallowed for key type "
            java.lang.String r6 = r6.concat(r7)     // Catch: java.lang.Throwable -> L89
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L89
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L89
            throw r7     // Catch: java.lang.Throwable -> L89
        L29:
            java.util.concurrent.ConcurrentMap r8 = r5.zzc     // Catch: java.lang.Throwable -> L89
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.internal.ads.zzghe r8 = (com.google.android.gms.internal.ads.zzghe) r8     // Catch: java.lang.Throwable -> L89
            if (r8 == 0) goto L7b
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L89
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L89
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L42
            goto L7b
        L42:
            java.lang.String r0 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r0 = r0.concat(r7)     // Catch: java.lang.Throwable -> L89
            java.util.logging.Logger r1 = com.google.android.gms.internal.ads.zzgoe.zza     // Catch: java.lang.Throwable -> L89
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "com.google.crypto.tink.internal.KeyManagerRegistry"
            java.lang.String r4 = "insertKeyManager"
            r1.logp(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L89
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L89
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L89
            r2 = 0
            r1[r2] = r7     // Catch: java.lang.Throwable -> L89
            r7 = 1
            java.lang.Class r8 = r8.getClass()     // Catch: java.lang.Throwable -> L89
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L89
            r1[r7] = r8     // Catch: java.lang.Throwable -> L89
            r7 = 2
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L89
            r1[r7] = r6     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.String r6 = java.lang.String.format(r6, r1)     // Catch: java.lang.Throwable -> L89
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L89
            throw r0     // Catch: java.lang.Throwable -> L89
        L7b:
            java.util.concurrent.ConcurrentMap r8 = r5.zzc     // Catch: java.lang.Throwable -> L89
            r8.putIfAbsent(r7, r6)     // Catch: java.lang.Throwable -> L89
            java.util.concurrent.ConcurrentMap r6 = r5.zzd     // Catch: java.lang.Throwable -> L89
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L89
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r5)
            return
        L89:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public final com.google.android.gms.internal.ads.zzghe zza(java.lang.String r5, java.lang.Class r6) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.android.gms.internal.ads.zzghe r5 = r4.zzg(r5)
            java.lang.Class r0 = r5.zzb()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lf
            return r5
        Lf:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r6 = r6.getName()
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Class r5 = r5.zzb()
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Primitive type "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " not supported by key manager of type "
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = ", which only supports: "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzghe zzb(java.lang.String r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.android.gms.internal.ads.zzghe r1 = r0.zzg(r1)
            return r1
    }

    public final synchronized void zzd(com.google.android.gms.internal.ads.zzghe r1, boolean r2) throws java.security.GeneralSecurityException {
            r0 = this;
            monitor-enter(r0)
            r2 = 1
            r0.zzf(r1, r2, r2)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean zze(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap r0 = r1.zzd
            java.lang.Object r2 = r0.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    public final synchronized void zzf(com.google.android.gms.internal.ads.zzghe r1, int r2, boolean r3) throws java.security.GeneralSecurityException {
            r0 = this;
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.internal.ads.zzgnw.zza(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto Le
            r2 = 0
            r3 = 1
            r0.zzh(r1, r2, r3)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return
        Le:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "Cannot register key manager: FIPS compatibility insufficient"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L16:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
