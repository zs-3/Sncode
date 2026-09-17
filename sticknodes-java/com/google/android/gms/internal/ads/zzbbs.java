package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbbs {
    private final java.io.InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbbs(java.io.InputStream r1, boolean r2, boolean r3, long r4, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r6
            return
    }

    public static com.google.android.gms.internal.ads.zzbbs zzb(java.io.InputStream r8, boolean r9, boolean r10, long r11, boolean r13) {
            com.google.android.gms.internal.ads.zzbbs r7 = new com.google.android.gms.internal.ads.zzbbs
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r6)
            return r7
    }

    public final long zza() {
            r2 = this;
            long r0 = r2.zzd
            return r0
    }

    public final java.io.InputStream zzc() {
            r1 = this;
            java.io.InputStream r0 = r1.zza
            return r0
    }

    public final boolean zzd() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }

    public final boolean zze() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }

    public final boolean zzf() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }
}
