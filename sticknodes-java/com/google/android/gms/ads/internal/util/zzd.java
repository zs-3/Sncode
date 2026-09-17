package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzd {
    public static void zza(android.content.Context r3) {
            int r0 = com.google.android.gms.ads.internal.util.client.zzl.zza
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzben.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L11
            goto L37
        L11:
            android.content.ContentResolver r0 = r3.getContentResolver()     // Catch: java.lang.Exception -> L38
            java.lang.String r1 = "development_settings_enabled"
            r2 = 0
            int r0 = android.provider.Settings.Global.getInt(r0, r1, r2)     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L37
            boolean r0 = com.google.android.gms.ads.internal.util.client.zzl.zzl()
            if (r0 != 0) goto L37
            com.google.android.gms.ads.internal.util.zzc r0 = new com.google.android.gms.ads.internal.util.zzc
            r0.<init>(r3)
            com.google.common.util.concurrent.ListenableFuture r3 = r0.zzb()
            java.lang.String r0 = "Updating ad debug logging enablement."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r0)
            java.lang.String r0 = "AdDebugLogUpdater.updateEnablement"
            com.google.android.gms.internal.ads.zzcaq.zza(r3, r0)
        L37:
            return
        L38:
            r3 = move-exception
            java.lang.String r0 = "Fail to determine debug setting."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r3)
            return
    }
}
