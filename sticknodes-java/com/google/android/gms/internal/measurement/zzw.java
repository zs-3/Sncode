package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzw extends com.google.android.gms.internal.measurement.zzai {
    final java.util.Map zza;
    private final com.google.android.gms.internal.measurement.zzj zzb;

    public zzw(com.google.android.gms.internal.measurement.zzj r2) {
            r1 = this;
            java.lang.String r0 = "require"
            r1.<init>(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg r3, java.util.List r4) {
            r2 = this;
            java.lang.String r0 = "require"
            r1 = 1
            com.google.android.gms.internal.measurement.zzh.zzh(r0, r1, r4)
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            com.google.android.gms.internal.measurement.zzap r4 = (com.google.android.gms.internal.measurement.zzap) r4
            com.google.android.gms.internal.measurement.zzap r3 = r3.zzb(r4)
            java.lang.String r3 = r3.zzi()
            java.util.Map r4 = r2.zza
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L24
            java.lang.Object r3 = r4.get(r3)
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            return r3
        L24:
            com.google.android.gms.internal.measurement.zzj r4 = r2.zzb
            java.util.Map r4 = r4.zza
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L4b
            java.lang.Object r4 = r4.get(r3)
            java.util.concurrent.Callable r4 = (java.util.concurrent.Callable) r4
            java.lang.Object r4 = r4.call()     // Catch: java.lang.Exception -> L3b
            com.google.android.gms.internal.measurement.zzap r4 = (com.google.android.gms.internal.measurement.zzap) r4     // Catch: java.lang.Exception -> L3b
            goto L4d
        L3b:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to create API implementation: "
            java.lang.String r3 = r0.concat(r3)
            r4.<init>(r3)
            throw r4
        L4b:
            com.google.android.gms.internal.measurement.zzap r4 = com.google.android.gms.internal.measurement.zzap.zzf
        L4d:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzai
            if (r0 == 0) goto L59
            java.util.Map r0 = r2.zza
            r1 = r4
            com.google.android.gms.internal.measurement.zzai r1 = (com.google.android.gms.internal.measurement.zzai) r1
            r0.put(r3, r1)
        L59:
            return r4
    }
}
