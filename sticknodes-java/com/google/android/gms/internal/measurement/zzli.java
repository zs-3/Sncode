package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzli extends java.io.IOException {
    zzli() {
            r1 = this;
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
            r1.<init>(r0)
            return
    }

    zzli(long r3, long r5, int r7, java.lang.Throwable r8) {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r1[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r4 = 1
            r1[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r4 = 2
            r1[r4] = r3
            java.lang.String r3 = "Pos: %d, limit: %d, len: %d"
            java.lang.String r3 = java.lang.String.format(r0, r3, r1)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            java.lang.String r3 = r4.concat(r3)
            r2.<init>(r3, r8)
            return
    }

    zzli(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
            r1.<init>(r0, r2)
            return
    }
}
