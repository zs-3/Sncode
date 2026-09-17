package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzaj {
    public static com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzal r4, com.google.android.gms.internal.measurement.zzap r5, com.google.android.gms.internal.measurement.zzg r6, java.util.List r7) {
            java.lang.String r0 = r5.zzi()
            boolean r0 = r4.zzt(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L33
            java.lang.String r0 = r5.zzi()
            com.google.android.gms.internal.measurement.zzap r4 = r4.zzf(r0)
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzai
            if (r0 == 0) goto L1f
            com.google.android.gms.internal.measurement.zzai r4 = (com.google.android.gms.internal.measurement.zzai) r4
            com.google.android.gms.internal.measurement.zzap r4 = r4.zza(r6, r7)
            return r4
        L1f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r5 = r5.zzi()
            r6[r1] = r5
            java.lang.String r5 = "%s is not a function"
            java.lang.String r5 = java.lang.String.format(r5, r6)
            r4.<init>(r5)
            throw r4
        L33:
            java.lang.String r0 = r5.zzi()
            java.lang.String r3 = "hasOwnProperty"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5c
            com.google.android.gms.internal.measurement.zzh.zzh(r3, r2, r7)
            java.lang.Object r5 = r7.get(r1)
            com.google.android.gms.internal.measurement.zzap r5 = (com.google.android.gms.internal.measurement.zzap) r5
            com.google.android.gms.internal.measurement.zzap r5 = r6.zzb(r5)
            java.lang.String r5 = r5.zzi()
            boolean r4 = r4.zzt(r5)
            if (r4 == 0) goto L59
            com.google.android.gms.internal.measurement.zzap r4 = com.google.android.gms.internal.measurement.zzap.zzk
            return r4
        L59:
            com.google.android.gms.internal.measurement.zzap r4 = com.google.android.gms.internal.measurement.zzap.zzl
            return r4
        L5c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r5 = r5.zzi()
            r6[r1] = r5
            java.lang.String r5 = "Object has no function %s"
            java.lang.String r5 = java.lang.String.format(r5, r6)
            r4.<init>(r5)
            throw r4
    }

    public static java.util.Iterator zzb(java.util.Map r1) {
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
            com.google.android.gms.internal.measurement.zzak r0 = new com.google.android.gms.internal.measurement.zzak
            r0.<init>(r1)
            return r0
    }
}
