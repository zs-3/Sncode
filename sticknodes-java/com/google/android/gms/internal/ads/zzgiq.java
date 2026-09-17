package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgiq {
    private java.lang.Integer zza;
    private java.lang.Integer zzb;
    private java.lang.Integer zzc;
    private java.lang.Integer zzd;
    private com.google.android.gms.internal.ads.zzgir zze;
    private com.google.android.gms.internal.ads.zzgis zzf;

    private zzgiq() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            r1.zzb = r0
            r1.zzc = r0
            r1.zzd = r0
            r1.zze = r0
            com.google.android.gms.internal.ads.zzgis r0 = com.google.android.gms.internal.ads.zzgis.zzc
            r1.zzf = r0
            return
    }

    /* synthetic */ zzgiq(com.google.android.gms.internal.ads.zzgip r1) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zza = r1
            r0.zzb = r1
            r0.zzc = r1
            r0.zzd = r1
            r0.zze = r1
            com.google.android.gms.internal.ads.zzgis r1 = com.google.android.gms.internal.ads.zzgis.zzc
            r0.zzf = r1
            return
    }

    public final com.google.android.gms.internal.ads.zzgiq zza(int r4) throws java.security.GeneralSecurityException {
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

    public final com.google.android.gms.internal.ads.zzgiq zzb(com.google.android.gms.internal.ads.zzgir r1) {
            r0 = this;
            r0.zze = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgiq zzc(int r4) throws java.security.GeneralSecurityException {
            r3 = this;
            r0 = 16
            if (r4 < r0) goto Lb
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.zzb = r4
            return r3
        Lb:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "Invalid key size in bytes %d; HMAC key must be at least 16 bytes"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzgiq zzd(int r4) throws java.security.GeneralSecurityException {
            r3 = this;
            r0 = 12
            if (r4 < r0) goto Lf
            r0 = 16
            if (r4 > r0) goto Lf
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.zzc = r4
            return r3
        Lf:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzgiq zze(int r4) throws java.security.GeneralSecurityException {
            r3 = this;
            r0 = 10
            if (r4 < r0) goto Lb
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.zzd = r4
            return r3
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r4 = "Invalid tag size in bytes %d; must be at least 10 bytes"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzgiq zzf(com.google.android.gms.internal.ads.zzgis r1) {
            r0 = this;
            r0.zzf = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgiu zzg() throws java.security.GeneralSecurityException {
            r13 = this;
            java.lang.Integer r0 = r13.zza
            if (r0 == 0) goto L105
            java.lang.Integer r0 = r13.zzb
            if (r0 == 0) goto Lfd
            java.lang.Integer r0 = r13.zzc
            if (r0 == 0) goto Lf5
            java.lang.Integer r0 = r13.zzd
            if (r0 == 0) goto Led
            com.google.android.gms.internal.ads.zzgir r1 = r13.zze
            if (r1 == 0) goto Le5
            com.google.android.gms.internal.ads.zzgis r1 = r13.zzf
            if (r1 == 0) goto Ldd
            int r0 = r0.intValue()
            com.google.android.gms.internal.ads.zzgir r1 = r13.zze
            com.google.android.gms.internal.ads.zzgir r2 = com.google.android.gms.internal.ads.zzgir.zza
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L3e
            r1 = 20
            if (r0 > r1) goto L2a
            goto L9d
        L2a:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L3e:
            com.google.android.gms.internal.ads.zzgir r2 = com.google.android.gms.internal.ads.zzgir.zzb
            if (r1 != r2) goto L5b
            r1 = 28
            if (r0 > r1) goto L47
            goto L9d
        L47:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L5b:
            com.google.android.gms.internal.ads.zzgir r2 = com.google.android.gms.internal.ads.zzgir.zzc
            if (r1 != r2) goto L78
            r1 = 32
            if (r0 > r1) goto L64
            goto L9d
        L64:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L78:
            com.google.android.gms.internal.ads.zzgir r2 = com.google.android.gms.internal.ads.zzgir.zzd
            if (r1 != r2) goto L95
            r1 = 48
            if (r0 > r1) goto L81
            goto L9d
        L81:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L95:
            com.google.android.gms.internal.ads.zzgir r2 = com.google.android.gms.internal.ads.zzgir.zze
            if (r1 != r2) goto Ld5
            r1 = 64
            if (r0 > r1) goto Lc1
        L9d:
            com.google.android.gms.internal.ads.zzgiu r0 = new com.google.android.gms.internal.ads.zzgiu
            java.lang.Integer r1 = r13.zza
            int r6 = r1.intValue()
            java.lang.Integer r1 = r13.zzb
            int r7 = r1.intValue()
            java.lang.Integer r1 = r13.zzc
            int r8 = r1.intValue()
            java.lang.Integer r1 = r13.zzd
            int r9 = r1.intValue()
            com.google.android.gms.internal.ads.zzgis r10 = r13.zzf
            com.google.android.gms.internal.ads.zzgir r11 = r13.zze
            r12 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r0
        Lc1:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r3] = r0
            java.lang.String r0 = "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        Ld5:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512"
            r0.<init>(r1)
            throw r0
        Ldd:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "variant is not set"
            r0.<init>(r1)
            throw r0
        Le5:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "hash type is not set"
            r0.<init>(r1)
            throw r0
        Led:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "tag size is not set"
            r0.<init>(r1)
            throw r0
        Lf5:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "iv size is not set"
            r0.<init>(r1)
            throw r0
        Lfd:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "HMAC key size is not set"
            r0.<init>(r1)
            throw r0
        L105:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "AES key size is not set"
            r0.<init>(r1)
            throw r0
    }
}
