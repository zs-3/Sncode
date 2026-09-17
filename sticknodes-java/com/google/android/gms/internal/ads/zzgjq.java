package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgjq {
    private java.lang.Integer zza;
    private java.lang.Integer zzb;
    private java.lang.Integer zzc;
    private com.google.android.gms.internal.ads.zzgjr zzd;

    private zzgjq() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            r1.zzb = r0
            r1.zzc = r0
            com.google.android.gms.internal.ads.zzgjr r0 = com.google.android.gms.internal.ads.zzgjr.zzc
            r1.zzd = r0
            return
    }

    /* synthetic */ zzgjq(com.google.android.gms.internal.ads.zzgjp r1) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zza = r1
            r0.zzb = r1
            r0.zzc = r1
            com.google.android.gms.internal.ads.zzgjr r1 = com.google.android.gms.internal.ads.zzgjr.zzc
            r0.zzd = r1
            return
    }

    public final com.google.android.gms.internal.ads.zzgjq zza(int r1) throws java.security.GeneralSecurityException {
            r0 = this;
            r1 = 12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgjq zzb(int r4) throws java.security.GeneralSecurityException {
            r3 = this;
            r0 = 16
            if (r4 == r0) goto L23
            r0 = 24
            if (r4 == r0) goto L23
            r0 = 32
            if (r4 != r0) goto Ld
            goto L23
        Ld:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        L23:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.zza = r4
            return r3
    }

    public final com.google.android.gms.internal.ads.zzgjq zzc(int r1) throws java.security.GeneralSecurityException {
            r0 = this;
            r1 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgjq zzd(com.google.android.gms.internal.ads.zzgjr r1) {
            r0 = this;
            r0.zzd = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgjt zze() throws java.security.GeneralSecurityException {
            r8 = this;
            java.lang.Integer r0 = r8.zza
            if (r0 == 0) goto L44
            com.google.android.gms.internal.ads.zzgjr r1 = r8.zzd
            if (r1 == 0) goto L3c
            java.lang.Integer r1 = r8.zzb
            if (r1 == 0) goto L34
            java.lang.Integer r1 = r8.zzc
            if (r1 == 0) goto L2c
            com.google.android.gms.internal.ads.zzgjt r1 = new com.google.android.gms.internal.ads.zzgjt
            int r3 = r0.intValue()
            java.lang.Integer r0 = r8.zzb
            r0.intValue()
            java.lang.Integer r0 = r8.zzc
            r0.intValue()
            r4 = 12
            r5 = 16
            com.google.android.gms.internal.ads.zzgjr r6 = r8.zzd
            r7 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        L2c:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Tag size is not set"
            r0.<init>(r1)
            throw r0
        L34:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "IV size is not set"
            r0.<init>(r1)
            throw r0
        L3c:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Variant is not set"
            r0.<init>(r1)
            throw r0
        L44:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Key size is not set"
            r0.<init>(r1)
            throw r0
    }
}
