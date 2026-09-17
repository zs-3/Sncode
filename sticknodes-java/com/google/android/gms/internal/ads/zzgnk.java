package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgnk extends com.google.android.gms.internal.ads.zzgnh {
    public zzgnk(byte[] r1, int r2) throws java.security.InvalidKeyException {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    final int zza() {
            r1 = this;
            r0 = 24
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    final int[] zzb(int[] r4, int r5) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
            r2 = 6
            if (r0 != r2) goto L29
            r0 = 16
            int[] r0 = new int[r0]
            int[] r2 = r3.zza
            int[] r2 = com.google.android.gms.internal.ads.zzgnf.zzd(r2, r4)
            com.google.android.gms.internal.ads.zzgnf.zzb(r0, r2)
            r2 = 12
            r0[r2] = r5
            r5 = 13
            r0[r5] = r1
            r5 = 14
            r1 = 4
            r1 = r4[r1]
            r0[r5] = r1
            r5 = 15
            r1 = 5
            r4 = r4[r1]
            r0[r5] = r4
            return r0
        L29:
            int r0 = r0 * 32
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r1] = r0
            java.lang.String r0 = "XChaCha20 uses 192-bit nonces, but got a %d-bit nonce"
            java.lang.String r5 = java.lang.String.format(r0, r5)
            r4.<init>(r5)
            throw r4
    }
}
