package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzba implements java.util.Comparator {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzai zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzg zzb;

    zzba(com.google.android.gms.internal.measurement.zzai r1, com.google.android.gms.internal.measurement.zzg r2) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            com.google.android.gms.internal.measurement.zzap r6 = (com.google.android.gms.internal.measurement.zzap) r6
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzau
            com.google.android.gms.internal.measurement.zzap r7 = (com.google.android.gms.internal.measurement.zzap) r7
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            boolean r6 = r7 instanceof com.google.android.gms.internal.measurement.zzau
            if (r6 != 0) goto Lf
            goto L45
        Lf:
            return r2
        L10:
            boolean r0 = r7 instanceof com.google.android.gms.internal.measurement.zzau
            if (r0 == 0) goto L16
            r1 = -1
            goto L45
        L16:
            com.google.android.gms.internal.measurement.zzai r0 = r5.zza
            if (r0 != 0) goto L27
            java.lang.String r6 = r6.zzi()
            java.lang.String r7 = r7.zzi()
            int r1 = r6.compareTo(r7)
            goto L45
        L27:
            com.google.android.gms.internal.measurement.zzg r3 = r5.zzb
            r4 = 2
            com.google.android.gms.internal.measurement.zzap[] r4 = new com.google.android.gms.internal.measurement.zzap[r4]
            r4[r2] = r6
            r4[r1] = r7
            java.util.List r6 = java.util.Arrays.asList(r4)
            com.google.android.gms.internal.measurement.zzap r6 = r0.zza(r3, r6)
            java.lang.Double r6 = r6.zzh()
            double r6 = r6.doubleValue()
            double r6 = com.google.android.gms.internal.measurement.zzh.zza(r6)
            int r1 = (int) r6
        L45:
            return r1
    }
}
