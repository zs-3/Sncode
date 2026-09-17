package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaei {
    private final byte[] zza;
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public zzaei() {
            r1 = this;
            r1.<init>()
            r0 = 10
            byte[] r0 = new byte[r0]
            r1.zza = r0
            return
    }

    public final void zza(com.google.android.gms.internal.ads.zzaeh r9, com.google.android.gms.internal.ads.zzaeg r10) {
            r8 = this;
            int r0 = r8.zzc
            if (r0 <= 0) goto L14
            long r2 = r8.zzd
            int r4 = r8.zze
            int r5 = r8.zzf
            int r6 = r8.zzg
            r1 = r9
            r7 = r10
            r1.zzs(r2, r4, r5, r6, r7)
            r9 = 0
            r8.zzc = r9
        L14:
            return
    }

    public final void zzb() {
            r1 = this;
            r0 = 0
            r1.zzb = r0
            r1.zzc = r0
            return
    }

    public final void zzc(com.google.android.gms.internal.ads.zzaeh r4, long r5, int r7, int r8, int r9, com.google.android.gms.internal.ads.zzaeg r10) {
            r3 = this;
            int r0 = r3.zzg
            int r1 = r8 + r9
            r2 = 0
            if (r0 > r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.String r1 = "TrueHD chunk samples must be contiguous in the sample queue."
            com.google.android.gms.internal.ads.zzdi.zzg(r0, r1)
            boolean r0 = r3.zzb
            if (r0 != 0) goto L14
            goto L30
        L14:
            int r0 = r3.zzc
            int r1 = r0 + 1
            r3.zzc = r1
            if (r0 != 0) goto L22
            r3.zzd = r5
            r3.zze = r7
            r3.zzf = r2
        L22:
            int r5 = r3.zzf
            int r5 = r5 + r8
            r3.zzf = r5
            r3.zzg = r9
            r5 = 16
            if (r1 < r5) goto L30
            r3.zza(r4, r10)
        L30:
            return
    }

    public final void zzd(com.google.android.gms.internal.ads.zzadc r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.zzb
            if (r0 == 0) goto L5
            goto L34
        L5:
            byte[] r0 = r3.zza
            r1 = 0
            r2 = 10
            r4.zzh(r0, r1, r2)
            r4.zzj()
            byte[] r4 = r3.zza
            int r0 = com.google.android.gms.internal.ads.zzacb.zza
            r0 = 4
            r0 = r4[r0]
            r1 = -8
            if (r0 != r1) goto L34
            r0 = 5
            r0 = r4[r0]
            r1 = 114(0x72, float:1.6E-43)
            if (r0 != r1) goto L34
            r0 = 6
            r0 = r4[r0]
            r1 = 111(0x6f, float:1.56E-43)
            if (r0 != r1) goto L34
            r0 = 7
            r4 = r4[r0]
            r4 = r4 & 254(0xfe, float:3.56E-43)
            r0 = 186(0xba, float:2.6E-43)
            if (r4 != r0) goto L34
            r4 = 1
            r3.zzb = r4
        L34:
            return
    }
}
