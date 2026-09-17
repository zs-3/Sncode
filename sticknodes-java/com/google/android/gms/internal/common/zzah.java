package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
public final class zzah extends com.google.android.gms.internal.common.zzae {
    public zzah() {
            r1 = this;
            r0 = 0
            throw r0
    }

    zzah(int r1) {
            r0 = this;
            r1 = 4
            r0.<init>(r1)
            return
    }

    public final com.google.android.gms.internal.common.zzah zzb(java.lang.Object r1) {
            r0 = this;
            super.zza(r1)
            return r0
    }

    public final com.google.android.gms.internal.common.zzah zzc(java.util.Iterator r2) {
            r1 = this;
        L0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Le
            java.lang.Object r0 = r2.next()
            super.zza(r0)
            goto L0
        Le:
            return r1
    }
}
