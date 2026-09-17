package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgdh {
    static {
            com.google.android.gms.internal.ads.zzgdf r0 = new com.google.android.gms.internal.ads.zzgdf
            r0.<init>()
            return
    }

    public static java.io.InputStream zza(java.io.InputStream r1, long r2) {
            com.google.android.gms.internal.ads.zzgdg r0 = new com.google.android.gms.internal.ads.zzgdg
            r0.<init>(r1, r2)
            return r0
    }

    public static byte[] zzb(java.io.InputStream r9) throws java.io.IOException {
            java.util.Objects.requireNonNull(r9)
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 20
            r0.<init>(r1)
            r1 = 8192(0x2000, float:1.14794E-41)
            r2 = 128(0x80, float:1.794E-43)
            r3 = 0
            int r4 = java.lang.Integer.highestOneBit(r3)
            int r4 = r4 + r4
            int r2 = java.lang.Math.max(r2, r4)
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
        L1d:
            r4 = -1
            r5 = 2147483639(0x7ffffff7, float:NaN)
            if (r2 >= r5) goto L50
            int r5 = r5 - r2
            int r5 = java.lang.Math.min(r1, r5)
            byte[] r6 = new byte[r5]
            r0.add(r6)
            r7 = 0
        L2e:
            if (r7 >= r5) goto L40
            int r8 = r5 - r7
            int r8 = r9.read(r6, r7, r8)
            if (r8 != r4) goto L3d
            byte[] r9 = zzc(r0, r2)
            goto L5a
        L3d:
            int r7 = r7 + r8
            int r2 = r2 + r8
            goto L2e
        L40:
            r4 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r4) goto L46
            r4 = 4
            goto L47
        L46:
            r4 = 2
        L47:
            long r5 = (long) r1
            long r7 = (long) r4
            long r5 = r5 * r7
            int r1 = com.google.android.gms.internal.ads.zzgdu.zze(r5)
            goto L1d
        L50:
            int r9 = r9.read()
            if (r9 != r4) goto L5b
            byte[] r9 = zzc(r0, r5)
        L5a:
            return r9
        L5b:
            java.lang.OutOfMemoryError r9 = new java.lang.OutOfMemoryError
            java.lang.String r0 = "input is too large to fit in a byte array"
            r9.<init>(r0)
            throw r9
    }

    private static byte[] zzc(java.util.Queue r6, int r7) {
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            byte[] r6 = new byte[r1]
            return r6
        La:
            java.lang.Object r0 = r6.remove()
            byte[] r0 = (byte[]) r0
            int r2 = r0.length
            if (r2 != r7) goto L14
            return r0
        L14:
            byte[] r0 = java.util.Arrays.copyOf(r0, r7)
            int r2 = r7 - r2
        L1a:
            if (r2 <= 0) goto L2e
            java.lang.Object r3 = r6.remove()
            byte[] r3 = (byte[]) r3
            int r4 = r3.length
            int r4 = java.lang.Math.min(r2, r4)
            int r5 = r7 - r2
            java.lang.System.arraycopy(r3, r1, r0, r5, r4)
            int r2 = r2 - r4
            goto L1a
        L2e:
            return r0
    }
}
