package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzazy {
    java.io.ByteArrayOutputStream zza;
    android.util.Base64OutputStream zzb;

    public zzazy() {
            r3 = this;
            r3.<init>()
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r1)
            r3.zza = r0
            android.util.Base64OutputStream r0 = new android.util.Base64OutputStream
            java.io.ByteArrayOutputStream r1 = r3.zza
            r2 = 10
            r0.<init>(r1, r2)
            r3.zzb = r0
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "HashManager: Unable to convert to Base64."
            android.util.Base64OutputStream r1 = r3.zzb     // Catch: java.io.IOException -> L8
            r1.close()     // Catch: java.io.IOException -> L8
            goto Lc
        L8:
            r1 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r1)
        Lc:
            r1 = 0
            java.io.ByteArrayOutputStream r2 = r3.zza     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            r2.close()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            java.io.ByteArrayOutputStream r2 = r3.zza     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            goto L21
        L19:
            r0 = move-exception
            goto L26
        L1b:
            r2 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = ""
        L21:
            r3.zza = r1
            r3.zzb = r1
            return r0
        L26:
            r3.zza = r1
            r3.zzb = r1
            throw r0
    }
}
