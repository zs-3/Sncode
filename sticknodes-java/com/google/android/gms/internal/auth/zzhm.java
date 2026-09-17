package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzhm extends com.google.android.gms.internal.auth.zzhl {
    zzhm() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.auth.zzhl
    final int zza(int r7, byte[] r8, int r9, int r10) {
            r6 = this;
        L0:
            if (r9 >= r10) goto L9
            r7 = r8[r9]
            if (r7 < 0) goto L9
            int r9 = r9 + 1
            goto L0
        L9:
            r7 = 0
            r0 = -1
            if (r9 < r10) goto Lf
            goto L7a
        Lf:
            if (r9 < r10) goto L13
            goto L7a
        L13:
            int r1 = r9 + 1
            r9 = r8[r9]
            if (r9 >= 0) goto L7b
            r2 = -32
            r3 = -65
            if (r9 >= r2) goto L2f
            if (r1 < r10) goto L23
            r7 = r9
            goto L7a
        L23:
            r2 = -62
            if (r9 < r2) goto L2d
            int r9 = r1 + 1
            r1 = r8[r1]
            if (r1 <= r3) goto Lf
        L2d:
            r7 = -1
            goto L7a
        L2f:
            r4 = -16
            if (r9 >= r4) goto L55
            int r4 = r10 + (-1)
            if (r1 < r4) goto L3c
            int r7 = com.google.android.gms.internal.auth.zzhn.zza(r8, r1, r10)
            goto L7a
        L3c:
            int r4 = r1 + 1
            r1 = r8[r1]
            if (r1 > r3) goto L2d
            r5 = -96
            if (r9 != r2) goto L48
            if (r1 < r5) goto L2d
        L48:
            r2 = -19
            if (r9 != r2) goto L4e
            if (r1 >= r5) goto L2d
        L4e:
            int r9 = r4 + 1
            r1 = r8[r4]
            if (r1 <= r3) goto Lf
            goto L2d
        L55:
            int r2 = r10 + (-2)
            if (r1 < r2) goto L5e
            int r7 = com.google.android.gms.internal.auth.zzhn.zza(r8, r1, r10)
            goto L7a
        L5e:
            int r2 = r1 + 1
            r1 = r8[r1]
            if (r1 > r3) goto L2d
            int r9 = r9 << 28
            int r1 = r1 + 112
            int r9 = r9 + r1
            int r9 = r9 >> 30
            if (r9 != 0) goto L2d
            int r9 = r2 + 1
            r1 = r8[r2]
            if (r1 > r3) goto L2d
            int r1 = r9 + 1
            r9 = r8[r9]
            if (r9 <= r3) goto L7b
            goto L2d
        L7a:
            return r7
        L7b:
            r9 = r1
            goto Lf
    }
}
