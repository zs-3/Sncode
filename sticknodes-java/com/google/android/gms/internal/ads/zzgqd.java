package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzgqd {
    private final java.lang.Class zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzgqd(java.lang.Class r1, java.lang.Class r2, com.google.android.gms.internal.ads.zzgqc r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzgqd zzb(com.google.android.gms.internal.ads.zzgqb r1, java.lang.Class r2, java.lang.Class r3) {
            com.google.android.gms.internal.ads.zzgqa r0 = new com.google.android.gms.internal.ads.zzgqa
            r0.<init>(r2, r3, r1)
            return r0
    }

    public abstract java.lang.Object zza(com.google.android.gms.internal.ads.zzghd r1) throws java.security.GeneralSecurityException;

    public final java.lang.Class zzc() {
            r1 = this;
            java.lang.Class r0 = r1.zza
            return r0
    }

    public final java.lang.Class zzd() {
            r1 = this;
            java.lang.Class r0 = r1.zzb
            return r0
    }
}
