package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfpw {
    private static android.app.UiModeManager zza;

    static {
            return
    }

    public static com.google.android.gms.internal.ads.zzfoo zza() {
            android.app.UiModeManager r0 = com.google.android.gms.internal.ads.zzfpw.zza
            if (r0 == 0) goto L17
            int r0 = r0.getCurrentModeType()
            r1 = 1
            if (r0 == r1) goto L14
            r1 = 4
            if (r0 == r1) goto L11
            com.google.android.gms.internal.ads.zzfoo r0 = com.google.android.gms.internal.ads.zzfoo.zzc
            return r0
        L11:
            com.google.android.gms.internal.ads.zzfoo r0 = com.google.android.gms.internal.ads.zzfoo.zza
            return r0
        L14:
            com.google.android.gms.internal.ads.zzfoo r0 = com.google.android.gms.internal.ads.zzfoo.zzb
            return r0
        L17:
            com.google.android.gms.internal.ads.zzfoo r0 = com.google.android.gms.internal.ads.zzfoo.zzc
            return r0
    }

    public static void zzb(android.content.Context r1) {
            if (r1 == 0) goto Lc
            java.lang.String r0 = "uimode"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.UiModeManager r1 = (android.app.UiModeManager) r1
            com.google.android.gms.internal.ads.zzfpw.zza = r1
        Lc:
            return
    }
}
