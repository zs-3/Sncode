package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzadt {
    public int zza;
    public java.lang.String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzadt() {
            r0 = this;
            r0.<init>()
            return
    }

    public zzadt(com.google.android.gms.internal.ads.zzadt r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.zza
            r1.zza = r0
            java.lang.String r0 = r2.zzb
            r1.zzb = r0
            int r0 = r2.zzc
            r1.zzc = r0
            int r0 = r2.zzd
            r1.zzd = r0
            int r0 = r2.zze
            r1.zze = r0
            int r0 = r2.zzf
            r1.zzf = r0
            int r2 = r2.zzg
            r1.zzg = r2
            return
    }

    public final boolean zza(int r10) {
            r9 = this;
            boolean r0 = com.google.android.gms.internal.ads.zzadu.zzd(r10)
            if (r0 != 0) goto L8
            goto La2
        L8:
            int r0 = r10 >>> 19
            r1 = 3
            r0 = r0 & r1
            r2 = 1
            if (r0 == r2) goto La2
            int r3 = r10 >>> 17
            r3 = r3 & r1
            if (r3 == 0) goto La2
            int r4 = r10 >>> 12
            r5 = 15
            r4 = r4 & r5
            if (r4 == 0) goto La2
            if (r4 == r5) goto La2
            int r5 = r10 >>> 10
            r5 = r5 & r1
            if (r5 == r1) goto La2
            int r4 = r4 + (-1)
            r9.zza = r0
            int r6 = 3 - r3
            java.lang.String[] r7 = com.google.android.gms.internal.ads.zzadu.zzk()
            r6 = r7[r6]
            r9.zzb = r6
            int[] r6 = com.google.android.gms.internal.ads.zzadu.zzj()
            r5 = r6[r5]
            r9.zzd = r5
            r6 = 2
            if (r0 != r6) goto L40
            int r5 = r5 / 2
            r9.zzd = r5
            goto L46
        L40:
            if (r0 != 0) goto L46
            int r5 = r5 / 4
            r9.zzd = r5
        L46:
            int r7 = r10 >>> 9
            r7 = r7 & r2
            int r8 = com.google.android.gms.internal.ads.zzadu.zza(r0, r3)
            r9.zzg = r8
            if (r3 != r1) goto L6b
            if (r0 != r1) goto L5a
            int[] r0 = com.google.android.gms.internal.ads.zzadu.zze()
            r0 = r0[r4]
            goto L60
        L5a:
            int[] r0 = com.google.android.gms.internal.ads.zzadu.zzi()
            r0 = r0[r4]
        L60:
            r9.zzf = r0
            int r0 = r0 * 12
            int r0 = r0 / r5
            int r0 = r0 + r7
            int r0 = r0 * 4
            r9.zzc = r0
            goto L99
        L6b:
            r8 = 144(0x90, float:2.02E-43)
            if (r0 != r1) goto L87
            if (r3 != r6) goto L78
            int[] r0 = com.google.android.gms.internal.ads.zzadu.zzf()
            r0 = r0[r4]
            goto L7e
        L78:
            int[] r0 = com.google.android.gms.internal.ads.zzadu.zzg()
            r0 = r0[r4]
        L7e:
            r9.zzf = r0
            int r0 = r0 * 144
            int r0 = r0 / r5
            int r0 = r0 + r7
            r9.zzc = r0
            goto L99
        L87:
            int[] r0 = com.google.android.gms.internal.ads.zzadu.zzh()
            r0 = r0[r4]
            r9.zzf = r0
            if (r3 != r2) goto L93
            r8 = 72
        L93:
            int r8 = r8 * r0
            int r8 = r8 / r5
            int r8 = r8 + r7
            r9.zzc = r8
        L99:
            int r10 = r10 >> 6
            r10 = r10 & r1
            if (r10 != r1) goto L9f
            r6 = 1
        L9f:
            r9.zze = r6
            return r2
        La2:
            r10 = 0
            return r10
    }
}
