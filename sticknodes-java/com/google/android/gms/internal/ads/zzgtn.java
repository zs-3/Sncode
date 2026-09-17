package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgtn implements com.google.android.gms.internal.ads.zzghr {
    private zzgtn(com.google.android.gms.internal.ads.zzghr r1, com.google.android.gms.internal.ads.zzgxf r2, byte[] r3) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.ads.zzghr zza(com.google.android.gms.internal.ads.zzgop r4) throws java.security.GeneralSecurityException {
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
            java.lang.Class<com.google.android.gms.internal.ads.zzghr> r2 = com.google.android.gms.internal.ads.zzghr.class
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzghv.zzb(r1, r2)
            com.google.android.gms.internal.ads.zzghr r1 = (com.google.android.gms.internal.ads.zzghr) r1
            com.google.android.gms.internal.ads.zzgxf r0 = r0.zzc()
            int r2 = r0.ordinal()
            r3 = 1
            if (r2 == r3) goto L64
            r3 = 2
            if (r2 == r3) goto L53
            r3 = 3
            if (r2 == r3) goto L4c
            r3 = 4
            if (r2 != r3) goto L44
            goto L53
        L44:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown output prefix type"
            r4.<init>(r0)
            throw r4
        L4c:
            com.google.android.gms.internal.ads.zzgyx r4 = com.google.android.gms.internal.ads.zzgpr.zza
            byte[] r4 = r4.zzc()
            goto L74
        L53:
            java.lang.Integer r4 = r4.zzb()
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.zzgyx r4 = com.google.android.gms.internal.ads.zzgpr.zza(r4)
            byte[] r4 = r4.zzc()
            goto L74
        L64:
            java.lang.Integer r4 = r4.zzb()
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.zzgyx r4 = com.google.android.gms.internal.ads.zzgpr.zzb(r4)
            byte[] r4 = r4.zzc()
        L74:
            com.google.android.gms.internal.ads.zzgtn r2 = new com.google.android.gms.internal.ads.zzgtn
            r2.<init>(r1, r0, r4)
            return r2
    }
}
