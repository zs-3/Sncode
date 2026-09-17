package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzazw {
    private static java.security.MessageDigest zzb;
    protected final java.lang.Object zza;

    static {
            return
    }

    public zzazw() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            return
    }

    protected final java.security.MessageDigest zza() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            java.security.MessageDigest r1 = com.google.android.gms.internal.ads.zzazw.zzb     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r1
        L9:
            r1 = 0
        La:
            r2 = 2
            if (r1 >= r2) goto L18
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.security.NoSuchAlgorithmException -> L15 java.lang.Throwable -> L1c
            com.google.android.gms.internal.ads.zzazw.zzb = r2     // Catch: java.security.NoSuchAlgorithmException -> L15 java.lang.Throwable -> L1c
        L15:
            int r1 = r1 + 1
            goto La
        L18:
            java.security.MessageDigest r1 = com.google.android.gms.internal.ads.zzazw.zzb     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r1
        L1c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    abstract byte[] zzb(java.lang.String r1);
}
