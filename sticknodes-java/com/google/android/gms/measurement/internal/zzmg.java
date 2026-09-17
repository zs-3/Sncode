package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzmg {
    public static java.lang.Object zza(java.lang.Object r4) {
            r0 = 0
            if (r4 == 0) goto L41
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L32
            r1.<init>()     // Catch: java.lang.Throwable -> L32
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L32
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L32
            r2.writeObject(r4)     // Catch: java.lang.Throwable -> L2e
            r2.flush()     // Catch: java.lang.Throwable -> L2e
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L2e
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L2e
            byte[] r1 = r1.toByteArray()     // Catch: java.lang.Throwable -> L2e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r1 = r4.readObject()     // Catch: java.lang.Throwable -> L2c
            r2.close()     // Catch: java.lang.Throwable -> L41
            r4.close()     // Catch: java.lang.Throwable -> L41
            return r1
        L2c:
            r1 = move-exception
            goto L36
        L2e:
            r4 = move-exception
            r1 = r4
            r4 = r0
            goto L36
        L32:
            r4 = move-exception
            r1 = r4
            r4 = r0
            r2 = r4
        L36:
            if (r2 == 0) goto L3b
            r2.close()     // Catch: java.lang.Throwable -> L41
        L3b:
            if (r4 == 0) goto L40
            r4.close()     // Catch: java.lang.Throwable -> L41
        L40:
            throw r1     // Catch: java.lang.Throwable -> L41
        L41:
            return r0
    }

    public static java.lang.String zzb(java.lang.String r3, java.lang.String[] r4, java.lang.String[] r5) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            int r0 = r4.length
            int r1 = r5.length
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
        Ld:
            if (r1 >= r0) goto L24
            r2 = r4[r1]
            if (r3 != 0) goto L15
            if (r2 == 0) goto L1e
        L15:
            if (r3 != 0) goto L18
            goto L21
        L18:
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L21
        L1e:
            r3 = r5[r1]
            return r3
        L21:
            int r1 = r1 + 1
            goto Ld
        L24:
            r3 = 0
            return r3
    }

    public static java.lang.String zzc(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.content.res.Resources r2 = r1.getResources()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L11
            java.lang.String r3 = com.google.android.gms.measurement.internal.zzig.zza(r1)
        L11:
            java.lang.String r1 = "google_app_id"
            java.lang.String r1 = com.google.android.gms.measurement.internal.zzig.zzb(r1, r2, r3)
            return r1
    }
}
