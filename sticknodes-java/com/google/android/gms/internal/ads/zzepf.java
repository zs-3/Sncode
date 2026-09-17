package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzepf implements com.google.android.gms.internal.ads.zzexg {
    public final android.content.Context zza;
    public final com.google.android.gms.ads.internal.client.zzs zzb;
    public final java.util.List zzc;

    public zzepf(android.content.Context r1, com.google.android.gms.ads.internal.client.zzs r2, java.util.List r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r6) {
            r5 = this;
            java.lang.String r0 = "activity"
            android.os.Bundle r6 = (android.os.Bundle) r6
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbeu.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L13
            return
        L13:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r2 = r5.zza
            r3 = 0
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Exception -> L46
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Exception -> L46
            if (r2 != 0) goto L27
            goto L47
        L27:
            r4 = 1
            java.util.List r2 = r2.getRunningTasks(r4)     // Catch: java.lang.Exception -> L46
            if (r2 == 0) goto L47
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Exception -> L46
            if (r4 != 0) goto L47
            r4 = 0
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Exception -> L46
            android.app.ActivityManager$RunningTaskInfo r2 = (android.app.ActivityManager.RunningTaskInfo) r2     // Catch: java.lang.Exception -> L46
            if (r2 == 0) goto L47
            android.content.ComponentName r2 = r2.topActivity     // Catch: java.lang.Exception -> L46
            if (r2 == 0) goto L47
            java.lang.String r3 = r2.getClassName()     // Catch: java.lang.Exception -> L46
            goto L47
        L46:
        L47:
            r1.putString(r0, r3)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.ads.internal.client.zzs r2 = r5.zzb
            int r2 = r2.zze
            java.lang.String r3 = "width"
            r0.putInt(r3, r2)
            com.google.android.gms.ads.internal.client.zzs r2 = r5.zzb
            int r2 = r2.zzb
            java.lang.String r3 = "height"
            r0.putInt(r3, r2)
            java.lang.String r2 = "size"
            r1.putBundle(r2, r0)
            java.util.List r0 = r5.zzc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L81
            java.util.List r0 = r5.zzc
            int r2 = r0.size()
            android.os.Parcelable[] r2 = new android.os.Parcelable[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            java.lang.String r2 = "parents"
            r1.putParcelableArray(r2, r0)
        L81:
            java.lang.String r0 = "view_hierarchy"
            r6.putBundle(r0, r1)
            return
    }
}
