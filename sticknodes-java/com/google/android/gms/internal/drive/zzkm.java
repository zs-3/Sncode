package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzkm {
    private static final java.nio.charset.Charset ISO_8859_1 = null;
    static final java.nio.charset.Charset UTF_8 = null;
    public static final byte[] zzsn = null;
    private static final java.nio.ByteBuffer zzso = null;
    private static final com.google.android.gms.internal.drive.zzjo zzsp = null;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.android.gms.internal.drive.zzkm.UTF_8 = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.android.gms.internal.drive.zzkm.ISO_8859_1 = r0
            r0 = 0
            byte[] r1 = new byte[r0]
            com.google.android.gms.internal.drive.zzkm.zzsn = r1
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r1)
            com.google.android.gms.internal.drive.zzkm.zzso = r2
            int r2 = r1.length
            com.google.android.gms.internal.drive.zzjo r0 = com.google.android.gms.internal.drive.zzjo.zza(r1, r0, r2, r0)
            com.google.android.gms.internal.drive.zzkm.zzsp = r0
            return
    }

    static <T> T checkNotNull(T r0) {
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    public static int hashCode(byte[] r2) {
            int r0 = r2.length
            r1 = 0
            int r2 = zza(r0, r2, r1, r0)
            if (r2 != 0) goto L9
            r2 = 1
        L9:
            return r2
    }

    static int zza(int r2, byte[] r3, int r4, int r5) {
            r0 = r4
        L1:
            int r1 = r4 + r5
            if (r0 >= r1) goto Ld
            int r2 = r2 * 31
            r1 = r3[r0]
            int r2 = r2 + r1
            int r0 = r0 + 1
            goto L1
        Ld:
            return r2
    }

    static java.lang.Object zza(java.lang.Object r0, java.lang.Object r1) {
            com.google.android.gms.internal.drive.zzlq r0 = (com.google.android.gms.internal.drive.zzlq) r0
            com.google.android.gms.internal.drive.zzlr r0 = r0.zzcy()
            com.google.android.gms.internal.drive.zzlq r1 = (com.google.android.gms.internal.drive.zzlq) r1
            com.google.android.gms.internal.drive.zzlr r0 = r0.zza(r1)
            com.google.android.gms.internal.drive.zzlq r0 = r0.zzde()
            return r0
    }

    static <T> T zza(T r0, java.lang.String r1) {
            java.util.Objects.requireNonNull(r0, r1)
            return r0
    }

    public static boolean zzd(byte[] r0) {
            boolean r0 = com.google.android.gms.internal.drive.zznf.zzd(r0)
            return r0
    }

    public static int zze(boolean r0) {
            if (r0 == 0) goto L5
            r0 = 1231(0x4cf, float:1.725E-42)
            return r0
        L5:
            r0 = 1237(0x4d5, float:1.733E-42)
            return r0
    }

    public static java.lang.String zze(byte[] r2) {
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = com.google.android.gms.internal.drive.zzkm.UTF_8
            r0.<init>(r2, r1)
            return r0
    }

    static boolean zzf(com.google.android.gms.internal.drive.zzlq r0) {
            r0 = 0
            return r0
    }

    public static int zzu(long r2) {
            r0 = 32
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            int r3 = (int) r2
            return r3
    }
}
