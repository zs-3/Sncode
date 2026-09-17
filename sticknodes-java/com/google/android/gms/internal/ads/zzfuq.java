package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzfuq implements android.hardware.SensorEventListener {
    protected zzfuq(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.ads.zzfup.zza()
            com.google.android.gms.internal.ads.zzfuo.zza()
            return
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent r1) {
            r0 = this;
            r0.zza(r1)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r1 = move-exception
            throw r1
    }

    public abstract void zza(android.hardware.SensorEvent r1);
}
