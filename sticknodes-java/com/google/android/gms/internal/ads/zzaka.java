package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaka extends com.google.android.gms.internal.ads.zzakj {
    private com.google.android.gms.internal.ads.zzadm zza;
    private com.google.android.gms.internal.ads.zzajz zzb;

    zzaka() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean zzd(byte[] r2) {
            r0 = 0
            r2 = r2[r0]
            r1 = -1
            if (r2 != r1) goto L8
            r2 = 1
            return r2
        L8:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    protected final long zza(com.google.android.gms.internal.ads.zzek r5) {
            r4 = this;
            byte[] r0 = r5.zzN()
            boolean r0 = zzd(r0)
            if (r0 == 0) goto L2c
            byte[] r0 = r5.zzN()
            r1 = 2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 4
            int r0 = r0 >> r1
            r2 = 6
            r3 = 7
            if (r0 == r2) goto L1c
            if (r0 != r3) goto L22
            r0 = 7
        L1c:
            r5.zzM(r1)
            r5.zzx()
        L22:
            int r0 = com.google.android.gms.internal.ads.zzadi.zza(r5, r0)
            r1 = 0
            r5.zzL(r1)
            long r0 = (long) r0
            return r0
        L2c:
            r0 = -1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    protected final void zzb(boolean r1) {
            r0 = this;
            super.zzb(r1)
            if (r1 == 0) goto La
            r1 = 0
            r0.zza = r1
            r0.zzb = r1
        La:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    protected final boolean zzc(com.google.android.gms.internal.ads.zzek r7, long r8, com.google.android.gms.internal.ads.zzakg r10) {
            r6 = this;
            byte[] r0 = r7.zzN()
            com.google.android.gms.internal.ads.zzadm r1 = r6.zza
            r2 = 1
            if (r1 != 0) goto L24
            com.google.android.gms.internal.ads.zzadm r8 = new com.google.android.gms.internal.ads.zzadm
            r9 = 17
            r8.<init>(r0, r9)
            r6.zza = r8
            r9 = 9
            int r7 = r7.zze()
            byte[] r7 = java.util.Arrays.copyOfRange(r0, r9, r7)
            r9 = 0
            com.google.android.gms.internal.ads.zzaf r7 = r8.zzc(r7, r9)
            r10.zza = r7
            return r2
        L24:
            r3 = 0
            r4 = r0[r3]
            r4 = r4 & 127(0x7f, float:1.78E-43)
            r5 = 3
            if (r4 != r5) goto L3e
            com.google.android.gms.internal.ads.zzadl r7 = com.google.android.gms.internal.ads.zzadj.zzb(r7)
            com.google.android.gms.internal.ads.zzadm r8 = r1.zzf(r7)
            r6.zza = r8
            com.google.android.gms.internal.ads.zzajz r9 = new com.google.android.gms.internal.ads.zzajz
            r9.<init>(r8, r7)
            r6.zzb = r9
            return r2
        L3e:
            boolean r7 = zzd(r0)
            if (r7 == 0) goto L55
            com.google.android.gms.internal.ads.zzajz r7 = r6.zzb
            if (r7 == 0) goto L4f
            r7.zza(r8)
            com.google.android.gms.internal.ads.zzajz r7 = r6.zzb
            r10.zzb = r7
        L4f:
            com.google.android.gms.internal.ads.zzaf r7 = r10.zza
            java.util.Objects.requireNonNull(r7)
            return r3
        L55:
            return r2
    }
}
