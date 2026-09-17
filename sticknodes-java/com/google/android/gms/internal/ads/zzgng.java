package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgng extends com.google.android.gms.internal.ads.zzgnh {
    public zzgng(byte[] r1, int r2) throws java.security.InvalidKeyException {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    public final int zza() {
            r1 = this;
            r0 = 12
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    public final int[] zzb(int[] r5, int r6) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
            r2 = 3
            if (r0 != r2) goto L18
            r0 = 16
            int[] r0 = new int[r0]
            int[] r3 = r4.zza
            com.google.android.gms.internal.ads.zzgnf.zzb(r0, r3)
            r3 = 12
            r0[r3] = r6
            r6 = 13
            java.lang.System.arraycopy(r5, r1, r0, r6, r2)
            return r0
        L18:
            int r0 = r0 * 32
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r1] = r0
            java.lang.String r0 = "ChaCha20 uses 96-bit nonces, but got a %d-bit nonce"
            java.lang.String r6 = java.lang.String.format(r0, r6)
            r5.<init>(r6)
            throw r5
    }
}
