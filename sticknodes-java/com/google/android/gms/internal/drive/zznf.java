package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zznf {
    private static final com.google.android.gms.internal.drive.zznh zzwt = null;

    static {
            boolean r0 = com.google.android.gms.internal.drive.zznd.zzfd()
            if (r0 == 0) goto Le
            boolean r0 = com.google.android.gms.internal.drive.zznd.zzfe()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L1d
            boolean r0 = com.google.android.gms.internal.drive.zzix.zzbr()
            if (r0 != 0) goto L1d
            com.google.android.gms.internal.drive.zznk r0 = new com.google.android.gms.internal.drive.zznk
            r0.<init>()
            goto L22
        L1d:
            com.google.android.gms.internal.drive.zzni r0 = new com.google.android.gms.internal.drive.zzni
            r0.<init>()
        L22:
            com.google.android.gms.internal.drive.zznf.zzwt = r0
            return
    }

    static int zza(java.lang.CharSequence r8) {
            int r0 = r8.length()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L13
            char r3 = r8.charAt(r2)
            r4 = 128(0x80, float:1.794E-43)
            if (r3 >= r4) goto L13
            int r2 = r2 + 1
            goto L6
        L13:
            r3 = r0
        L14:
            if (r2 >= r0) goto L59
            char r4 = r8.charAt(r2)
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L26
            int r4 = 127 - r4
            int r4 = r4 >>> 31
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L14
        L26:
            int r4 = r8.length()
        L2a:
            if (r2 >= r4) goto L58
            char r6 = r8.charAt(r2)
            if (r6 >= r5) goto L38
            int r6 = 127 - r6
            int r6 = r6 >>> 31
            int r1 = r1 + r6
            goto L55
        L38:
            int r1 = r1 + 2
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r7 > r6) goto L55
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r6 > r7) goto L55
            int r6 = java.lang.Character.codePointAt(r8, r2)
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r6 < r7) goto L4f
            int r2 = r2 + 1
            goto L55
        L4f:
            com.google.android.gms.internal.drive.zznj r8 = new com.google.android.gms.internal.drive.zznj
            r8.<init>(r2, r4)
            throw r8
        L55:
            int r2 = r2 + 1
            goto L2a
        L58:
            int r3 = r3 + r1
        L59:
            if (r3 < r0) goto L5c
            return r3
        L5c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            long r0 = (long) r3
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 + r2
            r2 = 54
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "UTF-8 length does not fit in int: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r8.<init>(r0)
            throw r8
    }

    static int zza(java.lang.CharSequence r1, byte[] r2, int r3, int r4) {
            com.google.android.gms.internal.drive.zznh r0 = com.google.android.gms.internal.drive.zznf.zzwt
            int r1 = r0.zzb(r1, r2, r3, r4)
            return r1
    }

    private static int zzay(int r1) {
            r0 = -12
            if (r1 <= r0) goto L5
            r1 = -1
        L5:
            return r1
    }

    static /* synthetic */ int zzaz(int r0) {
            int r0 = zzay(r0)
            return r0
    }

    private static int zzc(int r1, int r2, int r3) {
            r0 = -12
            if (r1 > r0) goto L12
            r0 = -65
            if (r2 > r0) goto L12
            if (r3 <= r0) goto Lb
            goto L12
        Lb:
            int r2 = r2 << 8
            r1 = r1 ^ r2
            int r2 = r3 << 16
            r1 = r1 ^ r2
            return r1
        L12:
            r1 = -1
            return r1
    }

    static /* synthetic */ int zzd(int r0, int r1, int r2) {
            int r0 = zzc(r0, r1, r2)
            return r0
    }

    public static boolean zzd(byte[] r3) {
            com.google.android.gms.internal.drive.zznh r0 = com.google.android.gms.internal.drive.zznf.zzwt
            int r1 = r3.length
            r2 = 0
            boolean r3 = r0.zze(r3, r2, r1)
            return r3
    }

    public static boolean zze(byte[] r1, int r2, int r3) {
            com.google.android.gms.internal.drive.zznh r0 = com.google.android.gms.internal.drive.zznf.zzwt
            boolean r1 = r0.zze(r1, r2, r3)
            return r1
    }

    private static int zzf(byte[] r3, int r4, int r5) {
            int r0 = r4 + (-1)
            r0 = r3[r0]
            int r5 = r5 - r4
            if (r5 == 0) goto L24
            r1 = 1
            if (r5 == r1) goto L1d
            r2 = 2
            if (r5 != r2) goto L17
            r5 = r3[r4]
            int r4 = r4 + r1
            r3 = r3[r4]
            int r3 = zzc(r0, r5, r3)
            return r3
        L17:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L1d:
            r3 = r3[r4]
            int r3 = zzr(r0, r3)
            return r3
        L24:
            int r3 = zzay(r0)
            return r3
    }

    static java.lang.String zzg(byte[] r1, int r2, int r3) throws com.google.android.gms.internal.drive.zzkq {
            com.google.android.gms.internal.drive.zznh r0 = com.google.android.gms.internal.drive.zznf.zzwt
            java.lang.String r1 = r0.zzg(r1, r2, r3)
            return r1
    }

    static /* synthetic */ int zzh(byte[] r0, int r1, int r2) {
            int r0 = zzf(r0, r1, r2)
            return r0
    }

    private static int zzr(int r1, int r2) {
            r0 = -12
            if (r1 > r0) goto Ld
            r0 = -65
            if (r2 <= r0) goto L9
            goto Ld
        L9:
            int r2 = r2 << 8
            r1 = r1 ^ r2
            return r1
        Ld:
            r1 = -1
            return r1
    }

    static /* synthetic */ int zzs(int r0, int r1) {
            int r0 = zzr(r0, r1)
            return r0
    }
}
