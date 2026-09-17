package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgku extends com.google.android.gms.internal.ads.zzgib {
    private final com.google.android.gms.internal.ads.zzgkw zza;
    private final com.google.android.gms.internal.ads.zzgyx zzb;
    private final java.lang.Integer zzc;

    private zzgku(com.google.android.gms.internal.ads.zzgkw r1, com.google.android.gms.internal.ads.zzgyx r2, java.lang.Integer r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzgku zza(com.google.android.gms.internal.ads.zzgkw r2, java.lang.Integer r3) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgkv r0 = r2.zzb()
            com.google.android.gms.internal.ads.zzgkv r1 = com.google.android.gms.internal.ads.zzgkv.zza
            if (r0 != r1) goto L2d
            if (r3 == 0) goto L25
            r0 = 5
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1 = 1
            java.nio.ByteBuffer r0 = r0.put(r1)
            int r1 = r3.intValue()
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            byte[] r0 = r0.array()
            com.google.android.gms.internal.ads.zzgyx r0 = com.google.android.gms.internal.ads.zzgyx.zzb(r0)
            goto L3e
        L25:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "For given Variant TINK the value of idRequirement must be non-null"
            r2.<init>(r3)
            throw r2
        L2d:
            com.google.android.gms.internal.ads.zzgkv r0 = r2.zzb()
            com.google.android.gms.internal.ads.zzgkv r1 = com.google.android.gms.internal.ads.zzgkv.zzb
            if (r0 != r1) goto L4c
            if (r3 != 0) goto L44
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.android.gms.internal.ads.zzgyx r0 = com.google.android.gms.internal.ads.zzgyx.zzb(r0)
        L3e:
            com.google.android.gms.internal.ads.zzgku r1 = new com.google.android.gms.internal.ads.zzgku
            r1.<init>(r2, r0, r3)
            return r1
        L44:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "For given Variant NO_PREFIX the value of idRequirement must be null"
            r2.<init>(r3)
            throw r2
        L4c:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            com.google.android.gms.internal.ads.zzgkv r2 = r2.zzb()
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "Unknown Variant: "
            java.lang.String r2 = r0.concat(r2)
            r3.<init>(r2)
            throw r3
    }

    public final com.google.android.gms.internal.ads.zzgkw zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgkw r0 = r1.zza
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgyx zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgyx r0 = r1.zzb
            return r0
    }

    public final java.lang.Integer zzd() {
            r1 = this;
            java.lang.Integer r0 = r1.zzc
            return r0
    }
}
