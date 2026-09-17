package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgyd implements com.google.android.gms.internal.ads.zzgye {
    private final com.google.android.gms.internal.ads.zzgyn zza;

    /* synthetic */ zzgyd(com.google.android.gms.internal.ads.zzgyn r1, com.google.android.gms.internal.ads.zzgyc r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgye
    public final java.lang.Object zza(java.lang.String r5) throws java.security.GeneralSecurityException {
            r4 = this;
            java.lang.String r0 = "GmsCore_OpenSSL"
            java.lang.String r1 = "AndroidOpenSSL"
            java.lang.String r2 = "Conscrypt"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            java.util.List r0 = com.google.android.gms.internal.ads.zzgyf.zzb(r0)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r0.next()
            java.security.Provider r2 = (java.security.Provider) r2
            com.google.android.gms.internal.ads.zzgyn r3 = r4.zza     // Catch: java.lang.Exception -> L26
            java.lang.Object r5 = r3.zza(r5, r2)     // Catch: java.lang.Exception -> L26
            return r5
        L26:
            r2 = move-exception
            if (r1 != 0) goto L13
            r1 = r2
            goto L13
        L2b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r0 = "No good Provider found."
            r5.<init>(r0, r1)
            throw r5
    }
}
