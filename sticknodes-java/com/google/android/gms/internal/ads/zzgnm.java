package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgnm implements com.google.android.gms.internal.ads.zzggt {
    private final com.google.android.gms.internal.ads.zzggt zza;
    private final byte[] zzb;

    private zzgnm(com.google.android.gms.internal.ads.zzggt r2, byte[] r3) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            int r2 = r3.length
            if (r2 == 0) goto L14
            r0 = 5
            if (r2 != r0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "identifier has an invalid length"
            r2.<init>(r3)
            throw r2
        L14:
            r1.zzb = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzggt zzb(com.google.android.gms.internal.ads.zzgop r4) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzghw r0 = com.google.android.gms.internal.ads.zzghc.zza()
            com.google.android.gms.internal.ads.zzgqr r0 = r4.zza(r0)
            com.google.android.gms.internal.ads.zzgvz r1 = com.google.android.gms.internal.ads.zzgwb.zza()
            java.lang.String r2 = r0.zzg()
            r1.zzb(r2)
            com.google.android.gms.internal.ads.zzgzs r2 = r0.zze()
            r1.zzc(r2)
            com.google.android.gms.internal.ads.zzgwa r2 = r0.zzb()
            r1.zza(r2)
            com.google.android.gms.internal.ads.zzhbe r1 = r1.zzbn()
            com.google.android.gms.internal.ads.zzgwb r1 = (com.google.android.gms.internal.ads.zzgwb) r1
            java.lang.Class<com.google.android.gms.internal.ads.zzggt> r2 = com.google.android.gms.internal.ads.zzggt.class
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzghv.zzb(r1, r2)
            com.google.android.gms.internal.ads.zzggt r1 = (com.google.android.gms.internal.ads.zzggt) r1
            com.google.android.gms.internal.ads.zzgxf r0 = r0.zzc()
            int r2 = r0.ordinal()
            r3 = 1
            if (r2 == r3) goto L6c
            r3 = 2
            if (r2 == r3) goto L5b
            r3 = 3
            if (r2 == r3) goto L54
            r3 = 4
            if (r2 != r3) goto L44
            goto L5b
        L44:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "unknown output prefix type "
            java.lang.String r0 = r1.concat(r0)
            r4.<init>(r0)
            throw r4
        L54:
            com.google.android.gms.internal.ads.zzgyx r4 = com.google.android.gms.internal.ads.zzgpr.zza
            byte[] r4 = r4.zzc()
            goto L7c
        L5b:
            java.lang.Integer r4 = r4.zzb()
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.zzgyx r4 = com.google.android.gms.internal.ads.zzgpr.zza(r4)
            byte[] r4 = r4.zzc()
            goto L7c
        L6c:
            java.lang.Integer r4 = r4.zzb()
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.zzgyx r4 = com.google.android.gms.internal.ads.zzgpr.zzb(r4)
            byte[] r4 = r4.zzc()
        L7c:
            com.google.android.gms.internal.ads.zzgnm r0 = new com.google.android.gms.internal.ads.zzgnm
            r0.<init>(r1, r4)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzggt zzc(com.google.android.gms.internal.ads.zzggt r1, com.google.android.gms.internal.ads.zzgyx r2) {
            com.google.android.gms.internal.ads.zzgnm r0 = new com.google.android.gms.internal.ads.zzgnm
            byte[] r2 = r2.zzc()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            byte[] r0 = r3.zzb
            int r1 = r0.length
            if (r1 != 0) goto Lc
            com.google.android.gms.internal.ads.zzggt r0 = r3.zza
            byte[] r4 = r0.zza(r4, r5)
            return r4
        Lc:
            boolean r0 = com.google.android.gms.internal.ads.zzgrg.zzc(r0, r4)
            if (r0 == 0) goto L1f
            com.google.android.gms.internal.ads.zzggt r0 = r3.zza
            r1 = 5
            int r2 = r4.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r1, r2)
            byte[] r4 = r0.zza(r4, r5)
            return r4
        L1f:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "wrong prefix"
            r4.<init>(r5)
            throw r4
    }
}
