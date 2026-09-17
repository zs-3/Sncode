package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public class zzkx {
    private static final com.google.android.gms.internal.drive.zzjx zzng = null;
    private com.google.android.gms.internal.drive.zzjc zzth;
    private volatile com.google.android.gms.internal.drive.zzlq zzti;
    private volatile com.google.android.gms.internal.drive.zzjc zztj;

    static {
            com.google.android.gms.internal.drive.zzjx r0 = com.google.android.gms.internal.drive.zzjx.zzci()
            com.google.android.gms.internal.drive.zzkx.zzng = r0
            return
    }

    public zzkx() {
            r0 = this;
            r0.<init>()
            return
    }

    private final com.google.android.gms.internal.drive.zzlq zzh(com.google.android.gms.internal.drive.zzlq r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzlq r0 = r1.zzti
            if (r0 != 0) goto L1d
            monitor-enter(r1)
            com.google.android.gms.internal.drive.zzlq r0 = r1.zzti     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            goto L1d
        Lb:
            r1.zzti = r2     // Catch: com.google.android.gms.internal.drive.zzkq -> L12 java.lang.Throwable -> L1a
            com.google.android.gms.internal.drive.zzjc r0 = com.google.android.gms.internal.drive.zzjc.zznq     // Catch: com.google.android.gms.internal.drive.zzkq -> L12 java.lang.Throwable -> L1a
            r1.zztj = r0     // Catch: com.google.android.gms.internal.drive.zzkq -> L12 java.lang.Throwable -> L1a
            goto L18
        L12:
            r1.zzti = r2     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.internal.drive.zzjc r2 = com.google.android.gms.internal.drive.zzjc.zznq     // Catch: java.lang.Throwable -> L1a
            r1.zztj = r2     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L1a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
        L1d:
            com.google.android.gms.internal.drive.zzlq r2 = r1.zzti
            return r2
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof com.google.android.gms.internal.drive.zzkx
            if (r0 != 0) goto La
            r3 = 0
            return r3
        La:
            com.google.android.gms.internal.drive.zzkx r3 = (com.google.android.gms.internal.drive.zzkx) r3
            com.google.android.gms.internal.drive.zzlq r0 = r2.zzti
            com.google.android.gms.internal.drive.zzlq r1 = r3.zzti
            if (r0 != 0) goto L21
            if (r1 != 0) goto L21
            com.google.android.gms.internal.drive.zzjc r0 = r2.zzbl()
            com.google.android.gms.internal.drive.zzjc r3 = r3.zzbl()
            boolean r3 = r0.equals(r3)
            return r3
        L21:
            if (r0 == 0) goto L2a
            if (r1 == 0) goto L2a
            boolean r3 = r0.equals(r1)
            return r3
        L2a:
            if (r0 == 0) goto L39
            com.google.android.gms.internal.drive.zzlq r1 = r0.zzda()
            com.google.android.gms.internal.drive.zzlq r3 = r3.zzh(r1)
            boolean r3 = r0.equals(r3)
            return r3
        L39:
            com.google.android.gms.internal.drive.zzlq r3 = r1.zzda()
            com.google.android.gms.internal.drive.zzlq r3 = r2.zzh(r3)
            boolean r3 = r3.equals(r1)
            return r3
    }

    public int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final com.google.android.gms.internal.drive.zzjc zzbl() {
            r1 = this;
            com.google.android.gms.internal.drive.zzjc r0 = r1.zztj
            if (r0 == 0) goto L7
            com.google.android.gms.internal.drive.zzjc r0 = r1.zztj
            return r0
        L7:
            monitor-enter(r1)
            com.google.android.gms.internal.drive.zzjc r0 = r1.zztj     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L10
            com.google.android.gms.internal.drive.zzjc r0 = r1.zztj     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            return r0
        L10:
            com.google.android.gms.internal.drive.zzlq r0 = r1.zzti     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L19
            com.google.android.gms.internal.drive.zzjc r0 = com.google.android.gms.internal.drive.zzjc.zznq     // Catch: java.lang.Throwable -> L25
            r1.zztj = r0     // Catch: java.lang.Throwable -> L25
            goto L21
        L19:
            com.google.android.gms.internal.drive.zzlq r0 = r1.zzti     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.drive.zzjc r0 = r0.zzbl()     // Catch: java.lang.Throwable -> L25
            r1.zztj = r0     // Catch: java.lang.Throwable -> L25
        L21:
            com.google.android.gms.internal.drive.zzjc r0 = r1.zztj     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            return r0
        L25:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            throw r0
    }

    public final int zzcx() {
            r1 = this;
            com.google.android.gms.internal.drive.zzjc r0 = r1.zztj
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.drive.zzjc r0 = r1.zztj
            int r0 = r0.size()
            return r0
        Lb:
            com.google.android.gms.internal.drive.zzlq r0 = r1.zzti
            if (r0 == 0) goto L16
            com.google.android.gms.internal.drive.zzlq r0 = r1.zzti
            int r0 = r0.zzcx()
            return r0
        L16:
            r0 = 0
            return r0
    }

    public final com.google.android.gms.internal.drive.zzlq zzi(com.google.android.gms.internal.drive.zzlq r3) {
            r2 = this;
            com.google.android.gms.internal.drive.zzlq r0 = r2.zzti
            r1 = 0
            r2.zzth = r1
            r2.zztj = r1
            r2.zzti = r3
            return r0
    }
}
