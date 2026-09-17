package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgpm {
    private static final com.google.android.gms.internal.ads.zzgpm zza = null;
    private final java.util.Map zzb;

    static {
            com.google.android.gms.internal.ads.zzgpm r0 = new com.google.android.gms.internal.ads.zzgpm
            r0.<init>()
            com.google.android.gms.internal.ads.zzgpm.zza = r0
            return
    }

    zzgpm() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzb = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzgpm zzb() {
            com.google.android.gms.internal.ads.zzgpm r0 = com.google.android.gms.internal.ads.zzgpm.zza
            return r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzghs zza(java.lang.String r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r2 = r1.zzb     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "AES128_GCM"
            boolean r2 = r2.containsKey(r0)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L15
            java.util.Map r2 = r1.zzb     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.internal.ads.zzghs r2 = (com.google.android.gms.internal.ads.zzghs) r2     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)
            return r2
        L15:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "Name AES128_GCM does not exist"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1d
            throw r2     // Catch: java.lang.Throwable -> L1d
        L1d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzc(java.lang.String r5, com.google.android.gms.internal.ads.zzghs r6) throws java.security.GeneralSecurityException {
            r4 = this;
            monitor-enter(r4)
            java.util.Map r0 = r4.zzb     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L4e
            java.util.Map r0 = r4.zzb     // Catch: java.lang.Throwable -> L55
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.ads.zzghs r0 = (com.google.android.gms.internal.ads.zzghs) r0     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.equals(r6)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L19
            monitor-exit(r4)
            return
        L19:
            java.util.Map r0 = r4.zzb     // Catch: java.lang.Throwable -> L55
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L55
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "Parameters object with name "
            r2.append(r3)     // Catch: java.lang.Throwable -> L55
            r2.append(r5)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = " already exists ("
            r2.append(r5)     // Catch: java.lang.Throwable -> L55
            r2.append(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = "), cannot insert "
            r2.append(r5)     // Catch: java.lang.Throwable -> L55
            r2.append(r6)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L55
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L55
            throw r1     // Catch: java.lang.Throwable -> L55
        L4e:
            java.util.Map r0 = r4.zzb     // Catch: java.lang.Throwable -> L55
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L55
            monitor-exit(r4)
            return
        L55:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public final synchronized void zzd(java.util.Map r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L27
        L9:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L27
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L27
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.zzghs r0 = (com.google.android.gms.internal.ads.zzghs) r0     // Catch: java.lang.Throwable -> L27
            r2.zzc(r1, r0)     // Catch: java.lang.Throwable -> L27
            goto L9
        L25:
            monitor-exit(r2)
            return
        L27:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
