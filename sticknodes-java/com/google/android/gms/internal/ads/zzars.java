package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzars extends com.google.android.gms.internal.ads.zzhhr {
    private java.util.Date zzg;
    private java.util.Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private com.google.android.gms.internal.ads.zzhib zzm;
    private long zzn;

    public zzars() {
            r2 = this;
            java.lang.String r0 = "mvhd"
            r2.<init>(r0)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.zzk = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.zzl = r0
            com.google.android.gms.internal.ads.zzhib r0 = com.google.android.gms.internal.ads.zzhib.zza
            r2.zzm = r0
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MovieHeaderBox[creationTime="
            r0.append(r1)
            java.util.Date r1 = r3.zzg
            r0.append(r1)
            java.lang.String r1 = ";modificationTime="
            r0.append(r1)
            java.util.Date r1 = r3.zzh
            r0.append(r1)
            java.lang.String r1 = ";timescale="
            r0.append(r1)
            long r1 = r3.zzi
            r0.append(r1)
            java.lang.String r1 = ";duration="
            r0.append(r1)
            long r1 = r3.zzj
            r0.append(r1)
            java.lang.String r1 = ";rate="
            r0.append(r1)
            double r1 = r3.zzk
            r0.append(r1)
            java.lang.String r1 = ";volume="
            r0.append(r1)
            float r1 = r3.zzl
            r0.append(r1)
            java.lang.String r1 = ";matrix="
            r0.append(r1)
            com.google.android.gms.internal.ads.zzhib r1 = r3.zzm
            r0.append(r1)
            java.lang.String r1 = ";nextTrackId="
            r0.append(r1)
            long r1 = r3.zzn
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final long zzc() {
            r2 = this;
            long r0 = r2.zzj
            return r0
    }

    public final long zzd() {
            r2 = this;
            long r0 = r2.zzi
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhhp
    public final void zze(java.nio.ByteBuffer r24) {
            r23 = this;
            r0 = r23
            r23.zzh(r24)
            int r1 = r23.zzg()
            r2 = 1
            if (r1 != r2) goto L2d
            long r3 = com.google.android.gms.internal.ads.zzaro.zzf(r24)
            java.util.Date r1 = com.google.android.gms.internal.ads.zzhhw.zza(r3)
            r0.zzg = r1
            long r3 = com.google.android.gms.internal.ads.zzaro.zzf(r24)
            java.util.Date r1 = com.google.android.gms.internal.ads.zzhhw.zza(r3)
            r0.zzh = r1
            long r3 = com.google.android.gms.internal.ads.zzaro.zze(r24)
            r0.zzi = r3
            long r3 = com.google.android.gms.internal.ads.zzaro.zzf(r24)
            r0.zzj = r3
            goto L4d
        L2d:
            long r3 = com.google.android.gms.internal.ads.zzaro.zze(r24)
            java.util.Date r1 = com.google.android.gms.internal.ads.zzhhw.zza(r3)
            r0.zzg = r1
            long r3 = com.google.android.gms.internal.ads.zzaro.zze(r24)
            java.util.Date r1 = com.google.android.gms.internal.ads.zzhhw.zza(r3)
            r0.zzh = r1
            long r3 = com.google.android.gms.internal.ads.zzaro.zze(r24)
            r0.zzi = r3
            long r3 = com.google.android.gms.internal.ads.zzaro.zze(r24)
            r0.zzj = r3
        L4d:
            double r3 = com.google.android.gms.internal.ads.zzaro.zzb(r24)
            r0.zzk = r3
            r1 = 2
            byte[] r1 = new byte[r1]
            r3 = r24
            r3.get(r1)
            r4 = 0
            r4 = r1[r4]
            int r4 = r4 << 8
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r4
            short r2 = (short) r2
            r1 = r1 | r2
            short r1 = (short) r1
            float r1 = (float) r1
            r2 = 1132462080(0x43800000, float:256.0)
            float r1 = r1 / r2
            r0.zzl = r1
            com.google.android.gms.internal.ads.zzaro.zzd(r24)
            com.google.android.gms.internal.ads.zzaro.zze(r24)
            com.google.android.gms.internal.ads.zzaro.zze(r24)
            double r5 = com.google.android.gms.internal.ads.zzaro.zzb(r24)
            double r7 = com.google.android.gms.internal.ads.zzaro.zzb(r24)
            double r13 = com.google.android.gms.internal.ads.zzaro.zza(r24)
            double r9 = com.google.android.gms.internal.ads.zzaro.zzb(r24)
            double r11 = com.google.android.gms.internal.ads.zzaro.zzb(r24)
            double r15 = com.google.android.gms.internal.ads.zzaro.zza(r24)
            double r19 = com.google.android.gms.internal.ads.zzaro.zzb(r24)
            double r21 = com.google.android.gms.internal.ads.zzaro.zzb(r24)
            double r17 = com.google.android.gms.internal.ads.zzaro.zza(r24)
            com.google.android.gms.internal.ads.zzhib r1 = new com.google.android.gms.internal.ads.zzhib
            r4 = r1
            r4.<init>(r5, r7, r9, r11, r13, r15, r17, r19, r21)
            r0.zzm = r1
            r24.getInt()
            r24.getInt()
            r24.getInt()
            r24.getInt()
            r24.getInt()
            r24.getInt()
            long r1 = com.google.android.gms.internal.ads.zzaro.zze(r24)
            r0.zzn = r1
            return
    }
}
