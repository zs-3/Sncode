package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgyw implements com.google.android.gms.internal.ads.zzggt {
    private final com.google.android.gms.internal.ads.zzgnl zza;
    private final byte[] zzb;

    private zzgyw(byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzgnl r0 = new com.google.android.gms.internal.ads.zzgnl
            r0.<init>(r2)
            r1.zza = r0
            r1.zzb = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzggt zzb(com.google.android.gms.internal.ads.zzglv r3) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgyw r0 = new com.google.android.gms.internal.ads.zzgyw
            com.google.android.gms.internal.ads.zzgyy r1 = r3.zzd()
            com.google.android.gms.internal.ads.zzghw r2 = com.google.android.gms.internal.ads.zzghc.zza()
            byte[] r1 = r1.zzd(r2)
            com.google.android.gms.internal.ads.zzgyx r3 = r3.zzc()
            byte[] r3 = r3.zzc()
            r0.<init>(r1, r3)
            return r0
    }

    private final byte[] zzc(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            r1 = 40
            if (r0 < r1) goto L18
            r1 = 24
            byte[] r2 = java.util.Arrays.copyOf(r4, r1)
            int r0 = r0 + (-24)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4, r1, r0)
            com.google.android.gms.internal.ads.zzgnl r0 = r3.zza
            byte[] r4 = r0.zzb(r4, r2, r5)
            return r4
        L18:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "ciphertext too short"
            r4.<init>(r5)
            throw r4
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] r3, byte[] r4) throws java.security.GeneralSecurityException {
            r2 = this;
            byte[] r0 = r2.zzb
            int r1 = r0.length
            if (r1 != 0) goto La
            byte[] r3 = r2.zzc(r3, r4)
            return r3
        La:
            boolean r0 = com.google.android.gms.internal.ads.zzgrg.zzc(r0, r3)
            if (r0 == 0) goto L1d
            byte[] r0 = r2.zzb
            int r1 = r3.length
            int r0 = r0.length
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r0, r1)
            byte[] r3 = r2.zzc(r3, r4)
            return r3
        L1d:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Decryption failed (OutputPrefix mismatch)."
            r3.<init>(r4)
            throw r3
    }
}
