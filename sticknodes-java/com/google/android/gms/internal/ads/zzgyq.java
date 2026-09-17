package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgyq extends java.lang.ThreadLocal {
    zzgyq() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static final javax.crypto.Cipher zza() {
            com.google.android.gms.internal.ads.zzgyf r0 = com.google.android.gms.internal.ads.zzgyf.zza     // Catch: java.security.GeneralSecurityException -> Lb
            java.lang.String r1 = "AES/ECB/NoPadding"
            java.lang.Object r0 = r0.zza(r1)     // Catch: java.security.GeneralSecurityException -> Lb
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0     // Catch: java.security.GeneralSecurityException -> Lb
            return r0
        Lb:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
            r1 = this;
            javax.crypto.Cipher r0 = zza()
            return r0
    }
}
