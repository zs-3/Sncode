package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzara {
    private final int zza;
    private final java.util.List zzb;
    private final int zzc;
    private final java.io.InputStream zzd;

    public zzara(int r1, java.util.List r2, int r3, java.io.InputStream r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public final java.io.InputStream zzc() {
            r1 = this;
            java.io.InputStream r0 = r1.zzd
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public final java.util.List zzd() {
            r1 = this;
            java.util.List r0 = r1.zzb
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }
}
