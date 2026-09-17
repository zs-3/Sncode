package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzwg {
    private final com.google.android.gms.internal.ads.zzek zza;
    private com.google.android.gms.internal.ads.zzwf zzb;
    private com.google.android.gms.internal.ads.zzwf zzc;
    private com.google.android.gms.internal.ads.zzwf zzd;
    private long zze;
    private final com.google.android.gms.internal.ads.zzza zzf;

    public zzwg(com.google.android.gms.internal.ads.zzza r4) {
            r3 = this;
            r3.<init>()
            r3.zzf = r4
            com.google.android.gms.internal.ads.zzek r4 = new com.google.android.gms.internal.ads.zzek
            r0 = 32
            r4.<init>(r0)
            r3.zza = r4
            com.google.android.gms.internal.ads.zzwf r4 = new com.google.android.gms.internal.ads.zzwf
            r0 = 0
            r2 = 65536(0x10000, float:9.18355E-41)
            r4.<init>(r0, r2)
            r3.zzb = r4
            r3.zzc = r4
            r3.zzd = r4
            return
    }

    private final int zzi(int r7) {
            r6 = this;
            com.google.android.gms.internal.ads.zzwf r0 = r6.zzd
            com.google.android.gms.internal.ads.zzyt r1 = r0.zzc
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.ads.zzza r1 = r6.zzf
            com.google.android.gms.internal.ads.zzyt r1 = r1.zzb()
            com.google.android.gms.internal.ads.zzwf r2 = new com.google.android.gms.internal.ads.zzwf
            com.google.android.gms.internal.ads.zzwf r3 = r6.zzd
            long r3 = r3.zzb
            r5 = 65536(0x10000, float:9.18355E-41)
            r2.<init>(r3, r5)
            r0.zzc = r1
            r0.zzd = r2
        L1b:
            com.google.android.gms.internal.ads.zzwf r0 = r6.zzd
            long r0 = r0.zzb
            long r2 = r6.zze
            long r0 = r0 - r2
            int r1 = (int) r0
            int r7 = java.lang.Math.min(r7, r1)
            return r7
    }

    private static com.google.android.gms.internal.ads.zzwf zzj(com.google.android.gms.internal.ads.zzwf r3, long r4) {
        L0:
            long r0 = r3.zzb
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            com.google.android.gms.internal.ads.zzwf r3 = r3.zzd
            goto L0
        L9:
            return r3
    }

    private static com.google.android.gms.internal.ads.zzwf zzk(com.google.android.gms.internal.ads.zzwf r3, long r4, java.nio.ByteBuffer r6, int r7) {
            com.google.android.gms.internal.ads.zzwf r3 = zzj(r3, r4)
        L4:
            if (r7 <= 0) goto L25
            long r0 = r3.zzb
            long r0 = r0 - r4
            int r1 = (int) r0
            int r0 = java.lang.Math.min(r7, r1)
            com.google.android.gms.internal.ads.zzyt r1 = r3.zzc
            byte[] r1 = r1.zza
            int r2 = r3.zza(r4)
            r6.put(r1, r2, r0)
            int r7 = r7 - r0
            long r0 = (long) r0
            long r4 = r4 + r0
            long r0 = r3.zzb
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L4
            com.google.android.gms.internal.ads.zzwf r3 = r3.zzd
            goto L4
        L25:
            return r3
    }

    private static com.google.android.gms.internal.ads.zzwf zzl(com.google.android.gms.internal.ads.zzwf r5, long r6, byte[] r8, int r9) {
            com.google.android.gms.internal.ads.zzwf r5 = zzj(r5, r6)
            r0 = r9
        L5:
            if (r0 <= 0) goto L28
            long r1 = r5.zzb
            long r1 = r1 - r6
            int r2 = (int) r1
            int r1 = java.lang.Math.min(r0, r2)
            com.google.android.gms.internal.ads.zzyt r2 = r5.zzc
            byte[] r2 = r2.zza
            int r3 = r5.zza(r6)
            int r4 = r9 - r0
            java.lang.System.arraycopy(r2, r3, r8, r4, r1)
            int r0 = r0 - r1
            long r1 = (long) r1
            long r6 = r6 + r1
            long r1 = r5.zzb
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 != 0) goto L5
            com.google.android.gms.internal.ads.zzwf r5 = r5.zzd
            goto L5
        L28:
            return r5
    }

    private static com.google.android.gms.internal.ads.zzwf zzm(com.google.android.gms.internal.ads.zzwf r19, com.google.android.gms.internal.ads.zzhq r20, com.google.android.gms.internal.ads.zzwi r21, com.google.android.gms.internal.ads.zzek r22) {
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r20.zzl()
            if (r3 == 0) goto Lc9
            long r3 = r1.zzb
            r5 = 1
            r2.zzI(r5)
            byte[] r6 = r22.zzN()
            r7 = r19
            com.google.android.gms.internal.ads.zzwf r6 = zzl(r7, r3, r6, r5)
            r7 = 1
            long r3 = r3 + r7
            byte[] r7 = r22.zzN()
            r8 = 0
            r7 = r7[r8]
            r9 = r7 & 128(0x80, float:1.794E-43)
            r7 = r7 & 127(0x7f, float:1.78E-43)
            com.google.android.gms.internal.ads.zzhn r10 = r0.zzb
            byte[] r11 = r10.zza
            if (r11 != 0) goto L37
            r11 = 16
            byte[] r11 = new byte[r11]
            r10.zza = r11
            goto L3a
        L37:
            java.util.Arrays.fill(r11, r8)
        L3a:
            if (r9 == 0) goto L3e
            r9 = 1
            goto L3f
        L3e:
            r9 = 0
        L3f:
            byte[] r11 = r10.zza
            com.google.android.gms.internal.ads.zzwf r6 = zzl(r6, r3, r11, r7)
            long r11 = (long) r7
            long r3 = r3 + r11
            if (r9 == 0) goto L5e
            r5 = 2
            r2.zzI(r5)
            byte[] r7 = r22.zzN()
            com.google.android.gms.internal.ads.zzwf r6 = zzl(r6, r3, r7, r5)
            r11 = 2
            long r3 = r3 + r11
            int r5 = r22.zzq()
            r11 = r5
            goto L5f
        L5e:
            r11 = 1
        L5f:
            int[] r5 = r10.zzd
            if (r5 == 0) goto L66
            int r7 = r5.length
            if (r7 >= r11) goto L68
        L66:
            int[] r5 = new int[r11]
        L68:
            r12 = r5
            int[] r5 = r10.zze
            if (r5 == 0) goto L70
            int r7 = r5.length
            if (r7 >= r11) goto L72
        L70:
            int[] r5 = new int[r11]
        L72:
            r13 = r5
            if (r9 == 0) goto L98
            int r5 = r11 * 6
            r2.zzI(r5)
            byte[] r7 = r22.zzN()
            com.google.android.gms.internal.ads.zzwf r6 = zzl(r6, r3, r7, r5)
            long r14 = (long) r5
            long r3 = r3 + r14
            r2.zzL(r8)
        L87:
            if (r8 >= r11) goto La4
            int r5 = r22.zzq()
            r12[r8] = r5
            int r5 = r22.zzp()
            r13[r8] = r5
            int r8 = r8 + 1
            goto L87
        L98:
            r12[r8] = r8
            int r5 = r1.zza
            long r14 = r1.zzb
            long r14 = r3 - r14
            int r7 = (int) r14
            int r5 = r5 - r7
            r13[r8] = r5
        La4:
            com.google.android.gms.internal.ads.zzaeg r5 = r1.zzc
            int r7 = com.google.android.gms.internal.ads.zzeu.zza
            byte[] r14 = r5.zzb
            byte[] r15 = r10.zza
            int r7 = r5.zza
            int r8 = r5.zzc
            int r5 = r5.zzd
            r16 = r7
            r17 = r8
            r18 = r5
            r10.zzc(r11, r12, r13, r14, r15, r16, r17, r18)
            long r7 = r1.zzb
            long r3 = r3 - r7
            int r4 = (int) r3
            long r9 = (long) r4
            long r7 = r7 + r9
            r1.zzb = r7
            int r3 = r1.zza
            int r3 = r3 - r4
            r1.zza = r3
            goto Lcc
        Lc9:
            r7 = r19
            r6 = r7
        Lcc:
            boolean r3 = r20.zze()
            if (r3 == 0) goto L129
            r3 = 4
            r2.zzI(r3)
            long r4 = r1.zzb
            byte[] r7 = r22.zzN()
            com.google.android.gms.internal.ads.zzwf r3 = zzl(r6, r4, r7, r3)
            int r2 = r22.zzp()
            long r4 = r1.zzb
            r6 = 4
            long r4 = r4 + r6
            r1.zzb = r4
            int r4 = r1.zza
            int r4 = r4 + (-4)
            r1.zza = r4
            r0.zzj(r2)
            long r4 = r1.zzb
            java.nio.ByteBuffer r6 = r0.zzc
            com.google.android.gms.internal.ads.zzwf r3 = zzk(r3, r4, r6, r2)
            long r4 = r1.zzb
            long r6 = (long) r2
            long r4 = r4 + r6
            r1.zzb = r4
            int r4 = r1.zza
            int r4 = r4 - r2
            r1.zza = r4
            java.nio.ByteBuffer r2 = r0.zzf
            if (r2 == 0) goto L118
            int r2 = r2.capacity()
            if (r2 >= r4) goto L112
            goto L118
        L112:
            java.nio.ByteBuffer r2 = r0.zzf
            r2.clear()
            goto L11e
        L118:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r4)
            r0.zzf = r2
        L11e:
            long r4 = r1.zzb
            java.nio.ByteBuffer r0 = r0.zzf
            int r1 = r1.zza
            com.google.android.gms.internal.ads.zzwf r0 = zzk(r3, r4, r0, r1)
            goto L138
        L129:
            int r2 = r1.zza
            r0.zzj(r2)
            long r2 = r1.zzb
            java.nio.ByteBuffer r0 = r0.zzc
            int r1 = r1.zza
            com.google.android.gms.internal.ads.zzwf r0 = zzk(r6, r2, r0, r1)
        L138:
            return r0
    }

    private final void zzn(int r6) {
            r5 = this;
            long r0 = r5.zze
            long r2 = (long) r6
            long r0 = r0 + r2
            r5.zze = r0
            com.google.android.gms.internal.ads.zzwf r6 = r5.zzd
            long r2 = r6.zzb
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L12
            com.google.android.gms.internal.ads.zzwf r6 = r6.zzd
            r5.zzd = r6
        L12:
            return
    }

    public final int zza(com.google.android.gms.internal.ads.zzp r5, int r6, boolean r7) throws java.io.IOException {
            r4 = this;
            int r6 = r4.zzi(r6)
            com.google.android.gms.internal.ads.zzwf r0 = r4.zzd
            com.google.android.gms.internal.ads.zzyt r1 = r0.zzc
            byte[] r1 = r1.zza
            long r2 = r4.zze
            int r0 = r0.zza(r2)
            int r5 = r5.zza(r1, r0, r6)
            r6 = -1
            if (r5 != r6) goto L20
            if (r7 == 0) goto L1a
            return r6
        L1a:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L20:
            r4.zzn(r5)
            return r5
    }

    public final long zzb() {
            r2 = this;
            long r0 = r2.zze
            return r0
    }

    public final void zzc(long r5) {
            r4 = this;
            r0 = -1
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L2a
        L6:
            com.google.android.gms.internal.ads.zzwf r0 = r4.zzb
            long r1 = r0.zzb
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L1e
            com.google.android.gms.internal.ads.zzza r1 = r4.zzf
            com.google.android.gms.internal.ads.zzyt r0 = r0.zzc
            r1.zzc(r0)
            com.google.android.gms.internal.ads.zzwf r0 = r4.zzb
            com.google.android.gms.internal.ads.zzwf r0 = r0.zzb()
            r4.zzb = r0
            goto L6
        L1e:
            com.google.android.gms.internal.ads.zzwf r5 = r4.zzc
            long r5 = r5.zza
            long r1 = r0.zza
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L2a
            r4.zzc = r0
        L2a:
            return
    }

    public final void zzd(com.google.android.gms.internal.ads.zzhq r3, com.google.android.gms.internal.ads.zzwi r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzek r0 = r2.zza
            com.google.android.gms.internal.ads.zzwf r1 = r2.zzc
            zzm(r1, r3, r4, r0)
            return
    }

    public final void zze(com.google.android.gms.internal.ads.zzhq r3, com.google.android.gms.internal.ads.zzwi r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzek r0 = r2.zza
            com.google.android.gms.internal.ads.zzwf r1 = r2.zzc
            com.google.android.gms.internal.ads.zzwf r3 = zzm(r1, r3, r4, r0)
            r2.zzc = r3
            return
    }

    public final void zzf() {
            r4 = this;
            com.google.android.gms.internal.ads.zzwf r0 = r4.zzb
            com.google.android.gms.internal.ads.zzyt r1 = r0.zzc
            if (r1 == 0) goto Le
            com.google.android.gms.internal.ads.zzza r1 = r4.zzf
            r1.zzd(r0)
            r0.zzb()
        Le:
            com.google.android.gms.internal.ads.zzwf r0 = r4.zzb
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            r0.zze(r2, r1)
            com.google.android.gms.internal.ads.zzwf r0 = r4.zzb
            r4.zzc = r0
            r4.zzd = r0
            r4.zze = r2
            com.google.android.gms.internal.ads.zzza r0 = r4.zzf
            r0.zzg()
            return
    }

    public final void zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzwf r0 = r1.zzb
            r1.zzc = r0
            return
    }

    public final void zzh(com.google.android.gms.internal.ads.zzek r6, int r7) {
            r5 = this;
        L0:
            if (r7 <= 0) goto L1a
            int r0 = r5.zzi(r7)
            com.google.android.gms.internal.ads.zzwf r1 = r5.zzd
            com.google.android.gms.internal.ads.zzyt r2 = r1.zzc
            byte[] r2 = r2.zza
            long r3 = r5.zze
            int r1 = r1.zza(r3)
            r6.zzH(r2, r1, r0)
            int r7 = r7 - r0
            r5.zzn(r0)
            goto L0
        L1a:
            return
    }
}
