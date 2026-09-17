package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzghg {
    public static final com.google.android.gms.internal.ads.zzghs zza(com.google.android.gms.internal.ads.zzghs r0) throws java.security.GeneralSecurityException {
            if (r0 == 0) goto L3
            return r0
        L3:
            r0 = 0
            com.google.android.gms.internal.ads.zzgwf r0 = zzb(r0)
            byte[] r0 = r0.zzaV()
            com.google.android.gms.internal.ads.zzghs r0 = com.google.android.gms.internal.ads.zzghy.zza(r0)
            return r0
    }

    static final com.google.android.gms.internal.ads.zzgwf zzb(com.google.android.gms.internal.ads.zzghs r3) {
            com.google.android.gms.internal.ads.zzgpq r3 = com.google.android.gms.internal.ads.zzgpq.zzc()     // Catch: java.security.GeneralSecurityException -> L12
            r0 = 0
            java.lang.Class<com.google.android.gms.internal.ads.zzgqs> r1 = com.google.android.gms.internal.ads.zzgqs.class
            com.google.android.gms.internal.ads.zzgqw r3 = r3.zze(r0, r1)     // Catch: java.security.GeneralSecurityException -> L12
            com.google.android.gms.internal.ads.zzgqs r3 = (com.google.android.gms.internal.ads.zzgqs) r3     // Catch: java.security.GeneralSecurityException -> L12
            com.google.android.gms.internal.ads.zzgwf r3 = r3.zzc()     // Catch: java.security.GeneralSecurityException -> L12
            return r3
        L12:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzgrf r0 = new com.google.android.gms.internal.ads.zzgrf
            java.lang.String r1 = "Parsing parameters failed in getProto(). You probably want to call some Tink register function for "
            java.lang.String r2 = "null"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1, r3)
            throw r0
    }
}
