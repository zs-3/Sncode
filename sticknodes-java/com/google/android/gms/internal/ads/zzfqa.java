package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfqa {
    private static int zza = 2;

    static {
            return
    }

    public static void zza(android.content.Context r2) {
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.media.action.HDMI_AUDIO_PLUG"
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzfpz r1 = new com.google.android.gms.internal.ads.zzfpz
            r1.<init>()
            r2.registerReceiver(r1, r0)
            return
    }

    public static int zzb() {
            com.google.android.gms.internal.ads.zzfoo r0 = com.google.android.gms.internal.ads.zzfpw.zza()
            com.google.android.gms.internal.ads.zzfoo r1 = com.google.android.gms.internal.ads.zzfoo.zza
            if (r0 == r1) goto La
            r0 = 2
            return r0
        La:
            int r0 = com.google.android.gms.internal.ads.zzfqa.zza
            return r0
    }

    static /* bridge */ /* synthetic */ void zzc(int r0) {
            com.google.android.gms.internal.ads.zzfqa.zza = r0
            return
    }
}
