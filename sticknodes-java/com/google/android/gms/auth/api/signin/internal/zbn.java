package com.google.android.gms.auth.api.signin.internal;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes.dex */
public final class zbn {
    private static com.google.android.gms.auth.api.signin.internal.zbn zbd;
    final com.google.android.gms.auth.api.signin.internal.Storage zba;
    com.google.android.gms.auth.api.signin.GoogleSignInAccount zbb;
    com.google.android.gms.auth.api.signin.GoogleSignInOptions zbc;

    static {
            return
    }

    private zbn(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.auth.api.signin.internal.Storage r2 = com.google.android.gms.auth.api.signin.internal.Storage.getInstance(r2)
            r1.zba = r2
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r2.getSavedDefaultGoogleSignInAccount()
            r1.zbb = r0
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r2.getSavedDefaultGoogleSignInOptions()
            r1.zbc = r2
            return
    }

    public static synchronized com.google.android.gms.auth.api.signin.internal.zbn zbc(android.content.Context r1) {
            java.lang.Class<com.google.android.gms.auth.api.signin.internal.zbn> r0 = com.google.android.gms.auth.api.signin.internal.zbn.class
            monitor-enter(r0)
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> Ld
            com.google.android.gms.auth.api.signin.internal.zbn r1 = zbf(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    private static synchronized com.google.android.gms.auth.api.signin.internal.zbn zbf(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.auth.api.signin.internal.zbn> r0 = com.google.android.gms.auth.api.signin.internal.zbn.class
            monitor-enter(r0)
            com.google.android.gms.auth.api.signin.internal.zbn r1 = com.google.android.gms.auth.api.signin.internal.zbn.zbd     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return r1
        L9:
            com.google.android.gms.auth.api.signin.internal.zbn r1 = new com.google.android.gms.auth.api.signin.internal.zbn     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.auth.api.signin.internal.zbn.zbd = r1     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public final synchronized com.google.android.gms.auth.api.signin.GoogleSignInAccount zba() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r1.zbb     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.android.gms.auth.api.signin.GoogleSignInOptions zbb() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r1.zbc     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void zbd() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.auth.api.signin.internal.Storage r0 = r1.zba     // Catch: java.lang.Throwable -> Ld
            r0.clear()     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            r1.zbb = r0     // Catch: java.lang.Throwable -> Ld
            r1.zbc = r0     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void zbe(com.google.android.gms.auth.api.signin.GoogleSignInOptions r2, com.google.android.gms.auth.api.signin.GoogleSignInAccount r3) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.auth.api.signin.internal.Storage r0 = r1.zba     // Catch: java.lang.Throwable -> Lc
            r0.saveDefaultGoogleSignInAccount(r3, r2)     // Catch: java.lang.Throwable -> Lc
            r1.zbb = r3     // Catch: java.lang.Throwable -> Lc
            r1.zbc = r2     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
