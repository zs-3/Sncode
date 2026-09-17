package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgsi {
    private java.lang.Integer zza;
    private java.lang.Integer zzb;
    private com.google.android.gms.internal.ads.zzgsj zzc;
    private com.google.android.gms.internal.ads.zzgsk zzd;

    private zzgsi() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            r1.zzb = r0
            r1.zzc = r0
            com.google.android.gms.internal.ads.zzgsk r0 = com.google.android.gms.internal.ads.zzgsk.zzd
            r1.zzd = r0
            return
    }

    /* synthetic */ zzgsi(com.google.android.gms.internal.ads.zzgsh r1) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zza = r1
            r0.zzb = r1
            r0.zzc = r1
            com.google.android.gms.internal.ads.zzgsk r1 = com.google.android.gms.internal.ads.zzgsk.zzd
            r0.zzd = r1
            return
    }

    public final com.google.android.gms.internal.ads.zzgsi zza(com.google.android.gms.internal.ads.zzgsj r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgsi zzb(int r1) throws java.security.GeneralSecurityException {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgsi zzc(int r1) throws java.security.GeneralSecurityException {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgsi zzd(com.google.android.gms.internal.ads.zzgsk r1) {
            r0 = this;
            r0.zzd = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgsm zze() throws java.security.GeneralSecurityException {
            r10 = this;
            java.lang.Integer r0 = r10.zza
            if (r0 == 0) goto L115
            java.lang.Integer r1 = r10.zzb
            if (r1 == 0) goto L10d
            com.google.android.gms.internal.ads.zzgsj r1 = r10.zzc
            if (r1 == 0) goto L105
            com.google.android.gms.internal.ads.zzgsk r1 = r10.zzd
            if (r1 == 0) goto Lfd
            int r0 = r0.intValue()
            r1 = 16
            r2 = 0
            r3 = 1
            if (r0 < r1) goto Leb
            java.lang.Integer r0 = r10.zzb
            int r0 = r0.intValue()
            com.google.android.gms.internal.ads.zzgsj r1 = r10.zzc
            r4 = 10
            if (r0 < r4) goto Ld7
            com.google.android.gms.internal.ads.zzgsj r4 = com.google.android.gms.internal.ads.zzgsj.zza
            if (r1 != r4) goto L44
            r1 = 20
            if (r0 > r1) goto L30
            goto La3
        L30:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1.<init>(r0)
            throw r1
        L44:
            com.google.android.gms.internal.ads.zzgsj r4 = com.google.android.gms.internal.ads.zzgsj.zzb
            if (r1 != r4) goto L61
            r1 = 28
            if (r0 > r1) goto L4d
            goto La3
        L4d:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1.<init>(r0)
            throw r1
        L61:
            com.google.android.gms.internal.ads.zzgsj r4 = com.google.android.gms.internal.ads.zzgsj.zzc
            if (r1 != r4) goto L7e
            r1 = 32
            if (r0 > r1) goto L6a
            goto La3
        L6a:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1.<init>(r0)
            throw r1
        L7e:
            com.google.android.gms.internal.ads.zzgsj r4 = com.google.android.gms.internal.ads.zzgsj.zzd
            if (r1 != r4) goto L9b
            r1 = 48
            if (r0 > r1) goto L87
            goto La3
        L87:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1.<init>(r0)
            throw r1
        L9b:
            com.google.android.gms.internal.ads.zzgsj r4 = com.google.android.gms.internal.ads.zzgsj.zze
            if (r1 != r4) goto Lcf
            r1 = 64
            if (r0 > r1) goto Lbb
        La3:
            com.google.android.gms.internal.ads.zzgsm r0 = new com.google.android.gms.internal.ads.zzgsm
            java.lang.Integer r1 = r10.zza
            int r5 = r1.intValue()
            java.lang.Integer r1 = r10.zzb
            int r6 = r1.intValue()
            com.google.android.gms.internal.ads.zzgsk r7 = r10.zzd
            com.google.android.gms.internal.ads.zzgsj r8 = r10.zzc
            r9 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        Lbb:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1.<init>(r0)
            throw r1
        Lcf:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "unknown hash type; must be SHA256, SHA384 or SHA512"
            r0.<init>(r1)
            throw r0
        Ld7:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = "Invalid tag size in bytes %d; must be at least 10 bytes"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1.<init>(r0)
            throw r1
        Leb:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r3 = r10.zza
            r1[r2] = r3
            java.lang.String r2 = "Invalid key size in bytes %d; must be at least 16 bytes"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        Lfd:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "variant is not set"
            r0.<init>(r1)
            throw r0
        L105:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "hash type is not set"
            r0.<init>(r1)
            throw r0
        L10d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "tag size is not set"
            r0.<init>(r1)
            throw r0
        L115:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "key size is not set"
            r0.<init>(r1)
            throw r0
    }
}
