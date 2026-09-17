package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbaf extends com.google.android.gms.internal.ads.zzazw {
    private java.security.MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzbaf(int r3) {
            r2 = this;
            r2.<init>()
            r0 = r3 & 7
            int r1 = r3 >> 3
            if (r0 <= 0) goto Lb
            int r1 = r1 + 1
        Lb:
            r2.zzc = r1
            r2.zzd = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzazw
    public final byte[] zzb(java.lang.String r9) {
            r8 = this;
            java.lang.Object r0 = r8.zza
            monitor-enter(r0)
            java.security.MessageDigest r1 = r8.zza()     // Catch: java.lang.Throwable -> L64
            r8.zzb = r1     // Catch: java.lang.Throwable -> L64
            r2 = 0
            if (r1 != 0) goto L10
            byte[] r9 = new byte[r2]     // Catch: java.lang.Throwable -> L64
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
            return r9
        L10:
            r1.reset()     // Catch: java.lang.Throwable -> L64
            java.security.MessageDigest r1 = r8.zzb     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch: java.lang.Throwable -> L64
            byte[] r9 = r9.getBytes(r3)     // Catch: java.lang.Throwable -> L64
            r1.update(r9)     // Catch: java.lang.Throwable -> L64
            java.security.MessageDigest r9 = r8.zzb     // Catch: java.lang.Throwable -> L64
            byte[] r9 = r9.digest()     // Catch: java.lang.Throwable -> L64
            int r1 = r9.length     // Catch: java.lang.Throwable -> L64
            int r3 = r8.zzc     // Catch: java.lang.Throwable -> L64
            if (r1 <= r3) goto L2e
            r1 = r3
        L2e:
            byte[] r3 = new byte[r1]     // Catch: java.lang.Throwable -> L64
            java.lang.System.arraycopy(r9, r2, r3, r2, r1)     // Catch: java.lang.Throwable -> L64
            int r9 = r8.zzd     // Catch: java.lang.Throwable -> L64
            r9 = r9 & 7
            if (r9 <= 0) goto L62
            r4 = 0
        L3b:
            r9 = 8
            if (r2 >= r1) goto L4b
            if (r2 <= 0) goto L42
            long r4 = r4 << r9
        L42:
            r9 = r3[r2]     // Catch: java.lang.Throwable -> L64
            r9 = r9 & 255(0xff, float:3.57E-43)
            long r6 = (long) r9     // Catch: java.lang.Throwable -> L64
            long r4 = r4 + r6
            int r2 = r2 + 1
            goto L3b
        L4b:
            int r1 = r8.zzd     // Catch: java.lang.Throwable -> L64
            r1 = r1 & 7
            int r1 = 8 - r1
            long r1 = r4 >>> r1
            int r4 = r8.zzc     // Catch: java.lang.Throwable -> L64
        L55:
            int r4 = r4 + (-1)
            if (r4 < 0) goto L62
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r1
            int r6 = (int) r5     // Catch: java.lang.Throwable -> L64
            byte r5 = (byte) r6     // Catch: java.lang.Throwable -> L64
            r3[r4] = r5     // Catch: java.lang.Throwable -> L64
            long r1 = r1 >>> r9
            goto L55
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
            return r3
        L64:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
            throw r9
    }
}
