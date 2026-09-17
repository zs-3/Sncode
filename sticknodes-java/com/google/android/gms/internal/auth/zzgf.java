package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzgf {
    private static final com.google.android.gms.internal.auth.zzgf zza = null;
    private final com.google.android.gms.internal.auth.zzgj zzb;
    private final java.util.concurrent.ConcurrentMap zzc;

    static {
            com.google.android.gms.internal.auth.zzgf r0 = new com.google.android.gms.internal.auth.zzgf
            r0.<init>()
            com.google.android.gms.internal.auth.zzgf.zza = r0
            return
    }

    private zzgf() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zzc = r0
            com.google.android.gms.internal.auth.zzfp r0 = new com.google.android.gms.internal.auth.zzfp
            r0.<init>()
            r1.zzb = r0
            return
    }

    public static com.google.android.gms.internal.auth.zzgf zza() {
            com.google.android.gms.internal.auth.zzgf r0 = com.google.android.gms.internal.auth.zzgf.zza
            return r0
    }

    public final com.google.android.gms.internal.auth.zzgi zzb(java.lang.Class r3) {
            r2 = this;
            java.lang.String r0 = "messageType"
            com.google.android.gms.internal.auth.zzfa.zzc(r3, r0)
            java.util.concurrent.ConcurrentMap r1 = r2.zzc
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.internal.auth.zzgi r1 = (com.google.android.gms.internal.auth.zzgi) r1
            if (r1 != 0) goto L24
            com.google.android.gms.internal.auth.zzgj r1 = r2.zzb
            com.google.android.gms.internal.auth.zzgi r1 = r1.zza(r3)
            com.google.android.gms.internal.auth.zzfa.zzc(r3, r0)
            java.util.concurrent.ConcurrentMap r0 = r2.zzc
            java.lang.Object r3 = r0.putIfAbsent(r3, r1)
            com.google.android.gms.internal.auth.zzgi r3 = (com.google.android.gms.internal.auth.zzgi) r3
            if (r3 != 0) goto L23
            goto L24
        L23:
            return r3
        L24:
            return r1
    }
}
