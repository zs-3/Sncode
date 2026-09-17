package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfsn {
    private final com.google.android.gms.internal.ads.zzayk zza;
    private final java.io.File zzb;
    private final java.io.File zzc;
    private final java.io.File zzd;
    private byte[] zze;

    public zzfsn(com.google.android.gms.internal.ads.zzayk r1, java.io.File r2, java.io.File r3, java.io.File r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r4
            r0.zzd = r3
            return
    }

    public final com.google.android.gms.internal.ads.zzayk zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzayk r0 = r1.zza
            return r0
    }

    public final java.io.File zzb() {
            r1 = this;
            java.io.File r0 = r1.zzc
            return r0
    }

    public final java.io.File zzc() {
            r1 = this;
            java.io.File r0 = r1.zzb
            return r0
    }

    public final boolean zzd(long r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzayk r5 = r4.zza
            long r5 = r5.zzc()
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            long r5 = r5 - r0
            r0 = 3600(0xe10, double:1.7786E-320)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L16
            r5 = 1
            return r5
        L16:
            r5 = 0
            return r5
    }

    public final byte[] zze() {
            r9 = this;
            byte[] r0 = r9.zze
            r1 = 0
            if (r0 != 0) goto L55
            java.io.File r0 = r9.zzd
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4f
            r0.<init>()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4f
            r3 = 256(0x100, float:3.59E-43)
        L13:
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4f
            r5 = 0
            r6 = 0
        L17:
            if (r6 >= r3) goto L25
            int r7 = r3 - r6
            int r7 = r2.read(r4, r6, r7)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4f
            r8 = -1
            if (r7 != r8) goto L23
            goto L25
        L23:
            int r6 = r6 + r7
            goto L17
        L25:
            if (r6 != 0) goto L29
            r4 = r1
            goto L2d
        L29:
            com.google.android.gms.internal.ads.zzgzs r4 = com.google.android.gms.internal.ads.zzgzs.zzv(r4, r5, r6)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4f
        L2d:
            if (r4 != 0) goto L3b
            com.google.android.gms.internal.ads.zzgzs r0 = com.google.android.gms.internal.ads.zzgzs.zzu(r0)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4f
            byte[] r0 = r0.zzA()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4f
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            goto L53
        L3b:
            r0.add(r4)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4f
            int r3 = r3 + r3
            r4 = 8192(0x2000, float:1.14794E-41)
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4f
            goto L13
        L46:
            r0 = move-exception
            r1 = r2
            goto L4a
        L49:
            r0 = move-exception
        L4a:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r1)
            throw r0
        L4e:
            r2 = r1
        L4f:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            r0 = r1
        L53:
            r9.zze = r0
        L55:
            byte[] r0 = r9.zze
            if (r0 != 0) goto L5a
            return r1
        L5a:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }
}
