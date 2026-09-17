package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzkq {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkq() {
            r3 = this;
            r3.<init>()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.zza = r0
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3.zzb = r2
            r3.zzc = r0
            return
    }

    /* synthetic */ zzkq(com.google.android.gms.internal.ads.zzks r3, com.google.android.gms.internal.ads.zzkp r4) {
            r2 = this;
            r2.<init>()
            long r0 = r3.zza
            r2.zza = r0
            float r4 = r3.zzb
            r2.zzb = r4
            long r3 = r3.zzc
            r2.zzc = r3
            return
    }

    static /* bridge */ /* synthetic */ float zza(com.google.android.gms.internal.ads.zzkq r0) {
            float r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ long zzb(com.google.android.gms.internal.ads.zzkq r2) {
            long r0 = r2.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ long zzc(com.google.android.gms.internal.ads.zzkq r2) {
            long r0 = r2.zza
            return r0
    }

    public final com.google.android.gms.internal.ads.zzkq zzd(long r7) {
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = 1
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L13
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 != 0) goto L12
            r7 = r0
            goto L13
        L12:
            r2 = 0
        L13:
            com.google.android.gms.internal.ads.zzdi.zzd(r2)
            r6.zzc = r7
            return r6
    }

    public final com.google.android.gms.internal.ads.zzkq zze(long r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzkq zzf(float r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto Lf
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r2.zzb = r3
            return r2
    }

    public final com.google.android.gms.internal.ads.zzks zzg() {
            r2 = this;
            com.google.android.gms.internal.ads.zzks r0 = new com.google.android.gms.internal.ads.zzks
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
