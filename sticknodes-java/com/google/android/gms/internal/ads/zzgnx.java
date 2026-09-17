package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgnx {
    private static final java.util.logging.Logger zza = null;
    private static final java.util.concurrent.atomic.AtomicBoolean zzb = null;

    static {
            java.lang.Class<com.google.android.gms.internal.ads.zzgnx> r0 = com.google.android.gms.internal.ads.zzgnx.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.android.gms.internal.ads.zzgnx.zza = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgnx.zzb = r0
            return
    }

    private zzgnx() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.Boolean zza() {
            java.lang.String r0 = "org.conscrypt.Conscrypt"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = "isBoringSslFIPSBuild"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L19
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L19
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L19
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L19
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L19
            return r0
        L19:
            java.util.logging.Logger r0 = com.google.android.gms.internal.ads.zzgnx.zza
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            java.lang.String r2 = "com.google.crypto.tink.config.internal.TinkFipsUtil"
            java.lang.String r3 = "checkConscryptIsAvailableAndUsesFipsBoringSsl"
            java.lang.String r4 = "Conscrypt is not available or does not support checking for FIPS build."
            r0.logp(r1, r2, r3, r4)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
    }

    public static boolean zzb() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.internal.ads.zzgnx.zzb
            boolean r0 = r0.get()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
