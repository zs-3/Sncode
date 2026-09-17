package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzu extends com.google.android.gms.internal.measurement.zzai {
    private final java.util.concurrent.Callable zza;

    public zzu(java.lang.String r1, java.util.concurrent.Callable r2) {
            r0 = this;
            java.lang.String r1 = "internal.appMetadata"
            r0.<init>(r1)
            r0.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg r1, java.util.List r2) {
            r0 = this;
            java.util.concurrent.Callable r1 = r0.zza     // Catch: java.lang.Exception -> Lb
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Exception -> Lb
            com.google.android.gms.internal.measurement.zzap r1 = com.google.android.gms.internal.measurement.zzi.zzb(r1)     // Catch: java.lang.Exception -> Lb
            return r1
        Lb:
            com.google.android.gms.internal.measurement.zzap r1 = com.google.android.gms.internal.measurement.zzap.zzf
            return r1
    }
}
