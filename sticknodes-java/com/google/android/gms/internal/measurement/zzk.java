package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzk extends com.google.android.gms.internal.measurement.zzai {
    private final com.google.android.gms.internal.measurement.zzab zza;

    public zzk(com.google.android.gms.internal.measurement.zzab r2) {
            r1 = this;
            java.lang.String r0 = "internal.eventLogger"
            r1.<init>(r0)
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg r5, java.util.List r6) {
            r4 = this;
            java.lang.String r0 = r4.zzd
            r1 = 3
            com.google.android.gms.internal.measurement.zzh.zzh(r0, r1, r6)
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r5.zzb(r0)
            java.lang.String r0 = r0.zzi()
            r1 = 1
            java.lang.Object r1 = r6.get(r1)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r5.zzb(r1)
            java.lang.Double r1 = r1.zzh()
            double r1 = r1.doubleValue()
            double r1 = com.google.android.gms.internal.measurement.zzh.zza(r1)
            long r1 = (long) r1
            r3 = 2
            java.lang.Object r6 = r6.get(r3)
            com.google.android.gms.internal.measurement.zzap r6 = (com.google.android.gms.internal.measurement.zzap) r6
            com.google.android.gms.internal.measurement.zzap r5 = r5.zzb(r6)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.zzam
            if (r6 == 0) goto L43
            com.google.android.gms.internal.measurement.zzam r5 = (com.google.android.gms.internal.measurement.zzam) r5
            java.util.Map r5 = com.google.android.gms.internal.measurement.zzh.zzg(r5)
            goto L48
        L43:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L48:
            com.google.android.gms.internal.measurement.zzab r6 = r4.zza
            r6.zze(r0, r1, r5)
            com.google.android.gms.internal.measurement.zzap r5 = com.google.android.gms.internal.measurement.zzap.zzf
            return r5
    }
}
