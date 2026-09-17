package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcsw {
    private final com.google.android.gms.internal.ads.zzdat zza;
    private final com.google.android.gms.internal.ads.zzdcz zzb;

    public zzcsw(com.google.android.gms.internal.ads.zzdat r1, com.google.android.gms.internal.ads.zzdcz r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final com.google.android.gms.internal.ads.zzdat zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdat r0 = r1.zza
            return r0
    }

    final com.google.android.gms.internal.ads.zzdcz zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdcz r0 = r1.zzb
            return r0
    }

    final com.google.android.gms.internal.ads.zzdfs zzc() {
            r3 = this;
            com.google.android.gms.internal.ads.zzdcz r0 = r3.zzb
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzdfs r1 = new com.google.android.gms.internal.ads.zzdfs
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            r1.<init>(r0, r2)
            return r1
        Lc:
            com.google.android.gms.internal.ads.zzdfs r0 = new com.google.android.gms.internal.ads.zzdfs
            com.google.android.gms.internal.ads.zzcsv r1 = new com.google.android.gms.internal.ads.zzcsv
            r1.<init>(r3)
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            r0.<init>(r1, r2)
            return r0
    }
}
