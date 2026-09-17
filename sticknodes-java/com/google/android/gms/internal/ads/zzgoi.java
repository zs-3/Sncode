package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzgoi {
    private final com.google.android.gms.internal.ads.zzgyx zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzgoi(com.google.android.gms.internal.ads.zzgyx r1, java.lang.Class r2, com.google.android.gms.internal.ads.zzgoh r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzgoi zzb(com.google.android.gms.internal.ads.zzgog r1, com.google.android.gms.internal.ads.zzgyx r2, java.lang.Class r3) {
            com.google.android.gms.internal.ads.zzgof r0 = new com.google.android.gms.internal.ads.zzgof
            r0.<init>(r2, r3, r1)
            return r0
    }

    public abstract com.google.android.gms.internal.ads.zzghd zza(com.google.android.gms.internal.ads.zzgqw r1, com.google.android.gms.internal.ads.zzghw r2) throws java.security.GeneralSecurityException;

    public final com.google.android.gms.internal.ads.zzgyx zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgyx r0 = r1.zza
            return r0
    }

    public final java.lang.Class zzd() {
            r1 = this;
            java.lang.Class r0 = r1.zzb
            return r0
    }
}
