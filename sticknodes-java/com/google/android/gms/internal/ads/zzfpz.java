package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfpz extends android.content.BroadcastReceiver {
    zzfpz() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r2, android.content.Intent r3) {
            r1 = this;
            java.lang.String r2 = r3.getAction()
            java.lang.String r0 = "android.media.action.HDMI_AUDIO_PLUG"
            if (r2 != r0) goto L1c
            r2 = -1
            java.lang.String r0 = "android.media.extra.AUDIO_PLUG_STATE"
            int r2 = r3.getIntExtra(r0, r2)
            r3 = 1
            if (r2 != 0) goto L16
            com.google.android.gms.internal.ads.zzfqa.zzc(r3)
            return
        L16:
            if (r2 != r3) goto L1c
            r2 = 2
            com.google.android.gms.internal.ads.zzfqa.zzc(r2)
        L1c:
            return
    }
}
