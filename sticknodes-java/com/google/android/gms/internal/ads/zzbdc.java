package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class zzbdc {
    public static boolean zza(com.google.android.gms.internal.ads.zzbdk r2, com.google.android.gms.internal.ads.zzbdh r3, java.lang.String... r4) {
            if (r3 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.elapsedRealtime()
            r2.zze(r3, r0, r4)
            r2 = 1
            return r2
    }
}
