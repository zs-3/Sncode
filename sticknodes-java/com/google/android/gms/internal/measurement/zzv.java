package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzv extends com.google.android.gms.internal.measurement.zzai {
    private final com.google.android.gms.internal.measurement.zzz zza;

    public zzv(com.google.android.gms.internal.measurement.zzz r2) {
            r1 = this;
            java.lang.String r0 = "internal.registerCallback"
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
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzao
            if (r2 == 0) goto L7a
            r2 = 2
            java.lang.Object r6 = r6.get(r2)
            com.google.android.gms.internal.measurement.zzap r6 = (com.google.android.gms.internal.measurement.zzap) r6
            com.google.android.gms.internal.measurement.zzap r5 = r5.zzb(r6)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.zzam
            if (r6 == 0) goto L72
            com.google.android.gms.internal.measurement.zzam r5 = (com.google.android.gms.internal.measurement.zzam) r5
            java.lang.String r6 = "type"
            boolean r2 = r5.zzt(r6)
            if (r2 == 0) goto L6a
            com.google.android.gms.internal.measurement.zzap r6 = r5.zzf(r6)
            java.lang.String r6 = r6.zzi()
            java.lang.String r2 = "priority"
            boolean r3 = r5.zzt(r2)
            if (r3 == 0) goto L5e
            com.google.android.gms.internal.measurement.zzap r5 = r5.zzf(r2)
            java.lang.Double r5 = r5.zzh()
            double r2 = r5.doubleValue()
            int r5 = com.google.android.gms.internal.measurement.zzh.zzb(r2)
            goto L60
        L5e:
            r5 = 1000(0x3e8, float:1.401E-42)
        L60:
            com.google.android.gms.internal.measurement.zzz r2 = r4.zza
            com.google.android.gms.internal.measurement.zzao r1 = (com.google.android.gms.internal.measurement.zzao) r1
            r2.zza(r0, r5, r1, r6)
            com.google.android.gms.internal.measurement.zzap r5 = com.google.android.gms.internal.measurement.zzap.zzf
            return r5
        L6a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Undefined rule type"
            r5.<init>(r6)
            throw r5
        L72:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid callback params"
            r5.<init>(r6)
            throw r5
        L7a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid callback type"
            r5.<init>(r6)
            throw r5
    }
}
