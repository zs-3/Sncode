package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzcr {
    private static final androidx.collection.ArrayMap zza = null;

    static {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            com.google.android.gms.internal.auth.zzcr.zza = r0
            return
    }

    public static synchronized android.net.Uri zza(java.lang.String r4) {
            java.lang.Class<com.google.android.gms.internal.auth.zzcr> r4 = com.google.android.gms.internal.auth.zzcr.class
            monitor-enter(r4)
            androidx.collection.ArrayMap r0 = com.google.android.gms.internal.auth.zzcr.zza     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "com.google.android.gms.auth_account"
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L28
            android.net.Uri r2 = (android.net.Uri) r2     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L26
            java.lang.String r2 = android.net.Uri.encode(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "content://com.google.android.gms.phenotype/"
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L28
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L28
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)
            return r2
        L26:
            monitor-exit(r4)
            return r2
        L28:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }
}
