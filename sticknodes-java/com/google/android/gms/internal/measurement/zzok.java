package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
abstract class zzok {
    final sun.misc.Unsafe zza;

    zzok(sun.misc.Unsafe r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public abstract double zza(java.lang.Object r1, long r2);

    public abstract float zzb(java.lang.Object r1, long r2);

    public abstract void zzc(java.lang.Object r1, long r2, boolean r4);

    public abstract void zzd(java.lang.Object r1, long r2, byte r4);

    public abstract void zze(java.lang.Object r1, long r2, double r4);

    public abstract void zzf(java.lang.Object r1, long r2, float r4);

    public abstract boolean zzg(java.lang.Object r1, long r2);
}
