package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzng {
    private static void zza(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) throws com.google.android.gms.internal.drive.zzkq {
            boolean r0 = zzg(r3)
            if (r0 != 0) goto L41
            int r0 = r2 << 28
            int r1 = r3 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L41
            boolean r0 = zzg(r4)
            if (r0 != 0) goto L41
            boolean r0 = zzg(r5)
            if (r0 != 0) goto L41
            r2 = r2 & 7
            int r2 = r2 << 18
            r3 = r3 & 63
            int r3 = r3 << 12
            r2 = r2 | r3
            r3 = r4 & 63
            int r3 = r3 << 6
            r2 = r2 | r3
            r3 = r5 & 63
            r2 = r2 | r3
            r3 = 55232(0xd7c0, float:7.7397E-41)
            int r4 = r2 >>> 10
            int r4 = r4 + r3
            char r3 = (char) r4
            r6[r7] = r3
            int r7 = r7 + 1
            r3 = 56320(0xdc00, float:7.8921E-41)
            r2 = r2 & 1023(0x3ff, float:1.434E-42)
            int r2 = r2 + r3
            char r2 = (char) r2
            r6[r7] = r2
            return
        L41:
            com.google.android.gms.internal.drive.zzkq r2 = com.google.android.gms.internal.drive.zzkq.zzdn()
            throw r2
    }

    private static void zza(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.android.gms.internal.drive.zzkq {
            boolean r0 = zzg(r3)
            if (r0 != 0) goto L2a
            r0 = -32
            r1 = -96
            if (r2 != r0) goto Le
            if (r3 < r1) goto L2a
        Le:
            r0 = -19
            if (r2 != r0) goto L14
            if (r3 >= r1) goto L2a
        L14:
            boolean r0 = zzg(r4)
            if (r0 != 0) goto L2a
            r2 = r2 & 15
            int r2 = r2 << 12
            r3 = r3 & 63
            int r3 = r3 << 6
            r2 = r2 | r3
            r3 = r4 & 63
            r2 = r2 | r3
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2a:
            com.google.android.gms.internal.drive.zzkq r2 = com.google.android.gms.internal.drive.zzkq.zzdn()
            throw r2
    }

    private static void zza(byte r1, byte r2, char[] r3, int r4) throws com.google.android.gms.internal.drive.zzkq {
            r0 = -62
            if (r1 < r0) goto L15
            boolean r0 = zzg(r2)
            if (r0 != 0) goto L15
            r1 = r1 & 31
            int r1 = r1 << 6
            r2 = r2 & 63
            r1 = r1 | r2
            char r1 = (char) r1
            r3[r4] = r1
            return
        L15:
            com.google.android.gms.internal.drive.zzkq r1 = com.google.android.gms.internal.drive.zzkq.zzdn()
            throw r1
    }

    private static void zza(byte r0, char[] r1, int r2) {
            char r0 = (char) r0
            r1[r2] = r0
            return
    }

    static /* synthetic */ void zzb(byte r0, byte r1, byte r2, byte r3, char[] r4, int r5) throws com.google.android.gms.internal.drive.zzkq {
            zza(r0, r1, r2, r3, r4, r5)
            return
    }

    static /* synthetic */ void zzb(byte r0, byte r1, byte r2, char[] r3, int r4) throws com.google.android.gms.internal.drive.zzkq {
            zza(r0, r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void zzb(byte r0, byte r1, char[] r2, int r3) throws com.google.android.gms.internal.drive.zzkq {
            zza(r0, r1, r2, r3)
            return
    }

    static /* synthetic */ void zzb(byte r0, char[] r1, int r2) {
            zza(r0, r1, r2)
            return
    }

    private static boolean zzd(byte r0) {
            if (r0 < 0) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    private static boolean zze(byte r1) {
            r0 = -32
            if (r1 >= r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    private static boolean zzf(byte r1) {
            r0 = -16
            if (r1 >= r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    private static boolean zzg(byte r1) {
            r0 = -65
            if (r1 <= r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    static /* synthetic */ boolean zzh(byte r0) {
            boolean r0 = zzd(r0)
            return r0
    }

    static /* synthetic */ boolean zzi(byte r0) {
            boolean r0 = zze(r0)
            return r0
    }

    static /* synthetic */ boolean zzj(byte r0) {
            boolean r0 = zzf(r0)
            return r0
    }
}
