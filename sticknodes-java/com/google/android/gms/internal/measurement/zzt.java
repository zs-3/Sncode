package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzt extends com.google.android.gms.internal.measurement.zzai {
    private final com.google.android.gms.internal.measurement.zzr zza;

    public zzt(com.google.android.gms.internal.measurement.zzr r6) {
            r5 = this;
            java.lang.String r0 = "internal.logger"
            r5.<init>(r0)
            r5.zza = r6
            java.util.Map r6 = r5.zze
            com.google.android.gms.internal.measurement.zzs r0 = new com.google.android.gms.internal.measurement.zzs
            r1 = 0
            r2 = 1
            r0.<init>(r5, r1, r2)
            java.lang.String r3 = "log"
            r6.put(r3, r0)
            java.util.Map r6 = r5.zze
            com.google.android.gms.internal.measurement.zzp r0 = new com.google.android.gms.internal.measurement.zzp
            java.lang.String r4 = "silent"
            r0.<init>(r5, r4)
            r6.put(r4, r0)
            java.util.Map r6 = r5.zze
            java.lang.Object r6 = r6.get(r4)
            com.google.android.gms.internal.measurement.zzai r6 = (com.google.android.gms.internal.measurement.zzai) r6
            com.google.android.gms.internal.measurement.zzs r0 = new com.google.android.gms.internal.measurement.zzs
            r0.<init>(r5, r2, r2)
            r6.zzr(r3, r0)
            java.util.Map r6 = r5.zze
            com.google.android.gms.internal.measurement.zzq r0 = new com.google.android.gms.internal.measurement.zzq
            java.lang.String r2 = "unmonitored"
            r0.<init>(r5, r2)
            r6.put(r2, r0)
            java.util.Map r6 = r5.zze
            java.lang.Object r6 = r6.get(r2)
            com.google.android.gms.internal.measurement.zzai r6 = (com.google.android.gms.internal.measurement.zzai) r6
            com.google.android.gms.internal.measurement.zzs r0 = new com.google.android.gms.internal.measurement.zzs
            r0.<init>(r5, r1, r1)
            r6.zzr(r3, r0)
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzr zzb(com.google.android.gms.internal.measurement.zzt r0) {
            com.google.android.gms.internal.measurement.zzr r0 = r0.zza
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg r1, java.util.List r2) {
            r0 = this;
            com.google.android.gms.internal.measurement.zzap r1 = com.google.android.gms.internal.measurement.zzap.zzf
            return r1
    }
}
