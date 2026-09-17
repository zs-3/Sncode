package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdyd extends com.google.android.gms.internal.ads.zzfuq {
    private final android.content.Context zza;
    private android.hardware.SensorManager zzb;
    private android.hardware.Sensor zzc;
    private long zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzdyc zzf;
    private boolean zzg;

    zzdyd(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "ShakeDetector"
            java.lang.String r1 = "ads"
            r2.<init>(r0, r1)
            r2.zza = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zza(android.hardware.SensorEvent r10) {
            r9 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziB
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L14
            goto Laf
        L14:
            float[] r10 = r10.values
            r0 = 0
            r1 = r10[r0]
            r2 = 1
            r3 = r10[r2]
            r4 = 2
            r10 = r10[r4]
            r4 = 1092413450(0x411ce80a, float:9.80665)
            float r1 = r1 / r4
            float r3 = r3 / r4
            float r10 = r10 / r4
            float r1 = r1 * r1
            float r3 = r3 * r3
            float r1 = r1 + r3
            float r10 = r10 * r10
            float r1 = r1 + r10
            double r3 = (double) r1
            double r3 = java.lang.Math.sqrt(r3)
            float r10 = (float) r3
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziC
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r3.zza(r1)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 < 0) goto Laf
            com.google.android.gms.common.util.Clock r10 = com.google.android.gms.ads.internal.zzu.zzB()
            long r3 = r10.currentTimeMillis()
            long r5 = r9.zzd
            com.google.android.gms.internal.ads.zzbcm r10 = com.google.android.gms.internal.ads.zzbcv.zziD
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r10 = r1.zza(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            long r7 = (long) r10
            long r5 = r5 + r7
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 > 0) goto Laf
            long r5 = r9.zzd
            com.google.android.gms.internal.ads.zzbcm r10 = com.google.android.gms.internal.ads.zzbcv.zziE
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r10 = r1.zza(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            long r7 = (long) r10
            long r5 = r5 + r7
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 >= 0) goto L81
            r9.zze = r0
        L81:
            java.lang.String r10 = "Shake detected."
            com.google.android.gms.ads.internal.util.zze.zza(r10)
            r9.zzd = r3
            int r10 = r9.zze
            int r10 = r10 + r2
            r9.zze = r10
            com.google.android.gms.internal.ads.zzdyc r0 = r9.zzf
            if (r0 == 0) goto Laf
            com.google.android.gms.internal.ads.zzbcm r1 = com.google.android.gms.internal.ads.zzbcv.zziF
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r10 != r1) goto Laf
            com.google.android.gms.internal.ads.zzdwy r10 = new com.google.android.gms.internal.ads.zzdwy
            com.google.android.gms.internal.ads.zzdxb r0 = (com.google.android.gms.internal.ads.zzdxb) r0
            r10.<init>(r0)
            com.google.android.gms.internal.ads.zzdxa r1 = com.google.android.gms.internal.ads.zzdxa.zzc
            r0.zzh(r10, r1)
        Laf:
            return
    }

    public final void zzb() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzg     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L16
            android.hardware.SensorManager r0 = r2.zzb     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L13
            android.hardware.Sensor r1 = r2.zzc     // Catch: java.lang.Throwable -> L18
            r0.unregisterListener(r2, r1)     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "Stopped listening for shake gestures."
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L18
        L13:
            r0 = 0
            r2.zzg = r0     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public final void zzc() {
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziB     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6a
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L15
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6a
            return
        L15:
            android.hardware.SensorManager r0 = r6.zzb     // Catch: java.lang.Throwable -> L6a
            r1 = 1
            if (r0 != 0) goto L35
            android.content.Context r0 = r6.zza     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> L6a
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0     // Catch: java.lang.Throwable -> L6a
            r6.zzb = r0     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L2f
            java.lang.String r0 = "Shake detection failed to initialize. Failed to obtain accelerometer."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6a
            return
        L2f:
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch: java.lang.Throwable -> L6a
            r6.zzc = r0     // Catch: java.lang.Throwable -> L6a
        L35:
            boolean r0 = r6.zzg     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L68
            android.hardware.SensorManager r0 = r6.zzb     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L68
            android.hardware.Sensor r2 = r6.zzc     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L68
            r3 = 2
            r0.registerListener(r6, r2, r3)     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()     // Catch: java.lang.Throwable -> L6a
            long r2 = r0.currentTimeMillis()     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zziD     // Catch: java.lang.Throwable -> L6a
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r4.zza(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L6a
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L6a
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L6a
            long r2 = r2 - r4
            r6.zzd = r2     // Catch: java.lang.Throwable -> L6a
            r6.zzg = r1     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "Listening for shake gestures."
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: java.lang.Throwable -> L6a
        L68:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6a
            return
        L6a:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6a
            throw r0
    }

    public final void zzd(com.google.android.gms.internal.ads.zzdyc r1) {
            r0 = this;
            r0.zzf = r1
            return
    }
}
