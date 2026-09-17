package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgrq {
    private java.lang.Integer zza;
    private java.lang.Integer zzb;
    private com.google.android.gms.internal.ads.zzgrr zzc;

    private zzgrq() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            r1.zzb = r0
            com.google.android.gms.internal.ads.zzgrr r0 = com.google.android.gms.internal.ads.zzgrr.zzd
            r1.zzc = r0
            return
    }

    /* synthetic */ zzgrq(com.google.android.gms.internal.ads.zzgrp r1) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zza = r1
            r0.zzb = r1
            com.google.android.gms.internal.ads.zzgrr r1 = com.google.android.gms.internal.ads.zzgrr.zzd
            r0.zzc = r1
            return
    }

    public final com.google.android.gms.internal.ads.zzgrq zza(int r4) throws java.security.GeneralSecurityException {
            r3 = this;
            r0 = 16
            if (r4 == r0) goto L21
            r0 = 32
            if (r4 != r0) goto L9
            goto L21
        L9:
            int r4 = r4 * 8
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "Invalid key size %d; only 128-bit and 256-bit AES keys are supported"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        L21:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.zza = r4
            return r3
    }

    public final com.google.android.gms.internal.ads.zzgrq zzb(int r4) throws java.security.GeneralSecurityException {
            r3 = this;
            r0 = 10
            if (r4 < r0) goto Lf
            r0 = 16
            if (r4 > r0) goto Lf
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.zzb = r4
            return r3
        Lf:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid tag size for AesCmacParameters: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzgrq zzc(com.google.android.gms.internal.ads.zzgrr r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgrt zzd() throws java.security.GeneralSecurityException {
            r5 = this;
            java.lang.Integer r0 = r5.zza
            if (r0 == 0) goto L2f
            java.lang.Integer r1 = r5.zzb
            if (r1 == 0) goto L27
            com.google.android.gms.internal.ads.zzgrr r1 = r5.zzc
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.zzgrt r1 = new com.google.android.gms.internal.ads.zzgrt
            int r0 = r0.intValue()
            java.lang.Integer r2 = r5.zzb
            int r2 = r2.intValue()
            com.google.android.gms.internal.ads.zzgrr r3 = r5.zzc
            r4 = 0
            r1.<init>(r0, r2, r3, r4)
            return r1
        L1f:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "variant not set"
            r0.<init>(r1)
            throw r0
        L27:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "tag size not set"
            r0.<init>(r1)
            throw r0
        L2f:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "key size not set"
            r0.<init>(r1)
            throw r0
    }
}
