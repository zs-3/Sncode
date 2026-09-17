package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzghy {
    public static com.google.android.gms.internal.ads.zzghs zza(byte[] r2) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzhao r0 = com.google.android.gms.internal.ads.zzhao.zza()     // Catch: java.io.IOException -> L21
            com.google.android.gms.internal.ads.zzgwf r2 = com.google.android.gms.internal.ads.zzgwf.zzf(r2, r0)     // Catch: java.io.IOException -> L21
            com.google.android.gms.internal.ads.zzgpq r0 = com.google.android.gms.internal.ads.zzgpq.zzc()
            com.google.android.gms.internal.ads.zzgqs r2 = com.google.android.gms.internal.ads.zzgqs.zza(r2)
            boolean r1 = r0.zzk(r2)
            if (r1 != 0) goto L1c
            com.google.android.gms.internal.ads.zzgoq r0 = new com.google.android.gms.internal.ads.zzgoq
            r0.<init>(r2)
            goto L20
        L1c:
            com.google.android.gms.internal.ads.zzghs r0 = r0.zzb(r2)
        L20:
            return r0
        L21:
            r2 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Failed to parse proto"
            r0.<init>(r1, r2)
            throw r0
    }

    public static byte[] zzb(com.google.android.gms.internal.ads.zzghs r2) throws java.security.GeneralSecurityException {
            java.lang.Class<com.google.android.gms.internal.ads.zzgqs> r0 = com.google.android.gms.internal.ads.zzgqs.class
            com.google.android.gms.internal.ads.zzgpq r1 = com.google.android.gms.internal.ads.zzgpq.zzc()
            com.google.android.gms.internal.ads.zzgqw r2 = r1.zze(r2, r0)
            com.google.android.gms.internal.ads.zzgqs r2 = (com.google.android.gms.internal.ads.zzgqs) r2
            com.google.android.gms.internal.ads.zzgwf r2 = r2.zzc()
            byte[] r2 = r2.zzaV()
            return r2
    }
}
