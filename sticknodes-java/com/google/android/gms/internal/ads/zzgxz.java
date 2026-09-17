package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgxz implements com.google.android.gms.internal.ads.zzgye {
    private final com.google.android.gms.internal.ads.zzgyn zza;

    /* synthetic */ zzgxz(com.google.android.gms.internal.ads.zzgyn r1, com.google.android.gms.internal.ads.zzgxy r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgye
    public final java.lang.Object zza(java.lang.String r4) throws java.security.GeneralSecurityException {
            r3 = this;
            java.lang.String r0 = "GmsCore_OpenSSL"
            java.lang.String r1 = "AndroidOpenSSL"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = com.google.android.gms.internal.ads.zzgyf.zzb(r0)
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            java.security.Provider r1 = (java.security.Provider) r1
            com.google.android.gms.internal.ads.zzgyn r2 = r3.zza     // Catch: java.lang.Exception -> L23
            java.lang.Object r4 = r2.zza(r4, r1)     // Catch: java.lang.Exception -> L23
            return r4
        L23:
            goto L10
        L25:
            com.google.android.gms.internal.ads.zzgyn r0 = r3.zza
            r1 = 0
            java.lang.Object r4 = r0.zza(r4, r1)
            return r4
    }
}
