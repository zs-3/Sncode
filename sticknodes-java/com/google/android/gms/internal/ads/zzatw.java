package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzatw {
    private static final java.lang.String zza = "zzatw";

    static {
            return
    }

    public zzatw() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static java.util.HashMap zza(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L27
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L20
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L20
            r1 = 0
            byte[] r2 = android.util.Base64.decode(r2, r1)     // Catch: java.lang.Throwable -> L20
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L20
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L20
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = r2.readObject()     // Catch: java.lang.Throwable -> L20
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L20
            return r2
        L20:
            java.lang.String r2 = com.google.android.gms.internal.ads.zzatw.zza
            java.lang.String r0 = "decode object failure"
            android.util.Log.d(r2, r0)
        L27:
            r2 = 0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L1e
            r0.<init>()     // Catch: java.io.IOException -> L1e
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch: java.io.IOException -> L1e
            r1.<init>(r0)     // Catch: java.io.IOException -> L1e
            java.util.HashMap r2 = r3.zzb()     // Catch: java.io.IOException -> L1e
            r1.writeObject(r2)     // Catch: java.io.IOException -> L1e
            r1.close()     // Catch: java.io.IOException -> L1e
            byte[] r0 = r0.toByteArray()     // Catch: java.io.IOException -> L1e
            r1 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch: java.io.IOException -> L1e
            return r0
        L1e:
            r0 = 0
            return r0
    }

    protected abstract java.util.HashMap zzb();
}
