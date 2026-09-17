package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
final class zzo extends com.google.android.gms.internal.common.zzn {
    private final char zza;

    zzo(char r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final java.lang.String toString() {
            r7 = this;
            r0 = 6
            char[] r0 = new char[r0]
            r0 = {x0038: FILL_ARRAY_DATA , data: [92, 117, 0, 0, 0, 0} // fill-array
            char r1 = r7.zza
            r2 = 0
        L9:
            r3 = 4
            if (r2 >= r3) goto L1c
            int r4 = 5 - r2
            r5 = r1 & 15
            java.lang.String r6 = "0123456789ABCDEF"
            char r5 = r6.charAt(r5)
            r0[r4] = r5
            int r1 = r1 >> r3
            int r2 = r2 + 1
            goto L9
        L1c:
            java.lang.String r0 = java.lang.String.copyValueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CharMatcher.is('"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "')"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzr
    public final boolean zza(char r2) {
            r1 = this;
            char r0 = r1.zza
            if (r2 != r0) goto L6
            r2 = 1
            return r2
        L6:
            r2 = 0
            return r2
    }
}
