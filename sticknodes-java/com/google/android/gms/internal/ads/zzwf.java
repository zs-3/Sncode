package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzwf implements com.google.android.gms.internal.ads.zzyu {
    public long zza;
    public long zzb;
    public com.google.android.gms.internal.ads.zzyt zzc;
    public com.google.android.gms.internal.ads.zzwf zzd;

    public zzwf(long r1, int r3) {
            r0 = this;
            r0.<init>()
            r3 = 65536(0x10000, float:9.18355E-41)
            r0.zze(r1, r3)
            return
    }

    public final int zza(long r3) {
            r2 = this;
            long r0 = r2.zza
            long r3 = r3 - r0
            com.google.android.gms.internal.ads.zzyt r0 = r2.zzc
            int r0 = r0.zzb
            int r4 = (int) r3
            return r4
    }

    public final com.google.android.gms.internal.ads.zzwf zzb() {
            r2 = this;
            r0 = 0
            r2.zzc = r0
            com.google.android.gms.internal.ads.zzwf r1 = r2.zzd
            r2.zzd = r0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final com.google.android.gms.internal.ads.zzyt zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzyt r0 = r1.zzc
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final com.google.android.gms.internal.ads.zzyu zzd() {
            r2 = this;
            com.google.android.gms.internal.ads.zzwf r0 = r2.zzd
            if (r0 == 0) goto La
            com.google.android.gms.internal.ads.zzyt r1 = r0.zzc
            if (r1 != 0) goto L9
            goto La
        L9:
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void zze(long r3, int r5) {
            r2 = this;
            com.google.android.gms.internal.ads.zzyt r5 = r2.zzc
            if (r5 != 0) goto L6
            r5 = 1
            goto L7
        L6:
            r5 = 0
        L7:
            com.google.android.gms.internal.ads.zzdi.zzf(r5)
            r2.zza = r3
            r0 = 65536(0x10000, double:3.2379E-319)
            long r3 = r3 + r0
            r2.zzb = r3
            return
    }
}
