package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzes implements com.google.android.gms.internal.auth.zzfv {
    private static final com.google.android.gms.internal.auth.zzes zza = null;

    static {
            com.google.android.gms.internal.auth.zzes r0 = new com.google.android.gms.internal.auth.zzes
            r0.<init>()
            com.google.android.gms.internal.auth.zzes.zza = r0
            return
    }

    private zzes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.auth.zzes zza() {
            com.google.android.gms.internal.auth.zzes r0 = com.google.android.gms.internal.auth.zzes.zza
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final com.google.android.gms.internal.auth.zzfu zzb(java.lang.Class r4) {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.auth.zzev> r0 = com.google.android.gms.internal.auth.zzev.class
            boolean r1 = r0.isAssignableFrom(r4)
            if (r1 == 0) goto L2a
            java.lang.Class r0 = r4.asSubclass(r0)     // Catch: java.lang.Exception -> L19
            com.google.android.gms.internal.auth.zzev r0 = com.google.android.gms.internal.auth.zzev.zzb(r0)     // Catch: java.lang.Exception -> L19
            r1 = 3
            r2 = 0
            java.lang.Object r0 = r0.zzn(r1, r2, r2)     // Catch: java.lang.Exception -> L19
            com.google.android.gms.internal.auth.zzfu r0 = (com.google.android.gms.internal.auth.zzfu) r0     // Catch: java.lang.Exception -> L19
            return r0
        L19:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r4 = r4.getName()
            java.lang.String r2 = "Unable to get message info for "
            java.lang.String r4 = r2.concat(r4)
            r1.<init>(r4, r0)
            throw r1
        L2a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "Unsupported message type: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final boolean zzc(java.lang.Class r2) {
            r1 = this;
            java.lang.Class<com.google.android.gms.internal.auth.zzev> r0 = com.google.android.gms.internal.auth.zzev.class
            boolean r2 = r0.isAssignableFrom(r2)
            return r2
    }
}
