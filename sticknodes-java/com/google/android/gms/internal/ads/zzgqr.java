package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgqr implements com.google.android.gms.internal.ads.zzgqw {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzgyx zzb;
    private final com.google.android.gms.internal.ads.zzgzs zzc;
    private final com.google.android.gms.internal.ads.zzgwa zzd;
    private final com.google.android.gms.internal.ads.zzgxf zze;
    private final java.lang.Integer zzf;

    private zzgqr(java.lang.String r1, com.google.android.gms.internal.ads.zzgyx r2, com.google.android.gms.internal.ads.zzgzs r3, com.google.android.gms.internal.ads.zzgwa r4, com.google.android.gms.internal.ads.zzgxf r5, java.lang.Integer r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            return
    }

    public static com.google.android.gms.internal.ads.zzgqr zza(java.lang.String r8, com.google.android.gms.internal.ads.zzgzs r9, com.google.android.gms.internal.ads.zzgwa r10, com.google.android.gms.internal.ads.zzgxf r11, java.lang.Integer r12) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgxf r0 = com.google.android.gms.internal.ads.zzgxf.zzd
            if (r11 != r0) goto Lf
            if (r12 != 0) goto L7
            goto L11
        L7:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "Keys with output prefix type raw should not have an id requirement."
            r8.<init>(r9)
            throw r8
        Lf:
            if (r12 == 0) goto L21
        L11:
            com.google.android.gms.internal.ads.zzgyx r2 = com.google.android.gms.internal.ads.zzgrg.zza(r8)
            com.google.android.gms.internal.ads.zzgqr r7 = new com.google.android.gms.internal.ads.zzgqr
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L21:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r9 = "Keys with output prefix type different from raw should have an id requirement."
            r8.<init>(r9)
            throw r8
    }

    public final com.google.android.gms.internal.ads.zzgwa zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgwa r0 = r1.zzd
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgxf zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgxf r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgqw
    public final com.google.android.gms.internal.ads.zzgyx zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgyx r0 = r1.zzb
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgzs zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgzs r0 = r1.zzc
            return r0
    }

    public final java.lang.Integer zzf() {
            r1 = this;
            java.lang.Integer r0 = r1.zzf
            return r0
    }

    public final java.lang.String zzg() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }
}
