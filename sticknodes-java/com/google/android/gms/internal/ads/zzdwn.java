package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdwn extends com.google.android.gms.internal.ads.zzfuq {
    private final android.hardware.SensorManager zza;
    private final android.hardware.Sensor zzb;
    private float zzc;
    private java.lang.Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private com.google.android.gms.internal.ads.zzdwm zzi;
    private boolean zzj;

    zzdwn(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "FlickDetector"
            java.lang.String r1 = "ads"
            r2.<init>(r0, r1)
            r0 = 0
            r2.zzc = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.zzd = r0
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.currentTimeMillis()
            r2.zze = r0
            r0 = 0
            r2.zzf = r0
            r2.zzg = r0
            r2.zzh = r0
            r1 = 0
            r2.zzi = r1
            r2.zzj = r0
            java.lang.String r0 = "sensor"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3
            r2.zza = r3
            if (r3 == 0) goto L3a
            r0 = 4
            android.hardware.Sensor r3 = r3.getDefaultSensor(r0)
            r2.zzb = r3
            return
        L3a:
            r2.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zza(android.hardware.SensorEvent r8) {
            r7 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziG
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L14
            goto Lf1
        L14:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r0 = r0.currentTimeMillis()
            long r2 = r7.zze
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zziI
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r4 = (long) r4
            long r2 = r2 + r4
            r4 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 >= 0) goto L45
            r7.zzf = r4
            r7.zze = r0
            r7.zzg = r4
            r7.zzh = r4
            java.lang.Float r2 = r7.zzd
            float r2 = r2.floatValue()
            r7.zzc = r2
        L45:
            float[] r8 = r8.values
            r2 = 1
            r8 = r8[r2]
            r3 = 1082130432(0x40800000, float:4.0)
            float r8 = r8 * r3
            java.lang.Float r3 = r7.zzd
            float r3 = r3.floatValue()
            float r3 = r3 + r8
            java.lang.Float r8 = java.lang.Float.valueOf(r3)
            r7.zzd = r8
            float r8 = r8.floatValue()
            float r3 = r7.zzc
            com.google.android.gms.internal.ads.zzbcm r5 = com.google.android.gms.internal.ads.zzbcv.zziH
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r6.zza(r5)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            float r3 = r3 + r6
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L81
            java.lang.Float r8 = r7.zzd
            float r8 = r8.floatValue()
            r7.zzc = r8
            r7.zzh = r2
            goto La6
        L81:
            java.lang.Float r8 = r7.zzd
            float r8 = r8.floatValue()
            float r3 = r7.zzc
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.zza(r5)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            float r3 = r3 - r5
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 >= 0) goto La6
            java.lang.Float r8 = r7.zzd
            float r8 = r8.floatValue()
            r7.zzc = r8
            r7.zzg = r2
        La6:
            java.lang.Float r8 = r7.zzd
            boolean r8 = r8.isInfinite()
            if (r8 == 0) goto Lb7
            r8 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r8)
            r7.zzd = r3
            r7.zzc = r8
        Lb7:
            boolean r8 = r7.zzg
            if (r8 == 0) goto Lf1
            boolean r8 = r7.zzh
            if (r8 == 0) goto Lf1
            java.lang.String r8 = "Flick detected."
            com.google.android.gms.ads.internal.util.zze.zza(r8)
            r7.zze = r0
            int r8 = r7.zzf
            int r8 = r8 + r2
            r7.zzf = r8
            r7.zzg = r4
            r7.zzh = r4
            com.google.android.gms.internal.ads.zzdwm r0 = r7.zzi
            if (r0 == 0) goto Lf1
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziJ
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r8 != r1) goto Lf1
            com.google.android.gms.internal.ads.zzdwz r8 = new com.google.android.gms.internal.ads.zzdwz
            com.google.android.gms.internal.ads.zzdxb r0 = (com.google.android.gms.internal.ads.zzdxb) r0
            r8.<init>(r0)
            com.google.android.gms.internal.ads.zzdxa r1 = com.google.android.gms.internal.ads.zzdxa.zzc
            r0.zzh(r8, r1)
        Lf1:
            return
    }

    public final void zzb() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzj     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            android.hardware.SensorManager r0 = r2.zza     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            android.hardware.Sensor r1 = r2.zzb     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L18
            r0.unregisterListener(r2, r1)     // Catch: java.lang.Throwable -> L1a
            r0 = 0
            r2.zzj = r0     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = "Stopped listening for flick gestures."
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    public final void zzc() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziG     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L15
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3e
            return
        L15:
            boolean r0 = r3.zzj     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L2d
            android.hardware.SensorManager r0 = r3.zza     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L2d
            android.hardware.Sensor r1 = r3.zzb     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L2d
            r2 = 2
            r0.registerListener(r3, r1, r2)     // Catch: java.lang.Throwable -> L3e
            r0 = 1
            r3.zzj = r0     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "Listening for flick gestures."
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L3e
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3e
            android.hardware.SensorManager r0 = r3.zza
            if (r0 == 0) goto L38
            android.hardware.Sensor r0 = r3.zzb
            if (r0 != 0) goto L37
            goto L38
        L37:
            return
        L38:
            java.lang.String r0 = "Flick detection failed to initialize. Failed to obtain gyroscope."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
        L3e:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3e
            throw r0
    }

    public final void zzd(com.google.android.gms.internal.ads.zzdwm r1) {
            r0 = this;
            r0.zzi = r1
            return
    }
}
