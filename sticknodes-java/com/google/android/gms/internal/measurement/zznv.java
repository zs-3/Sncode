package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zznv extends com.google.android.gms.internal.measurement.zzoa {
    zznv() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final void zza() {
            r3 = this;
            boolean r0 = r3.zzj()
            if (r0 != 0) goto L5e
            r0 = 0
        L7:
            int r1 = r3.zzc()
            if (r0 >= r1) goto L30
            java.util.Map$Entry r1 = r3.zzg(r0)
            r2 = r1
            com.google.android.gms.internal.measurement.zznw r2 = (com.google.android.gms.internal.measurement.zznw) r2
            java.lang.Comparable r2 = r2.zza()
            com.google.android.gms.internal.measurement.zzlt r2 = (com.google.android.gms.internal.measurement.zzlt) r2
            boolean r2 = r2.zze()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.setValue(r2)
        L2d:
            int r0 = r0 + 1
            goto L7
        L30:
            java.lang.Iterable r0 = r3.zzd()
            java.util.Iterator r0 = r0.iterator()
        L38:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.measurement.zzlt r2 = (com.google.android.gms.internal.measurement.zzlt) r2
            boolean r2 = r2.zze()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.setValue(r2)
            goto L38
        L5e:
            super.zza()
            return
    }
}
