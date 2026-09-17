package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfov {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    private zzfov(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzfov zza(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "Name is null or empty"
            com.google.android.gms.internal.ads.zzfqb.zzb(r1, r0)
            java.lang.String r0 = "Version is null or empty"
            com.google.android.gms.internal.ads.zzfqb.zzb(r2, r0)
            com.google.android.gms.internal.ads.zzfov r0 = new com.google.android.gms.internal.ads.zzfov
            r0.<init>(r1, r2)
            return r0
    }

    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
