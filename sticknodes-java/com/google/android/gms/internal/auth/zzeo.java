package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzeo {
    private static final com.google.android.gms.internal.auth.zzem zza = null;
    private static final com.google.android.gms.internal.auth.zzem zzb = null;

    static {
            com.google.android.gms.internal.auth.zzen r0 = new com.google.android.gms.internal.auth.zzen
            r0.<init>()
            com.google.android.gms.internal.auth.zzeo.zza = r0
            java.lang.String r0 = "com.google.protobuf.ExtensionSchemaFull"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1d
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L1d
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L1d
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1d
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L1d
            com.google.android.gms.internal.auth.zzem r0 = (com.google.android.gms.internal.auth.zzem) r0     // Catch: java.lang.Exception -> L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            com.google.android.gms.internal.auth.zzeo.zzb = r0
            return
    }

    static com.google.android.gms.internal.auth.zzem zza() {
            com.google.android.gms.internal.auth.zzem r0 = com.google.android.gms.internal.auth.zzeo.zzb
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Protobuf runtime is not correctly loaded."
            r0.<init>(r1)
            throw r0
    }

    static com.google.android.gms.internal.auth.zzem zzb() {
            com.google.android.gms.internal.auth.zzem r0 = com.google.android.gms.internal.auth.zzeo.zza
            return r0
    }
}
