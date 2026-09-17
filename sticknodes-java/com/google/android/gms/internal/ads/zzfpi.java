package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfpi {

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static final com.google.android.gms.internal.ads.zzfpi zza = null;
    private android.content.Context zzb;

    static {
            com.google.android.gms.internal.ads.zzfpi r0 = new com.google.android.gms.internal.ads.zzfpi
            r0.<init>()
            com.google.android.gms.internal.ads.zzfpi.zza = r0
            return
    }

    private zzfpi() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.ads.zzfpi zzb() {
            com.google.android.gms.internal.ads.zzfpi r0 = com.google.android.gms.internal.ads.zzfpi.zza
            return r0
    }

    public final android.content.Context zza() {
            r1 = this;
            android.content.Context r0 = r1.zzb
            return r0
    }

    public final void zzc(android.content.Context r1) {
            r0 = this;
            if (r1 == 0) goto L7
            android.content.Context r1 = r1.getApplicationContext()
            goto L8
        L7:
            r1 = 0
        L8:
            r0.zzb = r1
            return
    }
}
