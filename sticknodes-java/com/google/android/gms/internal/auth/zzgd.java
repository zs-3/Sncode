package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzgd {
    private static final com.google.android.gms.internal.auth.zzgc zza = null;
    private static final com.google.android.gms.internal.auth.zzgc zzb = null;

    static {
            java.lang.String r0 = "com.google.protobuf.NewInstanceSchemaFull"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L16
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L16
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L16
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L16
            com.google.android.gms.internal.auth.zzgc r0 = (com.google.android.gms.internal.auth.zzgc) r0     // Catch: java.lang.Exception -> L16
            goto L17
        L16:
            r0 = 0
        L17:
            com.google.android.gms.internal.auth.zzgd.zza = r0
            com.google.android.gms.internal.auth.zzgc r0 = new com.google.android.gms.internal.auth.zzgc
            r0.<init>()
            com.google.android.gms.internal.auth.zzgd.zzb = r0
            return
    }

    static com.google.android.gms.internal.auth.zzgc zza() {
            com.google.android.gms.internal.auth.zzgc r0 = com.google.android.gms.internal.auth.zzgd.zza
            return r0
    }

    static com.google.android.gms.internal.auth.zzgc zzb() {
            com.google.android.gms.internal.auth.zzgc r0 = com.google.android.gms.internal.auth.zzgd.zzb
            return r0
    }
}
