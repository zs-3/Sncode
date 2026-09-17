package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzccg extends com.google.android.gms.internal.ads.zzfuq {
    private final android.hardware.SensorManager zza;
    private final java.lang.Object zzb;
    private final android.view.Display zzc;
    private final float[] zzd;
    private final float[] zze;
    private float[] zzf;
    private android.os.Handler zzg;
    private com.google.android.gms.internal.ads.zzccf zzh;

    zzccg(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "OrientationMonitor"
            java.lang.String r1 = "ads"
            r2.<init>(r0, r1)
            java.lang.String r0 = "sensor"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r2.zza = r0
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r3 = r3.getDefaultDisplay()
            r2.zzc = r3
            r3 = 9
            float[] r0 = new float[r3]
            r2.zzd = r0
            float[] r3 = new float[r3]
            r2.zze = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zza(android.hardware.SensorEvent r9) {
            r8 = this;
            float[] r9 = r9.values
            r0 = 0
            r1 = r9[r0]
            r2 = 0
            r3 = 2
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L18
            r1 = r9[r4]
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L18
            r1 = r9[r3]
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L8a
        L18:
            java.lang.Object r1 = r8.zzb
            monitor-enter(r1)
            float[] r2 = r8.zzf     // Catch: java.lang.Throwable -> L8e
            r5 = 9
            if (r2 != 0) goto L25
            float[] r2 = new float[r5]     // Catch: java.lang.Throwable -> L8e
            r8.zzf = r2     // Catch: java.lang.Throwable -> L8e
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8e
            float[] r1 = r8.zzd
            android.hardware.SensorManager.getRotationMatrixFromVector(r1, r9)
            android.view.Display r9 = r8.zzc
            int r9 = r9.getRotation()
            r1 = 129(0x81, float:1.81E-43)
            r2 = 3
            if (r9 == r4) goto L54
            r6 = 130(0x82, float:1.82E-43)
            if (r9 == r3) goto L4c
            if (r9 == r2) goto L44
            float[] r9 = r8.zzd
            float[] r1 = r8.zze
            java.lang.System.arraycopy(r9, r0, r1, r0, r5)
            goto L5b
        L44:
            float[] r9 = r8.zzd
            float[] r1 = r8.zze
            android.hardware.SensorManager.remapCoordinateSystem(r9, r6, r4, r1)
            goto L5b
        L4c:
            float[] r9 = r8.zzd
            float[] r7 = r8.zze
            android.hardware.SensorManager.remapCoordinateSystem(r9, r1, r6, r7)
            goto L5b
        L54:
            float[] r9 = r8.zzd
            float[] r6 = r8.zze
            android.hardware.SensorManager.remapCoordinateSystem(r9, r3, r1, r6)
        L5b:
            float[] r9 = r8.zze
            r1 = r9[r4]
            r6 = r9[r2]
            r9[r4] = r6
            r9[r2] = r1
            r1 = r9[r3]
            r2 = 6
            r4 = r9[r2]
            r9[r3] = r4
            r9[r2] = r1
            r1 = 5
            r2 = r9[r1]
            r3 = 7
            r4 = r9[r3]
            r9[r1] = r4
            r9[r3] = r2
            java.lang.Object r9 = r8.zzb
            monitor-enter(r9)
            float[] r1 = r8.zze     // Catch: java.lang.Throwable -> L8b
            float[] r2 = r8.zzf     // Catch: java.lang.Throwable -> L8b
            java.lang.System.arraycopy(r1, r0, r2, r0, r5)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.zzccf r9 = r8.zzh
            if (r9 == 0) goto L8a
            r9.zza()
        L8a:
            return
        L8b:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8b
            throw r0
        L8e:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8e
            throw r9
    }

    final void zzb(com.google.android.gms.internal.ads.zzccf r1) {
            r0 = this;
            r0.zzh = r1
            return
    }

    final void zzc() {
            r4 = this;
            android.os.Handler r0 = r4.zzg
            if (r0 == 0) goto L5
            goto L3b
        L5:
            android.hardware.SensorManager r0 = r4.zza
            r1 = 11
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)
            if (r0 != 0) goto L15
            java.lang.String r0 = "No Sensor of TYPE_ROTATION_VECTOR"
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)
            return
        L15:
            android.os.HandlerThread r1 = new android.os.HandlerThread
            java.lang.String r2 = "OrientationMonitor"
            r1.<init>(r2)
            r1.start()
            com.google.android.gms.internal.ads.zzfun r2 = new com.google.android.gms.internal.ads.zzfun
            android.os.Looper r1 = r1.getLooper()
            r2.<init>(r1)
            r4.zzg = r2
            android.hardware.SensorManager r1 = r4.zza
            r3 = 0
            boolean r0 = r1.registerListener(r4, r0, r3, r2)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "SensorManager.registerListener failed."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r0)
            r4.zzd()
        L3b:
            return
    }

    final void zzd() {
            r2 = this;
            android.os.Handler r0 = r2.zzg
            if (r0 != 0) goto L5
            return
        L5:
            android.hardware.SensorManager r0 = r2.zza
            r0.unregisterListener(r2)
            android.os.Handler r0 = r2.zzg
            com.google.android.gms.internal.ads.zzcce r1 = new com.google.android.gms.internal.ads.zzcce
            r1.<init>(r2)
            r0.post(r1)
            r0 = 0
            r2.zzg = r0
            return
    }

    final boolean zze(float[] r5) {
            r4 = this;
            java.lang.Object r0 = r4.zzb
            monitor-enter(r0)
            float[] r1 = r4.zzf     // Catch: java.lang.Throwable -> L12
            r2 = 0
            if (r1 != 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r2
        La:
            r3 = 9
            java.lang.System.arraycopy(r1, r2, r5, r2, r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            r5 = 1
            return r5
        L12:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
    }
}
