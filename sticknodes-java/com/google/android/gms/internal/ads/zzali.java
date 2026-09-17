package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzali {
    private final com.google.android.gms.internal.ads.zzek zza;
    private final int[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public zzali() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r0.<init>()
            r1.zza = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]
            r1.zzb = r0
            return
    }

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzali r3, com.google.android.gms.internal.ads.zzek r4, int r5) {
            r0 = 4
            if (r5 >= r0) goto L4
            goto L50
        L4:
            r1 = 3
            r4.zzM(r1)
            int r1 = r4.zzm()
            r1 = r1 & 128(0x80, float:1.794E-43)
            int r5 = r5 + (-4)
            if (r1 == 0) goto L30
            r1 = 7
            if (r5 < r1) goto L50
            int r1 = r4.zzo()
            if (r1 < r0) goto L50
            int r0 = r4.zzq()
            r3.zzh = r0
            int r0 = r4.zzq()
            r3.zzi = r0
            com.google.android.gms.internal.ads.zzek r0 = r3.zza
            int r1 = r1 + (-4)
            r0.zzI(r1)
            int r5 = r5 + (-7)
        L30:
            com.google.android.gms.internal.ads.zzek r0 = r3.zza
            int r1 = r0.zzd()
            int r2 = r0.zze()
            if (r1 >= r2) goto L50
            if (r5 <= 0) goto L50
            int r2 = r2 - r1
            int r5 = java.lang.Math.min(r5, r2)
            byte[] r0 = r0.zzN()
            r4.zzH(r0, r1, r5)
            com.google.android.gms.internal.ads.zzek r3 = r3.zza
            int r1 = r1 + r5
            r3.zzL(r1)
        L50:
            return
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzali r1, com.google.android.gms.internal.ads.zzek r2, int r3) {
            r0 = 19
            if (r3 >= r0) goto L5
            return
        L5:
            int r3 = r2.zzq()
            r1.zzd = r3
            int r3 = r2.zzq()
            r1.zze = r3
            r3 = 11
            r2.zzM(r3)
            int r3 = r2.zzq()
            r1.zzf = r3
            int r2 = r2.zzq()
            r1.zzg = r2
            return
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzali r20, com.google.android.gms.internal.ads.zzek r21, int r22) {
            r0 = r20
            int r1 = r22 % 5
            r2 = 2
            if (r1 == r2) goto L8
            return
        L8:
            r1 = r21
            r1.zzM(r2)
            int[] r2 = r0.zzb
            r3 = 0
            java.util.Arrays.fill(r2, r3)
            int r2 = r22 / 5
            r4 = 0
        L16:
            if (r4 >= r2) goto L87
            int r5 = r21.zzm()
            int r6 = r21.zzm()
            int r7 = r21.zzm()
            int r8 = r21.zzm()
            int r9 = r21.zzm()
            double r10 = (double) r6
            int r7 = r7 + (-128)
            int r8 = r8 + (-128)
            int[] r6 = r0.zzb
            int r9 = r9 << 24
            double r12 = (double) r7
            r14 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            double r14 = r14 * r12
            double r14 = r14 + r10
            int r7 = (int) r14
            r14 = 255(0xff, float:3.57E-43)
            int r7 = java.lang.Math.min(r7, r14)
            int r7 = java.lang.Math.max(r3, r7)
            int r7 = r7 << 16
            r22 = r4
            double r3 = (double) r8
            r16 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            double r16 = r16 * r3
            double r16 = r10 - r16
            r18 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            double r12 = r12 * r18
            double r12 = r16 - r12
            int r8 = (int) r12
            int r8 = java.lang.Math.min(r8, r14)
            r12 = 0
            int r8 = java.lang.Math.max(r12, r8)
            int r8 = r8 << 8
            r15 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            double r3 = r3 * r15
            double r10 = r10 + r3
            int r3 = (int) r10
            int r3 = java.lang.Math.min(r3, r14)
            int r3 = java.lang.Math.max(r12, r3)
            r4 = r9 | r7
            r4 = r4 | r8
            r3 = r3 | r4
            r6[r5] = r3
            int r4 = r22 + 1
            r3 = 0
            goto L16
        L87:
            r1 = 1
            r0.zzc = r1
            return
    }

    public final com.google.android.gms.internal.ads.zzdb zza() {
            r7 = this;
            int r0 = r7.zzd
            if (r0 == 0) goto Lbd
            int r0 = r7.zze
            if (r0 == 0) goto Lbd
            int r0 = r7.zzh
            if (r0 == 0) goto Lbd
            int r0 = r7.zzi
            if (r0 == 0) goto Lbd
            com.google.android.gms.internal.ads.zzek r0 = r7.zza
            int r1 = r0.zze()
            if (r1 == 0) goto Lbd
            int r1 = r0.zzd()
            int r2 = r0.zze()
            if (r1 != r2) goto Lbd
            boolean r1 = r7.zzc
            if (r1 != 0) goto L28
            goto Lbd
        L28:
            r1 = 0
            r0.zzL(r1)
            int r0 = r7.zzh
            int r2 = r7.zzi
            int r0 = r0 * r2
            int[] r2 = new int[r0]
            r3 = 0
        L35:
            if (r3 >= r0) goto L78
            com.google.android.gms.internal.ads.zzek r4 = r7.zza
            int r4 = r4.zzm()
            if (r4 == 0) goto L49
            int r5 = r3 + 1
            int[] r6 = r7.zzb
            r4 = r6[r4]
            r2[r3] = r4
        L47:
            r3 = r5
            goto L35
        L49:
            com.google.android.gms.internal.ads.zzek r4 = r7.zza
            int r4 = r4.zzm()
            if (r4 == 0) goto L35
            r5 = r4 & 63
            r6 = r4 & 64
            if (r6 == 0) goto L60
            int r5 = r5 << 8
            com.google.android.gms.internal.ads.zzek r6 = r7.zza
            int r6 = r6.zzm()
            r5 = r5 | r6
        L60:
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 != 0) goto L69
            int[] r4 = r7.zzb
            r4 = r4[r1]
            goto L73
        L69:
            int[] r4 = r7.zzb
            com.google.android.gms.internal.ads.zzek r6 = r7.zza
            int r6 = r6.zzm()
            r4 = r4[r6]
        L73:
            int r5 = r5 + r3
            java.util.Arrays.fill(r2, r3, r5, r4)
            goto L47
        L78:
            int r0 = r7.zzh
            int r3 = r7.zzi
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r0, r3, r4)
            com.google.android.gms.internal.ads.zzcz r2 = new com.google.android.gms.internal.ads.zzcz
            r2.<init>()
            r2.zzc(r0)
            int r0 = r7.zzf
            float r0 = (float) r0
            int r3 = r7.zzd
            float r3 = (float) r3
            float r0 = r0 / r3
            r2.zzh(r0)
            r2.zzi(r1)
            int r0 = r7.zzg
            float r0 = (float) r0
            int r3 = r7.zze
            float r3 = (float) r3
            float r0 = r0 / r3
            r2.zze(r0, r1)
            r2.zzf(r1)
            int r0 = r7.zzh
            float r0 = (float) r0
            int r1 = r7.zzd
            float r1 = (float) r1
            float r0 = r0 / r1
            r2.zzk(r0)
            int r0 = r7.zzi
            float r0 = (float) r0
            int r1 = r7.zze
            float r1 = (float) r1
            float r0 = r0 / r1
            r2.zzd(r0)
            com.google.android.gms.internal.ads.zzdb r0 = r2.zzp()
            return r0
        Lbd:
            r0 = 0
            return r0
    }

    public final void zze() {
            r2 = this;
            r0 = 0
            r2.zzd = r0
            r2.zze = r0
            r2.zzf = r0
            r2.zzg = r0
            r2.zzh = r0
            r2.zzi = r0
            com.google.android.gms.internal.ads.zzek r1 = r2.zza
            r1.zzI(r0)
            r2.zzc = r0
            return
    }
}
