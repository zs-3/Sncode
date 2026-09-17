package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzqq {
    private final com.google.android.gms.internal.ads.zzct[] zza;
    private final com.google.android.gms.internal.ads.zzrk zzb;
    private final com.google.android.gms.internal.ads.zzcw zzc;

    public zzqq(com.google.android.gms.internal.ads.zzct... r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzrk r0 = new com.google.android.gms.internal.ads.zzrk
            r0.<init>()
            com.google.android.gms.internal.ads.zzcw r1 = new com.google.android.gms.internal.ads.zzcw
            r1.<init>()
            r4.<init>()
            r2 = 2
            com.google.android.gms.internal.ads.zzct[] r2 = new com.google.android.gms.internal.ads.zzct[r2]
            r4.zza = r2
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r2, r3, r3)
            r4.zzb = r0
            r4.zzc = r1
            r2[r3] = r0
            r5 = 1
            r2[r5] = r1
            return
    }

    public final long zza(long r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcw r0 = r1.zzc
            boolean r0 = r0.zzg()
            if (r0 == 0) goto Le
            com.google.android.gms.internal.ads.zzcw r0 = r1.zzc
            long r2 = r0.zzi(r2)
        Le:
            return r2
    }

    public final long zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzrk r0 = r2.zzb
            long r0 = r0.zzo()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbq zzc(com.google.android.gms.internal.ads.zzbq r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcw r0 = r2.zzc
            float r1 = r3.zzb
            r0.zzk(r1)
            com.google.android.gms.internal.ads.zzcw r0 = r2.zzc
            float r1 = r3.zzc
            r0.zzj(r1)
            return r3
    }

    public final boolean zzd(boolean r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzrk r0 = r1.zzb
            r0.zzp(r2)
            return r2
    }

    public final com.google.android.gms.internal.ads.zzct[] zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzct[] r0 = r1.zza
            return r0
    }
}
