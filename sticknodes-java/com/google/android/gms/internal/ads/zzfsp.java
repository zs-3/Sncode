package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfsp {
    public static java.io.File zza(java.io.File r0, boolean r1) {
            if (r1 == 0) goto L11
            boolean r1 = r0.exists()
            if (r1 == 0) goto L11
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L11
            r0.delete()
        L11:
            boolean r1 = r0.exists()
            if (r1 != 0) goto L1a
            r0.mkdirs()
        L1a:
            return r0
    }

    public static java.io.File zzb(java.lang.String r1, java.lang.String r2, java.io.File r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L17
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            goto L17
        Ld:
            java.io.File r0 = new java.io.File
            java.io.File r1 = zzc(r1, r3)
            r0.<init>(r1, r2)
            return r0
        L17:
            r1 = 0
            return r1
    }

    public static java.io.File zzc(java.lang.String r1, java.io.File r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            r1 = 0
            zza(r0, r1)
            return r0
    }

    public static boolean zzd(java.io.File r6) {
            boolean r0 = r6.exists()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.File[] r0 = r6.listFiles()
            r2 = 0
            if (r0 == 0) goto L26
            r3 = 0
            r4 = 1
        L11:
            int r5 = r0.length
            if (r3 >= r5) goto L27
            r5 = r0[r3]
            if (r5 == 0) goto L22
            boolean r5 = zzd(r5)
            if (r5 == 0) goto L22
            if (r4 == 0) goto L22
            r4 = 1
            goto L23
        L22:
            r4 = 0
        L23:
            int r3 = r3 + 1
            goto L11
        L26:
            r4 = 1
        L27:
            boolean r6 = r6.delete()
            if (r6 == 0) goto L30
            if (r4 == 0) goto L30
            return r1
        L30:
            return r2
    }

    public static boolean zze(java.io.File r3, byte[] r4) {
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L24
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L24
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            r2 = 34
            if (r0 < r2) goto Lf
            r3.setReadOnly()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
        Lf:
            r1.write(r4)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            r1.flush()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            com.google.android.gms.common.util.IOUtils.closeQuietly(r1)
            r3 = 1
            return r3
        L1a:
            r3 = move-exception
            r0 = r1
            goto L20
        L1d:
            r0 = r1
            goto L24
        L1f:
            r3 = move-exception
        L20:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r0)
            throw r3
        L24:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r0)
            r3 = 0
            return r3
    }
}
