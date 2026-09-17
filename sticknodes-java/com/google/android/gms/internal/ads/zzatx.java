package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzatx {
    public static java.lang.String zza(byte[] r1, boolean r2) {
            r0 = 1
            if (r0 == r2) goto L5
            r2 = 2
            goto L7
        L5:
            r2 = 11
        L7:
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)
            return r1
    }

    public static byte[] zzb(java.lang.String r1, boolean r2) throws java.lang.IllegalArgumentException {
            r2 = 2
            byte[] r2 = android.util.Base64.decode(r1, r2)
            int r0 = r2.length
            if (r0 != 0) goto L1b
            int r0 = r1.length()
            if (r0 > 0) goto Lf
            goto L1b
        Lf:
            java.lang.String r2 = "Unable to decode "
            java.lang.String r1 = r2.concat(r1)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        L1b:
            return r2
    }
}
