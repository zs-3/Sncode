package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgqu {
    private static final java.lang.ThreadLocal zza = null;

    static {
            com.google.android.gms.internal.ads.zzgqt r0 = new com.google.android.gms.internal.ads.zzgqt
            r0.<init>()
            com.google.android.gms.internal.ads.zzgqu.zza = r0
            return
    }

    static /* synthetic */ java.security.SecureRandom zza() {
            java.security.SecureRandom r0 = zzc()
            r0.nextLong()
            return r0
    }

    public static byte[] zzb(int r1) {
            byte[] r1 = new byte[r1]
            java.lang.ThreadLocal r0 = com.google.android.gms.internal.ads.zzgqu.zza
            java.lang.Object r0 = r0.get()
            java.security.SecureRandom r0 = (java.security.SecureRandom) r0
            r0.nextBytes(r1)
            return r1
    }

    private static java.security.SecureRandom zzc() {
            java.security.Provider r0 = com.google.android.gms.internal.ads.zzgny.zza()
            java.lang.String r1 = "SHA1PRNG"
            if (r0 == 0) goto Ld
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r1, r0)     // Catch: java.security.GeneralSecurityException -> Ld
            return r0
        Ld:
            r0 = 0
            java.lang.String r2 = "org.conscrypt.Conscrypt"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "newProvider"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.Throwable -> L27
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r2.invoke(r0, r3)     // Catch: java.lang.Throwable -> L27
            java.security.Provider r2 = (java.security.Provider) r2     // Catch: java.lang.Throwable -> L27
            r0 = r2
            goto L28
        L27:
        L28:
            if (r0 == 0) goto L2f
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r1, r0)     // Catch: java.security.GeneralSecurityException -> L2f
            return r0
        L2f:
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            return r0
    }
}
