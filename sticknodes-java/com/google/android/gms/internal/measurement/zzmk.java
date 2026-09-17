package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzmk {
    static final java.nio.charset.Charset zza = null;
    public static final byte[] zzb = null;

    static {
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset.forName(r0)
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.android.gms.internal.measurement.zzmk.zza = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset.forName(r0)
            r0 = 0
            byte[] r2 = new byte[r0]
            com.google.android.gms.internal.measurement.zzmk.zzb = r2
            java.nio.ByteBuffer.wrap(r2)
            int r1 = com.google.android.gms.internal.measurement.zzlg.zza
            com.google.android.gms.internal.measurement.zzle r7 = new com.google.android.gms.internal.measurement.zzle
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.zza(r0)     // Catch: com.google.android.gms.internal.measurement.zzmm -> L2a
            return
        L2a:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public static int zza(boolean r0) {
            if (r0 == 0) goto L5
            r0 = 1231(0x4cf, float:1.725E-42)
            return r0
        L5:
            r0 = 1237(0x4d5, float:1.733E-42)
            return r0
    }

    static int zzb(int r1, byte[] r2, int r3, int r4) {
            r3 = 0
        L1:
            if (r3 >= r4) goto Lb
            int r1 = r1 * 31
            r0 = r2[r3]
            int r1 = r1 + r0
            int r3 = r3 + 1
            goto L1
        Lb:
            return r1
    }

    static java.lang.Object zzc(java.lang.Object r0, java.lang.String r1) {
            java.lang.String r1 = "messageType"
            java.util.Objects.requireNonNull(r0, r1)
            return r0
    }
}
