package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgmy extends java.lang.ThreadLocal {
    zzgmy() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static final javax.crypto.Cipher zza() {
            r0 = 0
            com.google.android.gms.internal.ads.zzgyf r1 = com.google.android.gms.internal.ads.zzgyf.zza     // Catch: java.security.GeneralSecurityException -> L13
            java.lang.String r2 = "ChaCha20-Poly1305"
            java.lang.Object r1 = r1.zza(r2)     // Catch: java.security.GeneralSecurityException -> L13
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1     // Catch: java.security.GeneralSecurityException -> L13
            boolean r2 = com.google.android.gms.internal.ads.zzgmz.zzd(r1)     // Catch: java.security.GeneralSecurityException -> L13
            if (r2 != 0) goto L12
            return r0
        L12:
            return r1
        L13:
            return r0
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
            r1 = this;
            javax.crypto.Cipher r0 = zza()
            return r0
    }
}
