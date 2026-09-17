package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzgif implements com.google.android.gms.internal.ads.zzggt {
    private final com.google.android.gms.internal.ads.zzgqp zza;

    /* synthetic */ zzgif(com.google.android.gms.internal.ads.zzgqp r3, com.google.android.gms.internal.ads.zzgie r4) {
            r2 = this;
            r2.<init>()
            r2.zza = r3
            boolean r4 = r3.zzg()
            if (r4 == 0) goto L23
            com.google.android.gms.internal.ads.zzgpl r4 = com.google.android.gms.internal.ads.zzgpl.zzb()
            com.google.android.gms.internal.ads.zzgov r4 = r4.zza()
            com.google.android.gms.internal.ads.zzgpa r3 = com.google.android.gms.internal.ads.zzgpd.zza(r3)
            java.lang.String r0 = "aead"
            java.lang.String r1 = "encrypt"
            r4.zza(r3, r0, r1)
            java.lang.String r1 = "decrypt"
            r4.zza(r3, r0, r1)
        L23:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            r1 = 5
            if (r0 <= r1) goto L2e
            byte[] r0 = java.util.Arrays.copyOf(r4, r1)
            com.google.android.gms.internal.ads.zzgqp r1 = r3.zza
            java.util.List r0 = r1.zzf(r0)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzgqn r1 = (com.google.android.gms.internal.ads.zzgqn) r1
            java.lang.Object r2 = r1.zzd()     // Catch: java.security.GeneralSecurityException -> L2c
            com.google.android.gms.internal.ads.zzggt r2 = (com.google.android.gms.internal.ads.zzggt) r2     // Catch: java.security.GeneralSecurityException -> L2c
            byte[] r2 = r2.zza(r4, r5)     // Catch: java.security.GeneralSecurityException -> L2c
            r1.zza()     // Catch: java.security.GeneralSecurityException -> L2c
            return r2
        L2c:
            goto L12
        L2e:
            com.google.android.gms.internal.ads.zzgqp r0 = r3.zza
            byte[] r1 = com.google.android.gms.internal.ads.zzggy.zza
            java.util.List r0 = r0.zzf(r1)
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzgqn r1 = (com.google.android.gms.internal.ads.zzgqn) r1
            java.lang.Object r2 = r1.zzd()     // Catch: java.security.GeneralSecurityException -> L54
            com.google.android.gms.internal.ads.zzggt r2 = (com.google.android.gms.internal.ads.zzggt) r2     // Catch: java.security.GeneralSecurityException -> L54
            byte[] r2 = r2.zza(r4, r5)     // Catch: java.security.GeneralSecurityException -> L54
            r1.zza()     // Catch: java.security.GeneralSecurityException -> L54
            return r2
        L54:
            goto L3a
        L56:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "decryption failed"
            r4.<init>(r5)
            throw r4
    }
}
