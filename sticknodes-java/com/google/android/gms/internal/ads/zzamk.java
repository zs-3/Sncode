package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzamk {
    public long zza;
    public long zzb;
    public java.lang.CharSequence zzc;
    public int zzd;
    public float zze;
    public int zzf;
    public int zzg;
    public float zzh;
    public int zzi;
    public float zzj;
    public int zzk;

    public zzamk() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zza = r0
            r2.zzb = r0
            r0 = 2
            r2.zzd = r0
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2.zze = r0
            r1 = 1
            r2.zzf = r1
            r1 = 0
            r2.zzg = r1
            r2.zzh = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.zzi = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.zzj = r1
            r2.zzk = r0
            return
    }

    public final com.google.android.gms.internal.ads.zzcz zza() {
            r13 = this;
            float r0 = r13.zzh
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r6 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 == 0) goto L11
            goto L1e
        L11:
            int r0 = r13.zzd
            if (r0 == r4) goto L1d
            if (r0 == r3) goto L1a
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L1e
        L1a:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            int r7 = r13.zzi
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 3
            r10 = 2
            r11 = 1
            if (r7 == r8) goto L28
            goto L37
        L28:
            int r7 = r13.zzd
            if (r7 == r11) goto L36
            if (r7 == r9) goto L34
            if (r7 == r4) goto L36
            if (r7 == r3) goto L34
            r7 = 1
            goto L37
        L34:
            r7 = 2
            goto L37
        L36:
            r7 = 0
        L37:
            com.google.android.gms.internal.ads.zzcz r8 = new com.google.android.gms.internal.ads.zzcz
            r8.<init>()
            int r12 = r13.zzd
            if (r12 == r11) goto L66
            if (r12 == r10) goto L63
            if (r12 == r9) goto L60
            if (r12 == r4) goto L66
            if (r12 == r3) goto L60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown textAlignment: "
            r3.append(r4)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "WebvttCueParser"
            com.google.android.gms.internal.ads.zzea.zzf(r4, r3)
            r3 = 0
            goto L68
        L60:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L68
        L63:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L68
        L66:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
        L68:
            r8.zzm(r3)
            float r3 = r13.zze
            int r4 = r13.zzf
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L7e
            if (r4 != 0) goto L7e
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L82
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 <= 0) goto L7e
            goto L82
        L7e:
            if (r9 != 0) goto L85
            if (r4 != 0) goto L86
        L82:
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L86
        L85:
            r5 = r3
        L86:
            r8.zze(r5, r4)
            int r2 = r13.zzg
            r8.zzf(r2)
            r8.zzh(r0)
            r8.zzi(r7)
            float r2 = r13.zzj
            if (r7 == 0) goto Lb1
            if (r7 == r11) goto La7
            if (r7 != r10) goto L9d
            goto Lb3
        L9d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r7)
            r0.<init>(r1)
            throw r0
        La7:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto Lad
            float r0 = r0 + r0
            goto Lb3
        Lad:
            float r6 = r6 - r0
            float r0 = r6 + r6
            goto Lb3
        Lb1:
            float r0 = r6 - r0
        Lb3:
            float r0 = java.lang.Math.min(r2, r0)
            r8.zzk(r0)
            int r0 = r13.zzk
            r8.zzo(r0)
            java.lang.CharSequence r0 = r13.zzc
            if (r0 == 0) goto Lc6
            r8.zzl(r0)
        Lc6:
            return r8
    }
}
