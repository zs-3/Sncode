package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzsk extends com.google.android.gms.internal.ads.zzhq {
    private long zzg;
    private int zzh;
    private int zzi;

    public zzsk() {
            r2 = this;
            r0 = 2
            r1 = 0
            r2.<init>(r0, r1)
            r0 = 32
            r2.zzi = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzhk
    public final void zzb() {
            r1 = this;
            super.zzb()
            r0 = 0
            r1.zzh = r0
            return
    }

    public final int zzm() {
            r1 = this;
            int r0 = r1.zzh
            return r0
    }

    public final long zzn() {
            r2 = this;
            long r0 = r2.zzg
            return r0
    }

    public final void zzo(int r1) {
            r0 = this;
            r0.zzi = r1
            return
    }

    public final boolean zzp(com.google.android.gms.internal.ads.zzhq r5) {
            r4 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r5.zzd(r0)
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            boolean r0 = r5.zzd(r0)
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            r0 = 4
            boolean r0 = r5.zzd(r0)
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            boolean r0 = r4.zzq()
            if (r0 != 0) goto L25
            goto L44
        L25:
            int r0 = r4.zzh
            int r2 = r4.zzi
            if (r0 < r2) goto L2c
            goto L42
        L2c:
            java.nio.ByteBuffer r0 = r5.zzc
            if (r0 == 0) goto L44
            java.nio.ByteBuffer r2 = r4.zzc
            if (r2 == 0) goto L44
            int r2 = r2.position()
            int r0 = r0.remaining()
            int r2 = r2 + r0
            r0 = 3072000(0x2ee000, float:4.304789E-39)
            if (r2 <= r0) goto L44
        L42:
            r5 = 0
            return r5
        L44:
            int r0 = r4.zzh
            int r2 = r0 + 1
            r4.zzh = r2
            if (r0 != 0) goto L59
            long r2 = r5.zze
            r4.zze = r2
            boolean r0 = r5.zzd(r1)
            if (r0 == 0) goto L59
            r4.zzc(r1)
        L59:
            java.nio.ByteBuffer r0 = r5.zzc
            if (r0 == 0) goto L69
            int r2 = r0.remaining()
            r4.zzj(r2)
            java.nio.ByteBuffer r2 = r4.zzc
            r2.put(r0)
        L69:
            long r2 = r5.zze
            r4.zzg = r2
            return r1
    }

    public final boolean zzq() {
            r1 = this;
            int r0 = r1.zzh
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
