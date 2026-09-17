package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzerq implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final android.content.Context zzb;

    zzerq(com.google.android.gms.internal.ads.zzgfz r1, android.content.Context r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @android.annotation.SuppressLint({"UnprotectedReceiver"})
    private final android.content.Intent zzd() {
            r4 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zzkE
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L28
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r1 < r3) goto L28
            android.content.Context r1 = r4.zzb
            r3 = 4
            android.content.Intent r0 = r1.registerReceiver(r2, r0, r3)
            goto L2e
        L28:
            android.content.Context r1 = r4.zzb
            android.content.Intent r0 = r1.registerReceiver(r2, r0)
        L2e:
            return r0
    }

    private static final boolean zze(android.content.Intent r3) {
            r0 = 0
            if (r3 == 0) goto L14
            r1 = -1
            java.lang.String r2 = "status"
            int r3 = r3.getIntExtra(r2, r1)
            r1 = 2
            if (r3 == r1) goto L12
            r1 = 5
            if (r3 != r1) goto L11
            goto L12
        L11:
            return r0
        L12:
            r3 = 1
            return r3
        L14:
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 14
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    @android.annotation.SuppressLint({"UnprotectedReceiver"})
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzerp r0 = new com.google.android.gms.internal.ads.zzerp
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzerr zzc() throws java.lang.Exception {
            r6 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzlD
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r0 == 0) goto L3f
            android.content.Context r0 = r6.zzb
            java.lang.String r3 = "batterymanager"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.os.BatteryManager r0 = (android.os.BatteryManager) r0
            if (r0 == 0) goto L29
            r1 = 4
            int r1 = r0.getIntProperty(r1)
            double r1 = (double) r1
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r1 = r1 / r3
        L29:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L36
            if (r0 == 0) goto L36
            boolean r0 = r0.isCharging()
            goto L5a
        L36:
            android.content.Intent r0 = r6.zzd()
            boolean r0 = zze(r0)
            goto L5a
        L3f:
            android.content.Intent r0 = r6.zzd()
            boolean r3 = zze(r0)
            if (r0 == 0) goto L59
            java.lang.String r1 = "level"
            r2 = -1
            int r1 = r0.getIntExtra(r1, r2)
            java.lang.String r4 = "scale"
            int r0 = r0.getIntExtra(r4, r2)
            double r1 = (double) r1
            double r4 = (double) r0
            double r1 = r1 / r4
        L59:
            r0 = r3
        L5a:
            com.google.android.gms.internal.ads.zzerr r3 = new com.google.android.gms.internal.ads.zzerr
            r3.<init>(r1, r0)
            return r3
    }
}
