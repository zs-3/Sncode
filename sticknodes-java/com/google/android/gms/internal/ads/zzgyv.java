package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgyv {
    static {
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            java.lang.String r3 = "([0-9a-zA-Z\\-\\.\\_~])+"
            r1[r2] = r3
            r4 = 1
            r1[r4] = r3
            r5 = 2
            r1[r5] = r3
            r6 = 3
            r1[r6] = r3
            java.lang.String r7 = "^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$"
            java.lang.String.format(r7, r1)
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r3
            r1[r4] = r3
            r1[r5] = r3
            r1[r6] = r3
            r1[r0] = r3
            java.lang.String r0 = "^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$"
            java.lang.String.format(r0, r1)
            return
    }

    public static void zza(int r3) throws java.security.InvalidAlgorithmParameterException {
            r0 = 16
            if (r3 == r0) goto L21
            r0 = 32
            if (r3 != r0) goto L9
            goto L21
        L9:
            int r3 = r3 * 8
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r3 = "invalid key size %d; only 128-bit and 256-bit AES keys are supported"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
        L21:
            return
    }
}
