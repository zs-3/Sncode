package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgkd {
    private java.lang.Integer zza;
    private com.google.android.gms.internal.ads.zzgke zzb;

    private zzgkd() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            com.google.android.gms.internal.ads.zzgke r0 = com.google.android.gms.internal.ads.zzgke.zzc
            r1.zzb = r0
            return
    }

    /* synthetic */ zzgkd(com.google.android.gms.internal.ads.zzgkc r1) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zza = r1
            com.google.android.gms.internal.ads.zzgke r1 = com.google.android.gms.internal.ads.zzgke.zzc
            r0.zzb = r1
            return
    }

    public final com.google.android.gms.internal.ads.zzgkd zza(int r4) throws java.security.GeneralSecurityException {
            r3 = this;
            r0 = 16
            if (r4 == r0) goto L1f
            r0 = 32
            if (r4 != r0) goto L9
            goto L1f
        L9:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "Invalid key size %d; only 16-byte and 32-byte AES keys are supported"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        L1f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.zza = r4
            return r3
    }

    public final com.google.android.gms.internal.ads.zzgkd zzb(com.google.android.gms.internal.ads.zzgke r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgkg zzc() throws java.security.GeneralSecurityException {
            r4 = this;
            java.lang.Integer r0 = r4.zza
            if (r0 == 0) goto L1d
            com.google.android.gms.internal.ads.zzgke r1 = r4.zzb
            if (r1 == 0) goto L15
            com.google.android.gms.internal.ads.zzgkg r1 = new com.google.android.gms.internal.ads.zzgkg
            int r0 = r0.intValue()
            com.google.android.gms.internal.ads.zzgke r2 = r4.zzb
            r3 = 0
            r1.<init>(r0, r2, r3)
            return r1
        L15:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Variant is not set"
            r0.<init>(r1)
            throw r0
        L1d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Key size is not set"
            r0.<init>(r1)
            throw r0
    }
}
