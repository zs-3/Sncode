package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgk {
    private android.net.Uri zza;
    private java.util.Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public zzgk() {
            r2 = this;
            r2.<init>()
            java.util.Map r0 = java.util.Collections.emptyMap()
            r2.zzb = r0
            r0 = -1
            r2.zzd = r0
            return
    }

    /* synthetic */ zzgk(com.google.android.gms.internal.ads.zzgm r3, com.google.android.gms.internal.ads.zzgj r4) {
            r2 = this;
            r2.<init>()
            android.net.Uri r4 = r3.zza
            r2.zza = r4
            java.util.Map r4 = r3.zzd
            r2.zzb = r4
            long r0 = r3.zze
            r2.zzc = r0
            long r0 = r3.zzf
            r2.zzd = r0
            int r3 = r3.zzg
            r2.zze = r3
            return
    }

    public final com.google.android.gms.internal.ads.zzgk zza(int r1) {
            r0 = this;
            r1 = 6
            r0.zze = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgk zzb(java.util.Map r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgk zzc(long r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgk zzd(android.net.Uri r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzgm zze() {
            r17 = this;
            r0 = r17
            android.net.Uri r1 = r0.zza
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.zzgm r1 = new com.google.android.gms.internal.ads.zzgm
            android.net.Uri r3 = r0.zza
            r4 = 0
            r6 = 1
            r7 = 0
            java.util.Map r8 = r0.zzb
            long r9 = r0.zzc
            long r11 = r0.zzd
            r13 = 0
            int r14 = r0.zze
            r15 = 0
            r16 = 0
            r2 = r1
            r2.<init>(r3, r4, r6, r7, r8, r9, r11, r13, r14, r15, r16)
            return r1
        L1f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The uri must be set."
            r1.<init>(r2)
            throw r1
    }
}
