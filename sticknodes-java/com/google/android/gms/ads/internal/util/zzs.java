package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzs extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzt zza;

    /* synthetic */ zzs(com.google.android.gms.ads.internal.util.zzt r1, com.google.android.gms.ads.internal.util.zzr r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r2, android.content.Intent r3) {
            r1 = this;
            java.lang.String r2 = r3.getAction()
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L13
            com.google.android.gms.ads.internal.util.zzt r2 = r1.zza
            r3 = 1
            com.google.android.gms.ads.internal.util.zzt.zze(r2, r3)
            return
        L13:
            java.lang.String r2 = r3.getAction()
            java.lang.String r3 = "android.intent.action.SCREEN_OFF"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L25
            com.google.android.gms.ads.internal.util.zzt r2 = r1.zza
            r3 = 0
            com.google.android.gms.ads.internal.util.zzt.zze(r2, r3)
        L25:
            return
    }
}
