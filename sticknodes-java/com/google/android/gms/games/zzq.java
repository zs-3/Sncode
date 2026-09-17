package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public class zzq extends com.google.android.gms.common.data.DataBufferRef {
    public zzq(com.google.android.gms.common.data.DataHolder r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    protected final int zzq(java.lang.String r2, int r3) {
            r1 = this;
            boolean r0 = r1.hasColumn(r2)
            if (r0 == 0) goto L12
            boolean r0 = r1.hasNull(r2)
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            int r2 = r1.getInteger(r2)
            return r2
        L12:
            return r3
    }

    protected final java.lang.String zzr(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            boolean r2 = r0.hasColumn(r1)
            if (r2 == 0) goto L12
            boolean r2 = r0.hasNull(r1)
            if (r2 == 0) goto Ld
            goto L12
        Ld:
            java.lang.String r1 = r0.getString(r1)
            return r1
        L12:
            r1 = 0
            return r1
    }
}
