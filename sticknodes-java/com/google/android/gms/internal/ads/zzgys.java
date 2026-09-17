package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgys extends java.lang.ThreadLocal {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgyt zza;

    zzgys(com.google.android.gms.internal.ads.zzgyt r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
            r1 = this;
            javax.crypto.Mac r0 = r1.zza()
            return r0
    }

    protected final javax.crypto.Mac zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgyf r0 = com.google.android.gms.internal.ads.zzgyf.zzb     // Catch: java.security.GeneralSecurityException -> L18
            com.google.android.gms.internal.ads.zzgyt r1 = r2.zza     // Catch: java.security.GeneralSecurityException -> L18
            java.lang.String r1 = com.google.android.gms.internal.ads.zzgyt.zzb(r1)     // Catch: java.security.GeneralSecurityException -> L18
            java.lang.Object r0 = r0.zza(r1)     // Catch: java.security.GeneralSecurityException -> L18
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0     // Catch: java.security.GeneralSecurityException -> L18
            com.google.android.gms.internal.ads.zzgyt r1 = r2.zza     // Catch: java.security.GeneralSecurityException -> L18
            java.security.Key r1 = com.google.android.gms.internal.ads.zzgyt.zzc(r1)     // Catch: java.security.GeneralSecurityException -> L18
            r0.init(r1)     // Catch: java.security.GeneralSecurityException -> L18
            return r0
        L18:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }
}
