package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzm extends com.google.android.gms.internal.measurement.zzai {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzo zza;

    zzm(com.google.android.gms.internal.measurement.zzn r1, java.lang.String r2, com.google.android.gms.internal.measurement.zzo r3) {
            r0 = this;
            r0.zza = r3
            java.lang.String r1 = "getValue"
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg r3, java.util.List r4) {
            r2 = this;
            java.lang.String r0 = "getValue"
            r1 = 2
            com.google.android.gms.internal.measurement.zzh.zzh(r0, r1, r4)
            r0 = 0
            java.lang.Object r0 = r4.get(r0)
            com.google.android.gms.internal.measurement.zzap r0 = (com.google.android.gms.internal.measurement.zzap) r0
            com.google.android.gms.internal.measurement.zzap r0 = r3.zzb(r0)
            r1 = 1
            java.lang.Object r4 = r4.get(r1)
            com.google.android.gms.internal.measurement.zzap r4 = (com.google.android.gms.internal.measurement.zzap) r4
            com.google.android.gms.internal.measurement.zzap r3 = r3.zzb(r4)
            java.lang.String r4 = r0.zzi()
            com.google.android.gms.internal.measurement.zzo r0 = r2.zza
            java.lang.String r4 = r0.zza(r4)
            if (r4 == 0) goto L2d
            com.google.android.gms.internal.measurement.zzat r3 = new com.google.android.gms.internal.measurement.zzat
            r3.<init>(r4)
        L2d:
            return r3
    }
}
