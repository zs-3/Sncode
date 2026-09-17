package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzgpv {
    private final com.google.android.gms.internal.ads.zzgyx zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzgpv(com.google.android.gms.internal.ads.zzgyx r1, java.lang.Class r2, com.google.android.gms.internal.ads.zzgpu r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzgpv zzb(com.google.android.gms.internal.ads.zzgpt r1, com.google.android.gms.internal.ads.zzgyx r2, java.lang.Class r3) {
            com.google.android.gms.internal.ads.zzgps r0 = new com.google.android.gms.internal.ads.zzgps
            r0.<init>(r2, r3, r1)
            return r0
    }

    public abstract com.google.android.gms.internal.ads.zzghs zza(com.google.android.gms.internal.ads.zzgqw r1) throws java.security.GeneralSecurityException;

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
