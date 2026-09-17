package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgqs implements com.google.android.gms.internal.ads.zzgqw {
    private final com.google.android.gms.internal.ads.zzgyx zza;
    private final com.google.android.gms.internal.ads.zzgwf zzb;

    private zzgqs(com.google.android.gms.internal.ads.zzgwf r1, com.google.android.gms.internal.ads.zzgyx r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zza = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzgqs zza(com.google.android.gms.internal.ads.zzgwf r2) throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgqs r0 = new com.google.android.gms.internal.ads.zzgqs
            java.lang.String r1 = r2.zzi()
            com.google.android.gms.internal.ads.zzgyx r1 = com.google.android.gms.internal.ads.zzgrg.zza(r1)
            r0.<init>(r2, r1)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgqs zzb(com.google.android.gms.internal.ads.zzgwf r2) {
            com.google.android.gms.internal.ads.zzgqs r0 = new com.google.android.gms.internal.ads.zzgqs
            java.lang.String r1 = r2.zzi()
            com.google.android.gms.internal.ads.zzgyx r1 = com.google.android.gms.internal.ads.zzgrg.zzb(r1)
            r0.<init>(r2, r1)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgwf zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgwf r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgqw
    public final com.google.android.gms.internal.ads.zzgyx zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgyx r0 = r1.zza
            return r0
    }
}
